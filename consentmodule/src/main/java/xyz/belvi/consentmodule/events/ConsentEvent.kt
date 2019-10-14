package xyz.belvi.consentmodule.events

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import xyz.belvi.consentmodule.models.ConsentFlags
import java.util.*

class ConsentEvent(consentFlags: ConsentFlags, timestamp: Long) : BaseEvent() {

}