package fsimpl;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;
import com.fullstory.util.Log;

/* loaded from: classes14.dex */
public class eO {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f132100a = null;

    /* renamed from: b, reason: collision with root package name */
    private static eP f132101b = null;

    private static eP a(WebViewProvider webViewProvider) {
        eP ePVarB = eR.b(webViewProvider);
        return ePVarB != null ? ePVarB : eQ.b(webViewProvider);
    }

    public static boolean a(WebView webView) {
        if (f132100a == null) {
            c(webView);
        }
        Boolean bool = f132100a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static WebViewClient b(WebView webView) {
        if (f132100a == null) {
            c(webView);
        }
        Boolean bool = f132100a;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        try {
            WebViewProvider webViewProvider = webView.getWebViewProvider();
            if (webViewProvider != null) {
                return f132101b.a(webViewProvider);
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
                f132101b = ePVarA;
                if (ePVarA != null) {
                    f132100a = true;
                } else {
                    f132100a = false;
                    Log.e("Unable to find underlying WebViewClient fields");
                }
            }
        } catch (Throwable th2) {
            f132100a = false;
            Log.e("Exception trying to find WebViewClient fields", th2);
        }
    }
}
