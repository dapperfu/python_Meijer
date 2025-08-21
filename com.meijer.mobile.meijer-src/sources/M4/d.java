package M4;

import N4.a;
import N4.i;
import N4.r;
import N4.s;
import N4.t;
import N4.u;
import android.os.Build;
import android.webkit.WebSettings;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class d {
    @Deprecated
    public static void b(WebSettings webSettings, int i10) {
        a.h hVar = t.f20609T;
        if (hVar.c()) {
            i.a(webSettings, i10);
        } else {
            if (!hVar.d()) {
                throw t.a();
            }
            a(webSettings).a(i10);
        }
    }

    private static r a(WebSettings webSettings) {
        try {
            return u.c().a(webSettings);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                FS.log_e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
                return new s();
            }
            throw e10;
        }
    }
}
