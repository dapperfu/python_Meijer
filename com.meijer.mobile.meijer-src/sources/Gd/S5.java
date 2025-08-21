package Gd;

/* loaded from: classes6.dex */
final class S5 extends N5 {

    /* renamed from: e, reason: collision with root package name */
    static final N5 f11848e = new S5(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f11849c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f11850d;

    @Override // Gd.M4
    final int f() {
        return 0;
    }

    @Override // Gd.N5, Gd.M4
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f11849c, 0, objArr, 0, this.f11850d);
        return this.f11850d;
    }

    @Override // Gd.M4
    final int e() {
        return this.f11850d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11850d, "index");
        Object obj = this.f11849c[i10];
        obj.getClass();
        return obj;
    }

    @Override // Gd.M4
    final Object[] h() {
        return this.f11849c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11850d;
    }

    S5(Object[] objArr, int i10) {
        this.f11849c = objArr;
        this.f11850d = i10;
    }
}
