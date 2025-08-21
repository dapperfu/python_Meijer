package kotlin.math;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "", "c", "(D)I", "", "e", "(D)J", "", "d", "(F)I", "f", "(F)J", "a", "(I)I", "getSign$annotations", "(I)V", "sign", "b", "(J)I", "(J)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes4.dex */
public class b extends a {
    @SinceKotlin
    public static long f(float f10) {
        return e(f10);
    }

    public static int a(int i10) {
        return Integer.signum(i10);
    }

    public static int b(long j10) {
        return Long.signum(j10);
    }

    @SinceKotlin
    public static int c(double d10) {
        if (!Double.isNaN(d10)) {
            if (d10 > 2.147483647E9d) {
                return a.e.API_PRIORITY_OTHER;
            }
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin
    public static int d(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin
    public static long e(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
