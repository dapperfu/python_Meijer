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
    private final ExecutorService f62978a;

    /* renamed from: b, reason: collision with root package name */
    private final Semaphore f62979b;

    /* renamed from: c, reason: collision with root package name */
    private final Semaphore f62980c;

    /* renamed from: d, reason: collision with root package name */
    private final H f62981d;

    /* renamed from: e, reason: collision with root package name */
    private WebView f62982e;

    /* renamed from: f, reason: collision with root package name */
    private c f62983f;

    /* renamed from: g, reason: collision with root package name */
    private String f62984g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f62985h;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62986a;

        /* renamed from: com.adobe.marketing.mobile.assurance.internal.G$a$a, reason: collision with other inner class name */
        class RunnableC1238a implements Runnable {
            RunnableC1238a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (G.this.f62982e != null) {
                    WebView webView = G.this.f62982e;
                    String str = "javascript: " + a.this.f62986a;
                    FS.trackWebView(webView);
                    webView.loadUrl(str);
                } else {
                    R5.t.b("Assurance", "AssuranceWebViewSocket", "WebView is null, unable to execute JS for socket communication.", new Object[0]);
                }
                G.this.f62980c.release();
            }
        }

        a(String str) {
            this.f62986a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                if (G.this.f62982e == null) {
                    G.this.m();
                    G.this.f62979b.acquire();
                }
                G.this.f62980c.acquire();
            } catch (InterruptedException e10) {
                R5.t.b("Assurance", "AssuranceWebViewSocket", String.format("Socket unable to wait for JS semaphore: %s", e10.getLocalizedMessage()), new Object[0]);
            }
            G.this.o(new RunnableC1238a());
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f62989a;

        class a extends WebChromeClient {
            a() {
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    R5.t.b("Assurance", "AssuranceWebViewSocket", consoleMessage.message(), new Object[0]);
                }
                return super.onConsoleMessage(consoleMessage);
            }
        }

        b(WeakReference weakReference) {
            this.f62989a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                G g10 = (G) this.f62989a.get();
                if (g10 == null) {
                    R5.t.b("Assurance", "AssuranceWebViewSocket", "Current Socket is null", new Object[0]);
                    return;
                }
                if (G.class.getClassLoader() == null) {
                    R5.t.b("Assurance", "AssuranceWebViewSocket", "Socket unable to get class loader.", new Object[0]);
                    return;
                }
                g10.f62982e = G.this.f62982e == null ? new WebView(com.adobe.marketing.mobile.B.h()) : G.this.f62982e;
                WebSettings settings = g10.f62982e.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowContentAccess(false);
                settings.setAllowFileAccess(false);
                FS.setWebViewClient(g10.f62982e, new e(G.this, null));
                g10.f62982e.setWebChromeClient(new a());
                g10.f62982e.addJavascriptInterface(G.this.new d(g10), "nativeCode");
                WebView webView = g10.f62982e;
                FS.trackWebView(webView);
                webView.loadUrl("file:///android_asset/WebviewSocket.html");
            } catch (Exception e10) {
                R5.t.b("Assurance", "AssuranceWebViewSocket", "Unexpected exception while initializing webview: " + e10.getLocalizedMessage(), new Object[0]);
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
        private WeakReference<G> f62998a;

        d(G g10) {
            this.f62998a = new WeakReference<>(g10);
        }

        @JavascriptInterface
        public void log(String str) {
            R5.t.e("Assurance", "AssuranceWebViewSocket", "JSLog: " + str, new Object[0]);
        }

        @JavascriptInterface
        public void onMessageReceived(String str) {
            if (G.this.f62981d != null) {
                G.this.f62981d.d(this.f62998a.get(), str);
            }
        }

        @JavascriptInterface
        public void onSocketClosed(String str, short s10, boolean z10) {
            G.this.r(c.CLOSED);
            if (G.this.f62981d != null) {
                G.this.f62981d.c(this.f62998a.get(), str, s10, z10);
            }
        }

        @JavascriptInterface
        public void onSocketError() {
            G.this.r(c.CLOSED);
            if (G.this.f62981d != null) {
                G.this.f62981d.e(this.f62998a.get());
            }
        }

        @JavascriptInterface
        public void onSocketOpened() {
            G.this.r(c.OPEN);
            if (G.this.f62981d != null) {
                G.this.f62981d.b(this.f62998a.get());
            }
        }
    }

    private final class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            R5.t.e("Assurance", "AssuranceWebViewSocket", "Socket web content finished loading.", new Object[0]);
            G.this.f62979b.release();
        }

        /* synthetic */ e(G g10, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            R5.t.a("Assurance", "AssuranceWebViewSocket", "Socket encountered page error: %s", webResourceError);
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
        R5.t.f("Assurance", "AssuranceWebViewSocket", "Unable to send data packet, payload was " + strEncodeToString.length() + " bytes, maximum is 32768.", new Object[0]);
    }

    G(H h10, WebView webView) {
        this.f62985h = new Handler(Looper.getMainLooper());
        this.f62981d = h10;
        r(c.UNKNOWN);
        this.f62978a = Executors.newSingleThreadExecutor();
        this.f62979b = new Semaphore(0);
        this.f62980c = new Semaphore(1);
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
        this.f62985h.post(runnable);
    }

    private void p(Runnable runnable) {
        this.f62978a.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(c cVar) {
        this.f62983f = cVar;
        H h10 = this.f62981d;
        if (h10 != null) {
            h10.a(this, cVar);
        }
    }

    void j() {
        r(c.CLOSING);
        n("disconnect()");
        this.f62984g = null;
    }

    String k() {
        return this.f62984g;
    }

    c l() {
        return this.f62983f;
    }

    void i(String str) {
        if (!F.i(str)) {
            R5.t.f("Assurance", "AssuranceWebViewSocket", "URL is malformed, will not attempt to connect.", new Object[0]);
            return;
        }
        r(c.CONNECTING);
        n("connect('" + str + "')");
        this.f62984g = str;
    }
}
