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

/* loaded from: classes8.dex */
class h0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f89775f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f89776g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f89777h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f89778a;

    /* renamed from: b, reason: collision with root package name */
    private final K f89779b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f89780c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f89781d;

    /* renamed from: e, reason: collision with root package name */
    private final long f89782e;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private h0 f89783a;

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                h0 h0Var = this.f89783a;
                if (h0Var == null) {
                    return;
                }
                if (h0Var.i()) {
                    if (h0.j()) {
                        FS.log_d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f89783a.f89781d.l(this.f89783a, 0L);
                    context.unregisterReceiver(this);
                    this.f89783a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public a(h0 h0Var) {
            this.f89783a = h0Var;
        }

        public void a() {
            if (h0.j()) {
                FS.log_d("FirebaseMessaging", "Connectivity change received registered");
            }
            h0.this.f89778a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
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
            android.content.Context r0 = r2.f89778a     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.h0.i():boolean");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f89775f) {
            try {
                Boolean bool = f89777h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f89777h = boolValueOf;
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
        synchronized (f89775f) {
            try {
                Boolean bool = f89776g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f89776g = boolValueOf;
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
        if (h(this.f89778a)) {
            this.f89780c.acquire(C11459e.f89748a);
        }
        try {
            try {
                try {
                    this.f89781d.n(true);
                    if (!this.f89779b.g()) {
                        this.f89781d.n(false);
                        if (h(this.f89778a)) {
                            try {
                                this.f89780c.release();
                                return;
                            } catch (RuntimeException unused) {
                                FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f89778a) || i()) {
                        if (this.f89781d.r()) {
                            this.f89781d.n(false);
                        } else {
                            this.f89781d.s(this.f89782e);
                        }
                        if (h(this.f89778a)) {
                            this.f89780c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f89778a)) {
                        try {
                            this.f89780c.release();
                        } catch (RuntimeException unused2) {
                            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f89778a)) {
                        try {
                            this.f89780c.release();
                        } catch (RuntimeException unused3) {
                            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                FS.log_e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f89781d.n(false);
                if (h(this.f89778a)) {
                    this.f89780c.release();
                }
            }
        } catch (RuntimeException unused4) {
            FS.log_i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }

    h0(g0 g0Var, Context context, K k10, long j10) {
        this.f89781d = g0Var;
        this.f89778a = context;
        this.f89782e = j10;
        this.f89779b = k10;
        this.f89780c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
