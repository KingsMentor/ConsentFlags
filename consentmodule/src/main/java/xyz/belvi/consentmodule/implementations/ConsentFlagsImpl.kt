package xyz.belvi.consentmodule.implementations

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import xyz.belvi.consentmodule.events.ConsentEvent
import xyz.belvi.consentmodule.models.ConsentFlags
import xyz.belvi.consentmodule.usecase.ConsentFlagsUsecase
import java.util.*

open class ConsentFlagsImpl : ConsentFlagsUsecase {
    override fun getUserConsentFlags(): MutableList<ConsentFlags> {
        return fetchUserConsent()
    }

    override fun getUserConsentUpdate(): Flowable<ConsentEvent> {
        return listenToUpdate()
    }


    private fun fetchUserConsent(): MutableList<ConsentFlags> {
        return mutableListOf<ConsentFlags>()
    }

    private fun listenToUpdate(): Flowable<ConsentEvent> {
        return Flowable.create<ConsentEvent>({ emitter ->
            emitter.onNext(ConsentEvent(ConsentFlags(0), Calendar.getInstance().timeInMillis))
        }, BackpressureStrategy.LATEST)
    }
}