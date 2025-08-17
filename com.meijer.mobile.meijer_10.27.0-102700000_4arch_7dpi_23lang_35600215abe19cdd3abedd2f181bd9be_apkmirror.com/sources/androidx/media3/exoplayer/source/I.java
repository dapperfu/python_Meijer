package androidx.media3.exoplayer.source;

import a3.t;
import a3.v;
import android.net.Uri;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13466a;
import f3.InterfaceC13839d;
import f3.g;
import u3.InterfaceExecutorC17220a;

@Deprecated
/* loaded from: classes.dex */
public final class I extends AbstractC6075a {

    /* renamed from: h, reason: collision with root package name */
    private final f3.g f56745h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13839d.a f56746i;

    /* renamed from: j, reason: collision with root package name */
    private final a3.t f56747j;

    /* renamed from: k, reason: collision with root package name */
    private final long f56748k;

    /* renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56749l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f56750m;

    /* renamed from: n, reason: collision with root package name */
    private final a3.F f56751n;

    /* renamed from: o, reason: collision with root package name */
    private final a3.v f56752o;

    /* renamed from: p, reason: collision with root package name */
    private final Be.w<InterfaceExecutorC17220a> f56753p;

    /* renamed from: q, reason: collision with root package name */
    private f3.o f56754q;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC13839d.a f56755a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56756b = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f56757c = true;

        /* renamed from: d, reason: collision with root package name */
        private Object f56758d;

        /* renamed from: e, reason: collision with root package name */
        private String f56759e;

        /* renamed from: f, reason: collision with root package name */
        private Be.w<InterfaceExecutorC17220a> f56760f;

        public I a(v.k kVar, long j10) {
            return new I(this.f56759e, kVar, this.f56755a, j10, this.f56756b, this.f56757c, this.f56758d, this.f56760f);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new androidx.media3.exoplayer.upstream.a();
            }
            this.f56756b = bVar;
            return this;
        }

        public b(InterfaceC13839d.a aVar) {
            this.f56755a = (InterfaceC13839d.a) C13466a.e(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private I(String str, v.k kVar, InterfaceC13839d.a aVar, long j10, androidx.media3.exoplayer.upstream.b bVar, boolean z10, Object obj, Be.w<InterfaceExecutorC17220a> wVar) {
        this.f56746i = aVar;
        this.f56748k = j10;
        this.f56749l = bVar;
        this.f56750m = z10;
        a3.v vVarA = new v.c().i(Uri.EMPTY).e(kVar.f44137a.toString()).g(Ce.L.y(kVar)).h(obj).a();
        this.f56752o = vVarA;
        t.b bVarH0 = new t.b().u0((String) Be.j.a(kVar.f44138b, "text/x-unknown")).j0(kVar.f44139c).w0(kVar.f44140d).s0(kVar.f44141e).h0(kVar.f44142f);
        String str2 = kVar.f44143g;
        this.f56747j = bVarH0.f0(str2 != null ? str2 : str).N();
        this.f56745h = new g.b().h(kVar.f44137a).b(1).a();
        this.f56751n = new p3.t(j10, true, false, false, null, vVarA);
        this.f56753p = wVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public a3.v e() {
        return this.f56752o;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((H) qVar).w();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        f3.g gVar = this.f56745h;
        InterfaceC13839d.a aVar = this.f56746i;
        f3.o oVar = this.f56754q;
        a3.t tVar = this.f56747j;
        long j11 = this.f56748k;
        androidx.media3.exoplayer.upstream.b bVar3 = this.f56749l;
        s.a aVarT = t(bVar);
        boolean z10 = this.f56750m;
        Be.w<InterfaceExecutorC17220a> wVar = this.f56753p;
        return new H(gVar, aVar, oVar, tVar, j11, bVar3, aVarT, z10, wVar != null ? wVar.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void y(f3.o oVar) {
        this.f56754q = oVar;
        z(this.f56751n);
    }
}
