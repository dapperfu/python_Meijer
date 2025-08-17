package Cd;

import java.util.List;

/* renamed from: Cd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2987e extends AbstractC2988f {

    /* renamed from: d, reason: collision with root package name */
    final transient int f3799d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f3800e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2988f f3801f;

    C2987e(AbstractC2988f abstractC2988f, int i10, int i11) {
        this.f3801f = abstractC2988f;
        this.f3799d = i10;
        this.f3800e = i11;
    }

    @Override // Cd.AbstractC2985c
    final int e() {
        return this.f3801f.f() + this.f3799d + this.f3800e;
    }

    @Override // Cd.AbstractC2985c
    final int f() {
        return this.f3801f.f() + this.f3799d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f3800e, "index");
        return this.f3801f.get(i10 + this.f3799d);
    }

    @Override // Cd.AbstractC2985c
    final Object[] h() {
        return this.f3801f.h();
    }

    @Override // Cd.AbstractC2988f
    /* renamed from: k */
    public final AbstractC2988f subList(int i10, int i11) {
        Y.c(i10, i11, this.f3800e);
        int i12 = this.f3799d;
        return this.f3801f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3800e;
    }

    @Override // Cd.AbstractC2988f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
