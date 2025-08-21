package N4;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public class x implements w {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f20667a;

    @Override // N4.w
    public String[] a() {
        return this.f20667a.getSupportedFeatures();
    }

    @Override // N4.w
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) iw.a.a(WebViewProviderBoundaryInterface.class, this.f20667a.createWebView(webView));
    }

    @Override // N4.w
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) iw.a.a(StaticsBoundaryInterface.class, this.f20667a.getStatics());
    }

    @Override // N4.w
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) iw.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f20667a.getWebkitToCompatConverter());
    }

    public x(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f20667a = webViewProviderFactoryBoundaryInterface;
    }
}
