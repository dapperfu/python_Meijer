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
    private static final PreviewView.d f47852i = PreviewView.d.FILL_CENTER;

    /* renamed from: a, reason: collision with root package name */
    private Size f47853a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f47854b;

    /* renamed from: c, reason: collision with root package name */
    private int f47855c;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f47856d;

    /* renamed from: e, reason: collision with root package name */
    private int f47857e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47858f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47859g;

    /* renamed from: h, reason: collision with root package name */
    private PreviewView.d f47860h = f47852i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47861a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f47861a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47861a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47861a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47861a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47861a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47861a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f47859g ? this.f47855c : -G.c.b(this.f47857e);
    }

    private Size f() {
        return G.p.i(this.f47855c) ? new Size(this.f47854b.height(), this.f47854b.width()) : new Size(this.f47854b.width(), this.f47854b.height());
    }

    private boolean m() {
        return (this.f47854b == null || this.f47853a == null || !(!this.f47859g || this.f47857e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f47861a[dVar.ordinal()]) {
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
        p(matrix, rectF2, rectF, this.f47860h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.d g() {
        return this.f47860h;
    }

    Rect i() {
        return this.f47854b;
    }

    void o(int i10, int i11) {
        if (this.f47859g) {
            this.f47855c = i10;
            this.f47857e = i11;
        }
    }

    void q(PreviewView.d dVar) {
        this.f47860h = dVar;
    }

    void r(o0.h hVar, Size size, boolean z10) {
        P.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f47854b = hVar.a();
        this.f47855c = hVar.b();
        this.f47857e = hVar.d();
        this.f47853a = size;
        this.f47858f = z10;
        this.f47859g = hVar.e();
        this.f47856d = hVar.c();
    }

    e() {
    }

    private RectF l(Size size, int i10) {
        o2.i.i(m());
        Matrix matrixJ = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f47853a.getWidth(), this.f47853a.getHeight());
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
        matrix.postScale(rectFL.width() / this.f47853a.getWidth(), rectFL.height() / this.f47853a.getHeight());
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
        Matrix matrix = new Matrix(this.f47856d);
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
        Matrix matrixD = G.p.d(new RectF(this.f47854b), rectFD, this.f47855c);
        if (this.f47858f && this.f47859g) {
            if (G.p.i(this.f47855c)) {
                matrixD.preScale(1.0f, -1.0f, this.f47854b.centerX(), this.f47854b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f47854b.centerX(), this.f47854b.centerY());
        }
        return matrixD;
    }

    Matrix k() {
        o2.i.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f47853a.getWidth(), this.f47853a.getHeight());
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
                if (this.f47859g && display != null && display.getRotation() != this.f47857e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!this.f47859g && e() != 0) {
                    z11 = true;
                }
                if (z10 || z11) {
                    P.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f47853a.getWidth());
            view.setScaleY(rectFL.height() / this.f47853a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
            return;
        }
        P.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
