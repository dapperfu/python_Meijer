package x6;

import android.app.Application;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import x6.x;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: g, reason: collision with root package name */
    private static final String f170610g = y.class.toString();

    /* renamed from: a, reason: collision with root package name */
    private WebView f170611a;

    /* renamed from: b, reason: collision with root package name */
    Application f170612b;

    /* renamed from: c, reason: collision with root package name */
    public x f170613c;

    /* renamed from: d, reason: collision with root package name */
    String f170614d;

    /* renamed from: e, reason: collision with root package name */
    String f170615e;

    /* renamed from: f, reason: collision with root package name */
    private String f170616f = "<!DOCTYPE html><html><body><script id=\"static\">var s_e=document.createElement(\"script\"); s_e.src=\"[[URL]]\"; document.head.appendChild(s_e);</script></body></html>";

    final class a implements x.a {
        a() {
        }

        @Override // x6.x.a
        public final void a() {
            y.b(y.this);
        }
    }

    final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        b() {
        }
    }

    final class c extends WebViewClient {
        c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (com.cyberfend.cyfsecurity.a.g().u() == 2) {
                com.cyberfend.cyfsecurity.a.g().c(4);
            } else if (com.cyberfend.cyfsecurity.a.g().u() == 3) {
                com.cyberfend.cyfsecurity.a.g().c(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().c(6);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (com.cyberfend.cyfsecurity.a.g().u() == 2) {
                com.cyberfend.cyfsecurity.a.g().c(4);
            } else if (com.cyberfend.cyfsecurity.a.g().u() == 3) {
                com.cyberfend.cyfsecurity.a.g().c(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().c(6);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (com.cyberfend.cyfsecurity.a.g().u() == 2) {
                com.cyberfend.cyfsecurity.a.g().c(4);
            } else if (com.cyberfend.cyfsecurity.a.g().u() == 3) {
                com.cyberfend.cyfsecurity.a.g().c(5);
            } else {
                com.cyberfend.cyfsecurity.a.g().c(6);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.this.f170611a != null) {
                y.this.f170611a.stopLoading();
                y.this.f170611a.removeJavascriptInterface("JSBridge");
                WebView unused = y.this.f170611a;
                WebView.setWebContentsDebuggingEnabled(false);
                y.this.f170611a.getSettings().setJavaScriptEnabled(false);
                y.this.f170612b.deleteDatabase("webview.db");
                y.this.f170612b.deleteDatabase("webviewCache.db");
                y.this.f170611a.clearHistory();
                FS.setWebViewClient(y.this.f170611a, null);
                y.this.f170611a.setWebChromeClient(null);
                WebView webView = y.this.f170611a;
                FS.trackWebView(webView);
                webView.loadUrl(null);
                y.this.f170611a.clearFormData();
                y.this.f170611a.clearSslPreferences();
                y.this.f170611a.clearFocus();
                y.this.f170611a.addJavascriptInterface(null, "JSBridge");
                y.this.f170611a.removeAllViewsInLayout();
                y.this.f170611a.removeAllViews();
                y.this.f170611a.clearAnimation();
                y.this.f170611a.destroy();
                y.g(y.this);
            }
        }
    }

    static /* synthetic */ WebView g(y yVar) {
        yVar.f170611a = null;
        return null;
    }

    static /* synthetic */ void b(y yVar) {
        try {
            new Handler(Looper.getMainLooper()).post(yVar.new d());
            if (com.cyberfend.cyfsecurity.a.g().u() == 2) {
                com.cyberfend.cyfsecurity.a.g().c(8);
            } else if (yVar.f170615e == null) {
                com.cyberfend.cyfsecurity.a.g().c(7);
            } else {
                com.cyberfend.cyfsecurity.a.g().c(1);
            }
        } catch (Exception e10) {
            C18095A.a(e10);
        }
    }

    private void f() {
        try {
            this.f170611a.getSettings().setJavaScriptEnabled(true);
            this.f170611a.getSettings().setCacheMode(2);
            this.f170611a.addJavascriptInterface(this.f170613c, "JSBridge");
            this.f170611a.setWebChromeClient(new b());
            FS.setWebViewClient(this.f170611a, new c());
            Uri.Builder builderBuildUpon = Uri.parse(this.f170614d).buildUpon();
            builderBuildUpon.appendPath("_sec");
            builderBuildUpon.appendPath("sdk_challenge.js");
            builderBuildUpon.appendQueryParameter("os", "android");
            builderBuildUpon.appendQueryParameter("starttime", this.f170613c.startTime());
            builderBuildUpon.appendQueryParameter("systemVersion", this.f170613c.systemVersion());
            builderBuildUpon.appendQueryParameter("model", this.f170613c.model());
            builderBuildUpon.appendQueryParameter("deviceHardwareType", this.f170613c.hardWareType());
            builderBuildUpon.appendQueryParameter("appIdentifier", this.f170613c.appIdentifier());
            builderBuildUpon.appendQueryParameter("deviceId", this.f170613c.androidId());
            String str = this.f170615e;
            if (str != null) {
                builderBuildUpon.appendQueryParameter("serverSideSignal", str);
            }
            String strReplace = this.f170616f.replace("[[URL]]", builderBuildUpon.toString());
            WebView webView = this.f170611a;
            FS.trackWebView(webView);
            webView.loadData(strReplace, "text/html; charset=UTF-8", null);
        } catch (Exception e10) {
            C18095A.a(e10);
        }
    }

    final void a() {
        try {
            this.f170611a = new WebView(this.f170612b);
            if (this.f170613c == null) {
                this.f170613c = new x(this.f170612b, new a());
            }
            if ((this.f170612b.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            f();
        } catch (Exception e10) {
            C18095A.a(e10);
        }
    }

    public final String d() {
        if (this.f170613c.f170609e.booleanValue()) {
            return this.f170613c.f170607c;
        }
        return null;
    }

    y(Application application, String str, String str2) {
        try {
            this.f170612b = application;
            this.f170614d = str;
            this.f170615e = str2;
            a();
        } catch (Exception e10) {
            C18095A.a(e10);
        }
    }
}
