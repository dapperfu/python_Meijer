package E;

import E.C3406h;
import android.graphics.Bitmap;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3399a extends C3406h.b {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<Bitmap> f7488a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7489b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3406h.b) {
            C3406h.b bVar = (C3406h.b) obj;
            if (this.f7488a.equals(bVar.b()) && this.f7489b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3406h.b
    int a() {
        return this.f7489b;
    }

    @Override // E.C3406h.b
    O.B<Bitmap> b() {
        return this.f7488a;
    }

    public int hashCode() {
        return ((this.f7488a.hashCode() ^ 1000003) * 1000003) ^ this.f7489b;
    }

    public String toString() {
        return "In{packet=" + this.f7488a + ", jpegQuality=" + this.f7489b + "}";
    }

    C3399a(O.B<Bitmap> b10, int i10) {
        if (b10 != null) {
            this.f7488a = b10;
            this.f7489b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
