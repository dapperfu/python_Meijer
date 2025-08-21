package com.google.firebase.messaging;

import Jf.a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5513g;
import Vd.InterfaceC5515i;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import bf.InterfaceC6375a;
import com.fullstory.FS;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.X;
import com.google.firebase.messaging.b0;
import hd.C14504a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rc.InterfaceC16890j;
import rd.ThreadFactoryC16893b;

/* loaded from: classes8.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    private static b0 f89623n;

    /* renamed from: p, reason: collision with root package name */
    static ScheduledExecutorService f89625p;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f89626a;

    /* renamed from: b, reason: collision with root package name */
    private final Jf.a f89627b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f89628c;

    /* renamed from: d, reason: collision with root package name */
    private final F f89629d;

    /* renamed from: e, reason: collision with root package name */
    private final X f89630e;

    /* renamed from: f, reason: collision with root package name */
    private final a f89631f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f89632g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f89633h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5516j<g0> f89634i;

    /* renamed from: j, reason: collision with root package name */
    private final K f89635j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f89636k;

    /* renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f89637l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f89622m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    static Kf.b<InterfaceC16890j> f89624o = new Kf.b() { // from class: com.google.firebase.messaging.t
        @Override // Kf.b
        public final Object get() {
            return FirebaseMessaging.e();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final Hf.d f89638a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f89639b;

        /* renamed from: c, reason: collision with root package name */
        private Hf.b<com.google.firebase.b> f89640c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f89641d;

        synchronized void b() {
            try {
                if (this.f89639b) {
                    return;
                }
                Boolean boolD = d();
                this.f89641d = boolD;
                if (boolD == null) {
                    Hf.b<com.google.firebase.b> bVar = new Hf.b() { // from class: com.google.firebase.messaging.C
                        @Override // Hf.b
                        public final void a(Hf.a aVar) {
                            FirebaseMessaging.a.a(this.f89613a, aVar);
                        }
                    };
                    this.f89640c = bVar;
                    this.f89638a.a(com.google.firebase.b.class, bVar);
                }
                this.f89639b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f89641d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f89626a.t();
        }

        synchronized void e(boolean z10) {
            try {
                b();
                Hf.b<com.google.firebase.b> bVar = this.f89640c;
                if (bVar != null) {
                    this.f89638a.b(com.google.firebase.b.class, bVar);
                    this.f89640c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f89626a.k().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.E();
                }
                this.f89641d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        a(Hf.d dVar) {
            this.f89638a = dVar;
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextK = FirebaseMessaging.this.f89626a.k();
            SharedPreferences sharedPreferences = contextK.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextK.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextK.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public static /* synthetic */ void a(a aVar, Hf.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.E();
            }
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, Jf.a aVar, Kf.b<eg.i> bVar, Kf.b<If.j> bVar2, Lf.e eVar, Kf.b<InterfaceC16890j> bVar3, Hf.d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new K(fVar.k()));
    }

    private synchronized void D() {
        if (!this.f89636k) {
            G(0L);
        }
    }

    public static /* synthetic */ InterfaceC16890j e() {
        return null;
    }

    synchronized void B(boolean z10) {
        this.f89636k = z10;
    }

    synchronized void G(long j10) {
        n(new c0(this, Math.min(Math.max(30L, 2 * j10), f89622m)), j10);
        this.f89636k = true;
    }

    private boolean C() {
        Q.c(this.f89628c);
        if (!Q.d(this.f89628c)) {
            return false;
        }
        if (this.f89626a.j(InterfaceC6375a.class) != null) {
            return true;
        }
        return J.a() && f89624o != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Jf.a aVar = this.f89627b;
        if (aVar != null) {
            aVar.a();
        } else if (H(t())) {
            D();
        }
    }

    public static /* synthetic */ AbstractC5516j a(FirebaseMessaging firebaseMessaging, String str, b0.a aVar, String str2) {
        q(firebaseMessaging.f89628c).f(firebaseMessaging.r(), str, str2, firebaseMessaging.f89635j.a());
        if (aVar == null || !str2.equals(aVar.f89731a)) {
            firebaseMessaging.x(str2);
        }
        return C5519m.f(str2);
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
        com.google.android.gms.common.internal.r.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging p() {
        return getInstance(com.google.firebase.f.l());
    }

    private static synchronized b0 q(Context context) {
        try {
            if (f89623n == null) {
                f89623n = new b0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89623n;
    }

    private String r() {
        return "[DEFAULT]".equals(this.f89626a.m()) ? "" : this.f89626a.o();
    }

    public static InterfaceC16890j u() {
        return f89624o.get();
    }

    private void v() {
        this.f89629d.e().h(this.f89632g, new InterfaceC5513g() { // from class: com.google.firebase.messaging.z
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.g(this.f89823a, (C14504a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Q.c(this.f89628c);
        T.f(this.f89628c, this.f89629d, C());
        if (C()) {
            v();
        }
    }

    private void x(String str) {
        if ("[DEFAULT]".equals(this.f89626a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f89626a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C11468n(this.f89628c).g(intent);
        }
    }

    public void A(boolean z10) {
        this.f89631f.e(z10);
    }

    @SuppressLint({"TaskMainThread"})
    public AbstractC5516j<Void> F(final String str) {
        return this.f89634i.s(new InterfaceC5515i() { // from class: com.google.firebase.messaging.r
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return ((g0) obj).q(str);
            }
        });
    }

    boolean H(b0.a aVar) {
        return aVar == null || aVar.b(this.f89635j.a());
    }

    @SuppressLint({"TaskMainThread"})
    public AbstractC5516j<Void> I(final String str) {
        return this.f89634i.s(new InterfaceC5515i() { // from class: com.google.firebase.messaging.u
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return ((g0) obj).t(str);
            }
        });
    }

    String m() throws IOException {
        Jf.a aVar = this.f89627b;
        if (aVar != null) {
            try {
                return (String) C5519m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final b0.a aVarT = t();
        if (!H(aVarT)) {
            return aVarT.f89731a;
        }
        final String strC = K.c(this.f89626a);
        try {
            return (String) C5519m.a(this.f89630e.b(strC, new X.a() { // from class: com.google.firebase.messaging.A
                @Override // com.google.firebase.messaging.X.a
                public final AbstractC5516j start() {
                    FirebaseMessaging firebaseMessaging = this.f89608a;
                    return firebaseMessaging.f89629d.f().t(firebaseMessaging.f89633h, new InterfaceC5515i() { // from class: com.google.firebase.messaging.s
                        @Override // Vd.InterfaceC5515i
                        public final AbstractC5516j then(Object obj) {
                            return FirebaseMessaging.a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    void n(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f89625p == null) {
                    f89625p = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16893b("TAG"));
                }
                f89625p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Context o() {
        return this.f89628c;
    }

    public AbstractC5516j<String> s() {
        Jf.a aVar = this.f89627b;
        if (aVar != null) {
            return aVar.c();
        }
        final C5517k c5517k = new C5517k();
        this.f89632g.execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f89611a, c5517k);
            }
        });
        return c5517k.a();
    }

    b0.a t() {
        return q(this.f89628c).d(r(), K.c(this.f89626a));
    }

    public boolean y() {
        return this.f89631f.c();
    }

    boolean z() {
        return this.f89635j.g();
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.y()) {
            firebaseMessaging.E();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, C5517k c5517k) {
        firebaseMessaging.getClass();
        try {
            c5517k.c(firebaseMessaging.m());
        } catch (Exception e10) {
            c5517k.b(e10);
        }
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, C14504a c14504a) {
        firebaseMessaging.getClass();
        if (c14504a != null) {
            J.y(c14504a.B());
            firebaseMessaging.v();
        }
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, g0 g0Var) {
        if (firebaseMessaging.y()) {
            g0Var.p();
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, Jf.a aVar, Kf.b<eg.i> bVar, Kf.b<If.j> bVar2, Lf.e eVar, Kf.b<InterfaceC16890j> bVar3, Hf.d dVar, K k10) {
        this(fVar, aVar, bVar3, dVar, k10, new F(fVar, k10, bVar, bVar2, eVar), C11469o.f(), C11469o.c(), C11469o.b());
    }

    FirebaseMessaging(com.google.firebase.f fVar, Jf.a aVar, Kf.b<InterfaceC16890j> bVar, Hf.d dVar, K k10, F f10, Executor executor, Executor executor2, Executor executor3) {
        this.f89636k = false;
        f89624o = bVar;
        this.f89626a = fVar;
        this.f89627b = aVar;
        this.f89631f = new a(dVar);
        Context contextK = fVar.k();
        this.f89628c = contextK;
        C11471q c11471q = new C11471q();
        this.f89637l = c11471q;
        this.f89635j = k10;
        this.f89629d = f10;
        this.f89630e = new X(executor);
        this.f89632g = executor2;
        this.f89633h = executor3;
        Context contextK2 = fVar.k();
        if (contextK2 instanceof Application) {
            ((Application) contextK2).registerActivityLifecycleCallbacks(c11471q);
        } else {
            FS.log_w("FirebaseMessaging", "Context " + contextK2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new a.InterfaceC0259a() { // from class: com.google.firebase.messaging.v
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f89820a);
            }
        });
        AbstractC5516j<g0> abstractC5516jF = g0.f(this, k10, f10, contextK, C11469o.g());
        this.f89634i = abstractC5516jF;
        abstractC5516jF.h(executor2, new InterfaceC5513g() { // from class: com.google.firebase.messaging.x
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.i(this.f89821a, (g0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f89822a.w();
            }
        });
    }
}
