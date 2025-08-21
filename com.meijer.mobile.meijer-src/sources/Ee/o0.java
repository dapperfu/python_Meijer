package Ee;

/* loaded from: classes6.dex */
final class o0<E> extends O<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f7410h;

    /* renamed from: i, reason: collision with root package name */
    static final o0<Object> f7411i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f7412c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f7413d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f7414e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f7415f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f7416g;

    static {
        Object[] objArr = new Object[0];
        f7410h = objArr;
        f7411i = new o0<>(objArr, 0, objArr, 0, 0);
    }

    @Override // Ee.J
    int k() {
        return 0;
    }

    @Override // Ee.J
    boolean l() {
        return false;
    }

    @Override // Ee.O
    boolean v() {
        return true;
    }

    @Override // Ee.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f7414e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = I.c(obj);
        while (true) {
            int i10 = iC & this.f7415f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // Ee.J
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f7412c, 0, objArr, i10, this.f7416g);
        return i10 + this.f7416g;
    }

    @Override // Ee.J
    Object[] f() {
        return this.f7412c;
    }

    @Override // Ee.J
    int h() {
        return this.f7416g;
    }

    @Override // Ee.O, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7413d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7416g;
    }

    @Override // Ee.O
    L<E> u() {
        return L.o(this.f7412c, this.f7416g);
    }

    o0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7412c = objArr;
        this.f7413d = i10;
        this.f7414e = objArr2;
        this.f7415f = i11;
        this.f7416g = i12;
    }

    @Override // Ee.O, Ee.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public y0<E> iterator() {
        return a().iterator();
    }
}
