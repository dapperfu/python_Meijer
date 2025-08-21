package com.launchdarkly.sdk.android;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import com.launchdarkly.sdk.android.C11665a;
import com.launchdarkly.sdk.android.n0;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.C15034c;

/* renamed from: com.launchdarkly.sdk.android.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11665a implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f91957a;

    /* renamed from: b, reason: collision with root package name */
    private final v0 f91958b;

    /* renamed from: c, reason: collision with root package name */
    private final C15034c f91959c;

    /* renamed from: d, reason: collision with root package name */
    private final c f91960d;

    /* renamed from: e, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f91961e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<n0.a> f91962f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<n0.b> f91963g = new CopyOnWriteArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f91964h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f91965i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.launchdarkly.sdk.android.a$b */
    final class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        private volatile ScheduledFuture<?> f91966a;

        private b() {
            this.f91966a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
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

        public static /* synthetic */ void a(b bVar) {
            if (C11665a.this.f91965i && C11665a.this.f91964h.getAndSet(false)) {
                C11665a.this.f91959c.a("went background");
                Iterator it = C11665a.this.f91963g.iterator();
                while (it.hasNext()) {
                    ((n0.b) it.next()).a(false);
                }
            }
        }

        public static /* synthetic */ void b(b bVar) {
            Iterator it = C11665a.this.f91963g.iterator();
            while (it.hasNext()) {
                ((n0.b) it.next()).a(true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (C11665a.this.f91964h.get()) {
                C11665a.this.f91965i = true;
                if (this.f91966a != null) {
                    this.f91966a.cancel(false);
                }
                C11665a.this.f91959c.a("activity paused; waiting to see if another activity resumes");
                this.f91966a = C11665a.this.f91958b.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11665a.b.a(this.f91993a);
                    }
                }, 500L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C11665a.this.f91965i = false;
            if (C11665a.this.f91964h.getAndSet(true)) {
                C11665a.this.f91959c.a("activity resumed while already in foreground");
            } else {
                C11665a.this.f91959c.a("activity resumed, we are now in foreground");
                C11665a.this.f91958b.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11665a.b.b(this.f91992a);
                    }
                }, 0L);
            }
        }
    }

    /* renamed from: com.launchdarkly.sdk.android.a$c */
    private final class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private boolean f91968a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f91969b;

        private c() {
            this.f91968a = false;
            this.f91969b = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                synchronized (this) {
                    try {
                        boolean zK3 = C11665a.this.k3();
                        if (this.f91968a && this.f91969b == zK3) {
                            return;
                        }
                        this.f91968a = true;
                        this.f91969b = zK3;
                        Iterator it = C11665a.this.f91962f.iterator();
                        while (it.hasNext()) {
                            ((n0.a) it.next()).a(zK3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: com.launchdarkly.sdk.android.a$d */
    interface d {
        boolean a();
    }

    @Override // com.launchdarkly.sdk.android.n0
    public boolean k3() {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f91957a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2)) {
                    if (networkCapabilities.hasTransport(4)) {
                    }
                }
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    @Override // com.launchdarkly.sdk.android.n0
    public File G() {
        return this.f91957a.getCacheDir();
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void M0(n0.b bVar) {
        this.f91963g.add(bVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void X2(n0.a aVar) {
        this.f91962f.add(aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f91962f.clear();
        this.f91963g.clear();
        try {
            this.f91957a.unregisterReceiver(this.f91960d);
        } catch (IllegalArgumentException unused) {
        }
        this.f91957a.unregisterActivityLifecycleCallbacks(this.f91961e);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void o2(n0.b bVar) {
        this.f91963g.remove(bVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void s3(n0.a aVar) {
        this.f91962f.remove(aVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public boolean x3() {
        return this.f91964h.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11665a(Application application, v0 v0Var, C15034c c15034c) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f91964h = atomicBoolean;
        this.f91965i = true;
        this.f91957a = application;
        this.f91958b = v0Var;
        this.f91959c = c15034c;
        c cVar = new c();
        this.f91960d = cVar;
        application.registerReceiver(cVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        if (application instanceof d) {
            atomicBoolean.set(((d) application).a());
        } else {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i10 = runningAppProcessInfo.importance;
            atomicBoolean.set(i10 == 100 || i10 == 200);
        }
        b bVar = new b();
        this.f91961e = bVar;
        application.registerActivityLifecycleCallbacks(bVar);
    }
}
