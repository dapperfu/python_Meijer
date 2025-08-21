package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11471q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<String> f89813a = new ArrayDeque(10);

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strH = J.h(extras);
                if (!TextUtils.isEmpty(strH)) {
                    if (this.f89813a.contains(strH)) {
                        return;
                    } else {
                        this.f89813a.add(strH);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e10) {
            FS.log_w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (J.E(bundle)) {
            J.x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    C11471q() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89811a.b(intent);
                }
            });
        } else {
            b(intent);
        }
    }
}
