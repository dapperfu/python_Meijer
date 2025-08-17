package Dg;

/* loaded from: classes7.dex */
abstract class g {

    /* renamed from: b, reason: collision with root package name */
    static final g f6445b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final g f6446a;

    abstract void c(Gg.a aVar, byte[] bArr);

    final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    final g d() {
        return this.f6446a;
    }

    g(g gVar) {
        this.f6446a = gVar;
    }
}
