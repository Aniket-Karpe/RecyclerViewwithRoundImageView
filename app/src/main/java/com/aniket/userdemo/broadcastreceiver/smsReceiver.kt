package com.aniket.userdemo.broadcastreceiver





    // SmsReceiver.kt
    import android.content.BroadcastReceiver
    import android.content.Context
    import android.content.Intent
    import android.provider.Telephony
    import android.telephony.SmsMessage
    import android.util.Log

    class smsReceiver : BroadcastReceiver() {

        companion object {
            const val SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED"
        }

        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action == SMS_RECEIVED_ACTION) {
                val messages = Telephony.Sms.Intents.getMessagesFromIntent(intent)

                for (message in messages) {
                    val sender = message.originatingAddress
                    val messageBody = message.messageBody

                    Log.d("SmsReceiver", "Sender: $sender, Message: $messageBody")

                }
            }
        }
    }

