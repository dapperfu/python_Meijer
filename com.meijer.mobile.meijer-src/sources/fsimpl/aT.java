package fsimpl;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class aT {

    /* renamed from: A, reason: collision with root package name */
    private static final Field f132769A;

    /* renamed from: a, reason: collision with root package name */
    private static final Field f132770a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f132771b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f132772c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f132773d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f132774e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f132775f;

    /* renamed from: g, reason: collision with root package name */
    private static final Field f132776g;

    /* renamed from: h, reason: collision with root package name */
    private static final Field f132777h;

    /* renamed from: i, reason: collision with root package name */
    private static final Field f132778i;

    /* renamed from: j, reason: collision with root package name */
    private static final Field f132779j;

    /* renamed from: k, reason: collision with root package name */
    private static final Field f132780k;

    /* renamed from: l, reason: collision with root package name */
    private static final Field f132781l;

    /* renamed from: m, reason: collision with root package name */
    private static final Field f132782m;

    /* renamed from: n, reason: collision with root package name */
    private static final Field f132783n;

    /* renamed from: o, reason: collision with root package name */
    private static final Field f132784o;

    /* renamed from: p, reason: collision with root package name */
    private static final Field f132785p;

    /* renamed from: q, reason: collision with root package name */
    private static final Field f132786q;

    /* renamed from: r, reason: collision with root package name */
    private static final Field f132787r;

    /* renamed from: s, reason: collision with root package name */
    private static final Field f132788s;

    /* renamed from: t, reason: collision with root package name */
    private static final Field f132789t;

    /* renamed from: u, reason: collision with root package name */
    private static final Field f132790u;

    /* renamed from: v, reason: collision with root package name */
    private static final Field f132791v;

    /* renamed from: w, reason: collision with root package name */
    private static final Field f132792w;

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f132793x;

    /* renamed from: y, reason: collision with root package name */
    private static final Field f132794y;

    /* renamed from: z, reason: collision with root package name */
    private static final Field f132795z;

    static {
        boolean z10;
        Field fieldA = fT.a(-1, 31, LinearGradient.class, "mX0");
        f132770a = fieldA;
        Field fieldA2 = fT.a(-1, 31, LinearGradient.class, "mY0");
        f132771b = fieldA2;
        Field fieldA3 = fT.a(-1, 31, LinearGradient.class, "mX1");
        f132772c = fieldA3;
        Field fieldA4 = fT.a(-1, 31, LinearGradient.class, "mY1");
        f132773d = fieldA4;
        Field fieldA5 = fT.a(-1, 31, LinearGradient.class, "mPositions");
        f132777h = fieldA5;
        Field fieldA6 = fT.a(LinearGradient.class, "mColors");
        f132774e = fieldA6;
        Field fieldA7 = fT.a(LinearGradient.class, "mColor0");
        f132775f = fieldA7;
        Field fieldA8 = fT.a(-1, 31, LinearGradient.class, "mColor1");
        f132776g = fieldA8;
        Field fieldA9 = fT.a(-1, 31, LinearGradient.class, "mTileMode");
        f132778i = fieldA9;
        boolean z11 = true;
        if (fieldA == null || fieldA2 == null || fieldA3 == null || fieldA4 == null || fieldA5 == null || fieldA6 == null || fieldA7 == null || fieldA8 == null || fieldA9 == null) {
            Log.e("Failed to locate LinearGradient bits: linearGradientX0=" + fieldA + "; linearGradientY0=" + fieldA2 + "; linearGradientX1=" + fieldA3 + "; linearGradientY1=" + fieldA4 + "; linearGradientPositions=" + fieldA5 + "; linearGradientColors=" + fieldA6 + "; linearGradientColor0=" + fieldA7 + "; linearGradientColor1=" + fieldA8 + "; linearGradientTileMode=" + fieldA9);
            z10 = true;
        } else {
            z10 = false;
        }
        Field fieldA10 = fT.a(-1, 31, RadialGradient.class, "mX");
        f132779j = fieldA10;
        Field fieldA11 = fT.a(-1, 31, RadialGradient.class, "mY");
        f132780k = fieldA11;
        Field fieldA12 = fT.a(-1, 31, RadialGradient.class, "mRadius");
        f132781l = fieldA12;
        Field fieldA13 = fT.a(-1, 31, RadialGradient.class, "mPositions");
        f132785p = fieldA13;
        Field fieldA14 = fT.a(-1, 31, RadialGradient.class, "mColors");
        f132782m = fieldA14;
        Field fieldA15 = fT.a(-1, 31, RadialGradient.class, "mCenterColor");
        f132783n = fieldA15;
        Field fieldA16 = fT.a(-1, 31, RadialGradient.class, "mEdgeColor");
        f132784o = fieldA16;
        Field fieldA17 = fT.a(-1, 31, RadialGradient.class, "mTileMode");
        f132786q = fieldA17;
        if (fieldA10 == null || fieldA11 == null || fieldA12 == null || fieldA13 == null || fieldA14 == null || fieldA15 == null || fieldA16 == null || fieldA17 == null) {
            Log.e("Failed to locate RadialGradient bits: radialGradientX=" + fieldA10 + "; radialGradientY=" + fieldA11 + "; radialGradientR=" + fieldA12 + "; radialGradientPositions=" + fieldA13 + "; radialGradientColors=" + fieldA14 + "; radialGradientColor0=" + fieldA15 + "; radialGradientColor1=" + fieldA16 + "; radialGradientTileMode=" + fieldA17);
            z10 = true;
        }
        Field fieldA18 = fT.a(-1, 31, SweepGradient.class, "mCx");
        f132787r = fieldA18;
        Field fieldA19 = fT.a(-1, 31, SweepGradient.class, "mCy");
        f132788s = fieldA19;
        Field fieldA20 = fT.a(-1, 31, SweepGradient.class, "mPositions");
        f132792w = fieldA20;
        Field fieldA21 = fT.a(-1, 31, SweepGradient.class, "mColors");
        f132789t = fieldA21;
        Field fieldA22 = fT.a(-1, 31, SweepGradient.class, "mColor0");
        f132790u = fieldA22;
        Field fieldA23 = fT.a(-1, 31, SweepGradient.class, "mColor1");
        f132791v = fieldA23;
        if (fieldA18 == null || fieldA19 == null || fieldA20 == null || fieldA21 == null || fieldA22 == null || fieldA23 == null) {
            Log.e("Failed to locate SweepGradient bits: sweepGradientX=" + fieldA18 + "; sweepGradientY=" + fieldA19 + "; sweepGradientPositions=" + fieldA20 + "; sweepGradientColors=" + fieldA21 + "; sweepGradientColor0=" + fieldA22 + "; sweepGradientColor1=" + fieldA23);
            z10 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Field fieldA24 = fT.a(30, LinearGradient.class, "mColorLongs");
            f132794y = fieldA24;
            if (fieldA24 == null) {
                Log.e("Failed to locate LinearGradient bits: linearGradientColorLongs=" + fieldA24);
                z10 = true;
            }
            Field fieldA25 = fT.a(30, RadialGradient.class, "mColorLongs");
            f132795z = fieldA25;
            if (fieldA25 == null) {
                Log.e("Failed to locate RadialGradient bits: radialGradientColorLongs=" + fieldA25);
                z10 = true;
            }
            Field fieldA26 = fT.a(30, SweepGradient.class, "mColorLongs");
            f132769A = fieldA26;
            if (fieldA26 == null) {
                Log.e("Failed to locate SweepGradient bits: sweepGradientColorLongs=" + fieldA26);
            }
            f132793x = z11;
        }
        f132794y = null;
        f132795z = null;
        f132769A = null;
        z11 = z10;
        f132793x = z11;
    }

    private void a(gh ghVar, int[] iArr, int i10, int i11, float[] fArr) {
        int iA;
        if (iArr == null) {
            C14176dw.d(ghVar, 2);
            ghVar.c(i11);
            ghVar.c(i10);
            iA = ghVar.b();
        } else {
            iA = C14176dw.a(ghVar, iArr);
        }
        int iA2 = fArr != null ? C14176dw.a(ghVar, fArr) : 0;
        C14176dw.a(ghVar);
        C14176dw.c(ghVar, iA);
        C14176dw.e(ghVar, iA2);
    }

    private static int[] a(Shader shader, Field field, Field field2) {
        return field2 != null ? fA.a((long[]) field2.get(shader)) : (int[]) field.get(shader);
    }

    private int b(gh ghVar, Shader shader) {
        try {
        } catch (Throwable th2) {
            dI.a("Failed to read gradients", th2);
        }
        if (shader instanceof LinearGradient) {
            float f10 = f132770a.getFloat(shader);
            float f11 = f132771b.getFloat(shader);
            float f12 = f132772c.getFloat(shader);
            float f13 = f132773d.getFloat(shader);
            int[] iArrA = a(shader, f132774e, f132794y);
            int i10 = f132775f.getInt(shader);
            int i11 = f132776g.getInt(shader);
            float[] fArr = (float[]) f132777h.get(shader);
            Shader.TileMode tileMode = (Shader.TileMode) f132778i.get(shader);
            a(ghVar, iArrA, i10, i11, fArr);
            C14176dw.a(ghVar, (byte) 0);
            C14176dw.a(ghVar, C14168dn.a(ghVar, f10, f11));
            C14176dw.b(ghVar, C14168dn.a(ghVar, f12, f13));
            C14176dw.b(ghVar, C14103bc.a(tileMode));
            return C14176dw.b(ghVar);
        }
        if (!(shader instanceof RadialGradient)) {
            if (shader instanceof SweepGradient) {
                float f14 = f132787r.getFloat(shader);
                float f15 = f132788s.getFloat(shader);
                a(ghVar, a(shader, f132789t, f132769A), f132790u.getInt(shader), f132791v.getInt(shader), (float[]) f132792w.get(shader));
                C14176dw.a(ghVar, (byte) 2);
                C14176dw.a(ghVar, C14168dn.a(ghVar, f14, f15));
                return C14176dw.b(ghVar);
            }
            return 0;
        }
        float f16 = f132779j.getFloat(shader);
        float f17 = f132780k.getFloat(shader);
        float f18 = f132781l.getFloat(shader);
        int[] iArrA2 = a(shader, f132782m, f132795z);
        int i12 = f132783n.getInt(shader);
        int i13 = f132784o.getInt(shader);
        float[] fArr2 = (float[]) f132785p.get(shader);
        Shader.TileMode tileMode2 = (Shader.TileMode) f132786q.get(shader);
        a(ghVar, iArrA2, i12, i13, fArr2);
        C14176dw.a(ghVar, (byte) 1);
        C14176dw.a(ghVar, C14168dn.a(ghVar, f16, f17));
        C14176dw.a(ghVar, f18);
        C14176dw.b(ghVar, C14103bc.a(tileMode2));
        return C14176dw.b(ghVar);
    }

    public int a(gh ghVar, Shader shader) {
        if (f132793x) {
            return 0;
        }
        return b(ghVar, shader);
    }
}
