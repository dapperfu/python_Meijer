package vd;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: vd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17661f extends C17656a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l10) {
        try {
            return (Long) Bd.d.a(new CallableC17662g(sharedPreferences, str, l10));
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            FS.log_w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return l10;
        }
    }
}
