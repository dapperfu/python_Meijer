package com.google.firebase;

import Z.C5503a;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bf.C6245c;
import bf.C6248f;
import bf.n;
import bf.t;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.p;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import hd.ComponentCallbacks2C14402c;
import j2.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f88709k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map<String, f> f88710l = new C5503a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f88711a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88712b;

    /* renamed from: c, reason: collision with root package name */
    private final m f88713c;

    /* renamed from: d, reason: collision with root package name */
    private final bf.n f88714d;

    /* renamed from: g, reason: collision with root package name */
    private final t<Of.a> f88717g;

    /* renamed from: h, reason: collision with root package name */
    private final If.b<Gf.f> f88718h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f88715e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f88716f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f88719i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<g> f88720j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f88722b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f88723a;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f88722b.get() == null) {
                c cVar = new c(context);
                if (U.d.a(f88722b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f88723a.unregisterReceiver(this);
        }

        public c(Context context) {
            this.f88723a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f88709k) {
                try {
                    Iterator<f> it = f.f88710l.values().iterator();
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
    private static class b implements ComponentCallbacks2C14402c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f88721a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f88721a.get() == null) {
                    b bVar = new b();
                    if (U.d.a(f88721a, null, bVar)) {
                        ComponentCallbacks2C14402c.c(application);
                        ComponentCallbacks2C14402c.b().a(bVar);
                    }
                }
            }
        }

        @Override // hd.ComponentCallbacks2C14402c.a
        public void a(boolean z10) {
            synchronized (f.f88709k) {
                try {
                    Iterator it = new ArrayList(f.f88710l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f88715e.get()) {
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
            fVar.f88718h.get().h();
        }
    }

    public static /* synthetic */ Of.a b(f fVar, Context context) {
        return new Of.a(context, fVar.o(), (Ff.c) fVar.f88714d.a(Ff.c.class));
    }

    private void i() {
        r.q(!this.f88716f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f88709k) {
            try {
                fVar = f88710l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                fVar.f88718h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!o.a(this.f88711a)) {
            FS.log_i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f88711a);
            return;
        }
        FS.log_i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f88714d.p(u());
        this.f88718h.get().h();
    }

    public static f q(Context context) {
        synchronized (f88709k) {
            try {
                if (f88710l.containsKey("[DEFAULT]")) {
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
        Iterator<a> it = this.f88719i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f88712b.equals(((f) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return this.f88712b.hashCode();
    }

    public String o() {
        return com.google.android.gms.common.util.c.b(m().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    protected f(final Context context, String str, m mVar) {
        this.f88711a = (Context) r.l(context);
        this.f88712b = r.f(str);
        this.f88713c = (m) r.l(mVar);
        n nVarB = FirebaseInitProvider.b();
        lg.c.b("Firebase");
        lg.c.b("ComponentDiscovery");
        List<If.b<ComponentRegistrar>> listB = C6248f.c(context, ComponentDiscoveryService.class).b();
        lg.c.a();
        lg.c.b("Runtime");
        n.b bVarF = bf.n.m(cf.l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C6245c.q(context, Context.class, new Class[0])).b(C6245c.q(this, f.class, new Class[0])).b(C6245c.q(mVar, m.class, new Class[0])).f(new lg.b());
        if (o.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C6245c.q(nVarB, n.class, new Class[0]));
        }
        bf.n nVarE = bVarF.e();
        this.f88714d = nVarE;
        lg.c.a();
        this.f88717g = new t<>(new If.b() { // from class: com.google.firebase.d
            @Override // If.b
            public final Object get() {
                return f.b(this.f88706a, context);
            }
        });
        this.f88718h = nVarE.f(Gf.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void a(boolean z10) {
                f.a(this.f88708a, z10);
            }
        });
        lg.c.a();
    }

    public static f s(Context context, m mVar, String str) {
        f fVar;
        b.c(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f88709k) {
            Map<String, f> map = f88710l;
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
        if (this.f88715e.get() && ComponentCallbacks2C14402c.b().d()) {
            aVar.a(true);
        }
        this.f88719i.add(aVar);
    }

    public void h(g gVar) {
        i();
        r.l(gVar);
        this.f88720j.add(gVar);
    }

    public <T> T j(Class<T> cls) {
        i();
        return (T) this.f88714d.a(cls);
    }

    public Context k() {
        i();
        return this.f88711a;
    }

    public String m() {
        i();
        return this.f88712b;
    }

    public m n() {
        i();
        return this.f88713c;
    }

    public boolean t() {
        i();
        return this.f88717g.get().b();
    }

    public String toString() {
        return C6535q.c(this).a("name", this.f88712b).a("options", this.f88713c).toString();
    }
}
