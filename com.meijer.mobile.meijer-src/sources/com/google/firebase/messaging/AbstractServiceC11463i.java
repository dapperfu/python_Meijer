package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5511e;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.l0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractServiceC11463i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C11469o.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class a implements l0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.l0.a
        public AbstractC5516j<Void> a(Intent intent) {
            return AbstractServiceC11463i.this.processIntent(intent);
        }
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                FS.log_d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new l0(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTask(Intent intent) {
        if (intent != null) {
            j0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        AbstractC5516j<Void> abstractC5516jProcessIntent = processIntent(startCommandIntent);
        if (abstractC5516jProcessIntent.q()) {
            finishTask(intent);
            return 2;
        }
        abstractC5516jProcessIntent.d(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5511e() { // from class: com.google.firebase.messaging.g
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                this.f89761a.finishTask(intent);
            }
        });
        return 3;
    }

    public static /* synthetic */ void a(AbstractServiceC11463i abstractServiceC11463i, Intent intent, C5517k c5517k) {
        abstractServiceC11463i.getClass();
        try {
            abstractServiceC11463i.handleIntent(intent);
        } finally {
            c5517k.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5516j<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C5519m.f(null);
        }
        final C5517k c5517k = new C5517k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC11463i.a(this.f89772a, intent, c5517k);
            }
        });
        return c5517k.a();
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
