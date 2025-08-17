package G;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f11204a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix d(RectF rectF, RectF rectF2, int i10) {
        return e(rectF, rectF2, i10, false);
    }

    public static boolean j(Size size, Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static Rect p(Size size) {
        return q(size, 0, 0);
    }

    public static RectF r(Size size) {
        return s(size, 0, 0);
    }

    public static float a(float f10, float f11, float f12, float f13) {
        float f14 = (f10 * f12) + (f11 * f13);
        float f15 = (f10 * f13) - (f11 * f12);
        double dSqrt = Math.sqrt((f10 * f10) + (f11 * f11)) * Math.sqrt((f12 * f12) + (f13 * f13));
        return (float) Math.toDegrees(Math.atan2(f15 / dSqrt, f14 / dSqrt));
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f11204a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f11204a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static int g(Matrix matrix) {
        matrix.getValues(new float[9]);
        return u((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    public static boolean k(Size size, boolean z10, Size size2, boolean z11) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z10) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size n(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size o(Size size, int i10) {
        o2.i.b(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return i(u(i10)) ? n(size) : size;
    }

    public static Rect q(Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    public static RectF s(Size size, int i10, int i11) {
        return new RectF(i10, i11, i10 + size.getWidth(), i11 + size.getHeight());
    }

    public static Matrix t(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int u(int i10) {
        return ((i10 % 360) + 360) % 360;
    }

    public static Size f(Rect rect, int i10) {
        return o(m(rect), i10);
    }
}
