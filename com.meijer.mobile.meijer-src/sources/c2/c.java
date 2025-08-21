package c2;

import android.graphics.Color;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f61159a = new ThreadLocal<>();

    public static void a(int i10, int i11, int i12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = i10 / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i11 / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = i12 / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int c(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private static int f(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / l3.f93323c);
    }

    private static int h(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * l3.f93323c) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * l3.f93323c);
    }

    private static int i(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }

    private static double[] j() {
        ThreadLocal<double[]> threadLocal = f61159a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    public static double d(int i10) {
        double[] dArrJ = j();
        e(i10, dArrJ);
        return dArrJ[1] / 100.0d;
    }

    public static void e(int i10, double[] dArr) {
        a(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static int g(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int iF = f(iAlpha2, iAlpha);
        return Color.argb(iF, h(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, iF), h(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, iF), h(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, iF));
    }

    public static int b(double d10, double d11, double d12) {
        double dPow;
        double dPow2;
        double dPow3;
        double d13 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d14 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d15 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        if (d13 > 0.0031308d) {
            dPow = (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow = d13 * 12.92d;
        }
        if (d14 > 0.0031308d) {
            dPow2 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow2 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            dPow3 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow3 = d15 * 12.92d;
        }
        return Color.rgb(i((int) Math.round(dPow * 255.0d), 0, l3.f93323c), i((int) Math.round(dPow2 * 255.0d), 0, l3.f93323c), i((int) Math.round(dPow3 * 255.0d), 0, l3.f93323c));
    }
}
