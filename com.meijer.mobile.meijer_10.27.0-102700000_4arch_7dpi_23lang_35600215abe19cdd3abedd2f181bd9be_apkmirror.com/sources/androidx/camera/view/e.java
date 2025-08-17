package androidx.camera.view;

import C.P;
import C.o0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.PreviewView;

/* loaded from: classes.dex */
final class e {

    /* renamed from: i, reason: collision with root package name */
    private static final PreviewView.d f47628i = PreviewView.d.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    private Size f47629a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f47630b;

    /* renamed from: c, reason: collision with root package name */
    private int f47631c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f47632d;

    /* renamed from: e, reason: collision with root package name */
    private int f47633e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47634f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47635g;

    /* renamed from: h, reason: collision with root package name */
    private PreviewView.d f47636h = f47628i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47637a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f47637a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47637a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47637a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47637a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47637a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47637a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f47635g ? this.f47631c : -G.c.b(this.f47633e);
    }

    private Size f() {
        return G.p.i(this.f47631c) ? new Size(this.f47630b.height(), this.f47630b.width()) : new Size(this.f47630b.width(), this.f47630b.height());
    }

    private boolean m() {
        return (this.f47630b == null || this.f47629a == null || !(!this.f47635g || this.f47633e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f47637a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                P.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f47636h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.d g() {
        return this.f47636h;
    }

    Rect i() {
        return this.f47630b;
    }

    void o(int i10, int i11) {
        if (this.f47635g) {
            this.f47631c = i10;
            this.f47633e = i11;
        }
    }

    void q(PreviewView.d dVar) {
        this.f47636h = dVar;
    }

    void r(o0.h hVar, Size size, boolean z10) {
        P.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f47630b = hVar.a();
        this.f47631c = hVar.b();
        this.f47633e = hVar.d();
        this.f47629a = size;
        this.f47634f = z10;
        this.f47635g = hVar.e();
        this.f47632d = hVar.c();
    }

    e() {
    }

    private RectF l(Size size, int i10) {
        o2.i.i(m());
        Matrix matrixJ = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f47629a.getWidth(), this.f47629a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f47629a.getWidth(), rectFL.height() / this.f47629a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i10, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    Matrix h(Size size, int i10) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f47632d);
        matrix.postConcat(j(size, i10));
        return matrix;
    }

    Matrix j(Size size, int i10) {
        RectF rectFD;
        o2.i.i(m());
        if (n(size)) {
            rectFD = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            rectFD = d(size, i10);
        }
        Matrix matrixD = G.p.d(new RectF(this.f47630b), rectFD, this.f47631c);
        if (this.f47634f && this.f47635g) {
            if (G.p.i(this.f47631c)) {
                matrixD.preScale(1.0f, -1.0f, this.f47630b.centerX(), this.f47630b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f47630b.centerX(), this.f47630b.centerY());
        }
        return matrixD;
    }

    Matrix k() {
        o2.i.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f47629a.getWidth(), this.f47629a.getHeight());
        return G.p.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return G.p.k(size, true, f(), false);
    }

    void s(Size size, int i10, View view) {
        boolean z10;
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (!m()) {
                return;
            }
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z11 = false;
                if (this.f47635g && display != null && display.getRotation() != this.f47633e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!this.f47635g && e() != 0) {
                    z11 = true;
                }
                if (z10 || z11) {
                    P.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f47629a.getWidth());
            view.setScaleY(rectFL.height() / this.f47629a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
            return;
        }
        P.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
