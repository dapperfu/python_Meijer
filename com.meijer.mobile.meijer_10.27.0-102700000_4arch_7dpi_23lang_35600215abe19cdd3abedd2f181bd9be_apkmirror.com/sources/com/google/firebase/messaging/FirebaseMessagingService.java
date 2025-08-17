package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import fd.C13874a;
import fd.C13876c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class FirebaseMessagingService extends AbstractServiceC11338i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C13876c rpc;

    public void onDeletedMessages() {
    }

    public void onMessageReceived(S s10) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C13876c getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new C13876c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        getRpc(this).b(new C13874a(intent));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                H.y(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                FS.log_w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    void setRpcForTesting(C13876c c13876c) {
        this.rpc = c13876c;
    }

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J.t(extras)) {
            J j10 = new J(extras);
            ExecutorService executorServiceE = C11344o.e();
            try {
                if (new C11335f(this, j10, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (H.D(intent)) {
                    H.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        onMessageReceived(new S(extras));
    }

    @Override // com.google.firebase.messaging.AbstractServiceC11338i
    protected Intent getStartCommandIntent(Intent intent) {
        return W.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC11338i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            FS.log_d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        handleMessageIntent(intent);
    }
}
