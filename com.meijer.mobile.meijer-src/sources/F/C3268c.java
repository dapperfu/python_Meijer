package F;

import android.util.Size;
import android.view.Surface;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3268c extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Surface f8703a;

    /* renamed from: b, reason: collision with root package name */
    private final Size f8704b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8705c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f8703a.equals(e0Var.d()) && this.f8704b.equals(e0Var.c()) && this.f8705c == e0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.e0
    public int b() {
        return this.f8705c;
    }

    @Override // F.e0
    public Size c() {
        return this.f8704b;
    }

    @Override // F.e0
    public Surface d() {
        return this.f8703a;
    }

    public int hashCode() {
        return ((((this.f8703a.hashCode() ^ 1000003) * 1000003) ^ this.f8704b.hashCode()) * 1000003) ^ this.f8705c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f8703a + ", size=" + this.f8704b + ", imageFormat=" + this.f8705c + "}";
    }

    C3268c(Surface surface, Size size, int i10) {
        if (surface != null) {
            this.f8703a = surface;
            if (size != null) {
                this.f8704b = size;
                this.f8705c = i10;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }
}
