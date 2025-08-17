package fsimpl;

import android.webkit.JavascriptInterface;
import com.fullstory.instrumentation.webview.WebViewTracker;

/* loaded from: classes14.dex */
public class eK {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewTracker f132087a;

    /* renamed from: b, reason: collision with root package name */
    private final long f132088b;

    public eK(WebViewTracker webViewTracker, long j10) {
        this.f132087a = webViewTracker;
        this.f132088b = j10;
    }

    @JavascriptInterface
    public void send(int i10, int i11, String str) {
        this.f132087a.a(this.f132088b, i11, i10, str);
    }

    @JavascriptInterface
    public void webShouldCapture(String str, String str2) {
        this.f132087a.a(this.f132088b, str, str2);
    }
}
