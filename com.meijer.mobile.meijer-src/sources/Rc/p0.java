package Rc;

import com.fullstory.FS;
import com.google.android.gms.internal.ads.C9107og;

/* loaded from: classes4.dex */
public final class p0 extends Sc.p {
    public static boolean m() {
        return Sc.p.j(2) && ((Boolean) C9107og.f78254a.e()).booleanValue();
    }

    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : Sc.p.f34520a.d(str)) {
                    if (z10) {
                        FS.log_v("Ads", str2);
                    } else {
                        FS.log_v("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            FS.log_v("Ads", str);
        }
    }

    public static void l(String str, Throwable th2) {
        if (m()) {
            FS.log_v("Ads", str, th2);
        }
    }
}
