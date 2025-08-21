package vd;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: vd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17659d extends C17656a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) Bd.d.a(new CallableC17660e(sharedPreferences, str, num));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
