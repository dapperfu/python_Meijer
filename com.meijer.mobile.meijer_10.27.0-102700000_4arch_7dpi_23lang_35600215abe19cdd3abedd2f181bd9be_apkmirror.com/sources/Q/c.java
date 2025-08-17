package Q;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private final EGLSurface f29352a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29353b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29354c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f29352a.equals(gVar.a()) && this.f29353b == gVar.c() && this.f29354c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // Q.g
    public EGLSurface a() {
        return this.f29352a;
    }

    @Override // Q.g
    public int b() {
        return this.f29354c;
    }

    @Override // Q.g
    public int c() {
        return this.f29353b;
    }

    public int hashCode() {
        return ((((this.f29352a.hashCode() ^ 1000003) * 1000003) ^ this.f29353b) * 1000003) ^ this.f29354c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f29352a + ", width=" + this.f29353b + ", height=" + this.f29354c + "}";
    }

    c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface != null) {
            this.f29352a = eGLSurface;
            this.f29353b = i10;
            this.f29354c = i11;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }
}
