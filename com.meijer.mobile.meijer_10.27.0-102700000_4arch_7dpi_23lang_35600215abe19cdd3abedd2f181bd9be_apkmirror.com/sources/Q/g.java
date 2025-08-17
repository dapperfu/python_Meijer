package Q;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public abstract class g {
    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();

    public static g d(EGLSurface eGLSurface, int i10, int i11) {
        return new c(eGLSurface, i10, i11);
    }
}
