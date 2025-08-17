package td;

import android.content.SharedPreferences;
import com.fullstory.FS;
import zd.C18445d;

/* renamed from: td.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17088h extends C17081a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) C18445d.a(new CallableC17089i(sharedPreferences, str, str2));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
