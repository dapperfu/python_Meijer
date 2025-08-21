package androidx.media3.exoplayer.source;

import a3.v;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;

/* renamed from: androidx.media3.exoplayer.source.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6228l extends AbstractC6217a {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6226j f57124h;

    /* renamed from: i, reason: collision with root package name */
    private final long f57125i;

    /* renamed from: j, reason: collision with root package name */
    private a3.v f57126j;

    /* renamed from: androidx.media3.exoplayer.source.l$b */
    public static final class b implements r.a {

        /* renamed from: c, reason: collision with root package name */
        private final long f57127c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6226j f57128d;

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
        public C6228l e(a3.v vVar) {
            return new C6228l(vVar, this.f57127c, this.f57128d);
        }

        public b(long j10, InterfaceC6226j interfaceC6226j) {
            this.f57127c = j10;
            this.f57128d = interfaceC6226j;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void c(a3.v vVar) {
        this.f57126j = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized a3.v e() {
        return this.f57126j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void m() {
    }

    private C6228l(a3.v vVar, long j10, InterfaceC6226j interfaceC6226j) {
        this.f57126j = vVar;
        this.f57125i = j10;
        this.f57124h = interfaceC6226j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((C6227k) qVar).o();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        z(new p3.t(this.f57125i, true, false, false, null, e()));
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        a3.v vVarE = e();
        C13599a.e(vVarE.f44830b);
        C13599a.f(vVarE.f44830b.f44929b, "Externally loaded mediaItems require a MIME type.");
        v.h hVar = vVarE.f44830b;
        return new C6227k(hVar.f44928a, hVar.f44929b, this.f57124h);
    }
}
