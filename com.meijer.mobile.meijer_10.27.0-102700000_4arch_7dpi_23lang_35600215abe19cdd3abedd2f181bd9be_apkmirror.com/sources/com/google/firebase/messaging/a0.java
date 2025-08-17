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
import pd.ThreadFactoryC16289b;

/* loaded from: classes7.dex */
class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f88887a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f88888b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f88889c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService f88890d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC16289b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private a0 f88891a;

        /* renamed from: b, reason: collision with root package name */
        private Context f88892b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a0 a0Var = this.f88891a;
            if (a0Var != null && a0Var.f()) {
                if (a0.e()) {
                    FS.log_d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f88891a.f88889c.l(this.f88891a, 0L);
                Context context2 = this.f88892b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f88891a = null;
            }
        }

        public a(a0 a0Var) {
            this.f88891a = a0Var;
        }

        public void a() {
            if (a0.e()) {
                FS.log_d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            a0 a0Var = this.f88891a;
            if (a0Var != null) {
                Context contextB = a0Var.b();
                this.f88892b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }
    }

    static boolean e() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f88889c.m();
    }

    boolean g() throws IOException {
        try {
            if (this.f88889c.k() == null) {
                FS.log_e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            FS.log_d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!D.h(e10.getMessage())) {
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
    public a0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f88889c = firebaseMessaging;
        this.f88887a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f88888b = wakeLockNewWakeLock;
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
        if (W.b().e(b())) {
            this.f88888b.acquire();
        }
        try {
            try {
                this.f88889c.z(true);
                if (!this.f88889c.x()) {
                    this.f88889c.z(false);
                    if (!W.b().e(b())) {
                        return;
                    }
                } else if (W.b().d(b()) && !f()) {
                    new a(this).a();
                    if (!W.b().e(b())) {
                        return;
                    }
                } else {
                    if (g()) {
                        this.f88889c.z(false);
                    } else {
                        this.f88889c.D(this.f88887a);
                    }
                    if (!W.b().e(b())) {
                        return;
                    }
                }
                this.f88888b.release();
            } catch (IOException e10) {
                FS.log_e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f88889c.z(false);
                if (W.b().e(b())) {
                    this.f88888b.release();
                }
            }
        } catch (Throwable th2) {
            if (W.b().e(b())) {
                this.f88888b.release();
            }
            throw th2;
        }
    }
}
