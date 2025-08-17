package Vc;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.c;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9302rg;
import com.google.android.gms.internal.ads.C9998y60;
import com.google.android.gms.internal.ads.CN;
import com.google.android.gms.internal.ads.M9;
import com.google.android.gms.internal.ads.R90;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.zzavb;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Vc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5364a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37202a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f37203b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f37204c;

    /* renamed from: d, reason: collision with root package name */
    private final C9998y60 f37205d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37206e;

    /* renamed from: f, reason: collision with root package name */
    private final CN f37207f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f37208g;

    /* renamed from: h, reason: collision with root package name */
    private final Xj0 f37209h = C6908Kq.f68179f;

    /* renamed from: i, reason: collision with root package name */
    private final R90 f37210i;

    /* renamed from: j, reason: collision with root package name */
    private final l0 f37211j;

    /* renamed from: k, reason: collision with root package name */
    private final c0 f37212k;

    /* renamed from: l, reason: collision with root package name */
    private final g0 f37213l;

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            Qc.p.d("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) C6908Kq.f68174a.i0(new Callable() { // from class: Vc.U
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f37186a.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f37206e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Qc.p.e("Exception getting click signals with timeout. ", e10);
            Lc.v.s().x(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            Qc.p.d("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) C6908Kq.f68174a.i0(new Callable() { // from class: Vc.S
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f37183a.getViewSignals();
                }
            }).get(Math.min(i10, this.f37206e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Qc.p.e("Exception getting view signals with timeout. ", e10);
            Lc.v.s().x(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f75910B9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        C6908Kq.f68174a.execute(new Runnable() { // from class: Vc.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f37184a.f(str);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) throws JSONException {
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i10 = 1;
                if (i14 != 1) {
                    i10 = 2;
                    if (i14 != 2) {
                        i10 = 3;
                        if (i14 != 3) {
                            i10 = -1;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            try {
                this.f37204c.d(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e10) {
                e = e10;
                Qc.p.e("Failed to parse the touch string. ", e);
                Lc.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e11) {
                e = e11;
                Qc.p.e("Failed to parse the touch string. ", e);
                Lc.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }

    C5364a(WebView webView, M9 m92, CN cn2, R90 r90, C9998y60 c9998y60, l0 l0Var, c0 c0Var, g0 g0Var) {
        this.f37203b = webView;
        Context context = webView.getContext();
        this.f37202a = context;
        this.f37204c = m92;
        this.f37207f = cn2;
        C8659lf.a(context);
        this.f37206e = ((Integer) Mc.A.c().a(C8659lf.f76567w9)).intValue();
        this.f37208g = ((Boolean) Mc.A.c().a(C8659lf.f76581x9)).booleanValue();
        this.f37210i = r90;
        this.f37205d = c9998y60;
        this.f37211j = l0Var;
        this.f37212k = c0Var;
        this.f37213l = g0Var;
    }

    final /* synthetic */ void e(Bundle bundle, Xc.b bVar) {
        boolean zAcceptThirdPartyCookies;
        CookieManager cookieManagerA = Lc.v.u().a(this.f37202a);
        if (cookieManagerA != null) {
            zAcceptThirdPartyCookies = cookieManagerA.acceptThirdPartyCookies(this.f37203b);
        } else {
            zAcceptThirdPartyCookies = false;
        }
        bundle.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies);
        Xc.a.a(this.f37202a, Ec.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), bVar);
    }

    final /* synthetic */ void f(String str) {
        C9998y60 c9998y60;
        Uri uriA = Uri.parse(str);
        try {
            if (((Boolean) Mc.A.c().a(C8659lf.f76150Sb)).booleanValue() && (c9998y60 = this.f37205d) != null) {
                uriA = c9998y60.a(uriA, this.f37202a, this.f37203b, null);
            } else {
                uriA = this.f37204c.a(uriA, this.f37202a, this.f37203b, null);
            }
        } catch (zzavb e10) {
            Qc.p.c("Failed to append the click signal to URL: ", e10);
            Lc.v.s().x(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.f37210i.d(uriA.toString(), null, null);
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jA = Lc.v.c().a();
            String strD = this.f37204c.c().d(this.f37202a, str, this.f37203b);
            if (this.f37208g) {
                C5366c.d(this.f37207f, null, "csg", new Pair("clat", String.valueOf(Lc.v.c().a() - jA)));
                return strD;
            }
            return strD;
        } catch (RuntimeException e10) {
            Qc.p.e("Exception getting click signals. ", e10);
            Lc.v.s().x(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        Lc.v.t();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final Y y10 = new Y(this, string);
        if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
            this.f37211j.g(this.f37203b, y10);
            return string;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76609z9)).booleanValue()) {
            this.f37209h.execute(new Runnable() { // from class: Vc.V
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37188a.e(bundle, y10);
                }
            });
            return string;
        }
        Xc.a.a(this.f37202a, Ec.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), y10);
        return string;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jA = Lc.v.c().a();
            String strZzh = this.f37204c.c().zzh(this.f37202a, this.f37203b, null);
            if (this.f37208g) {
                C5366c.d(this.f37207f, null, "vsg", new Pair("vlat", String.valueOf(Lc.v.c().a() - jA)));
                return strZzh;
            }
            return strZzh;
        } catch (RuntimeException e10) {
            Qc.p.e("Exception getting view signals. ", e10);
            Lc.v.s().x(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }
}
