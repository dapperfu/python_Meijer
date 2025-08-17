package fsimpl;

import android.webkit.WebView;
import com.fullstory.instrumentation.webview.WebViewTracker;

/* loaded from: classes14.dex */
public class eL implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f132089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f132090b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f132091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ WebViewTracker f132092d;

    public eL(WebViewTracker webViewTracker, WebView webView, String str, String str2) {
        this.f132092d = webViewTracker;
        this.f132089a = webView;
        this.f132090b = str;
        this.f132091c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132089a.evaluateJavascript(this.f132090b, new WebViewTracker.TrackerValueCallback(this.f132091c, null));
    }
}
