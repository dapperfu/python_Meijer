package td;

import android.content.SharedPreferences;
import com.fullstory.FS;
import zd.C18445d;

/* renamed from: td.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17084d extends C17081a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) C18445d.a(new CallableC17085e(sharedPreferences, str, num));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
