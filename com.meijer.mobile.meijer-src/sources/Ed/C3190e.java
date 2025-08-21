package Ed;

import java.util.List;

/* renamed from: Ed.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3190e extends AbstractC3191f {

    /* renamed from: d, reason: collision with root package name */
    final transient int f7111d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f7112e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3191f f7113f;

    C3190e(AbstractC3191f abstractC3191f, int i10, int i11) {
        this.f7113f = abstractC3191f;
        this.f7111d = i10;
        this.f7112e = i11;
    }

    @Override // Ed.AbstractC3188c
    final int e() {
        return this.f7113f.f() + this.f7111d + this.f7112e;
    }

    @Override // Ed.AbstractC3188c
    final int f() {
        return this.f7113f.f() + this.f7111d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f7112e, "index");
        return this.f7113f.get(i10 + this.f7111d);
    }

    @Override // Ed.AbstractC3188c
    final Object[] h() {
        return this.f7113f.h();
    }

    @Override // Ed.AbstractC3191f
    /* renamed from: k */
    public final AbstractC3191f subList(int i10, int i11) {
        Y.c(i10, i11, this.f7112e);
        int i12 = this.f7111d;
        return this.f7113f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7112e;
    }

    @Override // Ed.AbstractC3191f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
