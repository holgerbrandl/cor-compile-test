import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class MyTraceListener  {
    // think of it as a  Non Blocking Queue
    val ordersChannel = Channel<String>()

    fun processTrace(traceElement: String) {
        GlobalScope.launch {
            ordersChannel.offer(traceElement)
        }
    }
}
