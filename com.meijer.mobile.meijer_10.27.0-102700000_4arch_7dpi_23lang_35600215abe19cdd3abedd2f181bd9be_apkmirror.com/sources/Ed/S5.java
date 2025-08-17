package Ed;

/* loaded from: classes6.dex */
final class S5 extends N5 {

    /* renamed from: e, reason: collision with root package name */
    static final N5 f8296e = new S5(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f8297c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f8298d;

    @Override // Ed.M4
    final int f() {
        return 0;
    }

    @Override // Ed.N5, Ed.M4
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f8297c, 0, objArr, 0, this.f8298d);
        return this.f8298d;
    }

    @Override // Ed.M4
    final int e() {
        return this.f8298d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f8298d, "index");
        Object obj = this.f8297c[i10];
        obj.getClass();
        return obj;
    }

    @Override // Ed.M4
    final Object[] h() {
        return this.f8297c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8298d;
    }

    S5(Object[] objArr, int i10) {
        this.f8297c = objArr;
        this.f8298d = i10;
    }
}
