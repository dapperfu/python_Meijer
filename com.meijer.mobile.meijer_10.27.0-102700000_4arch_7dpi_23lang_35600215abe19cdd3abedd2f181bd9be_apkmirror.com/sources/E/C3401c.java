package E;

import E.C3419v;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3401c extends C3419v.a {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<androidx.camera.core.n> f7503a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7504b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3419v.a) {
            C3419v.a aVar = (C3419v.a) obj;
            if (this.f7503a.equals(aVar.b()) && this.f7504b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3419v.a
    int a() {
        return this.f7504b;
    }

    @Override // E.C3419v.a
    O.B<androidx.camera.core.n> b() {
        return this.f7503a;
    }

    public int hashCode() {
        return ((this.f7503a.hashCode() ^ 1000003) * 1000003) ^ this.f7504b;
    }

    public String toString() {
        return "In{packet=" + this.f7503a + ", jpegQuality=" + this.f7504b + "}";
    }

    C3401c(O.B<androidx.camera.core.n> b10, int i10) {
        if (b10 != null) {
            this.f7503a = b10;
            this.f7504b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
