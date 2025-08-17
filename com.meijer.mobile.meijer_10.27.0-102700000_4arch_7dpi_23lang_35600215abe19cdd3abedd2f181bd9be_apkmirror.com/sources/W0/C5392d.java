package W0;

import W0.C5390b;
import W0.l;
import Z.K;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0014\u0010 \u001a\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010'\u001a\u001f\u0010!\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010'\u001a'\u0010\u0018\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0018\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"LW0/c;", "source", "destination", "LW0/r;", "intent", "LW0/l;", "j", "(LW0/c;LW0/c;I)LW0/l;", "h", "LW0/I;", "whitePoint", "LW0/a;", "adaptation", "c", "(LW0/c;LW0/I;LW0/a;)LW0/c;", "", "x", "a", "b", "d", "g", "o", "(DDDDDD)D", "q", "e", "f", "p", "(DDDDDDDD)D", "r", "", "(LW0/I;LW0/I;)Z", "", "([F[F)Z", "m", "k", "([F)[F", "lhs", "rhs", "l", "([F[F)[F", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: W0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5392d {
    public static final boolean f(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static /* synthetic */ AbstractC5391c d(AbstractC5391c abstractC5391c, WhitePoint whitePoint, AbstractC5389a abstractC5389a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC5389a = AbstractC5389a.INSTANCE.a();
        }
        return c(abstractC5391c, whitePoint, abstractC5389a);
    }

    public static /* synthetic */ l i(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC5391c2 = k.f38267a.G();
        }
        if ((i11 & 2) != 0) {
            i10 = r.INSTANCE.b();
        }
        return h(abstractC5391c, abstractC5391c2, i10);
    }

    private static final l j(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, int i10) {
        if (abstractC5391c == abstractC5391c2) {
            return l.INSTANCE.c(abstractC5391c);
        }
        long jG = abstractC5391c.getModel();
        C5390b.Companion aVar = C5390b.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!C5390b.e(jG, aVar.b()) || !C5390b.e(abstractC5391c2.getModel(), aVar.b())) {
            return new l(abstractC5391c, abstractC5391c2, i10, defaultConstructorMarker);
        }
        Intrinsics.h(abstractC5391c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.h(abstractC5391c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new l.b((F) abstractC5391c, (F) abstractC5391c2, i10, defaultConstructorMarker);
    }

    public static final float[] k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        fArr3[1] = (f15 * f16) + (f12 * f17) + (f18 * f14);
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        fArr3[2] = f21 + (f14 * f22);
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        fArr3[3] = f26 + (f13 * f27);
        float f28 = fArr[1];
        float f29 = fArr2[3];
        fArr3[4] = (f28 * f29) + (f17 * f25) + (f18 * f27);
        float f30 = fArr[2];
        fArr3[5] = (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22);
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        fArr3[6] = f34 + (f13 * f35);
        float f36 = fArr2[6];
        fArr3[7] = (f28 * f36) + (fArr[4] * f33) + (f18 * f35);
        fArr3[8] = (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35);
        return fArr3;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }

    @JvmOverloads
    public static final AbstractC5391c c(AbstractC5391c abstractC5391c, WhitePoint whitePoint, AbstractC5389a abstractC5389a) {
        if (C5390b.e(abstractC5391c.getModel(), C5390b.INSTANCE.b())) {
            Intrinsics.h(abstractC5391c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            F f10 = (F) abstractC5391c;
            if (!f(f10.getWhitePoint(), whitePoint)) {
                return new F(f10, l(e(abstractC5389a.getTransform(), f10.getWhitePoint().c(), whitePoint.c()), f10.getTransform()), whitePoint);
            }
        }
        return abstractC5391c;
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final l h(AbstractC5391c abstractC5391c, AbstractC5391c abstractC5391c2, int i10) {
        int iD = abstractC5391c.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        int iD2 = abstractC5391c2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        if ((iD | iD2) < 0) {
            return j(abstractC5391c, abstractC5391c2, i10);
        }
        K<l> kA = m.a();
        int i11 = iD | (iD2 << 6) | (i10 << 12);
        l lVarB = kA.b(i11);
        if (lVarB == null) {
            lVarB = j(abstractC5391c, abstractC5391c2, i10);
            kA.r(i11, lVarB);
        }
        return lVarB;
    }
}
