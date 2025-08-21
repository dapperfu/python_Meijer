package fsimpl;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class eO {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f133350a = null;

    /* renamed from: b, reason: collision with root package name */
    private static eP f133351b = null;

    private static eP a(WebViewProvider webViewProvider) {
        eP ePVarB = eR.b(webViewProvider);
        return ePVarB != null ? ePVarB : eQ.b(webViewProvider);
    }

    public static boolean a(WebView webView) {
        if (f133350a == null) {
            c(webView);
        }
        Boolean bool = f133350a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static WebViewClient b(WebView webView) {
        if (f133350a == null) {
            c(webView);
        }
        Boolean bool = f133350a;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        try {
            WebViewProvider webViewProvider = webView.getWebViewProvider();
            if (webViewProvider != null) {
                return f133351b.a(webViewProvider);
            }
            return null;
        } catch (Throwable th2) {
            Log.e("Exception trying to retrieve the current WebViewClient instance", th2);
            return null;
        }
    }

    private static void c(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            WebViewProvider webViewProvider = webView.getWebViewProvider();
            if (webViewProvider != null) {
                eP ePVarA = a(webViewProvider);
                f133351b = ePVarA;
                if (ePVarA != null) {
                    f133350a = true;
                } else {
                    f133350a = false;
                    Log.e("Unable to find underlying WebViewClient fields");
                }
            }
        } catch (Throwable th2) {
            f133350a = false;
            Log.e("Exception trying to find WebViewClient fields", th2);
        }
    }
}
