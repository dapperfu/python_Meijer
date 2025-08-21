package Fg;

/* loaded from: classes8.dex */
abstract class g {

    /* renamed from: b, reason: collision with root package name */
    static final g f10478b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final g f10479a;

    abstract void c(Ig.a aVar, byte[] bArr);

    final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    final g d() {
        return this.f10479a;
    }

    g(g gVar) {
        this.f10479a = gVar;
    }
}
