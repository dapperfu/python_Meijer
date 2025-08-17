package Ad;

import java.util.List;

/* loaded from: classes6.dex */
final class o0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f275c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f276d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p0 f277e;

    @Override // Ad.m0
    final boolean l() {
        return true;
    }

    o0(p0 p0Var, int i10, int i11) {
        this.f277e = p0Var;
        this.f275c = i10;
        this.f276d = i11;
    }

    @Override // Ad.m0
    final Object[] e() {
        return this.f277e.e();
    }

    @Override // Ad.m0
    final int f() {
        return this.f277e.f() + this.f275c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.a(i10, this.f276d, "index");
        return this.f277e.get(i10 + this.f275c);
    }

    @Override // Ad.m0
    final int h() {
        return this.f277e.f() + this.f275c + this.f276d;
    }

    @Override // Ad.p0
    /* renamed from: n */
    public final p0 subList(int i10, int i11) {
        j0.c(i10, i11, this.f276d);
        int i12 = this.f275c;
        return this.f277e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f276d;
    }

    @Override // Ad.p0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
