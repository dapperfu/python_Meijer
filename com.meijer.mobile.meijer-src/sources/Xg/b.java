package Xg;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f42268f = new b(929, 3);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f42269a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f42270b;

    /* renamed from: c, reason: collision with root package name */
    private final c f42271c;

    /* renamed from: d, reason: collision with root package name */
    private final c f42272d;

    /* renamed from: e, reason: collision with root package name */
    private final int f42273e;

    int a(int i10, int i11) {
        return (i10 + i11) % this.f42273e;
    }

    c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f42271c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new c(this, iArr);
    }

    int c(int i10) {
        return this.f42269a[i10];
    }

    c d() {
        return this.f42272d;
    }

    int e() {
        return this.f42273e;
    }

    c f() {
        return this.f42271c;
    }

    int g(int i10) {
        if (i10 != 0) {
            return this.f42269a[(this.f42273e - this.f42270b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f42270b[i10];
        }
        throw new IllegalArgumentException();
    }

    int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f42269a;
        int[] iArr2 = this.f42270b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f42273e - 1)];
    }

    int j(int i10, int i11) {
        int i12 = this.f42273e;
        return ((i10 + i12) - i11) % i12;
    }

    private b(int i10, int i11) {
        this.f42273e = i10;
        this.f42269a = new int[i10];
        this.f42270b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f42269a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f42270b[this.f42269a[i14]] = i14;
        }
        this.f42271c = new c(this, new int[]{0});
        this.f42272d = new c(this, new int[]{1});
    }
}
