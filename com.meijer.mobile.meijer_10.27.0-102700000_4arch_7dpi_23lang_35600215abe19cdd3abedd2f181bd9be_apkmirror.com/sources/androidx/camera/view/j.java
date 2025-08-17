package androidx.camera.view;

import C.T;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;

/* loaded from: classes.dex */
class j extends T {

    /* renamed from: e, reason: collision with root package name */
    static final PointF f47651e = new PointF(2.0f, 2.0f);

    /* renamed from: b, reason: collision with root package name */
    private final e f47652b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f47653c = null;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f47654d;

    public void c(Rect rect) {
        a(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f47653c = rect;
        }
    }

    j(e eVar) {
        this.f47652b = eVar;
    }

    void b(Size size, int i10) {
        Rect rect;
        G.o.a();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f47653c) != null) {
                    this.f47654d = this.f47652b.c(size, i10, rect);
                    return;
                }
                this.f47654d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
