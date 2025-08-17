package Fr;

import Fr.c;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"LFr/b;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "LFr/t;", "value", "a", "LFr/t;", "b", "()LFr/t;", "d", "(LFr/t;)V", "state", "LFr/s;", "LFr/s;", "()LFr/s;", "c", "(LFr/s;)V", "navigator", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public t state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public s navigator;

    public s a() {
        s sVar = this.navigator;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.y("navigator");
        return null;
    }

    public t b() {
        t tVar = this.state;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.y("state");
        return null;
    }

    public void c(s sVar) {
        Intrinsics.j(sVar, "<set-?>");
        this.navigator = sVar;
    }

    public void d(t tVar) {
        Intrinsics.j(tVar, "<set-?>");
        this.state = tVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        Intrinsics.j(view, "view");
        super.doUpdateVisitedHistory(view, url, isReload);
        a().d(view.canGoBack());
        a().e(view.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.j(view, "view");
        super.onPageFinished(view, url);
        b().j(c.a.f10973a);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Intrinsics.j(view, "view");
        super.onPageStarted(view, url, favicon);
        b().j(new c.Loading(0.0f));
        b().b().clear();
        b().l(null);
        b().k(null);
        b().i(url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.j(view, "view");
        super.onReceivedError(view, request, error);
        if (error != null) {
            b().b().add(new WebViewError(request, error));
        }
    }
}
