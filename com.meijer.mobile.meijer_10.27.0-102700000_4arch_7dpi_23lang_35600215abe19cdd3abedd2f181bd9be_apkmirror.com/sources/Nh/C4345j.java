package Nh;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aC\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lokhttp3/HttpUrl;", "aurusUrl", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "Lkotlin/Function1;", "", "onAction", "d", "(Landroidx/compose/ui/Modifier;Lokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "i", "(Ljava/lang/String;)Ljava/lang/String;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Nh.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4345j {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Nh/j$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nh.j$a */
    public static final class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HttpUrl f21721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21722b;

        a(HttpUrl httpUrl, String str) {
            this.f21721a = httpUrl;
            this.f21722b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            if (StringsKt.G(this.f21721a.getHost(), "meijer.com", false, 2, null) && Intrinsics.e(this.f21721a.c(), "/mma/mma-payment.html") && view != null) {
                view.evaluateJavascript(C4345j.i(this.f21722b), null);
            }
            super.onPageFinished(view, url);
        }
    }

    public static final void d(Modifier modifier, final HttpUrl aurusUrl, final String accessToken, final Function1<? super String, Unit> onAction, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.j(aurusUrl, "aurusUrl");
        Intrinsics.j(accessToken, "accessToken");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1575279399);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(aurusUrl) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(accessToken) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onAction) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(1575279399, i12, -1, "com.meijer.mobile.accounts.ux.composables.payments.AurusScreen (AurusScreen.kt:35)");
            }
            Modifier modifierA = j0.T.a(d0.T.g(modifier4, d0.T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null));
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 7168) == 2048) | composerStartRestartGroup.D(aurusUrl) | ((i12 & 896) == 256);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Nh.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4345j.e(onAction, aurusUrl, accessToken, (Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Nh.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4345j.f((WebView) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.e.a(function1, modifierA, (Function1) objB2, composerStartRestartGroup, 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier4;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Nh.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4345j.g(modifier3, aurusUrl, accessToken, onAction, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView e(Function1 function1, HttpUrl httpUrl, String str, Context context) {
        Intrinsics.j(context, "context");
        WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        FS.setWebViewClient(webView, new a(httpUrl, str));
        webView.addJavascriptInterface(new C4341f(function1), "android-bridge");
        String url = httpUrl.getUrl();
        FS.trackWebView(webView);
        webView.loadUrl(url);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Modifier modifier, HttpUrl httpUrl, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(modifier, httpUrl, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        return "window.loadToken('" + str + "')";
    }
}
