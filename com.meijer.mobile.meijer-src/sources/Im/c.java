package Im;

import Ki.LocalThemeScope;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.fullstory.FS;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a`\u0010\u000f\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\b0\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isPinPadLoading", "", "acculynkPostBody", "Lkotlin/Function0;", "", "onCloseLoadingIndicator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "getBalanceResult", "ebtGetBalanceResult", "c", "(LKi/M;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Im/c$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f14978a;

        a(Function0<Unit> function0) {
            this.f14978a = function0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            if (view != null) {
                view.evaluateJavascript("\n                               parent.addEventListener('message', function(event){\n                                        EbtGetBalance.callFromIframe(JSON.stringify(event.data));\n                                    });\n                            ", null);
            }
            super.onPageStarted(view, url, favicon);
            this.f14978a.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14979a;

        b(LocalThemeScope localThemeScope) {
            this.f14979a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1306250019, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.view.AcculynkWebview.<anonymous>.<anonymous> (AcculynkPinPadWebview.kt:106)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.m.d(this.f14979a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, Ci.o.f4629a, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final boolean r19, final java.lang.String r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Im.c.c(Ki.M, androidx.compose.ui.Modifier, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView d(Function1 function1, String str, Function0 function0, Context context) {
        Intrinsics.j(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FS.setWebViewClient(webView, new a(function0));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new y(function1), "EbtGetBalance");
        FS.trackWebView(webView);
        webView.loadUrl(str);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, String str, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, z10, str, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
