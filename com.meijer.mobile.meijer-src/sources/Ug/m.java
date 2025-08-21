package Ug;

/* loaded from: classes8.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f37495a = 0;

    /* renamed from: b, reason: collision with root package name */
    private a f37496b = a.NUMERIC;

    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    int a() {
        return this.f37495a;
    }

    void b(int i10) {
        this.f37495a += i10;
    }

    boolean c() {
        return this.f37496b == a.ALPHA;
    }

    boolean d() {
        return this.f37496b == a.ISO_IEC_646;
    }

    void e() {
        this.f37496b = a.ALPHA;
    }

    void f() {
        this.f37496b = a.ISO_IEC_646;
    }

    void g() {
        this.f37496b = a.NUMERIC;
    }

    void h(int i10) {
        this.f37495a = i10;
    }

    m() {
    }
}
