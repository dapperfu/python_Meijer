package com.meijer.mobile.chatbot.ux;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00126\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u0012<\b\u0002\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0018J#\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRD\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRH\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/chatbot/ux/h;", "LFr/b;", "LCl/e;", "meijerIntent", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "deeplinkCode", "Landroid/net/Uri;", "url", "", "onLoadInternalUrl", "Landroid/webkit/WebView;", "view", "", "onPageFinished", "<init>", "(LCl/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onLoadResource", "c", "LCl/e;", "d", "Lkotlin/jvm/functions/Function2;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h extends Fr.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerIntent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<Integer, Uri, Unit> onLoadInternalUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<WebView, String, Unit> onPageFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Cl.e meijerIntent, Function2<? super Integer, ? super Uri, Unit> onLoadInternalUrl, Function2<? super WebView, ? super String, Unit> function2) {
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(onLoadInternalUrl, "onLoadInternalUrl");
        this.meijerIntent = meijerIntent;
        this.onLoadInternalUrl = onLoadInternalUrl;
        this.onPageFinished = function2;
    }

    @Override // Fr.b, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.j(view, "view");
        super.onPageFinished(view, url);
        Function2<WebView, String, Unit> function2 = this.onPageFinished;
        if (function2 != null) {
            function2.invoke(view, url);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        String authority;
        Uri uriC = this.meijerIntent.getMPerksLinkParser().c(request != null ? request.getUrl() : null);
        if (uriC == null || request == null || (url = request.getUrl()) == null || (authority = url.getAuthority()) == null || !StringsKt.c0(authority, "meijer.com", false, 2, null) || this.meijerIntent.O(uriC) == -1) {
            return super.shouldOverrideUrlLoading(view, request);
        }
        this.onLoadInternalUrl.invoke(Integer.valueOf(this.meijerIntent.O(uriC)), uriC);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        uw.a.INSTANCE.a("loading resource " + url, new Object[0]);
    }
}
