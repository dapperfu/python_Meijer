package Wg;

/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f41039a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41040b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41041c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41042d;

    /* renamed from: e, reason: collision with root package name */
    private int f41043e = -1;

    boolean h(int i10) {
        return i10 != -1 && this.f41041c == (i10 % 3) * 3;
    }

    int a() {
        return this.f41041c;
    }

    int b() {
        return this.f41040b;
    }

    int c() {
        return this.f41043e;
    }

    int d() {
        return this.f41039a;
    }

    int e() {
        return this.f41042d;
    }

    int f() {
        return this.f41040b - this.f41039a;
    }

    boolean g() {
        return h(this.f41043e);
    }

    void i(int i10) {
        this.f41043e = i10;
    }

    void j() {
        this.f41043e = ((this.f41042d / 30) * 3) + (this.f41041c / 3);
    }

    public String toString() {
        return this.f41043e + "|" + this.f41042d;
    }

    d(int i10, int i11, int i12, int i13) {
        this.f41039a = i10;
        this.f41040b = i11;
        this.f41041c = i12;
        this.f41042d = i13;
    }
}
