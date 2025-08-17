package U0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "digits", "", "a", "(FI)Ljava/lang/String;", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static final String a(float f10, int i10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            if (f10 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int iMax = Math.max(i10, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i11 = (int) f11;
        if (f11 - i11 >= 0.5f) {
            i11++;
        }
        float f12 = i11 / fPow;
        if (iMax > 0) {
            return String.valueOf(f12);
        }
        return String.valueOf((int) f12);
    }
}
