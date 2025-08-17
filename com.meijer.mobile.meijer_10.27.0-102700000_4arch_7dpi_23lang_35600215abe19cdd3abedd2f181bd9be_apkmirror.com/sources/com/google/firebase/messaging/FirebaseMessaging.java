package com.google.firebase.messaging;

import Hf.a;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5229g;
import Td.InterfaceC5231i;
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
import com.fullstory.FS;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.V;
import com.google.firebase.messaging.Z;
import fd.C13874a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pc.InterfaceC16286j;
import pd.ThreadFactoryC16289b;

/* loaded from: classes7.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    private static Z f88783n;

    /* renamed from: p, reason: collision with root package name */
    static ScheduledExecutorService f88785p;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f88786a;

    /* renamed from: b, reason: collision with root package name */
    private final Hf.a f88787b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f88788c;

    /* renamed from: d, reason: collision with root package name */
    private final D f88789d;

    /* renamed from: e, reason: collision with root package name */
    private final V f88790e;

    /* renamed from: f, reason: collision with root package name */
    private final a f88791f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f88792g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f88793h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5232j<e0> f88794i;

    /* renamed from: j, reason: collision with root package name */
    private final I f88795j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f88796k;

    /* renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f88797l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f88782m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    static If.b<InterfaceC16286j> f88784o = new If.b() { // from class: com.google.firebase.messaging.r
        @Override // If.b
        public final Object get() {
            return FirebaseMessaging.d();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final Ff.d f88798a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f88799b;

        /* renamed from: c, reason: collision with root package name */
        private Ff.b<com.google.firebase.b> f88800c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f88801d;

        synchronized void b() {
            try {
                if (this.f88799b) {
                    return;
                }
                Boolean boolD = d();
                this.f88801d = boolD;
                if (boolD == null) {
                    Ff.b<com.google.firebase.b> bVar = new Ff.b() { // from class: com.google.firebase.messaging.A
                        @Override // Ff.b
                        public final void a(Ff.a aVar) {
                            FirebaseMessaging.a.a(this.f88768a, aVar);
                        }
                    };
                    this.f88800c = bVar;
                    this.f88798a.c(com.google.firebase.b.class, bVar);
                }
                this.f88799b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f88801d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f88786a.t();
        }

        synchronized void e(boolean z10) {
            try {
                b();
                Ff.b<com.google.firebase.b> bVar = this.f88800c;
                if (bVar != null) {
                    this.f88798a.a(com.google.firebase.b.class, bVar);
                    this.f88800c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f88786a.k().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.C();
                }
                this.f88801d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        a(Ff.d dVar) {
            this.f88798a = dVar;
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextK = FirebaseMessaging.this.f88786a.k();
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

        public static /* synthetic */ void a(a aVar, Ff.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.C();
            }
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, Hf.a aVar, If.b<cg.i> bVar, If.b<Gf.j> bVar2, Jf.e eVar, If.b<InterfaceC16286j> bVar3, Ff.d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new I(fVar.k()));
    }

    private synchronized void B() {
        if (!this.f88796k) {
            D(0L);
        }
    }

    public static /* synthetic */ InterfaceC16286j d() {
        return null;
    }

    synchronized void D(long j10) {
        l(new a0(this, Math.min(Math.max(30L, 2 * j10), f88782m)), j10);
        this.f88796k = true;
    }

    synchronized void z(boolean z10) {
        this.f88796k = z10;
    }

    private boolean A() {
        O.c(this.f88788c);
        if (!O.d(this.f88788c)) {
            return false;
        }
        if (this.f88786a.j(Ze.a.class) != null) {
            return true;
        }
        return H.a() && f88784o != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Hf.a aVar = this.f88787b;
        if (aVar != null) {
            aVar.a();
        } else if (E(r())) {
            B();
        }
    }

    public static /* synthetic */ AbstractC5232j a(FirebaseMessaging firebaseMessaging, String str, Z.a aVar, String str2) {
        o(firebaseMessaging.f88788c).f(firebaseMessaging.p(), str, str2, firebaseMessaging.f88795j.a());
        if (aVar == null || !str2.equals(aVar.f88863a)) {
            firebaseMessaging.v(str2);
        }
        return C5235m.f(str2);
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
        com.google.android.gms.common.internal.r.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        return getInstance(com.google.firebase.f.l());
    }

    private static synchronized Z o(Context context) {
        try {
            if (f88783n == null) {
                f88783n = new Z(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f88783n;
    }

    private String p() {
        return "[DEFAULT]".equals(this.f88786a.m()) ? "" : this.f88786a.o();
    }

    public static InterfaceC16286j s() {
        return f88784o.get();
    }

    private void t() {
        this.f88789d.e().h(this.f88792g, new InterfaceC5229g() { // from class: com.google.firebase.messaging.w
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(this.f88973a, (C13874a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        O.c(this.f88788c);
        Q.f(this.f88788c, this.f88789d, A());
        if (A()) {
            t();
        }
    }

    private void v(String str) {
        if ("[DEFAULT]".equals(this.f88786a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f88786a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C11343n(this.f88788c).g(intent);
        }
    }

    boolean E(Z.a aVar) {
        return aVar == null || aVar.b(this.f88795j.a());
    }

    String k() throws IOException {
        Hf.a aVar = this.f88787b;
        if (aVar != null) {
            try {
                return (String) C5235m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final Z.a aVarR = r();
        if (!E(aVarR)) {
            return aVarR.f88863a;
        }
        final String strC = I.c(this.f88786a);
        try {
            return (String) C5235m.a(this.f88790e.b(strC, new V.a() { // from class: com.google.firebase.messaging.x
                @Override // com.google.firebase.messaging.V.a
                public final AbstractC5232j start() {
                    FirebaseMessaging firebaseMessaging = this.f88974a;
                    return firebaseMessaging.f88789d.f().t(firebaseMessaging.f88793h, new InterfaceC5231i() { // from class: com.google.firebase.messaging.z
                        @Override // Td.InterfaceC5231i
                        public final AbstractC5232j then(Object obj) {
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
    void l(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f88785p == null) {
                    f88785p = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16289b("TAG"));
                }
                f88785p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Context m() {
        return this.f88788c;
    }

    public AbstractC5232j<String> q() {
        Hf.a aVar = this.f88787b;
        if (aVar != null) {
            return aVar.c();
        }
        final C5233k c5233k = new C5233k();
        this.f88792g.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f88977a, c5233k);
            }
        });
        return c5233k.a();
    }

    Z.a r() {
        return o(this.f88788c).d(p(), I.c(this.f88786a));
    }

    public boolean w() {
        return this.f88791f.c();
    }

    boolean x() {
        return this.f88795j.g();
    }

    public void y(boolean z10) {
        this.f88791f.e(z10);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.w()) {
            firebaseMessaging.C();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, C5233k c5233k) {
        firebaseMessaging.getClass();
        try {
            c5233k.c(firebaseMessaging.k());
        } catch (Exception e10) {
            c5233k.b(e10);
        }
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, C13874a c13874a) {
        firebaseMessaging.getClass();
        if (c13874a != null) {
            H.y(c13874a.B());
            firebaseMessaging.t();
        }
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, e0 e0Var) {
        if (firebaseMessaging.w()) {
            e0Var.n();
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, Hf.a aVar, If.b<cg.i> bVar, If.b<Gf.j> bVar2, Jf.e eVar, If.b<InterfaceC16286j> bVar3, Ff.d dVar, I i10) {
        this(fVar, aVar, bVar3, dVar, i10, new D(fVar, i10, bVar, bVar2, eVar), C11344o.f(), C11344o.c(), C11344o.b());
    }

    FirebaseMessaging(com.google.firebase.f fVar, Hf.a aVar, If.b<InterfaceC16286j> bVar, Ff.d dVar, I i10, D d10, Executor executor, Executor executor2, Executor executor3) {
        this.f88796k = false;
        f88784o = bVar;
        this.f88786a = fVar;
        this.f88787b = aVar;
        this.f88791f = new a(dVar);
        Context contextK = fVar.k();
        this.f88788c = contextK;
        C11346q c11346q = new C11346q();
        this.f88797l = c11346q;
        this.f88795j = i10;
        this.f88789d = d10;
        this.f88790e = new V(executor);
        this.f88792g = executor2;
        this.f88793h = executor3;
        Context contextK2 = fVar.k();
        if (contextK2 instanceof Application) {
            ((Application) contextK2).registerActivityLifecycleCallbacks(c11346q);
        } else {
            FS.log_w("FirebaseMessaging", "Context " + contextK2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new a.InterfaceC0191a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f88970a);
            }
        });
        AbstractC5232j<e0> abstractC5232jE = e0.e(this, i10, d10, contextK, C11344o.g());
        this.f88794i = abstractC5232jE;
        abstractC5232jE.h(executor2, new InterfaceC5229g() { // from class: com.google.firebase.messaging.u
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f88971a, (e0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f88972a.u();
            }
        });
    }
}
