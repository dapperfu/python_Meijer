package Ed;

import java.util.Objects;

/* renamed from: Ed.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3197l extends AbstractC3191f {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC3191f f7126f = new C3197l(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f7127d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f7128e;

    @Override // Ed.AbstractC3188c
    final int f() {
        return 0;
    }

    @Override // Ed.AbstractC3191f, Ed.AbstractC3188c
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f7127d, 0, objArr, 0, this.f7128e);
        return this.f7128e;
    }

    @Override // Ed.AbstractC3188c
    final int e() {
        return this.f7128e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f7128e, "index");
        Object obj = this.f7127d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Ed.AbstractC3188c
    final Object[] h() {
        return this.f7127d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7128e;
    }

    C3197l(Object[] objArr, int i10) {
        this.f7127d = objArr;
        this.f7128e = i10;
    }
}
