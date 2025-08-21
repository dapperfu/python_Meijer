package vd;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: vd.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17663h extends C17656a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) Bd.d.a(new CallableC17664i(sharedPreferences, str, str2));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
