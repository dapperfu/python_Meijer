package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5511e;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.fullstory.FS;
import com.google.firebase.messaging.o0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qd.C16631b;
import rd.ThreadFactoryC16893b;

/* loaded from: classes8.dex */
class o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f89803a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f89804b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f89805c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<a> f89806d;

    /* renamed from: e, reason: collision with root package name */
    private l0 f89807e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f89808f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f89809a;

        /* renamed from: b, reason: collision with root package name */
        private final C5517k<Void> f89810b = new C5517k<>();

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.m0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a.b(this.f89797a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().d(scheduledExecutorService, new InterfaceC5511e() { // from class: com.google.firebase.messaging.n0
                @Override // Vd.InterfaceC5511e
                public final void onComplete(AbstractC5516j abstractC5516j) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f89810b.e(null);
        }

        AbstractC5516j<Void> e() {
            return this.f89810b.a();
        }

        a(Intent intent) {
            this.f89809a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            FS.log_w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f89809a.getAction() + " finishing.");
            aVar.d();
        }
    }

    o0(Context context, String str) {
        this(context, str, a());
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f89806d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    FS.log_d("FirebaseMessaging", "found intent to be delivered");
                }
                l0 l0Var = this.f89807e;
                if (l0Var == null || !l0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    FS.log_d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f89807e.b(this.f89806d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f89808f);
            FS.log_d("FirebaseMessaging", sb2.toString());
        }
        if (this.f89808f) {
            return;
        }
        this.f89808f = true;
        try {
        } catch (SecurityException e10) {
            FS.log_e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C16631b.b().a(this.f89803a, this.f89804b, this, 65)) {
            return;
        }
        FS.log_e("FirebaseMessaging", "binding to the service failed");
        this.f89808f = false;
        b();
    }

    synchronized AbstractC5516j<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f89805c);
            this.f89806d.add(aVar);
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
            this.f89808f = false;
            if (iBinder instanceof l0) {
                this.f89807e = (l0) iBinder;
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

    o0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f89806d = new ArrayDeque();
        this.f89808f = false;
        Context applicationContext = context.getApplicationContext();
        this.f89803a = applicationContext;
        this.f89804b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f89805c = scheduledExecutorService;
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16893b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f89806d.isEmpty()) {
            this.f89806d.poll().d();
        }
    }
}
