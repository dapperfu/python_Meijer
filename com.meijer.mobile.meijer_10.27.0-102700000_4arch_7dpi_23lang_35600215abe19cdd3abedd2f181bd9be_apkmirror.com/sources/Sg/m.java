package Sg;

/* loaded from: classes7.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f33619a = 0;

    /* renamed from: b, reason: collision with root package name */
    private a f33620b = a.NUMERIC;

    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    int a() {
        return this.f33619a;
    }

    void b(int i10) {
        this.f33619a += i10;
    }

    boolean c() {
        return this.f33620b == a.ALPHA;
    }

    boolean d() {
        return this.f33620b == a.ISO_IEC_646;
    }

    void e() {
        this.f33620b = a.ALPHA;
    }

    void f() {
        this.f33620b = a.ISO_IEC_646;
    }

    void g() {
        this.f33620b = a.NUMERIC;
    }

    void h(int i10) {
        this.f33619a = i10;
    }

    m() {
    }
}
