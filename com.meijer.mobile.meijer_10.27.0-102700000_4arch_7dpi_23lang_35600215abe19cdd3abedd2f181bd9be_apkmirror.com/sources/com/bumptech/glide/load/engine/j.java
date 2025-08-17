package com.bumptech.glide.load.engine;

import Z6.a;
import Z6.h;
import a7.ExecutorServiceC5584a;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.Map;
import java.util.concurrent.Executor;
import m7.InterfaceC15573h;
import q7.C16480a;

/* loaded from: classes4.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f63902i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final p f63903a;

    /* renamed from: b, reason: collision with root package name */
    private final n f63904b;

    /* renamed from: c, reason: collision with root package name */
    private final Z6.h f63905c;

    /* renamed from: d, reason: collision with root package name */
    private final b f63906d;

    /* renamed from: e, reason: collision with root package name */
    private final u f63907e;

    /* renamed from: f, reason: collision with root package name */
    private final c f63908f;

    /* renamed from: g, reason: collision with root package name */
    private final a f63909g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f63910h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f63911a;

        /* renamed from: b, reason: collision with root package name */
        final o2.f<h<?>> f63912b = C16480a.d(BinsView.TOTE_WIDTH_DP, new C1248a());

        /* renamed from: c, reason: collision with root package name */
        private int f63913c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C1248a implements C16480a.d<h<?>> {
            C1248a() {
            }

            @Override // q7.C16480a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f63911a, aVar.f63912b);
            }
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, m mVar, V6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, X6.a aVar, Map<Class<?>, V6.k<?>> map, boolean z10, boolean z11, boolean z12, V6.g gVar2, h.b<R> bVar) {
            h hVar = (h) p7.k.d(this.f63912b.b());
            int i12 = this.f63913c;
            this.f63913c = i12 + 1;
            return hVar.D(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z12, gVar2, bVar, i12);
        }

        a(h.e eVar) {
            this.f63911a = eVar;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final ExecutorServiceC5584a f63915a;

        /* renamed from: b, reason: collision with root package name */
        final ExecutorServiceC5584a f63916b;

        /* renamed from: c, reason: collision with root package name */
        final ExecutorServiceC5584a f63917c;

        /* renamed from: d, reason: collision with root package name */
        final ExecutorServiceC5584a f63918d;

        /* renamed from: e, reason: collision with root package name */
        final l f63919e;

        /* renamed from: f, reason: collision with root package name */
        final o.a f63920f;

        /* renamed from: g, reason: collision with root package name */
        final o2.f<k<?>> f63921g = C16480a.d(BinsView.TOTE_WIDTH_DP, new a());

        class a implements C16480a.d<k<?>> {
            a() {
            }

            @Override // q7.C16480a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k<?> a() {
                b bVar = b.this;
                return new k<>(bVar.f63915a, bVar.f63916b, bVar.f63917c, bVar.f63918d, bVar.f63919e, bVar.f63920f, bVar.f63921g);
            }
        }

        <R> k<R> a(V6.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) p7.k.d(this.f63921g.b())).l(eVar, z10, z11, z12, z13);
        }

        b(ExecutorServiceC5584a executorServiceC5584a, ExecutorServiceC5584a executorServiceC5584a2, ExecutorServiceC5584a executorServiceC5584a3, ExecutorServiceC5584a executorServiceC5584a4, l lVar, o.a aVar) {
            this.f63915a = executorServiceC5584a;
            this.f63916b = executorServiceC5584a2;
            this.f63917c = executorServiceC5584a3;
            this.f63918d = executorServiceC5584a4;
            this.f63919e = lVar;
            this.f63920f = aVar;
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0903a f63923a;

        /* renamed from: b, reason: collision with root package name */
        private volatile Z6.a f63924b;

        @Override // com.bumptech.glide.load.engine.h.e
        public Z6.a a() {
            if (this.f63924b == null) {
                synchronized (this) {
                    try {
                        if (this.f63924b == null) {
                            this.f63924b = this.f63923a.build();
                        }
                        if (this.f63924b == null) {
                            this.f63924b = new Z6.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f63924b;
        }

        c(a.InterfaceC0903a interfaceC0903a) {
            this.f63923a = interfaceC0903a;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final k<?> f63925a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC15573h f63926b;

        d(InterfaceC15573h interfaceC15573h, k<?> kVar) {
            this.f63926b = interfaceC15573h;
            this.f63925a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f63925a.r(this.f63926b);
            }
        }
    }

    public j(Z6.h hVar, a.InterfaceC0903a interfaceC0903a, ExecutorServiceC5584a executorServiceC5584a, ExecutorServiceC5584a executorServiceC5584a2, ExecutorServiceC5584a executorServiceC5584a3, ExecutorServiceC5584a executorServiceC5584a4, boolean z10) {
        this(hVar, interfaceC0903a, executorServiceC5584a, executorServiceC5584a2, executorServiceC5584a3, executorServiceC5584a4, null, null, null, null, null, null, z10);
    }

    private o<?> i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o<?> oVarG = g(mVar);
        if (oVarG != null) {
            if (f63902i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return oVarG;
        }
        o<?> oVarH = h(mVar);
        if (oVarH == null) {
            return null;
        }
        if (f63902i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return oVarH;
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, V6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, X6.a aVar, Map<Class<?>, V6.k<?>> map, boolean z10, boolean z11, V6.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC15573h interfaceC15573h, Executor executor, m mVar, long j10) {
        k<?> kVarA = this.f63903a.a(mVar, z15);
        if (kVarA != null) {
            kVarA.a(interfaceC15573h, executor);
            if (f63902i) {
                j("Added to existing load", j10, mVar);
            }
            return new d(interfaceC15573h, kVarA);
        }
        k<R> kVarA2 = this.f63906d.a(mVar, z12, z13, z14, z15);
        h<R> hVarA = this.f63909g.a(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z15, gVar2, kVarA2);
        this.f63903a.c(mVar, kVarA2);
        kVarA2.a(interfaceC15573h, executor);
        kVarA2.s(hVarA);
        if (f63902i) {
            j("Started new load", j10, mVar);
        }
        return new d(interfaceC15573h, kVarA2);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k<?> kVar, V6.e eVar, o<?> oVar) {
        if (oVar != null) {
            try {
                if (oVar.e()) {
                    this.f63910h.a(eVar, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f63903a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void c(k<?> kVar, V6.e eVar) {
        this.f63903a.d(eVar, kVar);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, V6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, X6.a aVar, Map<Class<?>, V6.k<?>> map, boolean z10, boolean z11, V6.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC15573h interfaceC15573h, Executor executor) {
        long jB = f63902i ? p7.g.b() : 0L;
        m mVarA = this.f63904b.a(obj, eVar, i10, i11, map, cls, cls2, gVar2);
        synchronized (this) {
            try {
                o<?> oVarI = i(mVarA, z12, jB);
                if (oVarI == null) {
                    return l(dVar, obj, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, gVar2, z12, z13, z14, z15, interfaceC15573h, executor, mVarA, jB);
                }
                interfaceC15573h.b(oVarI, V6.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    j(Z6.h hVar, a.InterfaceC0903a interfaceC0903a, ExecutorServiceC5584a executorServiceC5584a, ExecutorServiceC5584a executorServiceC5584a2, ExecutorServiceC5584a executorServiceC5584a3, ExecutorServiceC5584a executorServiceC5584a4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar, b bVar, a aVar2, u uVar, boolean z10) {
        this.f63905c = hVar;
        c cVar = new c(interfaceC0903a);
        this.f63908f = cVar;
        com.bumptech.glide.load.engine.a aVar3 = aVar == null ? new com.bumptech.glide.load.engine.a(z10) : aVar;
        this.f63910h = aVar3;
        aVar3.f(this);
        this.f63904b = nVar == null ? new n() : nVar;
        this.f63903a = pVar == null ? new p() : pVar;
        this.f63906d = bVar == null ? new b(executorServiceC5584a, executorServiceC5584a2, executorServiceC5584a3, executorServiceC5584a4, this, this) : bVar;
        this.f63909g = aVar2 == null ? new a(cVar) : aVar2;
        this.f63907e = uVar == null ? new u() : uVar;
        hVar.d(this);
    }

    private o<?> e(V6.e eVar) {
        X6.c<?> cVarC = this.f63905c.c(eVar);
        if (cVarC == null) {
            return null;
        }
        return cVarC instanceof o ? (o) cVarC : new o<>(cVarC, true, true, eVar, this);
    }

    private o<?> g(V6.e eVar) {
        o<?> oVarE = this.f63910h.e(eVar);
        if (oVarE != null) {
            oVarE.b();
        }
        return oVarE;
    }

    private static void j(String str, long j10, V6.e eVar) {
        FS.log_v("Engine", str + " in " + p7.g.a(j10) + "ms, key: " + eVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void a(V6.e eVar, o<?> oVar) {
        this.f63910h.d(eVar);
        if (oVar.e()) {
            this.f63905c.e(eVar, oVar);
        } else {
            this.f63907e.a(oVar, false);
        }
    }

    @Override // Z6.h.a
    public void d(X6.c<?> cVar) {
        this.f63907e.a(cVar, true);
    }

    public void k(X6.c<?> cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).f();
    }

    private o<?> h(V6.e eVar) {
        o<?> oVarE = e(eVar);
        if (oVarE != null) {
            oVarE.b();
            this.f63910h.a(eVar, oVarE);
        }
        return oVarE;
    }
}
