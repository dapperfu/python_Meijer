package Pc;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C10184zt;
import com.google.android.gms.internal.ads.C7348Xt;
import com.google.android.gms.internal.ads.C7392Zc;
import com.google.android.gms.internal.ads.GS;
import com.google.android.gms.internal.ads.InterfaceC9008ot;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes4.dex */
public class E0 extends C4558b {
    public E0() {
        super(null);
    }

    @Override // Pc.C4558b
    public final WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // Pc.C4558b
    public final C10184zt c(InterfaceC9008ot interfaceC9008ot, C7392Zc c7392Zc, boolean z10, GS gs2) {
        return new C7348Xt(interfaceC9008ot, c7392Zc, z10, gs2);
    }

    @Override // Pc.C4558b
    public final CookieManager a(Context context) {
        Lc.v.t();
        if (D0.g()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            Qc.p.e("Failed to obtain CookieManager.", th2);
            Lc.v.s().w(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
