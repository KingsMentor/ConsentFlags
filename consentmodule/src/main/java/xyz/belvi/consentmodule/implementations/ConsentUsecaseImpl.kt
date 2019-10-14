package xyz.belvi.consentmodule.implementations

import io.reactivex.Flowable
import xyz.belvi.consentmodule.events.ConsentEvent
import xyz.belvi.consentmodule.models.ConsentFlags
import xyz.belvi.consentmodule.usecase.ConsentFlagsUsecase

open class ConsentUsecaseImpl : ConsentFlagsUsecase {
    private val consentFlagsImpl = ConsentFlagsImpl()

    override fun getUserConsentFlags(): MutableList<ConsentFlags> {
        return consentFlagsImpl.fetchUserConsent()
    }

    override fun getUserConsentUpdate(): Flowable<ConsentEvent> {
        return consentFlagsImpl.listenToUpdate()
    }
}