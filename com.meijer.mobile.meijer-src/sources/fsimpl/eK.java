package fsimpl;

import android.webkit.JavascriptInterface;
import com.fullstory.instrumentation.webview.WebViewTracker;

/* loaded from: classes15.dex */
public class eK {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewTracker f133337a;

    /* renamed from: b, reason: collision with root package name */
    private final long f133338b;

    public eK(WebViewTracker webViewTracker, long j10) {
        this.f133337a = webViewTracker;
        this.f133338b = j10;
    }

    @JavascriptInterface
    public void send(int i10, int i11, String str) {
        this.f133337a.a(this.f133338b, i11, i10, str);
    }

    @JavascriptInterface
    public void webShouldCapture(String str, String str2) {
        this.f133337a.a(this.f133338b, str, str2);
    }
}
