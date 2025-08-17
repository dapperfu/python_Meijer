package td;

import android.content.SharedPreferences;
import com.fullstory.FS;
import zd.C18445d;

/* renamed from: td.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17082b extends C17081a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) C18445d.a(new CallableC17083c(sharedPreferences, str, bool));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
