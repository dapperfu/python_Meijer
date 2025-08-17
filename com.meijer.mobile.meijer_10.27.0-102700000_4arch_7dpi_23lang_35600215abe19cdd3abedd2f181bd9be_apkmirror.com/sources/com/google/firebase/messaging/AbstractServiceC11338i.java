package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5227e;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.j0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractServiceC11338i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C11344o.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class a implements j0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.j0.a
        public AbstractC5232j<Void> a(Intent intent) {
            return AbstractServiceC11338i.this.processIntent(intent);
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
                this.binder = new j0(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTask(Intent intent) {
        if (intent != null) {
            h0.c(intent);
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
        AbstractC5232j<Void> abstractC5232jProcessIntent = processIntent(startCommandIntent);
        if (abstractC5232jProcessIntent.q()) {
            finishTask(intent);
            return 2;
        }
        abstractC5232jProcessIntent.d(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5227e() { // from class: com.google.firebase.messaging.g
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                this.f88935a.finishTask(intent);
            }
        });
        return 3;
    }

    public static /* synthetic */ void a(AbstractServiceC11338i abstractServiceC11338i, Intent intent, C5233k c5233k) {
        abstractServiceC11338i.getClass();
        try {
            abstractServiceC11338i.handleIntent(intent);
        } finally {
            c5233k.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5232j<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C5235m.f(null);
        }
        final C5233k c5233k = new C5233k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC11338i.a(this.f88938a, intent, c5233k);
            }
        });
        return c5233k.a();
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
