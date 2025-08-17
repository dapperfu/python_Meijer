package androidx.media3.exoplayer.source;

import a3.F;
import a3.v;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.w;
import d3.C13466a;
import d3.P;
import f3.InterfaceC13839d;
import i3.E1;
import p3.C16249b;
import u3.InterfaceExecutorC17220a;

/* loaded from: classes.dex */
public final class C extends AbstractC6075a implements B.c {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC13839d.a f56627h;

    /* renamed from: i, reason: collision with root package name */
    private final w.a f56628i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56629j;

    /* renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56630k;

    /* renamed from: l, reason: collision with root package name */
    private final int f56631l;

    /* renamed from: m, reason: collision with root package name */
    private final int f56632m;

    /* renamed from: n, reason: collision with root package name */
    private final a3.t f56633n;

    /* renamed from: o, reason: collision with root package name */
    private final Be.w<InterfaceExecutorC17220a> f56634o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f56635p;

    /* renamed from: q, reason: collision with root package name */
    private long f56636q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f56637r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f56638s;

    /* renamed from: t, reason: collision with root package name */
    private f3.o f56639t;

    /* renamed from: u, reason: collision with root package name */
    private a3.v f56640u;

    class a extends m {
        a(a3.F f10) {
            super(f10);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f43597f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f43625k = true;
            return cVar;
        }
    }

    public static final class b implements t {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC13839d.a f56642c;

        /* renamed from: d, reason: collision with root package name */
        private w.a f56643d;

        /* renamed from: e, reason: collision with root package name */
        private k3.k f56644e;

        /* renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56645f;

        /* renamed from: g, reason: collision with root package name */
        private int f56646g;

        /* renamed from: h, reason: collision with root package name */
        private Be.w<InterfaceExecutorC17220a> f56647h;

        /* renamed from: i, reason: collision with root package name */
        private int f56648i;

        /* renamed from: j, reason: collision with root package name */
        private a3.t f56649j;

        public b(InterfaceC13839d.a aVar, final x3.u uVar) {
            this(aVar, new w.a() { // from class: p3.q
                @Override // androidx.media3.exoplayer.source.w.a
                public final androidx.media3.exoplayer.source.w a(E1 e12) {
                    return C.b.i(uVar, e12);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public int[] d() {
            return new int[]{4};
        }

        public b(InterfaceC13839d.a aVar, w.a aVar2) {
            this(aVar, aVar2, new androidx.media3.exoplayer.drm.g(), new androidx.media3.exoplayer.upstream.a(), 1048576);
        }

        public static /* synthetic */ w i(x3.u uVar, E1 e12) {
            return new C16249b(uVar);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C e(a3.v vVar) {
            C13466a.e(vVar.f44012b);
            return new C(vVar, this.f56642c, this.f56643d, this.f56644e.a(vVar), this.f56645f, this.f56646g, this.f56648i, this.f56649j, this.f56647h, null);
        }

        b k(int i10, a3.t tVar) {
            this.f56648i = i10;
            this.f56649j = (a3.t) C13466a.e(tVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(k3.k kVar) {
            this.f56644e = (k3.k) C13466a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f56645f = (androidx.media3.exoplayer.upstream.b) C13466a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC13839d.a aVar, w.a aVar2, k3.k kVar, androidx.media3.exoplayer.upstream.b bVar, int i10) {
            this.f56642c = aVar;
            this.f56643d = aVar2;
            this.f56644e = kVar;
            this.f56645f = bVar;
            this.f56646g = i10;
        }
    }

    /* synthetic */ C(a3.v vVar, InterfaceC13839d.a aVar, w.a aVar2, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, int i11, a3.t tVar, Be.w wVar, a aVar3) {
        this(vVar, aVar, aVar2, iVar, bVar, i10, i11, tVar, wVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void c(a3.v vVar) {
        this.f56640u = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized a3.v e() {
        return this.f56640u;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private C(a3.v vVar, InterfaceC13839d.a aVar, w.a aVar2, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, int i11, a3.t tVar, Be.w<InterfaceExecutorC17220a> wVar) {
        this.f56640u = vVar;
        this.f56627h = aVar;
        this.f56628i = aVar2;
        this.f56629j = iVar;
        this.f56630k = bVar;
        this.f56631l = i10;
        this.f56633n = tVar;
        this.f56632m = i11;
        this.f56635p = true;
        this.f56636q = -9223372036854775807L;
        this.f56634o = wVar;
    }

    private void C() {
        a3.F tVar = new p3.t(this.f56636q, this.f56637r, false, this.f56638s, null, e());
        if (this.f56635p) {
            tVar = new a(tVar);
        }
        z(tVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
        this.f56629j.release();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((B) qVar).f0();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        InterfaceC13839d interfaceC13839dA = this.f56627h.a();
        f3.o oVar = this.f56639t;
        if (oVar != null) {
            interfaceC13839dA.e(oVar);
        }
        v.h hVarB = B();
        Uri uri = hVarB.f44110a;
        w wVarA = this.f56628i.a(w());
        androidx.media3.exoplayer.drm.i iVar = this.f56629j;
        h.a aVarR = r(bVar);
        androidx.media3.exoplayer.upstream.b bVar3 = this.f56630k;
        s.a aVarT = t(bVar);
        String str = hVarB.f44115f;
        int i10 = this.f56631l;
        int i11 = this.f56632m;
        a3.t tVar = this.f56633n;
        long jM0 = P.M0(hVarB.f44119j);
        Be.w<InterfaceExecutorC17220a> wVar = this.f56634o;
        return new B(uri, interfaceC13839dA, wVarA, iVar, aVarR, bVar3, aVarT, this, bVar2, str, i10, i11, tVar, jM0, wVar != null ? wVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void y(f3.o oVar) {
        this.f56639t = oVar;
        this.f56629j.d((Looper) C13466a.e(Looper.myLooper()), w());
        this.f56629j.g();
        C();
    }

    private v.h B() {
        return (v.h) C13466a.e(e().f44012b);
    }

    @Override // androidx.media3.exoplayer.source.B.c
    public void p(long j10, x3.J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f56636q;
        }
        boolean zG = j11.g();
        if (!this.f56635p && this.f56636q == j10 && this.f56637r == zG && this.f56638s == z10) {
            return;
        }
        this.f56636q = j10;
        this.f56637r = zG;
        this.f56638s = z10;
        this.f56635p = false;
        C();
    }
}
