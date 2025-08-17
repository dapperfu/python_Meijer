package androidx.media3.exoplayer.source;

import a3.v;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;

/* renamed from: androidx.media3.exoplayer.source.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6086l extends AbstractC6075a {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6084j f56900h;

    /* renamed from: i, reason: collision with root package name */
    private final long f56901i;

    /* renamed from: j, reason: collision with root package name */
    private a3.v f56902j;

    /* renamed from: androidx.media3.exoplayer.source.l$b */
    public static final class b implements r.a {

        /* renamed from: c, reason: collision with root package name */
        private final long f56903c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6084j f56904d;

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a c(k3.k kVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public int[] d() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a f(androidx.media3.exoplayer.upstream.b bVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C6086l e(a3.v vVar) {
            return new C6086l(vVar, this.f56903c, this.f56904d);
        }

        public b(long j10, InterfaceC6084j interfaceC6084j) {
            this.f56903c = j10;
            this.f56904d = interfaceC6084j;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void c(a3.v vVar) {
        this.f56902j = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized a3.v e() {
        return this.f56902j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private C6086l(a3.v vVar, long j10, InterfaceC6084j interfaceC6084j) {
        this.f56902j = vVar;
        this.f56901i = j10;
        this.f56900h = interfaceC6084j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((C6085k) qVar).o();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6075a
    protected void y(f3.o oVar) {
        z(new p3.t(this.f56901i, true, false, false, null, e()));
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        a3.v vVarE = e();
        C13466a.e(vVarE.f44012b);
        C13466a.f(vVarE.f44012b.f44111b, "Externally loaded mediaItems require a MIME type.");
        v.h hVar = vVarE.f44012b;
        return new C6085k(hVar.f44110a, hVar.f44111b, this.f56900h);
    }
}
