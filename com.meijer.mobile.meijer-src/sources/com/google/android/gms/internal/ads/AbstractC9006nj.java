package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
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

/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9006nj extends WebViewClient {
    protected abstract WebViewClient a();

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return null;
        }
        return webViewClientA.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClientA = a();
        if (webViewClientA != null) {
            return webViewClientA.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClientA = a();
        if (webViewClientA != null) {
            webViewClientA.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onScaleChanged(webView, f10, f11);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return;
        }
        webViewClientA.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return null;
        }
        return webViewClientA.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClientA = a();
        if (webViewClientA == null) {
            return false;
        }
        return webViewClientA.shouldOverrideUrlLoading(webView, str);
    }
}
