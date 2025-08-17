package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5227e;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.m0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import od.C16023b;
import pd.ThreadFactoryC16289b;

/* loaded from: classes7.dex */
class m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f88954a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f88955b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f88956c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<a> f88957d;

    /* renamed from: e, reason: collision with root package name */
    private j0 f88958e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f88959f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f88960a;

        /* renamed from: b, reason: collision with root package name */
        private final C5233k<Void> f88961b = new C5233k<>();

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.k0
                @Override // java.lang.Runnable
                public final void run() {
                    m0.a.b(this.f88952a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().d(scheduledExecutorService, new InterfaceC5227e() { // from class: com.google.firebase.messaging.l0
                @Override // Td.InterfaceC5227e
                public final void onComplete(AbstractC5232j abstractC5232j) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f88961b.e(null);
        }

        AbstractC5232j<Void> e() {
            return this.f88961b.a();
        }

        a(Intent intent) {
            this.f88960a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            FS.log_w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f88960a.getAction() + " finishing.");
            aVar.d();
        }
    }

    m0(Context context, String str) {
        this(context, str, a());
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f88957d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    FS.log_d("FirebaseMessaging", "found intent to be delivered");
                }
                j0 j0Var = this.f88958e;
                if (j0Var == null || !j0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    FS.log_d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f88958e.b(this.f88957d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f88959f);
            FS.log_d("FirebaseMessaging", sb2.toString());
        }
        if (this.f88959f) {
            return;
        }
        this.f88959f = true;
        try {
        } catch (SecurityException e10) {
            FS.log_e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C16023b.b().a(this.f88954a, this.f88955b, this, 65)) {
            return;
        }
        FS.log_e("FirebaseMessaging", "binding to the service failed");
        this.f88959f = false;
        b();
    }

    synchronized AbstractC5232j<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f88956c);
            this.f88957d.add(aVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f88959f = false;
            if (iBinder instanceof j0) {
                this.f88958e = (j0) iBinder;
                c();
                return;
            }
            FS.log_e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    m0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f88957d = new ArrayDeque();
        this.f88959f = false;
        Context applicationContext = context.getApplicationContext();
        this.f88954a = applicationContext;
        this.f88955b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f88956c = scheduledExecutorService;
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16289b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f88957d.isEmpty()) {
            this.f88957d.poll().d();
        }
    }
}
