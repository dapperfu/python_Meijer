package ev;

/* loaded from: classes9.dex */
public final class o<T> {

    /* renamed from: a, reason: collision with root package name */
    final float f130079a;

    /* renamed from: b, reason: collision with root package name */
    int f130080b;

    /* renamed from: c, reason: collision with root package name */
    int f130081c;

    /* renamed from: d, reason: collision with root package name */
    int f130082d;

    /* renamed from: e, reason: collision with root package name */
    T[] f130083e;

    public o() {
        this(16, 0.75f);
    }

    public o(int i10, float f10) {
        this.f130079a = f10;
        int iA = p.a(i10);
        this.f130080b = iA - 1;
        this.f130082d = (int) (f10 * iA);
        this.f130083e = (T[]) new Object[iA];
    }

    public boolean a(T t10) {
        T t11;
        T[] tArr = this.f130083e;
        int i10 = this.f130080b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                t11 = tArr[iC];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[iC] = t10;
        int i11 = this.f130081c + 1;
        this.f130081c = i11;
        if (i11 >= this.f130082d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f130083e;
    }

    void d() {
        T t10;
        T[] tArr = this.f130083e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f130081c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f130080b = i11;
                this.f130082d = (int) (i10 * this.f130079a);
                this.f130083e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int iC = c(t10.hashCode()) & i11;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i12 = i13;
        }
    }

    public boolean e(T t10) {
        T t11;
        T[] tArr = this.f130083e;
        int i10 = this.f130080b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return f(iC, tArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            t11 = tArr[iC];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return f(iC, tArr, i10);
    }

    boolean f(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f130081c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 == null) {
                    tArr[i10] = null;
                    return true;
                }
                int iC = c(t10.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iC || iC > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iC || iC <= i12) {
                    i13 = i12 + 1;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }

    public int g() {
        return this.f130081c;
    }

    static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }
}
