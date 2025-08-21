package N4;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f20668a;

    public r a(WebSettings webSettings) {
        return new r((WebSettingsBoundaryInterface) iw.a.a(WebSettingsBoundaryInterface.class, this.f20668a.convertSettings(webSettings)));
    }

    public y(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f20668a = webkitToCompatConverterBoundaryInterface;
    }
}
