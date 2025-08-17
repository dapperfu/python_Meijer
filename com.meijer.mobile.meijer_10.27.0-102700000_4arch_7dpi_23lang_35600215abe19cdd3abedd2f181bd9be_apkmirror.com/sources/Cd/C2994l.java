package Cd;

import java.util.Objects;

/* renamed from: Cd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2994l extends AbstractC2988f {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC2988f f3814f = new C2994l(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f3815d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3816e;

    @Override // Cd.AbstractC2985c
    final int f() {
        return 0;
    }

    @Override // Cd.AbstractC2988f, Cd.AbstractC2985c
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f3815d, 0, objArr, 0, this.f3816e);
        return this.f3816e;
    }

    @Override // Cd.AbstractC2985c
    final int e() {
        return this.f3816e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f3816e, "index");
        Object obj = this.f3815d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Cd.AbstractC2985c
    final Object[] h() {
        return this.f3815d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3816e;
    }

    C2994l(Object[] objArr, int i10) {
        this.f3815d = objArr;
        this.f3816e = i10;
    }
}
