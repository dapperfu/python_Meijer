package cg;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f62481a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        Wf.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f62481a == null) {
            f62481a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f62481a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
