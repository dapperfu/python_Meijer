package N4;

import M4.e;
import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f20666a;

    public void a(String str, String[] strArr, e.a aVar) {
        this.f20666a.addWebMessageListener(str, strArr, iw.a.c(new p(aVar)));
    }

    public WebViewClient b() {
        return this.f20666a.getWebViewClient();
    }

    public void c(String str) {
        this.f20666a.removeWebMessageListener(str);
    }

    public void d(boolean z10) {
        this.f20666a.setAudioMuted(z10);
    }

    public v(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f20666a = webViewProviderBoundaryInterface;
    }
}
