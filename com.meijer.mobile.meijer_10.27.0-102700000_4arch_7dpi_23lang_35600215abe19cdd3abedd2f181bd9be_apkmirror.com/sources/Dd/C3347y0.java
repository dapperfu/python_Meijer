package Dd;

import java.util.Objects;

/* renamed from: Dd.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3347y0 extends AbstractC3178j0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC3178j0 f6336f = new C3347y0(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f6337d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f6338e;

    @Override // Dd.AbstractC3118e0
    final int f() {
        return 0;
    }

    @Override // Dd.AbstractC3178j0, Dd.AbstractC3118e0
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f6337d, 0, objArr, i10, this.f6338e);
        return i10 + this.f6338e;
    }

    @Override // Dd.AbstractC3118e0
    final int e() {
        return this.f6338e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C3291t.a(i10, this.f6338e, "index");
        Object obj = this.f6337d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Dd.AbstractC3118e0
    final Object[] k() {
        return this.f6337d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6338e;
    }

    C3347y0(Object[] objArr, int i10) {
        this.f6337d = objArr;
        this.f6338e = i10;
    }
}
