package fsimpl;

import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
class eR extends eP {

    /* renamed from: a, reason: collision with root package name */
    private static Method f132104a = null;

    eR() {
    }

    static eP b(WebViewProvider webViewProvider) {
        try {
            Method method = webViewProvider.getClass().getMethod("getWebViewClient", new Class[0]);
            f132104a = method;
            method.setAccessible(true);
            return new eR();
        } catch (Throwable th2) {
            return null;
        }
    }

    @Override // fsimpl.eP
    WebViewClient a(WebViewProvider webViewProvider) {
        return (WebViewClient) f132104a.invoke(webViewProvider, new Object[0]);
    }
}
