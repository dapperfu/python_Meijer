package Ug;

/* loaded from: classes7.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f36014a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36015b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36016c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36017d;

    /* renamed from: e, reason: collision with root package name */
    private int f36018e = -1;

    boolean h(int i10) {
        return i10 != -1 && this.f36016c == (i10 % 3) * 3;
    }

    int a() {
        return this.f36016c;
    }

    int b() {
        return this.f36015b;
    }

    int c() {
        return this.f36018e;
    }

    int d() {
        return this.f36014a;
    }

    int e() {
        return this.f36017d;
    }

    int f() {
        return this.f36015b - this.f36014a;
    }

    boolean g() {
        return h(this.f36018e);
    }

    void i(int i10) {
        this.f36018e = i10;
    }

    void j() {
        this.f36018e = ((this.f36017d / 30) * 3) + (this.f36016c / 3);
    }

    public String toString() {
        return this.f36018e + "|" + this.f36017d;
    }

    d(int i10, int i11, int i12, int i13) {
        this.f36014a = i10;
        this.f36015b = i11;
        this.f36016c = i12;
        this.f36017d = i13;
    }
}
