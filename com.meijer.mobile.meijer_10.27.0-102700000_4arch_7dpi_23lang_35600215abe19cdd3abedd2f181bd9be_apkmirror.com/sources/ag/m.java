package ag;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f45466a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        Uf.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f45466a == null) {
            f45466a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f45466a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
