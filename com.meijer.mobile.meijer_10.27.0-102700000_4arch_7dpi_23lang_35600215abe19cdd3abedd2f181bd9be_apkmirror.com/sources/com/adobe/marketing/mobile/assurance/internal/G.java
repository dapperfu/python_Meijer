package com.adobe.marketing.mobile.assurance.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f62139a;

    /* renamed from: b, reason: collision with root package name */
    private final Semaphore f62140b;

    /* renamed from: c, reason: collision with root package name */
    private final Semaphore f62141c;

    /* renamed from: d, reason: collision with root package name */
    private final H f62142d;

    /* renamed from: e, reason: collision with root package name */
    private WebView f62143e;

    /* renamed from: f, reason: collision with root package name */
    private c f62144f;

    /* renamed from: g, reason: collision with root package name */
    private String f62145g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f62146h;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62147a;

        /* renamed from: com.adobe.marketing.mobile.assurance.internal.G$a$a, reason: collision with other inner class name */
        class RunnableC1228a implements Runnable {
            RunnableC1228a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (G.this.f62143e != null) {
                    WebView webView = G.this.f62143e;
                    String str = "javascript: " + a.this.f62147a;
                    FS.trackWebView(webView);
                    webView.loadUrl(str);
                } else {
                    Q5.t.b("Assurance", "AssuranceWebViewSocket", "WebView is null, unable to execute JS for socket communication.", new Object[0]);
                }
                G.this.f62141c.release();
            }
        }

        a(String str) {
            this.f62147a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                if (G.this.f62143e == null) {
                    G.this.m();
                    G.this.f62140b.acquire();
                }
                G.this.f62141c.acquire();
            } catch (InterruptedException e10) {
                Q5.t.b("Assurance", "AssuranceWebViewSocket", String.format("Socket unable to wait for JS semaphore: %s", e10.getLocalizedMessage()), new Object[0]);
            }
            G.this.o(new RunnableC1228a());
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f62150a;

        class a extends WebChromeClient {
            a() {
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    Q5.t.b("Assurance", "AssuranceWebViewSocket", consoleMessage.message(), new Object[0]);
                }
                return super.onConsoleMessage(consoleMessage);
            }
        }

        b(WeakReference weakReference) {
            this.f62150a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                G g10 = (G) this.f62150a.get();
                if (g10 == null) {
                    Q5.t.b("Assurance", "AssuranceWebViewSocket", "Current Socket is null", new Object[0]);
                    return;
                }
                if (G.class.getClassLoader() == null) {
                    Q5.t.b("Assurance", "AssuranceWebViewSocket", "Socket unable to get class loader.", new Object[0]);
                    return;
                }
                g10.f62143e = G.this.f62143e == null ? new WebView(com.adobe.marketing.mobile.B.h()) : G.this.f62143e;
                WebSettings settings = g10.f62143e.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowContentAccess(false);
                settings.setAllowFileAccess(false);
                FS.setWebViewClient(g10.f62143e, new e(G.this, null));
                g10.f62143e.setWebChromeClient(new a());
                g10.f62143e.addJavascriptInterface(G.this.new d(g10), "nativeCode");
                WebView webView = g10.f62143e;
                FS.trackWebView(webView);
                webView.loadUrl("file:///android_asset/WebviewSocket.html");
            } catch (Exception e10) {
                Q5.t.b("Assurance", "AssuranceWebViewSocket", "Unexpected exception while initializing webview: " + e10.getLocalizedMessage(), new Object[0]);
            }
        }
    }

    public enum c {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED,
        UNKNOWN
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<G> f62159a;

        d(G g10) {
            this.f62159a = new WeakReference<>(g10);
        }

        @JavascriptInterface
        public void log(String str) {
            Q5.t.e("Assurance", "AssuranceWebViewSocket", "JSLog: " + str, new Object[0]);
        }

        @JavascriptInterface
        public void onMessageReceived(String str) {
            if (G.this.f62142d != null) {
                G.this.f62142d.d(this.f62159a.get(), str);
            }
        }

        @JavascriptInterface
        public void onSocketClosed(String str, short s10, boolean z10) {
            G.this.r(c.CLOSED);
            if (G.this.f62142d != null) {
                G.this.f62142d.c(this.f62159a.get(), str, s10, z10);
            }
        }

        @JavascriptInterface
        public void onSocketError() {
            G.this.r(c.CLOSED);
            if (G.this.f62142d != null) {
                G.this.f62142d.e(this.f62159a.get());
            }
        }

        @JavascriptInterface
        public void onSocketOpened() {
            G.this.r(c.OPEN);
            if (G.this.f62142d != null) {
                G.this.f62142d.b(this.f62159a.get());
            }
        }
    }

    private final class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Q5.t.e("Assurance", "AssuranceWebViewSocket", "Socket web content finished loading.", new Object[0]);
            G.this.f62140b.release();
        }

        /* synthetic */ e(G g10, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Q5.t.a("Assurance", "AssuranceWebViewSocket", "Socket encountered page error: %s", webResourceError);
        }
    }

    G(H h10) {
        this(h10, null);
    }

    void q(byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 3);
        if (strEncodeToString.length() <= 32768) {
            n("sendData('" + strEncodeToString + "')");
            return;
        }
        Q5.t.f("Assurance", "AssuranceWebViewSocket", "Unable to send data packet, payload was " + strEncodeToString.length() + " bytes, maximum is 32768.", new Object[0]);
    }

    G(H h10, WebView webView) {
        this.f62146h = new Handler(Looper.getMainLooper());
        this.f62142d = h10;
        r(c.UNKNOWN);
        this.f62139a = Executors.newSingleThreadExecutor();
        this.f62140b = new Semaphore(0);
        this.f62141c = new Semaphore(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        o(new b(new WeakReference(this)));
    }

    private void n(String str) {
        p(new a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Runnable runnable) {
        this.f62146h.post(runnable);
    }

    private void p(Runnable runnable) {
        this.f62139a.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(c cVar) {
        this.f62144f = cVar;
        H h10 = this.f62142d;
        if (h10 != null) {
            h10.a(this, cVar);
        }
    }

    void j() {
        r(c.CLOSING);
        n("disconnect()");
        this.f62145g = null;
    }

    String k() {
        return this.f62145g;
    }

    c l() {
        return this.f62144f;
    }

    void i(String str) {
        if (!F.i(str)) {
            Q5.t.f("Assurance", "AssuranceWebViewSocket", "URL is malformed, will not attempt to connect.", new Object[0]);
            return;
        }
        r(c.CONNECTING);
        n("connect('" + str + "')");
        this.f62145g = str;
    }
}
