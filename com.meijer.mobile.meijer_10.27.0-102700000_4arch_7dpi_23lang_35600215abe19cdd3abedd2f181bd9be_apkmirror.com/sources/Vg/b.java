package Vg;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f37556f = new b(929, 3);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f37557a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f37558b;

    /* renamed from: c, reason: collision with root package name */
    private final c f37559c;

    /* renamed from: d, reason: collision with root package name */
    private final c f37560d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37561e;

    int a(int i10, int i11) {
        return (i10 + i11) % this.f37561e;
    }

    c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f37559c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    int c(int i10) {
        return this.f37557a[i10];
    }

    c d() {
        return this.f37560d;
    }

    int e() {
        return this.f37561e;
    }

    c f() {
        return this.f37559c;
    }

    int g(int i10) {
        if (i10 != 0) {
            return this.f37557a[(this.f37561e - this.f37558b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f37558b[i10];
        }
        throw new IllegalArgumentException();
    }

    int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f37557a;
        int[] iArr2 = this.f37558b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f37561e - 1)];
    }

    int j(int i10, int i11) {
        int i12 = this.f37561e;
        return ((i10 + i12) - i11) % i12;
    }

    private b(int i10, int i11) {
        this.f37561e = i10;
        this.f37557a = new int[i10];
        this.f37558b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f37557a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f37558b[this.f37557a[i14]] = i14;
        }
        this.f37559c = new c(this, new int[]{0});
        this.f37560d = new c(this, new int[]{1});
    }
}
