package fsimpl;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.instrumentation.webview.WebViewTracker;
import java.io.IOException;

/* loaded from: classes14.dex */
public class eJ extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private WebViewTracker f132084a;

    /* renamed from: b, reason: collision with root package name */
    private WebViewClient f132085b;

    /* renamed from: c, reason: collision with root package name */
    private WebViewClient f132086c;

    public eJ(WebViewTracker webViewTracker) {
        this.f132084a = webViewTracker;
    }

    private void b() {
        if (this.f132085b == this.f132086c) {
            Log.w(com.fullstory.util.Log.TAG, "Loading inside WebView due to FullStory being applied to the app. Without FullStory, this would have loaded in the external browser.");
        }
    }

    public WebViewClient a() {
        return this.f132085b;
    }

    public void a(WebViewClient webViewClient) {
        this.f132086c = webViewClient;
    }

    public void b(WebViewClient webViewClient) {
        if (webViewClient == null) {
            webViewClient = this.f132086c;
        }
        this.f132085b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        this.f132084a.b(webView, str);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        this.f132084a.c(webView, str);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f132084a.d(webView, str);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f132084a.e(webView, str);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f132084a.a(webView, i10, str, str2);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f132084a.a(webView, webResourceRequest, webResourceError);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f132084a.a(webView, webResourceRequest, webResourceResponse);
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f10, f11);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onUnhandledInputEvent(webView, inputEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
        WebResourceResponse webResourceResponseA = this.f132084a.a(webView, webResourceRequest.getUrl().toString());
        WebViewClient webViewClient = this.f132085b;
        return webResourceResponseA != null ? webResourceResponseA : webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) throws IOException {
        WebResourceResponse webResourceResponseA = this.f132084a.a(webView, str);
        WebViewClient webViewClient = this.f132085b;
        return webResourceResponseA != null ? webResourceResponseA : webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        b();
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        b();
        WebViewClient webViewClient = this.f132085b;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}
