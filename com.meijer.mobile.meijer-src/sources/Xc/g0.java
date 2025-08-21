package Xc;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import com.google.android.gms.internal.ads.AbstractC9006nj;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.Xj0;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC9006nj {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f41948a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f41949b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f41950c;

    /* renamed from: d, reason: collision with root package name */
    private WebViewClient f41951d;

    @Override // com.google.android.gms.internal.ads.AbstractC9006nj
    protected final WebViewClient a() {
        return this.f41951d;
    }

    public final void c() {
        this.f41950c.execute(new Runnable() { // from class: Xc.e0
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                this.f41943a.b();
            }
        });
    }

    public g0(WebView webView, c0 c0Var, Xj0 xj0) {
        this.f41948a = webView;
        this.f41949b = c0Var;
        this.f41950c = xj0;
    }

    private final void d() {
        this.f41948a.evaluateJavascript(String.format(Locale.getDefault(), (String) Oc.A.c().a(C8784lf.f76820G9), this.f41949b.a()), null);
    }

    final /* synthetic */ void b() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClientH;
        try {
            Nc.v.t();
            WebView webView = this.f41948a;
            if (Build.VERSION.SDK_INT >= 26) {
                webViewClientH = FS.getWebViewClient(webView);
            } else {
                if (M4.f.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientH = M4.e.h(webView);
                    } catch (RuntimeException e10) {
                        Nc.v.s().x(e10, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (webViewClientH != this) {
                if (webViewClientH != null) {
                    this.f41951d = webViewClientH;
                }
                FS.setWebViewClient(this.f41948a, this);
                d();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9006nj, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9006nj, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        d();
        super.onPageStarted(webView, str, bitmap);
    }
}
