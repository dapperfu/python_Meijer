package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rd.ThreadFactoryC16893b;

/* loaded from: classes8.dex */
class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f89734a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f89735b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f89736c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService f89737d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC16893b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private c0 f89738a;

        /* renamed from: b, reason: collision with root package name */
        private Context f89739b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f89738a;
            if (c0Var != null && c0Var.f()) {
                if (c0.e()) {
                    FS.log_d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f89738a.f89736c.n(this.f89738a, 0L);
                Context context2 = this.f89739b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f89738a = null;
            }
        }

        public a(c0 c0Var) {
            this.f89738a = c0Var;
        }

        public void a() {
            if (c0.e()) {
                FS.log_d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            c0 c0Var = this.f89738a;
            if (c0Var != null) {
                Context contextB = c0Var.b();
                this.f89739b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }
    }

    static boolean e() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f89736c.o();
    }

    boolean g() throws IOException {
        try {
            if (this.f89736c.m() == null) {
                FS.log_e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            FS.log_d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!F.h(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                FS.log_w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            FS.log_w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            FS.log_w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public c0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f89736c = firebaseMessaging;
        this.f89734a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f89735b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    boolean f() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (Y.b().e(b())) {
            this.f89735b.acquire();
        }
        try {
            try {
                this.f89736c.B(true);
                if (!this.f89736c.z()) {
                    this.f89736c.B(false);
                    if (!Y.b().e(b())) {
                        return;
                    }
                } else if (Y.b().d(b()) && !f()) {
                    new a(this).a();
                    if (!Y.b().e(b())) {
                        return;
                    }
                } else {
                    if (g()) {
                        this.f89736c.B(false);
                    } else {
                        this.f89736c.G(this.f89734a);
                    }
                    if (!Y.b().e(b())) {
                        return;
                    }
                }
                this.f89735b.release();
            } catch (IOException e10) {
                FS.log_e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f89736c.B(false);
                if (Y.b().e(b())) {
                    this.f89735b.release();
                }
            }
        } catch (Throwable th2) {
            if (Y.b().e(b())) {
                this.f89735b.release();
            }
            throw th2;
        }
    }
}
