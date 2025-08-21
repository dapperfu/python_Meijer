package N4;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class d {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static WebViewClient b(WebView webView) {
        return FS.getWebViewClient(webView);
    }
}
