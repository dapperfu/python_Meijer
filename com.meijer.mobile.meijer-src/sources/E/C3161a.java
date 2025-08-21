package E;

import E.C3168h;
import android.graphics.Bitmap;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3161a extends C3168h.b {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<Bitmap> f6895a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6896b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3168h.b) {
            C3168h.b bVar = (C3168h.b) obj;
            if (this.f6895a.equals(bVar.b()) && this.f6896b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3168h.b
    int a() {
        return this.f6896b;
    }

    @Override // E.C3168h.b
    O.B<Bitmap> b() {
        return this.f6895a;
    }

    public int hashCode() {
        return ((this.f6895a.hashCode() ^ 1000003) * 1000003) ^ this.f6896b;
    }

    public String toString() {
        return "In{packet=" + this.f6895a + ", jpegQuality=" + this.f6896b + "}";
    }

    C3161a(O.B<Bitmap> b10, int i10) {
        if (b10 != null) {
            this.f6895a = b10;
            this.f6896b = i10;
            return;
        }
        throw new NullPointerException("Null packet");
    }
}
