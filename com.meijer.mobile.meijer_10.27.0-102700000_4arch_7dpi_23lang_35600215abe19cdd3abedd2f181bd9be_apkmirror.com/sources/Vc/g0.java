package Vc;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import com.google.android.gms.internal.ads.AbstractC8881nj;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.Xj0;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC8881nj {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f37236a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f37237b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f37238c;

    /* renamed from: d, reason: collision with root package name */
    private WebViewClient f37239d;

    @Override // com.google.android.gms.internal.ads.AbstractC8881nj
    protected final WebViewClient a() {
        return this.f37239d;
    }

    public final void c() {
        this.f37238c.execute(new Runnable() { // from class: Vc.e0
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                this.f37231a.b();
            }
        });
    }

    public g0(WebView webView, c0 c0Var, Xj0 xj0) {
        this.f37236a = webView;
        this.f37237b = c0Var;
        this.f37238c = xj0;
    }

    private final void d() {
        this.f37236a.evaluateJavascript(String.format(Locale.getDefault(), (String) Mc.A.c().a(C8659lf.f75980G9), this.f37237b.a()), null);
    }

    final /* synthetic */ void b() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClientH;
        try {
            Lc.v.t();
            WebView webView = this.f37236a;
            if (Build.VERSION.SDK_INT >= 26) {
                webViewClientH = FS.getWebViewClient(webView);
            } else {
                if (L4.f.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientH = L4.e.h(webView);
                    } catch (RuntimeException e10) {
                        Lc.v.s().x(e10, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (webViewClientH != this) {
                if (webViewClientH != null) {
                    this.f37239d = webViewClientH;
                }
                FS.setWebViewClient(this.f37236a, this);
                d();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8881nj, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8881nj, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        d();
        super.onPageStarted(webView, str, bitmap);
    }
}
