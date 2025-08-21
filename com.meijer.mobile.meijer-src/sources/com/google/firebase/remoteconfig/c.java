package com.google.firebase.remoteconfig;

import Lf.e;
import Vd.C5519m;
import android.app.Application;
import android.content.Context;
import bf.InterfaceC6375a;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.x;
import gg.C14360a;
import gg.C14364e;
import hg.InterfaceC14521a;
import ig.InterfaceC14733f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import jd.ComponentCallbacks2C14980c;

/* loaded from: classes8.dex */
public class c implements InterfaceC14521a {

    /* renamed from: j, reason: collision with root package name */
    private static final f f90010j = i.d();

    /* renamed from: k, reason: collision with root package name */
    private static final Random f90011k = new Random();

    /* renamed from: l, reason: collision with root package name */
    private static final Map<String, com.google.firebase.remoteconfig.a> f90012l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.google.firebase.remoteconfig.a> f90013a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f90014b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f90015c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f90016d;

    /* renamed from: e, reason: collision with root package name */
    private final e f90017e;

    /* renamed from: f, reason: collision with root package name */
    private final Ze.b f90018f;

    /* renamed from: g, reason: collision with root package name */
    private final Kf.b<InterfaceC6375a> f90019g;

    /* renamed from: h, reason: collision with root package name */
    private final String f90020h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, String> f90021i;

    c(Context context, @cf.b ScheduledExecutorService scheduledExecutorService, com.google.firebase.f fVar, e eVar, Ze.b bVar, Kf.b<InterfaceC6375a> bVar2) {
        this(context, scheduledExecutorService, fVar, eVar, bVar, bVar2, true);
    }

    public static /* synthetic */ InterfaceC6375a b() {
        return null;
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                com.google.firebase.remoteconfig.internal.f fVarF = f(str, "fetch");
                com.google.firebase.remoteconfig.internal.f fVarF2 = f(str, "activate");
                com.google.firebase.remoteconfig.internal.f fVarF3 = f(str, "defaults");
                t tVarN = n(this.f90014b, this.f90020h, str);
                o oVarJ = j(fVarF2, fVarF3);
                final x xVarK = k(this.f90016d, str, this.f90019g);
                if (xVarK != null) {
                    try {
                        oVarJ.b(new d() { // from class: fg.k
                            @Override // com.google.android.gms.common.util.d
                            public final void accept(Object obj, Object obj2) {
                                xVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                            }
                        });
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return d(this.f90016d, str, this.f90017e, this.f90018f, this.f90015c, fVarF, fVarF2, fVarF3, h(str, fVarF, tVarN), oVarJ, tVarN, m(fVarF2, fVarF3));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new m(this.f90017e, p(this.f90016d) ? this.f90019g : new Kf.b() { // from class: fg.l
            @Override // Kf.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.b();
            }
        }, this.f90015c, f90010j, f90011k, fVar, i(this.f90016d.n().b(), str, tVar), tVar, this.f90021i);
    }

    synchronized p l(com.google.firebase.f fVar, e eVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
        return new p(fVar, eVar, mVar, fVar2, context, str, tVar, this.f90015c);
    }

    private static class a implements ComponentCallbacks2C14980c.a {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f90022a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f90022a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (U.d.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C14980c.c(application);
                    ComponentCallbacks2C14980c.b().a(aVar);
                }
            }
        }

        @Override // jd.ComponentCallbacks2C14980c.a
        public void a(boolean z10) {
            c.q(z10);
        }
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.f fVar, e eVar, Ze.b bVar, Kf.b<InterfaceC6375a> bVar2, boolean z10) {
        this.f90013a = new HashMap();
        this.f90021i = new HashMap();
        this.f90014b = context;
        this.f90015c = scheduledExecutorService;
        this.f90016d = fVar;
        this.f90017e = eVar;
        this.f90018f = bVar;
        this.f90019g = bVar2;
        this.f90020h = fVar.n().c();
        a.c(context);
        if (z10) {
            C5519m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f90009a.g();
                }
            });
        }
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f90015c, u.c(this.f90014b, String.format("%s_%s_%s_%s.json", "frc", this.f90020h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f90015c, fVar, fVar2);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean o(com.google.firebase.f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        Iterator<com.google.firebase.remoteconfig.a> it = f90012l.values().iterator();
        while (it.hasNext()) {
            it.next().m(z10);
        }
    }

    synchronized com.google.firebase.remoteconfig.a d(com.google.firebase.f fVar, String str, e eVar, Ze.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, C14364e c14364e) throws Throwable {
        c cVar;
        String str2;
        try {
            try {
                if (this.f90013a.containsKey(str)) {
                    cVar = this;
                    str2 = str;
                } else {
                    cVar = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f90014b, fVar, eVar, o(fVar, str) ? bVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, l(fVar, eVar, mVar, fVar3, this.f90014b, str, tVar), c14364e);
                    aVar.n();
                    cVar.f90013a.put(str2, aVar);
                    f90012l.put(str2, aVar);
                }
                return cVar.f90013a.get(str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    ConfigFetchHttpClient i(String str, String str2, t tVar) {
        return new ConfigFetchHttpClient(this.f90014b, this.f90016d.n().c(), str, str2, tVar.c(), tVar.c());
    }

    private static x k(com.google.firebase.f fVar, String str, Kf.b<InterfaceC6375a> bVar) {
        if (p(fVar) && str.equals("firebase")) {
            return new x(bVar);
        }
        return null;
    }

    private C14364e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new C14364e(fVar, C14360a.a(fVar, fVar2), this.f90015c);
    }

    private static boolean p(com.google.firebase.f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    @Override // hg.InterfaceC14521a
    public void a(String str, InterfaceC14733f interfaceC14733f) {
        e(str).j().e(interfaceC14733f);
    }
}
