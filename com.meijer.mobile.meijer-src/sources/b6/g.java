package b6;

import R5.t;
import V5.r;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lb6/g;", "Landroid/webkit/WebViewClient;", "Lb6/f;", "messageSettings", "LV5/r;", "presentationUtilityProvider", "Lkotlin/Function1;", "", "", "onUrlLoading", "<init>", "(Lb6/f;LV5/r;Lkotlin/jvm/functions/Function1;)V", "url", "a", "(Ljava/lang/String;)Z", "Landroid/webkit/WebResourceResponse;", "b", "(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lb6/f;", "LV5/r;", "c", "Lkotlin/jvm/functions/Function1;", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends WebViewClient {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f messageSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r presentationUtilityProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Boolean> onUrlLoading;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb6/g$a;", "", "<init>", "()V", "", "stringUrl", "", "a", "(Ljava/lang/String;)Z", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: b6.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String stringUrl) {
            if (stringUrl == null || StringsKt.s0(stringUrl)) {
                return false;
            }
            try {
                new URL(stringUrl);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    private final WebResourceResponse b(String url) {
        if (url == null || StringsKt.s0(url) || !INSTANCE.a(url)) {
            t.e("Services", "InAppMessageWebViewClient", "Cannot handle url: " + url, new Object[0]);
            return null;
        }
        String str = this.messageSettings.a().get(url);
        if (str == null || StringsKt.s0(str)) {
            t.e("Services", "InAppMessageWebViewClient", "No cache location found for url: " + url, new Object[0]);
            return null;
        }
        InputStream inputStreamD = this.presentationUtilityProvider.d(str, url);
        if (inputStreamD != null) {
            return new WebResourceResponse(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url)), null, inputStreamD);
        }
        t.e("Services", "InAppMessageWebViewClient", "Cached asset not found for url: " + url + " from cache location " + str + '.', new Object[0]);
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url = request != null ? request.getUrl() : null;
        return a(url != null ? url.toString() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(f messageSettings, r presentationUtilityProvider, Function1<? super String, Boolean> onUrlLoading) {
        Intrinsics.j(messageSettings, "messageSettings");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(onUrlLoading, "onUrlLoading");
        this.messageSettings = messageSettings;
        this.presentationUtilityProvider = presentationUtilityProvider;
        this.onUrlLoading = onUrlLoading;
    }

    private final boolean a(String url) {
        if (url != null && !StringsKt.s0(url)) {
            return this.onUrlLoading.invoke(url).booleanValue();
        }
        t.e("Services", "InAppMessageWebViewClient", "Unable to handle a null or empty url.", new Object[0]);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.j(request, "request");
        WebResourceResponse webResourceResponseB = b(request.getUrl().toString());
        return webResourceResponseB == null ? super.shouldInterceptRequest(view, request) : webResourceResponseB;
    }
}
