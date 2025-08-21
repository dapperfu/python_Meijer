package com.google.firebase;

import Z.C5603a;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.p;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import df.C13676c;
import df.C13679f;
import df.n;
import df.t;
import j2.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jd.ComponentCallbacks2C14980c;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f89549k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map<String, f> f89550l = new C5603a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f89551a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89552b;

    /* renamed from: c, reason: collision with root package name */
    private final m f89553c;

    /* renamed from: d, reason: collision with root package name */
    private final df.n f89554d;

    /* renamed from: g, reason: collision with root package name */
    private final t<Qf.a> f89557g;

    /* renamed from: h, reason: collision with root package name */
    private final Kf.b<If.f> f89558h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f89555e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f89556f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f89559i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<g> f89560j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f89562b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f89563a;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f89562b.get() == null) {
                c cVar = new c(context);
                if (U.d.a(f89562b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f89563a.unregisterReceiver(this);
        }

        public c(Context context) {
            this.f89563a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f89549k) {
                try {
                    Iterator<f> it = f.f89550l.values().iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    @TargetApi(14)
    private static class b implements ComponentCallbacks2C14980c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f89561a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f89561a.get() == null) {
                    b bVar = new b();
                    if (U.d.a(f89561a, null, bVar)) {
                        ComponentCallbacks2C14980c.c(application);
                        ComponentCallbacks2C14980c.b().a(bVar);
                    }
                }
            }
        }

        @Override // jd.ComponentCallbacks2C14980c.a
        public void a(boolean z10) {
            synchronized (f.f89549k) {
                try {
                    Iterator it = new ArrayList(f.f89550l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f89555e.get()) {
                            fVar.w(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void a(f fVar, boolean z10) {
        if (z10) {
            fVar.getClass();
        } else {
            fVar.f89558h.get().h();
        }
    }

    public static /* synthetic */ Qf.a b(f fVar, Context context) {
        return new Qf.a(context, fVar.o(), (Hf.c) fVar.f89554d.a(Hf.c.class));
    }

    private void i() {
        r.q(!this.f89556f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f89549k) {
            try {
                fVar = f89550l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                fVar.f89558h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!o.a(this.f89551a)) {
            FS.log_i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f89551a);
            return;
        }
        FS.log_i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f89554d.p(u());
        this.f89558h.get().h();
    }

    public static f q(Context context) {
        synchronized (f89549k) {
            try {
                if (f89550l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    FS.log_w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f r(Context context, m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z10) {
        FS.log_d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f89559i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f89552b.equals(((f) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return this.f89552b.hashCode();
    }

    public String o() {
        return com.google.android.gms.common.util.c.b(m().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    protected f(final Context context, String str, m mVar) {
        this.f89551a = (Context) r.l(context);
        this.f89552b = r.f(str);
        this.f89553c = (m) r.l(mVar);
        n nVarB = FirebaseInitProvider.b();
        ng.c.b("Firebase");
        ng.c.b("ComponentDiscovery");
        List<Kf.b<ComponentRegistrar>> listB = C13679f.c(context, ComponentDiscoveryService.class).b();
        ng.c.a();
        ng.c.b("Runtime");
        n.b bVarF = df.n.m(ef.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C13676c.q(context, Context.class, new Class[0])).b(C13676c.q(this, f.class, new Class[0])).b(C13676c.q(mVar, m.class, new Class[0])).f(new ng.b());
        if (o.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C13676c.q(nVarB, n.class, new Class[0]));
        }
        df.n nVarE = bVarF.e();
        this.f89554d = nVarE;
        ng.c.a();
        this.f89557g = new t<>(new Kf.b() { // from class: com.google.firebase.d
            @Override // Kf.b
            public final Object get() {
                return f.b(this.f89546a, context);
            }
        });
        this.f89558h = nVarE.g(If.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void a(boolean z10) {
                f.a(this.f89548a, z10);
            }
        });
        ng.c.a();
    }

    public static f s(Context context, m mVar, String str) {
        f fVar;
        b.c(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f89549k) {
            Map<String, f> map = f89550l;
            r.q(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            r.m(context, "Application context cannot be null.");
            fVar = new f(context, strV, mVar);
            map.put(strV, fVar);
        }
        fVar.p();
        return fVar;
    }

    private static String v(String str) {
        return str.trim();
    }

    public void g(a aVar) {
        i();
        if (this.f89555e.get() && ComponentCallbacks2C14980c.b().d()) {
            aVar.a(true);
        }
        this.f89559i.add(aVar);
    }

    public void h(g gVar) {
        i();
        r.l(gVar);
        this.f89560j.add(gVar);
    }

    public <T> T j(Class<T> cls) {
        i();
        return (T) this.f89554d.a(cls);
    }

    public Context k() {
        i();
        return this.f89551a;
    }

    public String m() {
        i();
        return this.f89552b;
    }

    public m n() {
        i();
        return this.f89553c;
    }

    public boolean t() {
        i();
        return this.f89557g.get().b();
    }

    public String toString() {
        return C6660q.c(this).a("name", this.f89552b).a("options", this.f89553c).toString();
    }
}
