package vd;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: vd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17657b extends C17656a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) Bd.d.a(new CallableC17658c(sharedPreferences, str, bool));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
