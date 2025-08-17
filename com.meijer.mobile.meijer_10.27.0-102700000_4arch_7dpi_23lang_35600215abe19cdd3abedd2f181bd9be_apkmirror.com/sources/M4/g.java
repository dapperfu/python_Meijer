package M4;

import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class g {
    public static ClassLoader a() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper b(WebView webView) {
        return webView.getWebViewLooper();
    }
}
