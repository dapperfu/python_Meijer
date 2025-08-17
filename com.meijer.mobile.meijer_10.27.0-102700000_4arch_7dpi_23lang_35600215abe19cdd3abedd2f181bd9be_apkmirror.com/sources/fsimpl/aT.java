package fsimpl;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
public class aT {

    /* renamed from: A, reason: collision with root package name */
    private static final Field f131519A;

    /* renamed from: a, reason: collision with root package name */
    private static final Field f131520a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f131521b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f131522c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f131523d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f131524e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f131525f;

    /* renamed from: g, reason: collision with root package name */
    private static final Field f131526g;

    /* renamed from: h, reason: collision with root package name */
    private static final Field f131527h;

    /* renamed from: i, reason: collision with root package name */
    private static final Field f131528i;

    /* renamed from: j, reason: collision with root package name */
    private static final Field f131529j;

    /* renamed from: k, reason: collision with root package name */
    private static final Field f131530k;

    /* renamed from: l, reason: collision with root package name */
    private static final Field f131531l;

    /* renamed from: m, reason: collision with root package name */
    private static final Field f131532m;

    /* renamed from: n, reason: collision with root package name */
    private static final Field f131533n;

    /* renamed from: o, reason: collision with root package name */
    private static final Field f131534o;

    /* renamed from: p, reason: collision with root package name */
    private static final Field f131535p;

    /* renamed from: q, reason: collision with root package name */
    private static final Field f131536q;

    /* renamed from: r, reason: collision with root package name */
    private static final Field f131537r;

    /* renamed from: s, reason: collision with root package name */
    private static final Field f131538s;

    /* renamed from: t, reason: collision with root package name */
    private static final Field f131539t;

    /* renamed from: u, reason: collision with root package name */
    private static final Field f131540u;

    /* renamed from: v, reason: collision with root package name */
    private static final Field f131541v;

    /* renamed from: w, reason: collision with root package name */
    private static final Field f131542w;

    /* renamed from: x, reason: collision with root package name */
    private static final boolean f131543x;

    /* renamed from: y, reason: collision with root package name */
    private static final Field f131544y;

    /* renamed from: z, reason: collision with root package name */
    private static final Field f131545z;

    static {
        boolean z10;
        Field fieldA = fT.a(-1, 31, LinearGradient.class, "mX0");
        f131520a = fieldA;
        Field fieldA2 = fT.a(-1, 31, LinearGradient.class, "mY0");
        f131521b = fieldA2;
        Field fieldA3 = fT.a(-1, 31, LinearGradient.class, "mX1");
        f131522c = fieldA3;
        Field fieldA4 = fT.a(-1, 31, LinearGradient.class, "mY1");
        f131523d = fieldA4;
        Field fieldA5 = fT.a(-1, 31, LinearGradient.class, "mPositions");
        f131527h = fieldA5;
        Field fieldA6 = fT.a(LinearGradient.class, "mColors");
        f131524e = fieldA6;
        Field fieldA7 = fT.a(LinearGradient.class, "mColor0");
        f131525f = fieldA7;
        Field fieldA8 = fT.a(-1, 31, LinearGradient.class, "mColor1");
        f131526g = fieldA8;
        Field fieldA9 = fT.a(-1, 31, LinearGradient.class, "mTileMode");
        f131528i = fieldA9;
        boolean z11 = true;
        if (fieldA == null || fieldA2 == null || fieldA3 == null || fieldA4 == null || fieldA5 == null || fieldA6 == null || fieldA7 == null || fieldA8 == null || fieldA9 == null) {
            Log.e("Failed to locate LinearGradient bits: linearGradientX0=" + fieldA + "; linearGradientY0=" + fieldA2 + "; linearGradientX1=" + fieldA3 + "; linearGradientY1=" + fieldA4 + "; linearGradientPositions=" + fieldA5 + "; linearGradientColors=" + fieldA6 + "; linearGradientColor0=" + fieldA7 + "; linearGradientColor1=" + fieldA8 + "; linearGradientTileMode=" + fieldA9);
            z10 = true;
        } else {
            z10 = false;
        }
        Field fieldA10 = fT.a(-1, 31, RadialGradient.class, "mX");
        f131529j = fieldA10;
        Field fieldA11 = fT.a(-1, 31, RadialGradient.class, "mY");
        f131530k = fieldA11;
        Field fieldA12 = fT.a(-1, 31, RadialGradient.class, "mRadius");
        f131531l = fieldA12;
        Field fieldA13 = fT.a(-1, 31, RadialGradient.class, "mPositions");
        f131535p = fieldA13;
        Field fieldA14 = fT.a(-1, 31, RadialGradient.class, "mColors");
        f131532m = fieldA14;
        Field fieldA15 = fT.a(-1, 31, RadialGradient.class, "mCenterColor");
        f131533n = fieldA15;
        Field fieldA16 = fT.a(-1, 31, RadialGradient.class, "mEdgeColor");
        f131534o = fieldA16;
        Field fieldA17 = fT.a(-1, 31, RadialGradient.class, "mTileMode");
        f131536q = fieldA17;
        if (fieldA10 == null || fieldA11 == null || fieldA12 == null || fieldA13 == null || fieldA14 == null || fieldA15 == null || fieldA16 == null || fieldA17 == null) {
            Log.e("Failed to locate RadialGradient bits: radialGradientX=" + fieldA10 + "; radialGradientY=" + fieldA11 + "; radialGradientR=" + fieldA12 + "; radialGradientPositions=" + fieldA13 + "; radialGradientColors=" + fieldA14 + "; radialGradientColor0=" + fieldA15 + "; radialGradientColor1=" + fieldA16 + "; radialGradientTileMode=" + fieldA17);
            z10 = true;
        }
        Field fieldA18 = fT.a(-1, 31, SweepGradient.class, "mCx");
        f131537r = fieldA18;
        Field fieldA19 = fT.a(-1, 31, SweepGradient.class, "mCy");
        f131538s = fieldA19;
        Field fieldA20 = fT.a(-1, 31, SweepGradient.class, "mPositions");
        f131542w = fieldA20;
        Field fieldA21 = fT.a(-1, 31, SweepGradient.class, "mColors");
        f131539t = fieldA21;
        Field fieldA22 = fT.a(-1, 31, SweepGradient.class, "mColor0");
        f131540u = fieldA22;
        Field fieldA23 = fT.a(-1, 31, SweepGradient.class, "mColor1");
        f131541v = fieldA23;
        if (fieldA18 == null || fieldA19 == null || fieldA20 == null || fieldA21 == null || fieldA22 == null || fieldA23 == null) {
            Log.e("Failed to locate SweepGradient bits: sweepGradientX=" + fieldA18 + "; sweepGradientY=" + fieldA19 + "; sweepGradientPositions=" + fieldA20 + "; sweepGradientColors=" + fieldA21 + "; sweepGradientColor0=" + fieldA22 + "; sweepGradientColor1=" + fieldA23);
            z10 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Field fieldA24 = fT.a(30, LinearGradient.class, "mColorLongs");
            f131544y = fieldA24;
            if (fieldA24 == null) {
                Log.e("Failed to locate LinearGradient bits: linearGradientColorLongs=" + fieldA24);
                z10 = true;
            }
            Field fieldA25 = fT.a(30, RadialGradient.class, "mColorLongs");
            f131545z = fieldA25;
            if (fieldA25 == null) {
                Log.e("Failed to locate RadialGradient bits: radialGradientColorLongs=" + fieldA25);
                z10 = true;
            }
            Field fieldA26 = fT.a(30, SweepGradient.class, "mColorLongs");
            f131519A = fieldA26;
            if (fieldA26 == null) {
                Log.e("Failed to locate SweepGradient bits: sweepGradientColorLongs=" + fieldA26);
            }
            f131543x = z11;
        }
        f131544y = null;
        f131545z = null;
        f131519A = null;
        z11 = z10;
        f131543x = z11;
    }

    private void a(gh ghVar, int[] iArr, int i10, int i11, float[] fArr) {
        int iA;
        if (iArr == null) {
            C14051dw.d(ghVar, 2);
            ghVar.c(i11);
            ghVar.c(i10);
            iA = ghVar.b();
        } else {
            iA = C14051dw.a(ghVar, iArr);
        }
        int iA2 = fArr != null ? C14051dw.a(ghVar, fArr) : 0;
        C14051dw.a(ghVar);
        C14051dw.c(ghVar, iA);
        C14051dw.e(ghVar, iA2);
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
            float f10 = f131520a.getFloat(shader);
            float f11 = f131521b.getFloat(shader);
            float f12 = f131522c.getFloat(shader);
            float f13 = f131523d.getFloat(shader);
            int[] iArrA = a(shader, f131524e, f131544y);
            int i10 = f131525f.getInt(shader);
            int i11 = f131526g.getInt(shader);
            float[] fArr = (float[]) f131527h.get(shader);
            Shader.TileMode tileMode = (Shader.TileMode) f131528i.get(shader);
            a(ghVar, iArrA, i10, i11, fArr);
            C14051dw.a(ghVar, (byte) 0);
            C14051dw.a(ghVar, C14043dn.a(ghVar, f10, f11));
            C14051dw.b(ghVar, C14043dn.a(ghVar, f12, f13));
            C14051dw.b(ghVar, C13978bc.a(tileMode));
            return C14051dw.b(ghVar);
        }
        if (!(shader instanceof RadialGradient)) {
            if (shader instanceof SweepGradient) {
                float f14 = f131537r.getFloat(shader);
                float f15 = f131538s.getFloat(shader);
                a(ghVar, a(shader, f131539t, f131519A), f131540u.getInt(shader), f131541v.getInt(shader), (float[]) f131542w.get(shader));
                C14051dw.a(ghVar, (byte) 2);
                C14051dw.a(ghVar, C14043dn.a(ghVar, f14, f15));
                return C14051dw.b(ghVar);
            }
            return 0;
        }
        float f16 = f131529j.getFloat(shader);
        float f17 = f131530k.getFloat(shader);
        float f18 = f131531l.getFloat(shader);
        int[] iArrA2 = a(shader, f131532m, f131545z);
        int i12 = f131533n.getInt(shader);
        int i13 = f131534o.getInt(shader);
        float[] fArr2 = (float[]) f131535p.get(shader);
        Shader.TileMode tileMode2 = (Shader.TileMode) f131536q.get(shader);
        a(ghVar, iArrA2, i12, i13, fArr2);
        C14051dw.a(ghVar, (byte) 1);
        C14051dw.a(ghVar, C14043dn.a(ghVar, f16, f17));
        C14051dw.a(ghVar, f18);
        C14051dw.b(ghVar, C13978bc.a(tileMode2));
        return C14051dw.b(ghVar);
    }

    public int a(gh ghVar, Shader shader) {
        if (f131543x) {
            return 0;
        }
        return b(ghVar, shader);
    }
}
