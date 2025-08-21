package fsimpl;

import android.content.Context;
import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    private Context f132692a;

    public X(Context context) {
        this.f132692a = context;
    }

    public String a(String str) {
        String strA = dO.a(this.f132692a, "FS_PREFS", str);
        Log.v(String.format("readKey: %s='%s'", str, strA));
        return strA;
    }

    public void a(String str, Boolean bool) {
        boolean zA = dO.a(this.f132692a, "FS_PREFS", str, bool);
        if (!zA) {
            Log.e(String.format("writeKeyBool '%s' failed", str));
        }
        Log.v(String.format("writeKeyBool %s='%b'; success=%b", str, bool, Boolean.valueOf(zA)));
    }

    public void a(String str, Long l10) {
        boolean zA = dO.a(this.f132692a, "FS_PREFS", str, l10);
        if (!zA) {
            Log.e(String.format("writeKeyLong '%s' failed", str));
        }
        Log.v(String.format("writeKeyLong %s='%d'; success=%b", str, l10, Boolean.valueOf(zA)));
    }

    public void a(String str, String str2) {
        boolean zA = dO.a(this.f132692a, "FS_PREFS", str, str2);
        if (!zA) {
            Log.e(String.format("writeKey '%s' failed", str));
        }
        Log.v(String.format("writeKey: %s='%s'; success=%b", str, str2, Boolean.valueOf(zA)));
    }

    public Boolean b(String str) {
        Boolean boolB = dO.b(this.f132692a, "FS_PREFS", str);
        Log.v(String.format("readKeyBool: %s='%b'", str, boolB));
        return boolB;
    }

    public Long c(String str) {
        Long lC = dO.c(this.f132692a, "FS_PREFS", str);
        Log.v(String.format("readKeyLong: %s='%d'", str, lC));
        return lC;
    }
}
