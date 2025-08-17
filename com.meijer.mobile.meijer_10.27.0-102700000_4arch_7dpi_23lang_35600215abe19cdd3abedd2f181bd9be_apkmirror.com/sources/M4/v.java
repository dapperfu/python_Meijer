package M4;

import L4.e;
import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f19003a;

    public void a(String str, String[] strArr, e.a aVar) {
        this.f19003a.addWebMessageListener(str, strArr, mw.a.c(new p(aVar)));
    }

    public WebViewClient b() {
        return this.f19003a.getWebViewClient();
    }

    public void c(String str) {
        this.f19003a.removeWebMessageListener(str);
    }

    public void d(boolean z10) {
        this.f19003a.setAudioMuted(z10);
    }

    public v(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f19003a = webViewProviderBoundaryInterface;
    }
}
