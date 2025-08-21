package fsimpl;

import android.webkit.WebView;
import com.fullstory.instrumentation.webview.WebViewTracker;

/* loaded from: classes15.dex */
public class eL implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f133339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f133340b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f133341c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ WebViewTracker f133342d;

    public eL(WebViewTracker webViewTracker, WebView webView, String str, String str2) {
        this.f133342d = webViewTracker;
        this.f133339a = webView;
        this.f133340b = str;
        this.f133341c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f133339a.evaluateJavascript(this.f133340b, new WebViewTracker.TrackerValueCallback(this.f133341c, null));
    }
}
