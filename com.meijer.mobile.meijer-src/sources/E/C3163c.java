package E;

import E.C3181v;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3163c extends C3181v.a {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<androidx.camera.core.n> f6910a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6911b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3181v.a) {
            C3181v.a aVar = (C3181v.a) obj;
            if (this.f6910a.equals(aVar.b()) && this.f6911b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3181v.a
    int a() {
        return this.f6911b;
    }

    @Override // E.C3181v.a
    O.B<androidx.camera.core.n> b() {
        return this.f6910a;
    }

    public int hashCode() {
        return ((this.f6910a.hashCode() ^ 1000003) * 1000003) ^ this.f6911b;
    }

    public String toString() {
        return "In{packet=" + this.f6910a + ", jpegQuality=" + this.f6911b + "}";
    }

    C3163c(O.B<androidx.camera.core.n> b10, int i10) {
        if (b10 != null) {
            this.f6910a = b10;
            this.f6911b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
