package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.r;

/* loaded from: classes.dex */
public abstract class L extends AbstractC6219c<Void> {

    /* renamed from: l, reason: collision with root package name */
    private static final Void f56993l = null;

    /* renamed from: k, reason: collision with root package name */
    protected final r f56994k;

    protected r.b I(r.b bVar) {
        return bVar;
    }

    protected long K(long j10, r.b bVar) {
        return j10;
    }

    protected int M(int i10) {
        return i10;
    }

    protected abstract void O(a3.F f10);

    protected final void Q() {
        G(f56993l, this.f56994k);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void c(a3.v vVar) {
        this.f56994k.c(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public a3.v e() {
        return this.f56994k.e();
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean n() {
        return this.f56994k.n();
    }

    @Override // androidx.media3.exoplayer.source.r
    public a3.F o() {
        return this.f56994k.o();
    }

    protected L(r rVar) {
        this.f56994k = rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final r.b C(Void r12, r.b bVar) {
        return I(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final long D(Void r12, long j10, r.b bVar) {
        return K(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int E(Void r12, int i10) {
        return M(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void F(Void r12, r rVar, a3.F f10) {
        O(f10);
    }

    protected void R() {
        Q();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected final void y(f3.o oVar) {
        super.y(oVar);
        R();
    }
}
