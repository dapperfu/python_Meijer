package f6;

import L5.q;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public final class l {
    public static boolean a(String str) {
        if (i.a(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String b(String str) {
        return q.a(str);
    }
}
