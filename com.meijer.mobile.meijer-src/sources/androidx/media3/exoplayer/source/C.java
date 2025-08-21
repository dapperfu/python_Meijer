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
import d3.C13599a;
import d3.P;
import f3.InterfaceC13949d;
import i3.E1;
import p3.C16394b;
import u3.InterfaceExecutorC17347a;

/* loaded from: classes.dex */
public final class C extends AbstractC6217a implements B.c {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC13949d.a f56851h;

    /* renamed from: i, reason: collision with root package name */
    private final w.a f56852i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56853j;

    /* renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56854k;

    /* renamed from: l, reason: collision with root package name */
    private final int f56855l;

    /* renamed from: m, reason: collision with root package name */
    private final int f56856m;

    /* renamed from: n, reason: collision with root package name */
    private final a3.t f56857n;

    /* renamed from: o, reason: collision with root package name */
    private final De.w<InterfaceExecutorC17347a> f56858o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f56859p;

    /* renamed from: q, reason: collision with root package name */
    private long f56860q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f56861r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f56862s;

    /* renamed from: t, reason: collision with root package name */
    private f3.o f56863t;

    /* renamed from: u, reason: collision with root package name */
    private a3.v f56864u;

    class a extends m {
        a(a3.F f10) {
            super(f10);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f44415f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f44443k = true;
            return cVar;
        }
    }

    public static final class b implements t {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC13949d.a f56866c;

        /* renamed from: d, reason: collision with root package name */
        private w.a f56867d;

        /* renamed from: e, reason: collision with root package name */
        private k3.k f56868e;

        /* renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56869f;

        /* renamed from: g, reason: collision with root package name */
        private int f56870g;

        /* renamed from: h, reason: collision with root package name */
        private De.w<InterfaceExecutorC17347a> f56871h;

        /* renamed from: i, reason: collision with root package name */
        private int f56872i;

        /* renamed from: j, reason: collision with root package name */
        private a3.t f56873j;

        public b(InterfaceC13949d.a aVar, final x3.u uVar) {
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

        public b(InterfaceC13949d.a aVar, w.a aVar2) {
            this(aVar, aVar2, new androidx.media3.exoplayer.drm.g(), new androidx.media3.exoplayer.upstream.a(), 1048576);
        }

        public static /* synthetic */ w i(x3.u uVar, E1 e12) {
            return new C16394b(uVar);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C e(a3.v vVar) {
            C13599a.e(vVar.f44830b);
            return new C(vVar, this.f56866c, this.f56867d, this.f56868e.a(vVar), this.f56869f, this.f56870g, this.f56872i, this.f56873j, this.f56871h, null);
        }

        b k(int i10, a3.t tVar) {
            this.f56872i = i10;
            this.f56873j = (a3.t) C13599a.e(tVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(k3.k kVar) {
            this.f56868e = (k3.k) C13599a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f56869f = (androidx.media3.exoplayer.upstream.b) C13599a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC13949d.a aVar, w.a aVar2, k3.k kVar, androidx.media3.exoplayer.upstream.b bVar, int i10) {
            this.f56866c = aVar;
            this.f56867d = aVar2;
            this.f56868e = kVar;
            this.f56869f = bVar;
            this.f56870g = i10;
        }
    }

    /* synthetic */ C(a3.v vVar, InterfaceC13949d.a aVar, w.a aVar2, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, int i11, a3.t tVar, De.w wVar, a aVar3) {
        this(vVar, aVar, aVar2, iVar, bVar, i10, i11, tVar, wVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void c(a3.v vVar) {
        this.f56864u = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized a3.v e() {
        return this.f56864u;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private C(a3.v vVar, InterfaceC13949d.a aVar, w.a aVar2, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i10, int i11, a3.t tVar, De.w<InterfaceExecutorC17347a> wVar) {
        this.f56864u = vVar;
        this.f56851h = aVar;
        this.f56852i = aVar2;
        this.f56853j = iVar;
        this.f56854k = bVar;
        this.f56855l = i10;
        this.f56857n = tVar;
        this.f56856m = i11;
        this.f56859p = true;
        this.f56860q = -9223372036854775807L;
        this.f56858o = wVar;
    }

    private void C() {
        a3.F tVar = new p3.t(this.f56860q, this.f56861r, false, this.f56862s, null, e());
        if (this.f56859p) {
            tVar = new a(tVar);
        }
        z(tVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
        this.f56853j.release();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((B) qVar).f0();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        InterfaceC13949d interfaceC13949dA = this.f56851h.a();
        f3.o oVar = this.f56863t;
        if (oVar != null) {
            interfaceC13949dA.e(oVar);
        }
        v.h hVarB = B();
        Uri uri = hVarB.f44928a;
        w wVarA = this.f56852i.a(w());
        androidx.media3.exoplayer.drm.i iVar = this.f56853j;
        h.a aVarR = r(bVar);
        androidx.media3.exoplayer.upstream.b bVar3 = this.f56854k;
        s.a aVarT = t(bVar);
        String str = hVarB.f44933f;
        int i10 = this.f56855l;
        int i11 = this.f56856m;
        a3.t tVar = this.f56857n;
        long jM0 = P.M0(hVarB.f44937j);
        De.w<InterfaceExecutorC17347a> wVar = this.f56858o;
        return new B(uri, interfaceC13949dA, wVarA, iVar, aVarR, bVar3, aVarT, this, bVar2, str, i10, i11, tVar, jM0, wVar != null ? wVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        this.f56863t = oVar;
        this.f56853j.d((Looper) C13599a.e(Looper.myLooper()), w());
        this.f56853j.g();
        C();
    }

    private v.h B() {
        return (v.h) C13599a.e(e().f44830b);
    }

    @Override // androidx.media3.exoplayer.source.B.c
    public void p(long j10, x3.J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f56860q;
        }
        boolean zG = j11.g();
        if (!this.f56859p && this.f56860q == j10 && this.f56861r == zG && this.f56862s == z10) {
            return;
        }
        this.f56860q = j10;
        this.f56861r = zG;
        this.f56862s = z10;
        this.f56859p = false;
        C();
    }
}
