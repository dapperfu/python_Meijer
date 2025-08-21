package fsimpl;

import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
class eR extends eP {

    /* renamed from: a, reason: collision with root package name */
    private static Method f133354a = null;

    eR() {
    }

    static eP b(WebViewProvider webViewProvider) {
        try {
            Method method = webViewProvider.getClass().getMethod("getWebViewClient", new Class[0]);
            f133354a = method;
            method.setAccessible(true);
            return new eR();
        } catch (Throwable th2) {
            return null;
        }
    }

    @Override // fsimpl.eP
    WebViewClient a(WebViewProvider webViewProvider) {
        return (WebViewClient) f133354a.invoke(webViewProvider, new Object[0]);
    }
}
