package Sq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "d", "(Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Sq/e$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView e(String str, Context context) {
        Intrinsics.j(context, "context");
        WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        FS.setWebViewClient(webView, new a());
        FS.trackWebView(webView);
        webView.loadDataWithBaseURL(null, str, "text/html", "UTF8", null);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i10, Composer composer, int i11) {
        d(composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void d(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2130807897);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2130807897, i10, -1, "com.meijer.mobile.singlepagecheckout.wic.WicWebview (WicWebview.kt:21)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            final String str = "<html>\n    <body>\n        <h1>Hello from WebView!</h1>\n        <p>This is where the fields will be for linking your WIC account.</p>\n    </body>\n</html>";
            boolean zV = composerStartRestartGroup.V("<html>\n    <body>\n        <h1>Hello from WebView!</h1>\n        <p>This is where the fields will be for linking your WIC account.</p>\n    </body>\n</html>");
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Sq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.e(str, (Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Sq.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.f((WebView) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.e.a(function1, null, (Function1) objB2, composerStartRestartGroup, 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Sq.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
