package Q;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private final EGLSurface f27365a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27366b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27367c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f27365a.equals(gVar.a()) && this.f27366b == gVar.c() && this.f27367c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q.g
    public EGLSurface a() {
        return this.f27365a;
    }

    @Override // Q.g
    public int b() {
        return this.f27367c;
    }

    @Override // Q.g
    public int c() {
        return this.f27366b;
    }

    public int hashCode() {
        return ((((this.f27365a.hashCode() ^ 1000003) * 1000003) ^ this.f27366b) * 1000003) ^ this.f27367c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f27365a + ", width=" + this.f27366b + ", height=" + this.f27367c + "}";
    }

    c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface != null) {
            this.f27365a = eGLSurface;
            this.f27366b = i10;
            this.f27367c = i11;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }
}
