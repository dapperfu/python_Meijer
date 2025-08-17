package V0;

import U0.MutableRect;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u00014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000f\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ{\u0010+\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u00162\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"LV0/k1;", "", "", "values", "b", "([F)[F", "LU0/f;", "point", "f", "([FJ)J", "LU0/d;", "rect", "", "g", "([FLU0/d;)V", "m", "l", "([F[F)V", "", "([F)Ljava/lang/String;", "h", "([F)V", "", "degrees", "j", "([FF)V", "x", "y", "z", "k", "([FFFF)V", "n", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "i", "([FFFFFFFFFFFF)V", "", "e", "([F)I", "other", "", "d", "([FLjava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: V0.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5331k1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] values;

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        if (fArr.length < 16) {
            return j10;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float f19 = 1 / (((f12 * fIntBitsToFloat) + (f15 * fIntBitsToFloat2)) + f18);
        if ((Float.floatToRawIntBits(f19) & a.e.API_PRIORITY_OTHER) >= 2139095040) {
            f19 = 0.0f;
        }
        float f20 = ((f10 * fIntBitsToFloat) + (f13 * fIntBitsToFloat2) + f16) * f19;
        float f21 = f19 * ((f11 * fIntBitsToFloat) + (f14 * fIntBitsToFloat2) + f17);
        return U0.f.e((Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(f21) & 4294967295L));
    }

    public static final void h(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void k(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static final void n(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static final /* synthetic */ C5331k1 a(float[] fArr) {
        return new C5331k1(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof C5331k1) && Intrinsics.e(fArr, ((C5331k1) obj).getValues());
    }

    public static final void g(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f19 = f12 * left;
        float f20 = f15 * top;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & a.e.API_PRIORITY_OTHER) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * left;
        float f23 = f13 * top;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = left * f11;
        float f26 = top * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * bottom;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & a.e.API_PRIORITY_OTHER) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * bottom;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * bottom;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * right;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & a.e.API_PRIORITY_OTHER) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * right;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = right * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & a.e.API_PRIORITY_OTHER) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        mutableRect.i(Math.min(f24, Math.min(f31, Math.min(f37, f42))));
        mutableRect.k(Math.min(f27, Math.min(f33, Math.min(f39, f43))));
        mutableRect.j(Math.max(f24, Math.max(f31, Math.max(f37, f42))));
        mutableRect.h(Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }

    public static final void i(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        double d10 = f15 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f21 = -fSin;
        float f22 = (f13 * fCos) - (f14 * fSin);
        float f23 = (f13 * fSin) + (f14 * fCos);
        double d11 = f16 * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f24 = -fSin2;
        float f25 = fSin * fSin2;
        float f26 = fSin * fCos2;
        float f27 = fCos * fSin2;
        float f28 = fCos * fCos2;
        float f29 = (f12 * fCos2) + (f23 * fSin2);
        float f30 = ((-f12) * fSin2) + (f23 * fCos2);
        double d12 = f17 * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d12);
        float fCos3 = (float) Math.cos(d12);
        float f31 = -fSin3;
        float f32 = (f31 * fCos2) + (fCos3 * f25);
        float f33 = fCos * fCos3;
        float f34 = (f31 * f24) + (fCos3 * f26);
        float f35 = ((fCos2 * fCos3) + (f25 * fSin3)) * f18;
        float f36 = fSin3 * fCos * f18;
        float f37 = ((fCos3 * f24) + (fSin3 * f26)) * f18;
        float f38 = f32 * f19;
        float f39 = f33 * f19;
        float f40 = f34 * f19;
        float f41 = f27 * f20;
        float f42 = f21 * f20;
        float f43 = f28 * f20;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f35;
        fArr[1] = f36;
        fArr[2] = f37;
        fArr[3] = 0.0f;
        fArr[4] = f38;
        fArr[5] = f39;
        fArr[6] = f40;
        fArr[7] = 0.0f;
        fArr[8] = f41;
        fArr[9] = f42;
        fArr[10] = f43;
        fArr[11] = 0.0f;
        float f44 = -f10;
        fArr[12] = ((f35 * f44) - (f38 * f11)) + f29 + f10;
        fArr[13] = ((f36 * f44) - (f39 * f11)) + f22 + f11;
        fArr[14] = ((f44 * f37) - (f11 * f40)) + f30;
        fArr[15] = 1.0f;
    }

    public static final void j(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = f10 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -fSin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (fCos * f11) + (fSin * f12);
        fArr[1] = (fCos * f14) + (fSin * f15);
        fArr[2] = (fCos * f16) + (fSin * f17);
        fArr[3] = (fCos * f18) + (fSin * f19);
        fArr[4] = (f11 * f13) + (f12 * fCos);
        fArr[5] = (f14 * f13) + (f15 * fCos);
        fArr[6] = (f16 * f13) + (f17 * fCos);
        fArr[7] = (f13 * f18) + (fCos * f19);
    }

    public static final void l(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = (f10 * f11) + (f12 * f13) + (f14 * f15) + (f16 * f17);
            float f19 = fArr2[1];
            float f20 = fArr2[5];
            float f21 = fArr2[9];
            float f22 = fArr2[13];
            float f23 = (f10 * f19) + (f12 * f20) + (f14 * f21) + (f16 * f22);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = fArr2[14];
            float f28 = (f10 * f24) + (f12 * f25) + (f14 * f26) + (f16 * f27);
            float f29 = fArr2[3];
            float f30 = fArr2[7];
            float f31 = fArr2[11];
            float f32 = fArr2[15];
            float f33 = (f10 * f29) + (f12 * f30) + (f14 * f31) + (f16 * f32);
            float f34 = fArr[4];
            float f35 = fArr[5];
            float f36 = fArr[6];
            float f37 = fArr[7];
            float f38 = (f34 * f11) + (f35 * f13) + (f36 * f15) + (f37 * f17);
            float f39 = (f34 * f19) + (f35 * f20) + (f36 * f21) + (f37 * f22);
            float f40 = (f34 * f24) + (f35 * f25) + (f36 * f26) + (f37 * f27);
            float f41 = (f34 * f29) + (f35 * f30) + (f36 * f31) + (f37 * f32);
            float f42 = fArr[8];
            float f43 = fArr[9];
            float f44 = fArr[10];
            float f45 = fArr[11];
            float f46 = (f42 * f11) + (f43 * f13) + (f44 * f15) + (f45 * f17);
            float f47 = (f42 * f19) + (f43 * f20) + (f44 * f21) + (f45 * f22);
            float f48 = (f42 * f24) + (f43 * f25) + (f44 * f26) + (f45 * f27);
            float f49 = (f42 * f29) + (f43 * f30) + (f44 * f31) + (f45 * f32);
            float f50 = fArr[12];
            float f51 = fArr[13];
            float f52 = (f11 * f50) + (f13 * f51);
            float f53 = fArr[14];
            float f54 = f52 + (f15 * f53);
            float f55 = fArr[15];
            fArr[0] = f18;
            fArr[1] = f23;
            fArr[2] = f28;
            fArr[3] = f33;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f41;
            fArr[8] = f46;
            fArr[9] = f47;
            fArr[10] = f48;
            fArr[11] = f49;
            fArr[12] = f54 + (f17 * f55);
            fArr[13] = (f19 * f50) + (f20 * f51) + (f21 * f53) + (f22 * f55);
            fArr[14] = (f24 * f50) + (f25 * f51) + (f26 * f53) + (f27 * f55);
            fArr[15] = (f50 * f29) + (f51 * f30) + (f53 * f31) + (f55 * f32);
        }
    }

    public static String m(float[] fArr) {
        return StringsKt.n("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static /* synthetic */ void o(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        n(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.values, obj);
    }

    public int hashCode() {
        return e(this.values);
    }

    /* renamed from: p, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return m(this.values);
    }

    private /* synthetic */ C5331k1(float[] fArr) {
        this.values = fArr;
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }
}
