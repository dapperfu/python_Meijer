package androidx.media3.exoplayer.source;

import a3.t;
import a3.v;
import android.net.Uri;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13599a;
import f3.InterfaceC13949d;
import f3.g;
import u3.InterfaceExecutorC17347a;

@Deprecated
/* loaded from: classes.dex */
public final class I extends AbstractC6217a {

    /* renamed from: h, reason: collision with root package name */
    private final f3.g f56969h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13949d.a f56970i;

    /* renamed from: j, reason: collision with root package name */
    private final a3.t f56971j;

    /* renamed from: k, reason: collision with root package name */
    private final long f56972k;

    /* renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56973l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f56974m;

    /* renamed from: n, reason: collision with root package name */
    private final a3.F f56975n;

    /* renamed from: o, reason: collision with root package name */
    private final a3.v f56976o;

    /* renamed from: p, reason: collision with root package name */
    private final De.w<InterfaceExecutorC17347a> f56977p;

    /* renamed from: q, reason: collision with root package name */
    private f3.o f56978q;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC13949d.a f56979a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56980b = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f56981c = true;

        /* renamed from: d, reason: collision with root package name */
        private Object f56982d;

        /* renamed from: e, reason: collision with root package name */
        private String f56983e;

        /* renamed from: f, reason: collision with root package name */
        private De.w<InterfaceExecutorC17347a> f56984f;

        public I a(v.k kVar, long j10) {
            return new I(this.f56983e, kVar, this.f56979a, j10, this.f56980b, this.f56981c, this.f56982d, this.f56984f);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new androidx.media3.exoplayer.upstream.a();
            }
            this.f56980b = bVar;
            return this;
        }

        public b(InterfaceC13949d.a aVar) {
            this.f56979a = (InterfaceC13949d.a) C13599a.e(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private I(String str, v.k kVar, InterfaceC13949d.a aVar, long j10, androidx.media3.exoplayer.upstream.b bVar, boolean z10, Object obj, De.w<InterfaceExecutorC17347a> wVar) {
        this.f56970i = aVar;
        this.f56972k = j10;
        this.f56973l = bVar;
        this.f56974m = z10;
        a3.v vVarA = new v.c().i(Uri.EMPTY).e(kVar.f44955a.toString()).g(Ee.L.y(kVar)).h(obj).a();
        this.f56976o = vVarA;
        t.b bVarH0 = new t.b().u0((String) De.j.a(kVar.f44956b, "text/x-unknown")).j0(kVar.f44957c).w0(kVar.f44958d).s0(kVar.f44959e).h0(kVar.f44960f);
        String str2 = kVar.f44961g;
        this.f56971j = bVarH0.f0(str2 != null ? str2 : str).N();
        this.f56969h = new g.b().h(kVar.f44955a).b(1).a();
        this.f56975n = new p3.t(j10, true, false, false, null, vVarA);
        this.f56977p = wVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public a3.v e() {
        return this.f56976o;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((H) qVar).w();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        f3.g gVar = this.f56969h;
        InterfaceC13949d.a aVar = this.f56970i;
        f3.o oVar = this.f56978q;
        a3.t tVar = this.f56971j;
        long j11 = this.f56972k;
        androidx.media3.exoplayer.upstream.b bVar3 = this.f56973l;
        s.a aVarT = t(bVar);
        boolean z10 = this.f56974m;
        De.w<InterfaceExecutorC17347a> wVar = this.f56977p;
        return new H(gVar, aVar, oVar, tVar, j11, bVar3, aVarT, z10, wVar != null ? wVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        this.f56978q = oVar;
        z(this.f56975n);
    }
}
