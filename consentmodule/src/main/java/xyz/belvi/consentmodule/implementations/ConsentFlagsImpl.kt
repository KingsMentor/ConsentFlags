package xyz.belvi.consentmodule.implementations

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import xyz.belvi.consentmodule.events.ConsentEvent
import xyz.belvi.consentmodule.models.ConsentFlags
import xyz.belvi.consentmodule.usecase.ConsentFlagsUsecase
import java.util.*

internal open class ConsentFlagsImpl {


     fun fetchUserConsent(): MutableList<ConsentFlags> {
        return mutableListOf()
    }

     fun listenToUpdate(): Flowable<ConsentEvent> {
        return Flowable.create({ emitter ->
            emitter.onNext(ConsentEvent(ConsentFlags(0), Calendar.getInstance().timeInMillis))
        }, BackpressureStrategy.LATEST)
    }
}