package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;

/* loaded from: classes7.dex */
class f0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f88925f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f88926g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f88927h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f88928a;

    /* renamed from: b, reason: collision with root package name */
    private final I f88929b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f88930c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f88931d;

    /* renamed from: e, reason: collision with root package name */
    private final long f88932e;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private f0 f88933a;

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                f0 f0Var = this.f88933a;
                if (f0Var == null) {
                    return;
                }
                if (f0Var.i()) {
                    if (f0.j()) {
                        FS.log_d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f88933a.f88931d.k(this.f88933a, 0L);
                    context.unregisterReceiver(this);
                    this.f88933a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public a(f0 f0Var) {
            this.f88933a = f0Var;
        }

        public void a() {
            if (f0.j()) {
                FS.log_d("FirebaseMessaging", "Connectivity change received registered");
            }
            f0.this.f88928a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f88928a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.f0.i():boolean");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f88925f) {
            try {
                Boolean bool = f88927h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f88927h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f88925f) {
            try {
                Boolean bool = f88926g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f88926g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f88928a)) {
            this.f88930c.acquire(C11334e.f88912a);
        }
        try {
            try {
                try {
                    this.f88931d.l(true);
                    if (!this.f88929b.g()) {
                        this.f88931d.l(false);
                        if (h(this.f88928a)) {
                            try {
                                this.f88930c.release();
                                return;
                            } catch (RuntimeException unused) {
                                FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f88928a) || i()) {
                        if (this.f88931d.o()) {
                            this.f88931d.l(false);
                        } else {
                            this.f88931d.p(this.f88932e);
                        }
                        if (h(this.f88928a)) {
                            this.f88930c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f88928a)) {
                        try {
                            this.f88930c.release();
                        } catch (RuntimeException unused2) {
                            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f88928a)) {
                        try {
                            this.f88930c.release();
                        } catch (RuntimeException unused3) {
                            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                FS.log_e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f88931d.l(false);
                if (h(this.f88928a)) {
                    this.f88930c.release();
                }
            }
        } catch (RuntimeException unused4) {
            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }

    f0(e0 e0Var, Context context, I i10, long j10) {
        this.f88931d = e0Var;
        this.f88928a = context;
        this.f88932e = j10;
        this.f88929b = i10;
        this.f88930c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
