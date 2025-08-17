package com.fullstory.instrumentation.webview;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fsimpl.C13966ar;
import fsimpl.eJ;
import fsimpl.eK;
import fsimpl.eL;
import fsimpl.eM;
import fsimpl.eN;
import fsimpl.eO;
import fsimpl.fZ;
import fsimpl.gd;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class WebViewTracker {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f64344a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private static final String f64345b = null;

    /* renamed from: c, reason: collision with root package name */
    private final RustInterface f64346c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f64347d;

    /* renamed from: e, reason: collision with root package name */
    private final LongSparseArray f64348e = new LongSparseArray();

    /* renamed from: f, reason: collision with root package name */
    private final ReferenceQueue f64349f = new ReferenceQueue();

    /* renamed from: g, reason: collision with root package name */
    private final String f64350g;

    /* renamed from: h, reason: collision with root package name */
    private final String f64351h;

    /* renamed from: i, reason: collision with root package name */
    private final String f64352i;

    /* renamed from: j, reason: collision with root package name */
    private final String f64353j;

    /* renamed from: k, reason: collision with root package name */
    private final String f64354k;

    /* renamed from: l, reason: collision with root package name */
    private final String f64355l;

    /* renamed from: m, reason: collision with root package name */
    private final String f64356m;

    /* renamed from: n, reason: collision with root package name */
    private final String f64357n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f64358o;

    /* renamed from: p, reason: collision with root package name */
    private final int f64359p;

    public class TrackerValueCallback implements ValueCallback {
        private String title;

        private TrackerValueCallback(String str) {
            this.title = str;
        }

        public /* synthetic */ TrackerValueCallback(String str, eL eLVar) {
            this(str);
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            WebViewTracker.b("WebViewTracker actuallyEvaluateJs=%s result=%s", this.title, str);
        }
    }

    public WebViewTracker(RustInterface rustInterface, boolean z10, String str) {
        this.f64346c = rustInterface;
        this.f64347d = z10;
        this.f64357n = str;
        String strA = rustInterface.a("function f(a,b,c){if(window._fs_native_msg_handler){window._fs_native_msg_handler.send(a,b,c)}else{console.log('missing _fs_native_msg_handler')}}", str);
        this.f64350g = strA;
        this.f64351h = rustInterface.a(str);
        this.f64352i = "window[window._fs_namespace]?._init_callback && window[window._fs_namespace]._init_callback()";
        String strA2 = rustInterface.a(str, true);
        this.f64353j = strA2;
        String strA3 = rustInterface.a(str, false);
        this.f64354k = strA3;
        this.f64355l = rustInterface.b(str, strA2);
        this.f64356m = rustInterface.b(str, strA3);
        this.f64359p = rustInterface.f();
        b("WebViewTracker: snippet: %s", strA);
    }

    private eJ a(WebViewClient webViewClient) {
        b("WebViewTracker: createInitialWebViewClientDelegate", new Object[0]);
        eJ eJVar = new eJ(this);
        eJVar.b(webViewClient);
        eJVar.a(webViewClient);
        return eJVar;
    }

    private static void a(long j10, String str, Object... objArr) {
    }

    private static void a(WebView webView, eJ eJVar) {
        webView.getWebViewProvider().setWebViewClient(eJVar);
    }

    private void a(WebView webView, eM eMVar) {
        a(webView, "evaluateSnippet time=%s", eMVar);
        c(webView);
        a(webView, "snippet", this.f64350g);
    }

    private void a(WebView webView, String str, String str2) {
        eL eLVar = new eL(this, webView, str2, str);
        if (Build.VERSION.SDK_INT >= 28) {
            new Handler(webView.getWebViewLooper()).post(eLVar);
        } else {
            fZ.b(eLVar);
        }
        if ("activate_capture_snippet".equals(str)) {
            C13966ar c13966arA = this.f64346c.a();
            a(webView, "init_consent", c13966arA != null ? c13966arA.e() : false ? this.f64355l : this.f64356m);
        }
    }

    private static void a(WebView webView, String str, Object... objArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object... objArr) {
    }

    private void c() {
        synchronized (this.f64348e) {
            while (true) {
                eN eNVar = (eN) this.f64349f.poll();
                if (eNVar != null) {
                    a(eNVar.f132098a, "lost", new Object[0]);
                    this.f64346c.b(eNVar.f132098a);
                    this.f64348e.remove(eNVar.f132098a);
                }
            }
        }
    }

    public static void d(WebView webView) {
        a(webView, "disableInjection webView=%s", webView);
        f64344a.add(webView);
    }

    private void f(WebView webView) {
        WebViewClient webViewClientG = g(webView);
        if (webViewClientG instanceof eJ) {
            return;
        }
        a(webView, a(webViewClientG));
    }

    private static WebViewClient g(WebView webView) {
        return Build.VERSION.SDK_INT < 26 ? eO.b(webView) : webView.getWebViewClient();
    }

    private boolean h(WebView webView) {
        if (Build.VERSION.SDK_INT < 26) {
            return eO.a(webView);
        }
        return true;
    }

    private boolean i(WebView webView) {
        return this.f64347d && !f64344a.contains(webView);
    }

    public int a(WebView webView) {
        synchronized (this.f64348e) {
            eN eNVar = (eN) this.f64348e.get(gd.c(webView));
            if (eNVar == null) {
                return 0;
            }
            return eNVar.f132099b;
        }
    }

    public WebResourceResponse a(WebView webView, String str) throws IOException {
        String str2 = f64345b;
        if (str2 == null || !str.endsWith("fs.js")) {
            return null;
        }
        a(webView, "*** fs.js redirected from %s to %s", str, str2);
        try {
            HashMap map = new HashMap();
            map.put("Access-Control-Allow-Origin", "*");
            map.put("Access-Control-Allow-Methods", "*");
            return new WebResourceResponse("application/js", "UTF-8", HttpResponseStatus.SUCCESS_OK, "OK", map, new URL(str2).openConnection().getInputStream());
        } catch (IOException e10) {
            Log.e("Failed to redirect fs.js", e10);
            return null;
        }
    }

    public void a() {
        b(-1L, "shutdown", this.f64351h);
    }

    void a(long j10) {
        b(j10, "signal fs.js to capture", this.f64352i);
    }

    public void a(long j10, int i10, int i11, String str) {
        if (i11 == this.f64359p) {
            a(j10, "WebView API: command=%s", str);
            this.f64346c.b(str);
            return;
        }
        synchronized (this.f64348e) {
            a(j10, "WebView message: epoch=%d type=%d msg=%s", Integer.valueOf(i10), Integer.valueOf(i11), str);
            eN eNVar = (eN) this.f64348e.get(j10);
            if (eNVar != null) {
                eNVar.f132099b = i10;
            }
            this.f64346c.a(j10, i10, (byte) i11, str);
        }
    }

    public void a(long j10, String str, String str2) {
        if (this.f64357n.equals(str) && this.f64346c.c(str2)) {
            return;
        }
        a(j10);
    }

    public void a(WebView webView, int i10, String str, String str2) {
        a(webView, "onReceivedError: %d %s %s", Integer.valueOf(i10), str2, str);
        if (str2 == null || !str2.endsWith("/s/fs.js")) {
            return;
        }
        Log.e(String.format("FullStory web script failed to load: %d %s %s", Integer.valueOf(i10), str2, str));
    }

    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest != null && webResourceError != null) {
            a(webView, "onReceivedError: %d %s %s", Integer.valueOf(webResourceError.getErrorCode()), webResourceRequest.getUrl(), webResourceError.getDescription());
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !webResourceRequest.getUrl().toString().endsWith("/s/fs.js")) {
            return;
        }
        Log.e(String.format("FullStory web script failed to load: %d %s %s", Integer.valueOf(webResourceError.getErrorCode()), webResourceRequest.getUrl(), webResourceError.getDescription()));
    }

    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceResponse != null) {
            a(webView, "onReceivedHttpError: %d %s %s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl(), webResourceResponse.getReasonPhrase());
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !webResourceRequest.getUrl().toString().endsWith("/s/fs.js")) {
            return;
        }
        Log.e(String.format("FullStory web script failed to load: %d %s %s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl(), webResourceResponse.getReasonPhrase()));
    }

    public void a(WebView webView, WebViewClient webViewClient) {
        a(webView, "setWebViewClient client=%s", webViewClient);
        if (!i(webView)) {
            a(webView, "setWebViewClient returning early, disabled webview is %s", webView);
            webView.setWebViewClient(webViewClient);
            return;
        }
        if (!h(webView)) {
            a(webView, "setWebViewClient uhoh: !canAccessWebViewClient", new Object[0]);
            webView.setWebViewClient(webViewClient);
            return;
        }
        WebViewClient webViewClientG = g(webView);
        eJ eJVarA = !(webViewClientG instanceof eJ) ? a(webViewClientG) : (eJ) webViewClientG;
        webView.setWebViewClient(webViewClient);
        if (webViewClient == null) {
            eJVarA.a(e(webView));
        }
        eJVarA.b(webViewClient);
        a(webView, eJVarA);
    }

    public void a(boolean z10) {
        b(-1L, "set_consent", z10 ? this.f64353j : this.f64354k);
    }

    public void b() {
        synchronized (this.f64348e) {
            c();
        }
    }

    public void b(WebView webView, String str) {
        a(webView, "onPageHistoryUpdate: %s", str);
        a(webView, eM.ON_PAGE_HISTORY_UPDATE);
    }

    public boolean b(long j10, String str, String str2) {
        WebView webView;
        WebView webView2;
        b("WebViewTracker: Evaluating Javascript=%s id=%d js=%s", str, Long.valueOf(j10), str2);
        c();
        synchronized (this.f64348e) {
            if (j10 != -1) {
                eN eNVar = (eN) this.f64348e.get(j10);
                if (eNVar != null && (webView = (WebView) eNVar.get()) != null) {
                    a(webView, str, str2);
                }
                b("WebViewTracker: Lost web view with id=%d", Long.valueOf(j10));
                this.f64346c.b(j10);
                return false;
            }
            for (int i10 = 0; i10 < this.f64348e.size(); i10++) {
                eN eNVar2 = (eN) this.f64348e.valueAt(i10);
                if (eNVar2 != null && (webView2 = (WebView) eNVar2.get()) != null) {
                    a(webView2, str, str2);
                }
            }
            return true;
        }
    }

    public boolean b(WebView webView) {
        return a(webView) != 0;
    }

    public void c(WebView webView) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            Log.w(String.format("Track called for WebView on incorrect thread (should be %s be but was %s). Skipping.", Looper.getMainLooper().getThread().getName(), Thread.currentThread().getName()));
            return;
        }
        long jC = gd.c(webView);
        if (!i(webView)) {
            a(webView, "track returning early, disabled webview is %s", webView);
            this.f64346c.a(jC, 0, (short) 1);
            return;
        }
        synchronized (this.f64348e) {
            c();
            if (this.f64348e.indexOfKey(jC) < 0) {
                a(webView, "track: now tracking", new Object[0]);
                this.f64348e.put(jC, new eN(jC, webView, this.f64349f));
                if (h(webView)) {
                    eK eKVar = new eK(this, jC);
                    f(webView);
                    webView.addJavascriptInterface(eKVar, "_fs_native_msg_handler");
                } else {
                    Log.w("WebViewTracker: Couldn't access the webview's client");
                }
                WebSettings settings = webView.getSettings();
                if (settings != null) {
                    boolean javaScriptEnabled = settings.getJavaScriptEnabled();
                    a(webView, "JavaScript enabled=%s", Boolean.valueOf(javaScriptEnabled));
                    if (!javaScriptEnabled) {
                        if (!this.f64358o) {
                            this.f64358o = true;
                            Log.logAlways("FullStory unable to instrument WebViews with setJavaScriptEnabled(false)");
                        }
                        this.f64346c.a(jC, 0, (short) 2);
                    }
                } else {
                    a(webView, "Unable to retrieve WebView settings", new Object[0]);
                }
                this.f64346c.a(jC);
            } else {
                a(webView, "track: already tracking", new Object[0]);
            }
        }
    }

    public void c(WebView webView, String str) {
        a(webView, "onPageCommitVisible: %s", str);
        a(webView, eM.ON_PAGE_COMMIT_VISIBLE);
    }

    public void d(WebView webView, String str) {
        a(webView, "onPageFinished: %s", str);
        a(webView, eM.ON_PAGE_FINISHED);
    }

    public WebViewClient e(WebView webView) {
        WebViewClient webViewClientG = g(webView);
        return webViewClientG instanceof eJ ? ((eJ) webViewClientG).a() : webViewClientG;
    }

    public void e(WebView webView, String str) {
        a(webView, "onPageStarted: ", str);
        a(webView, eM.ON_PAGE_STARTED);
    }
}
