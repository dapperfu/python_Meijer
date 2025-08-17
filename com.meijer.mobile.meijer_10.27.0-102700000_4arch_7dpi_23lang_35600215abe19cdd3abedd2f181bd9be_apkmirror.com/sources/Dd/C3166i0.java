package Dd;

import java.util.List;

/* renamed from: Dd.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3166i0 extends AbstractC3178j0 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f6087d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f6088e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3178j0 f6089f;

    C3166i0(AbstractC3178j0 abstractC3178j0, int i10, int i11) {
        this.f6089f = abstractC3178j0;
        this.f6087d = i10;
        this.f6088e = i11;
    }

    @Override // Dd.AbstractC3118e0
    final int e() {
        return this.f6089f.f() + this.f6087d + this.f6088e;
    }

    @Override // Dd.AbstractC3118e0
    final int f() {
        return this.f6089f.f() + this.f6087d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C3291t.a(i10, this.f6088e, "index");
        return this.f6089f.get(i10 + this.f6087d);
    }

    @Override // Dd.AbstractC3118e0
    final Object[] k() {
        return this.f6089f.k();
    }

    @Override // Dd.AbstractC3178j0
    /* renamed from: l */
    public final AbstractC3178j0 subList(int i10, int i11) {
        C3291t.d(i10, i11, this.f6088e);
        int i12 = this.f6087d;
        return this.f6089f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6088e;
    }

    @Override // Dd.AbstractC3178j0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
