package com.bumptech.glide.load.engine;

import android.util.Log;
import b7.InterfaceC6336a;
import b7.h;
import c7.ExecutorServiceC6490a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.Map;
import java.util.concurrent.Executor;
import o7.InterfaceC16083h;
import s7.C17028a;

/* loaded from: classes4.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f64742i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final p f64743a;

    /* renamed from: b, reason: collision with root package name */
    private final n f64744b;

    /* renamed from: c, reason: collision with root package name */
    private final b7.h f64745c;

    /* renamed from: d, reason: collision with root package name */
    private final b f64746d;

    /* renamed from: e, reason: collision with root package name */
    private final u f64747e;

    /* renamed from: f, reason: collision with root package name */
    private final c f64748f;

    /* renamed from: g, reason: collision with root package name */
    private final a f64749g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f64750h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f64751a;

        /* renamed from: b, reason: collision with root package name */
        final o2.f<h<?>> f64752b = C17028a.d(BinsView.TOTE_WIDTH_DP, new C1257a());

        /* renamed from: c, reason: collision with root package name */
        private int f64753c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C1257a implements C17028a.d<h<?>> {
            C1257a() {
            }

            @Override // s7.C17028a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f64751a, aVar.f64752b);
            }
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, m mVar, X6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, Z6.a aVar, Map<Class<?>, X6.k<?>> map, boolean z10, boolean z11, boolean z12, X6.g gVar2, h.b<R> bVar) {
            h hVar = (h) r7.k.d(this.f64752b.b());
            int i12 = this.f64753c;
            this.f64753c = i12 + 1;
            return hVar.D(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z12, gVar2, bVar, i12);
        }

        a(h.e eVar) {
            this.f64751a = eVar;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final ExecutorServiceC6490a f64755a;

        /* renamed from: b, reason: collision with root package name */
        final ExecutorServiceC6490a f64756b;

        /* renamed from: c, reason: collision with root package name */
        final ExecutorServiceC6490a f64757c;

        /* renamed from: d, reason: collision with root package name */
        final ExecutorServiceC6490a f64758d;

        /* renamed from: e, reason: collision with root package name */
        final l f64759e;

        /* renamed from: f, reason: collision with root package name */
        final o.a f64760f;

        /* renamed from: g, reason: collision with root package name */
        final o2.f<k<?>> f64761g = C17028a.d(BinsView.TOTE_WIDTH_DP, new a());

        class a implements C17028a.d<k<?>> {
            a() {
            }

            @Override // s7.C17028a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k<?> a() {
                b bVar = b.this;
                return new k<>(bVar.f64755a, bVar.f64756b, bVar.f64757c, bVar.f64758d, bVar.f64759e, bVar.f64760f, bVar.f64761g);
            }
        }

        <R> k<R> a(X6.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) r7.k.d(this.f64761g.b())).l(eVar, z10, z11, z12, z13);
        }

        b(ExecutorServiceC6490a executorServiceC6490a, ExecutorServiceC6490a executorServiceC6490a2, ExecutorServiceC6490a executorServiceC6490a3, ExecutorServiceC6490a executorServiceC6490a4, l lVar, o.a aVar) {
            this.f64755a = executorServiceC6490a;
            this.f64756b = executorServiceC6490a2;
            this.f64757c = executorServiceC6490a3;
            this.f64758d = executorServiceC6490a4;
            this.f64759e = lVar;
            this.f64760f = aVar;
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6336a.InterfaceC1192a f64763a;

        /* renamed from: b, reason: collision with root package name */
        private volatile InterfaceC6336a f64764b;

        @Override // com.bumptech.glide.load.engine.h.e
        public InterfaceC6336a a() {
            if (this.f64764b == null) {
                synchronized (this) {
                    try {
                        if (this.f64764b == null) {
                            this.f64764b = this.f64763a.build();
                        }
                        if (this.f64764b == null) {
                            this.f64764b = new b7.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f64764b;
        }

        c(InterfaceC6336a.InterfaceC1192a interfaceC1192a) {
            this.f64763a = interfaceC1192a;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final k<?> f64765a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC16083h f64766b;

        d(InterfaceC16083h interfaceC16083h, k<?> kVar) {
            this.f64766b = interfaceC16083h;
            this.f64765a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f64765a.r(this.f64766b);
            }
        }
    }

    public j(b7.h hVar, InterfaceC6336a.InterfaceC1192a interfaceC1192a, ExecutorServiceC6490a executorServiceC6490a, ExecutorServiceC6490a executorServiceC6490a2, ExecutorServiceC6490a executorServiceC6490a3, ExecutorServiceC6490a executorServiceC6490a4, boolean z10) {
        this(hVar, interfaceC1192a, executorServiceC6490a, executorServiceC6490a2, executorServiceC6490a3, executorServiceC6490a4, null, null, null, null, null, null, z10);
    }

    private o<?> i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o<?> oVarG = g(mVar);
        if (oVarG != null) {
            if (f64742i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return oVarG;
        }
        o<?> oVarH = h(mVar);
        if (oVarH == null) {
            return null;
        }
        if (f64742i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return oVarH;
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, X6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, Z6.a aVar, Map<Class<?>, X6.k<?>> map, boolean z10, boolean z11, X6.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC16083h interfaceC16083h, Executor executor, m mVar, long j10) {
        k<?> kVarA = this.f64743a.a(mVar, z15);
        if (kVarA != null) {
            kVarA.a(interfaceC16083h, executor);
            if (f64742i) {
                j("Added to existing load", j10, mVar);
            }
            return new d(interfaceC16083h, kVarA);
        }
        k<R> kVarA2 = this.f64746d.a(mVar, z12, z13, z14, z15);
        h<R> hVarA = this.f64749g.a(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z15, gVar2, kVarA2);
        this.f64743a.c(mVar, kVarA2);
        kVarA2.a(interfaceC16083h, executor);
        kVarA2.s(hVarA);
        if (f64742i) {
            j("Started new load", j10, mVar);
        }
        return new d(interfaceC16083h, kVarA2);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void a(k<?> kVar, X6.e eVar, o<?> oVar) {
        if (oVar != null) {
            try {
                if (oVar.e()) {
                    this.f64750h.a(eVar, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f64743a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void d(k<?> kVar, X6.e eVar) {
        this.f64743a.d(eVar, kVar);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, X6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, Z6.a aVar, Map<Class<?>, X6.k<?>> map, boolean z10, boolean z11, X6.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC16083h interfaceC16083h, Executor executor) {
        long jB = f64742i ? r7.g.b() : 0L;
        m mVarA = this.f64744b.a(obj, eVar, i10, i11, map, cls, cls2, gVar2);
        synchronized (this) {
            try {
                o<?> oVarI = i(mVarA, z12, jB);
                if (oVarI == null) {
                    return l(dVar, obj, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, gVar2, z12, z13, z14, z15, interfaceC16083h, executor, mVarA, jB);
                }
                interfaceC16083h.c(oVarI, X6.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    j(b7.h hVar, InterfaceC6336a.InterfaceC1192a interfaceC1192a, ExecutorServiceC6490a executorServiceC6490a, ExecutorServiceC6490a executorServiceC6490a2, ExecutorServiceC6490a executorServiceC6490a3, ExecutorServiceC6490a executorServiceC6490a4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar, b bVar, a aVar2, u uVar, boolean z10) {
        this.f64745c = hVar;
        c cVar = new c(interfaceC1192a);
        this.f64748f = cVar;
        com.bumptech.glide.load.engine.a aVar3 = aVar == null ? new com.bumptech.glide.load.engine.a(z10) : aVar;
        this.f64750h = aVar3;
        aVar3.f(this);
        this.f64744b = nVar == null ? new n() : nVar;
        this.f64743a = pVar == null ? new p() : pVar;
        this.f64746d = bVar == null ? new b(executorServiceC6490a, executorServiceC6490a2, executorServiceC6490a3, executorServiceC6490a4, this, this) : bVar;
        this.f64749g = aVar2 == null ? new a(cVar) : aVar2;
        this.f64747e = uVar == null ? new u() : uVar;
        hVar.e(this);
    }

    private o<?> e(X6.e eVar) {
        Z6.c<?> cVarD = this.f64745c.d(eVar);
        if (cVarD == null) {
            return null;
        }
        return cVarD instanceof o ? (o) cVarD : new o<>(cVarD, true, true, eVar, this);
    }

    private o<?> g(X6.e eVar) {
        o<?> oVarE = this.f64750h.e(eVar);
        if (oVarE != null) {
            oVarE.b();
        }
        return oVarE;
    }

    private static void j(String str, long j10, X6.e eVar) {
        FS.log_v("Engine", str + " in " + r7.g.a(j10) + "ms, key: " + eVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void b(X6.e eVar, o<?> oVar) {
        this.f64750h.d(eVar);
        if (oVar.e()) {
            this.f64745c.c(eVar, oVar);
        } else {
            this.f64747e.a(oVar, false);
        }
    }

    @Override // b7.h.a
    public void c(Z6.c<?> cVar) {
        this.f64747e.a(cVar, true);
    }

    public void k(Z6.c<?> cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).f();
    }

    private o<?> h(X6.e eVar) {
        o<?> oVarE = e(eVar);
        if (oVarE != null) {
            oVarE.b();
            this.f64750h.a(eVar, oVarE);
        }
        return oVarE;
    }
}
