package xyz.belvi.consentmodule.usecase

import io.reactivex.Flowable
import xyz.belvi.consentmodule.events.ConsentEvent
import xyz.belvi.consentmodule.models.ConsentFlags

interface ConsentFlagsUsecase {
    fun getUserConsentFlags(): MutableList<ConsentFlags>
    fun getUserConsentUpdate(): Flowable<ConsentEvent>
}