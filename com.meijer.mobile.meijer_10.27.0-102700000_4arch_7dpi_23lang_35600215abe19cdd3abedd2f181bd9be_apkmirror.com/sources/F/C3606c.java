package F;

import android.util.Size;
import android.view.Surface;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3606c extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Surface f9936a;

    /* renamed from: b, reason: collision with root package name */
    private final Size f9937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9938c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f9936a.equals(e0Var.d()) && this.f9937b.equals(e0Var.c()) && this.f9938c == e0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.e0
    public int b() {
        return this.f9938c;
    }

    @Override // F.e0
    public Size c() {
        return this.f9937b;
    }

    @Override // F.e0
    public Surface d() {
        return this.f9936a;
    }

    public int hashCode() {
        return ((((this.f9936a.hashCode() ^ 1000003) * 1000003) ^ this.f9937b.hashCode()) * 1000003) ^ this.f9938c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f9936a + ", size=" + this.f9937b + ", imageFormat=" + this.f9938c + "}";
    }

    C3606c(Surface surface, Size size, int i10) {
        if (surface != null) {
            this.f9936a = surface;
            if (size != null) {
                this.f9937b = size;
                this.f9938c = i10;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }
}
