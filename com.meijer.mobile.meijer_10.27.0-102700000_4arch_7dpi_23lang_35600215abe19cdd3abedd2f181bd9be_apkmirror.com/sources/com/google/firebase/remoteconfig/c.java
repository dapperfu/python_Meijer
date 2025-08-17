package com.google.firebase.remoteconfig;

import Jf.e;
import Td.C5235m;
import android.app.Application;
import android.content.Context;
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
import eg.C13656a;
import eg.C13660e;
import fg.InterfaceC13891a;
import gg.InterfaceC14259f;
import hd.ComponentCallbacks2C14402c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class c implements InterfaceC13891a {

    /* renamed from: j, reason: collision with root package name */
    private static final f f89168j = i.d();

    /* renamed from: k, reason: collision with root package name */
    private static final Random f89169k = new Random();

    /* renamed from: l, reason: collision with root package name */
    private static final Map<String, com.google.firebase.remoteconfig.a> f89170l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.google.firebase.remoteconfig.a> f89171a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f89172b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f89173c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f89174d;

    /* renamed from: e, reason: collision with root package name */
    private final e f89175e;

    /* renamed from: f, reason: collision with root package name */
    private final Xe.b f89176f;

    /* renamed from: g, reason: collision with root package name */
    private final If.b<Ze.a> f89177g;

    /* renamed from: h, reason: collision with root package name */
    private final String f89178h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, String> f89179i;

    c(Context context, @af.b ScheduledExecutorService scheduledExecutorService, com.google.firebase.f fVar, e eVar, Xe.b bVar, If.b<Ze.a> bVar2) {
        this(context, scheduledExecutorService, fVar, eVar, bVar, bVar2, true);
    }

    public static /* synthetic */ Ze.a b() {
        return null;
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                com.google.firebase.remoteconfig.internal.f fVarF = f(str, "fetch");
                com.google.firebase.remoteconfig.internal.f fVarF2 = f(str, "activate");
                com.google.firebase.remoteconfig.internal.f fVarF3 = f(str, "defaults");
                t tVarN = n(this.f89172b, this.f89178h, str);
                o oVarJ = j(fVarF2, fVarF3);
                final x xVarK = k(this.f89174d, str, this.f89177g);
                if (xVarK != null) {
                    try {
                        oVarJ.b(new d() { // from class: dg.k
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
                return d(this.f89174d, str, this.f89175e, this.f89176f, this.f89173c, fVarF, fVarF2, fVarF3, h(str, fVarF, tVarN), oVarJ, tVarN, m(fVarF2, fVarF3));
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
        return new m(this.f89175e, p(this.f89174d) ? this.f89177g : new If.b() { // from class: dg.l
            @Override // If.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.b();
            }
        }, this.f89173c, f89168j, f89169k, fVar, i(this.f89174d.n().b(), str, tVar), tVar, this.f89179i);
    }

    synchronized p l(com.google.firebase.f fVar, e eVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
        return new p(fVar, eVar, mVar, fVar2, context, str, tVar, this.f89173c);
    }

    private static class a implements ComponentCallbacks2C14402c.a {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f89180a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f89180a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (U.d.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C14402c.c(application);
                    ComponentCallbacks2C14402c.b().a(aVar);
                }
            }
        }

        @Override // hd.ComponentCallbacks2C14402c.a
        public void a(boolean z10) {
            c.q(z10);
        }
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.f fVar, e eVar, Xe.b bVar, If.b<Ze.a> bVar2, boolean z10) {
        this.f89171a = new HashMap();
        this.f89179i = new HashMap();
        this.f89172b = context;
        this.f89173c = scheduledExecutorService;
        this.f89174d = fVar;
        this.f89175e = eVar;
        this.f89176f = bVar;
        this.f89177g = bVar2;
        this.f89178h = fVar.n().c();
        a.c(context);
        if (z10) {
            C5235m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f89167a.g();
                }
            });
        }
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f89173c, u.c(this.f89172b, String.format("%s_%s_%s_%s.json", "frc", this.f89178h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f89173c, fVar, fVar2);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean o(com.google.firebase.f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        Iterator<com.google.firebase.remoteconfig.a> it = f89170l.values().iterator();
        while (it.hasNext()) {
            it.next().m(z10);
        }
    }

    synchronized com.google.firebase.remoteconfig.a d(com.google.firebase.f fVar, String str, e eVar, Xe.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, C13660e c13660e) throws Throwable {
        c cVar;
        String str2;
        try {
            try {
                if (this.f89171a.containsKey(str)) {
                    cVar = this;
                    str2 = str;
                } else {
                    cVar = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f89172b, fVar, eVar, o(fVar, str) ? bVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, l(fVar, eVar, mVar, fVar3, this.f89172b, str, tVar), c13660e);
                    aVar.n();
                    cVar.f89171a.put(str2, aVar);
                    f89170l.put(str2, aVar);
                }
                return cVar.f89171a.get(str2);
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
        return new ConfigFetchHttpClient(this.f89172b, this.f89174d.n().c(), str, str2, tVar.c(), tVar.c());
    }

    private static x k(com.google.firebase.f fVar, String str, If.b<Ze.a> bVar) {
        if (p(fVar) && str.equals("firebase")) {
            return new x(bVar);
        }
        return null;
    }

    private C13660e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new C13660e(fVar, C13656a.a(fVar, fVar2), this.f89173c);
    }

    private static boolean p(com.google.firebase.f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    @Override // fg.InterfaceC13891a
    public void a(String str, InterfaceC14259f interfaceC14259f) {
        e(str).j().e(interfaceC14259f);
    }
}
