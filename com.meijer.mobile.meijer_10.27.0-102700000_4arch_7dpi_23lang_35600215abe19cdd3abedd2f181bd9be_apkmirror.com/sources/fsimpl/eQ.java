package fsimpl;

import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
class eQ extends eP {

    /* renamed from: a, reason: collision with root package name */
    private static Field f132102a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f132103b = null;

    eQ() {
    }

    static eP b(WebViewProvider webViewProvider) {
        try {
            Field declaredField = webViewProvider.getClass().getDeclaredField("mContentsClientAdapter");
            f132102a = declaredField;
            declaredField.setAccessible(true);
            Object obj = f132102a.get(webViewProvider);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("mWebViewClient");
            f132103b = declaredField2;
            declaredField2.setAccessible(true);
            return new eQ();
        } catch (Throwable th2) {
            return null;
        }
    }

    @Override // fsimpl.eP
    WebViewClient a(WebViewProvider webViewProvider) throws IllegalAccessException, IllegalArgumentException {
        Object obj = f132102a.get(webViewProvider);
        if (obj == null) {
            return null;
        }
        Object obj2 = f132103b.get(obj);
        if (obj2 instanceof WebViewClient) {
            return (WebViewClient) obj2;
        }
        return null;
    }
}
