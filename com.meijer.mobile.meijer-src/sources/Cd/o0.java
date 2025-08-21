package Cd;

import java.util.List;

/* loaded from: classes6.dex */
final class o0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f4271c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f4272d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p0 f4273e;

    @Override // Cd.m0
    final boolean l() {
        return true;
    }

    o0(p0 p0Var, int i10, int i11) {
        this.f4273e = p0Var;
        this.f4271c = i10;
        this.f4272d = i11;
    }

    @Override // Cd.m0
    final Object[] e() {
        return this.f4273e.e();
    }

    @Override // Cd.m0
    final int f() {
        return this.f4273e.f() + this.f4271c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.a(i10, this.f4272d, "index");
        return this.f4273e.get(i10 + this.f4271c);
    }

    @Override // Cd.m0
    final int h() {
        return this.f4273e.f() + this.f4271c + this.f4272d;
    }

    @Override // Cd.p0
    /* renamed from: n */
    public final p0 subList(int i10, int i11) {
        j0.c(i10, i11, this.f4272d);
        int i12 = this.f4271c;
        return this.f4273e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4272d;
    }

    @Override // Cd.p0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
