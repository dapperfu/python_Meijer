package Pc;

import com.fullstory.FS;
import com.google.android.gms.internal.ads.C8982og;

/* loaded from: classes4.dex */
public final class p0 extends Qc.p {
    public static boolean m() {
        return Qc.p.j(2) && ((Boolean) C8982og.f77414a.e()).booleanValue();
    }

    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : Qc.p.f29970a.d(str)) {
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
