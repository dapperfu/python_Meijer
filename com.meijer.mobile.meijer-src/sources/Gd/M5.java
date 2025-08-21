package Gd;

import java.util.List;

/* loaded from: classes6.dex */
final class M5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f11780c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f11781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N5 f11782e;

    M5(N5 n52, int i10, int i11) {
        this.f11782e = n52;
        this.f11780c = i10;
        this.f11781d = i11;
    }

    @Override // Gd.M4
    final int e() {
        return this.f11782e.f() + this.f11780c + this.f11781d;
    }

    @Override // Gd.M4
    final int f() {
        return this.f11782e.f() + this.f11780c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11781d, "index");
        return this.f11782e.get(i10 + this.f11780c);
    }

    @Override // Gd.M4
    final Object[] h() {
        return this.f11782e.h();
    }

    @Override // Gd.N5
    /* renamed from: k */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f11781d);
        N5 n52 = this.f11782e;
        int i12 = this.f11780c;
        return n52.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11781d;
    }

    @Override // Gd.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
