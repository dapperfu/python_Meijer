package w6;

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
import w6.x;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: g, reason: collision with root package name */
    private static final String f165965g = y.class.toString();

    /* renamed from: a, reason: collision with root package name */
    private WebView f165966a;

    /* renamed from: b, reason: collision with root package name */
    Application f165967b;

    /* renamed from: c, reason: collision with root package name */
    public x f165968c;

    /* renamed from: d, reason: collision with root package name */
    String f165969d;

    /* renamed from: e, reason: collision with root package name */
    String f165970e;

    /* renamed from: f, reason: collision with root package name */
    private String f165971f = "<!DOCTYPE html><html><body><script id=\"static\">var s_e=document.createElement(\"script\"); s_e.src=\"[[URL]]\"; document.head.appendChild(s_e);</script></body></html>";

    final class a implements x.a {
        a() {
        }

        @Override // w6.x.a
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
            if (y.this.f165966a != null) {
                y.this.f165966a.stopLoading();
                y.this.f165966a.removeJavascriptInterface("JSBridge");
                WebView unused = y.this.f165966a;
                WebView.setWebContentsDebuggingEnabled(false);
                y.this.f165966a.getSettings().setJavaScriptEnabled(false);
                y.this.f165967b.deleteDatabase("webview.db");
                y.this.f165967b.deleteDatabase("webviewCache.db");
                y.this.f165966a.clearHistory();
                FS.setWebViewClient(y.this.f165966a, null);
                y.this.f165966a.setWebChromeClient(null);
                WebView webView = y.this.f165966a;
                FS.trackWebView(webView);
                webView.loadUrl(null);
                y.this.f165966a.clearFormData();
                y.this.f165966a.clearSslPreferences();
                y.this.f165966a.clearFocus();
                y.this.f165966a.addJavascriptInterface(null, "JSBridge");
                y.this.f165966a.removeAllViewsInLayout();
                y.this.f165966a.removeAllViews();
                y.this.f165966a.clearAnimation();
                y.this.f165966a.destroy();
                y.g(y.this);
            }
        }
    }

    static /* synthetic */ WebView g(y yVar) {
        yVar.f165966a = null;
        return null;
    }

    static /* synthetic */ void b(y yVar) {
        try {
            new Handler(Looper.getMainLooper()).post(yVar.new d());
            if (com.cyberfend.cyfsecurity.a.g().u() == 2) {
                com.cyberfend.cyfsecurity.a.g().c(8);
            } else if (yVar.f165970e == null) {
                com.cyberfend.cyfsecurity.a.g().c(7);
            } else {
                com.cyberfend.cyfsecurity.a.g().c(1);
            }
        } catch (Exception e10) {
            C17774A.a(e10);
        }
    }

    private void f() {
        try {
            this.f165966a.getSettings().setJavaScriptEnabled(true);
            this.f165966a.getSettings().setCacheMode(2);
            this.f165966a.addJavascriptInterface(this.f165968c, "JSBridge");
            this.f165966a.setWebChromeClient(new b());
            FS.setWebViewClient(this.f165966a, new c());
            Uri.Builder builderBuildUpon = Uri.parse(this.f165969d).buildUpon();
            builderBuildUpon.appendPath("_sec");
            builderBuildUpon.appendPath("sdk_challenge.js");
            builderBuildUpon.appendQueryParameter("os", "android");
            builderBuildUpon.appendQueryParameter("starttime", this.f165968c.startTime());
            builderBuildUpon.appendQueryParameter("systemVersion", this.f165968c.systemVersion());
            builderBuildUpon.appendQueryParameter("model", this.f165968c.model());
            builderBuildUpon.appendQueryParameter("deviceHardwareType", this.f165968c.hardWareType());
            builderBuildUpon.appendQueryParameter("appIdentifier", this.f165968c.appIdentifier());
            builderBuildUpon.appendQueryParameter("deviceId", this.f165968c.androidId());
            String str = this.f165970e;
            if (str != null) {
                builderBuildUpon.appendQueryParameter("serverSideSignal", str);
            }
            String strReplace = this.f165971f.replace("[[URL]]", builderBuildUpon.toString());
            WebView webView = this.f165966a;
            FS.trackWebView(webView);
            webView.loadData(strReplace, "text/html; charset=UTF-8", null);
        } catch (Exception e10) {
            C17774A.a(e10);
        }
    }

    final void a() {
        try {
            this.f165966a = new WebView(this.f165967b);
            if (this.f165968c == null) {
                this.f165968c = new x(this.f165967b, new a());
            }
            if ((this.f165967b.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            f();
        } catch (Exception e10) {
            C17774A.a(e10);
        }
    }

    public final String d() {
        if (this.f165968c.f165964e.booleanValue()) {
            return this.f165968c.f165962c;
        }
        return null;
    }

    y(Application application, String str, String str2) {
        try {
            this.f165967b = application;
            this.f165969d = str;
            this.f165970e = str2;
            a();
        } catch (Exception e10) {
            C17774A.a(e10);
        }
    }
}
