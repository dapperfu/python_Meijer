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
import com.launchdarkly.sdk.android.C11540a;
import com.launchdarkly.sdk.android.n0;
import ih.C14724c;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.launchdarkly.sdk.android.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11540a implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f91118a;

    /* renamed from: b, reason: collision with root package name */
    private final v0 f91119b;

    /* renamed from: c, reason: collision with root package name */
    private final C14724c f91120c;

    /* renamed from: d, reason: collision with root package name */
    private final c f91121d;

    /* renamed from: e, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f91122e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<n0.a> f91123f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<n0.b> f91124g = new CopyOnWriteArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f91125h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f91126i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.launchdarkly.sdk.android.a$b */
    final class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        private volatile ScheduledFuture<?> f91127a;

        private b() {
            this.f91127a = null;
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
            if (C11540a.this.f91126i && C11540a.this.f91125h.getAndSet(false)) {
                C11540a.this.f91120c.a("went background");
                Iterator it = C11540a.this.f91124g.iterator();
                while (it.hasNext()) {
                    ((n0.b) it.next()).a(false);
                }
            }
        }

        public static /* synthetic */ void b(b bVar) {
            Iterator it = C11540a.this.f91124g.iterator();
            while (it.hasNext()) {
                ((n0.b) it.next()).a(true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (C11540a.this.f91125h.get()) {
                C11540a.this.f91126i = true;
                if (this.f91127a != null) {
                    this.f91127a.cancel(false);
                }
                C11540a.this.f91120c.a("activity paused; waiting to see if another activity resumes");
                this.f91127a = C11540a.this.f91119b.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11540a.b.a(this.f91154a);
                    }
                }, 500L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C11540a.this.f91126i = false;
            if (C11540a.this.f91125h.getAndSet(true)) {
                C11540a.this.f91120c.a("activity resumed while already in foreground");
            } else {
                C11540a.this.f91120c.a("activity resumed, we are now in foreground");
                C11540a.this.f91119b.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11540a.b.b(this.f91153a);
                    }
                }, 0L);
            }
        }
    }

    /* renamed from: com.launchdarkly.sdk.android.a$c */
    private final class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private boolean f91129a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f91130b;

        private c() {
            this.f91129a = false;
            this.f91130b = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                synchronized (this) {
                    try {
                        boolean zK3 = C11540a.this.k3();
                        if (this.f91129a && this.f91130b == zK3) {
                            return;
                        }
                        this.f91129a = true;
                        this.f91130b = zK3;
                        Iterator it = C11540a.this.f91123f.iterator();
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
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f91118a.getSystemService("connectivity");
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
        return this.f91118a.getCacheDir();
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void P0(n0.b bVar) {
        this.f91124g.add(bVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void Y2(n0.a aVar) {
        this.f91123f.add(aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f91123f.clear();
        this.f91124g.clear();
        try {
            this.f91118a.unregisterReceiver(this.f91121d);
        } catch (IllegalArgumentException unused) {
        }
        this.f91118a.unregisterActivityLifecycleCallbacks(this.f91122e);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void q2(n0.b bVar) {
        this.f91124g.remove(bVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public void s3(n0.a aVar) {
        this.f91123f.remove(aVar);
    }

    @Override // com.launchdarkly.sdk.android.n0
    public boolean x3() {
        return this.f91125h.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11540a(Application application, v0 v0Var, C14724c c14724c) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f91125h = atomicBoolean;
        this.f91126i = true;
        this.f91118a = application;
        this.f91119b = v0Var;
        this.f91120c = c14724c;
        c cVar = new c();
        this.f91121d = cVar;
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
        this.f91122e = bVar;
        application.registerActivityLifecycleCallbacks(bVar);
    }
}
