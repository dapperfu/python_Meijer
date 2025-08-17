package Ed;

import java.util.List;

/* loaded from: classes6.dex */
final class M5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f8228c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f8229d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N5 f8230e;

    M5(N5 n52, int i10, int i11) {
        this.f8230e = n52;
        this.f8228c = i10;
        this.f8229d = i11;
    }

    @Override // Ed.M4
    final int e() {
        return this.f8230e.f() + this.f8228c + this.f8229d;
    }

    @Override // Ed.M4
    final int f() {
        return this.f8230e.f() + this.f8228c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f8229d, "index");
        return this.f8230e.get(i10 + this.f8228c);
    }

    @Override // Ed.M4
    final Object[] h() {
        return this.f8230e.h();
    }

    @Override // Ed.N5
    /* renamed from: k */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f8229d);
        N5 n52 = this.f8230e;
        int i12 = this.f8228c;
        return n52.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8229d;
    }

    @Override // Ed.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
