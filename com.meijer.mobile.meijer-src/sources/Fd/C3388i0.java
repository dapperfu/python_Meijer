package Fd;

import java.util.List;

/* renamed from: Fd.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3388i0 extends AbstractC3400j0 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f10120d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f10121e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3400j0 f10122f;

    C3388i0(AbstractC3400j0 abstractC3400j0, int i10, int i11) {
        this.f10122f = abstractC3400j0;
        this.f10120d = i10;
        this.f10121e = i11;
    }

    @Override // Fd.AbstractC3340e0
    final int e() {
        return this.f10122f.f() + this.f10120d + this.f10121e;
    }

    @Override // Fd.AbstractC3340e0
    final int f() {
        return this.f10122f.f() + this.f10120d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C3513t.a(i10, this.f10121e, "index");
        return this.f10122f.get(i10 + this.f10120d);
    }

    @Override // Fd.AbstractC3340e0
    final Object[] k() {
        return this.f10122f.k();
    }

    @Override // Fd.AbstractC3400j0
    /* renamed from: l */
    public final AbstractC3400j0 subList(int i10, int i11) {
        C3513t.d(i10, i11, this.f10121e);
        int i12 = this.f10120d;
        return this.f10122f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10121e;
    }

    @Override // Fd.AbstractC3400j0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
