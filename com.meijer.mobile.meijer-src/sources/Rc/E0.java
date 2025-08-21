package Rc;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C10309zt;
import com.google.android.gms.internal.ads.C7473Xt;
import com.google.android.gms.internal.ads.C7517Zc;
import com.google.android.gms.internal.ads.GS;
import com.google.android.gms.internal.ads.InterfaceC9133ot;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes4.dex */
public class E0 extends C5179b {
    public E0() {
        super(null);
    }

    @Override // Rc.C5179b
    public final WebResourceResponse b(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // Rc.C5179b
    public final C10309zt c(InterfaceC9133ot interfaceC9133ot, C7517Zc c7517Zc, boolean z10, GS gs2) {
        return new C7473Xt(interfaceC9133ot, c7517Zc, z10, gs2);
    }

    @Override // Rc.C5179b
    public final CookieManager a(Context context) {
        Nc.v.t();
        if (D0.g()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            Sc.p.e("Failed to obtain CookieManager.", th2);
            Nc.v.s().w(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
