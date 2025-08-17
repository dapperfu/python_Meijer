package Ce;

/* loaded from: classes6.dex */
final class o0<E> extends O<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f4098h;

    /* renamed from: i, reason: collision with root package name */
    static final o0<Object> f4099i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f4100c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f4101d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f4102e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f4103f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f4104g;

    static {
        Object[] objArr = new Object[0];
        f4098h = objArr;
        f4099i = new o0<>(objArr, 0, objArr, 0, 0);
    }

    @Override // Ce.J
    int k() {
        return 0;
    }

    @Override // Ce.J
    boolean l() {
        return false;
    }

    @Override // Ce.O
    boolean v() {
        return true;
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f4102e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = I.c(obj);
        while (true) {
            int i10 = iC & this.f4103f;
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

    @Override // Ce.J
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f4100c, 0, objArr, i10, this.f4104g);
        return i10 + this.f4104g;
    }

    @Override // Ce.J
    Object[] f() {
        return this.f4100c;
    }

    @Override // Ce.J
    int h() {
        return this.f4104g;
    }

    @Override // Ce.O, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f4101d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4104g;
    }

    @Override // Ce.O
    L<E> u() {
        return L.o(this.f4100c, this.f4104g);
    }

    o0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f4100c = objArr;
        this.f4101d = i10;
        this.f4102e = objArr2;
        this.f4103f = i11;
        this.f4104g = i12;
    }

    @Override // Ce.O, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public y0<E> iterator() {
        return a().iterator();
    }
}
