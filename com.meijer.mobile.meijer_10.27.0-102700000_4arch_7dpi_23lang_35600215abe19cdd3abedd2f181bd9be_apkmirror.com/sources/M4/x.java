package M4;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public class x implements w {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f19004a;

    @Override // M4.w
    public String[] a() {
        return this.f19004a.getSupportedFeatures();
    }

    @Override // M4.w
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) mw.a.a(WebViewProviderBoundaryInterface.class, this.f19004a.createWebView(webView));
    }

    @Override // M4.w
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) mw.a.a(StaticsBoundaryInterface.class, this.f19004a.getStatics());
    }

    @Override // M4.w
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) mw.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f19004a.getWebkitToCompatConverter());
    }

    public x(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f19004a = webViewProviderFactoryBoundaryInterface;
    }
}
