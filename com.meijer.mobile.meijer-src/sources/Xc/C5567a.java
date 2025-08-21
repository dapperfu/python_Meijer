package Xc;

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
import com.google.android.gms.internal.ads.C10123y60;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9427rg;
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

/* renamed from: Xc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5567a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41914a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f41915b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f41916c;

    /* renamed from: d, reason: collision with root package name */
    private final C10123y60 f41917d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41918e;

    /* renamed from: f, reason: collision with root package name */
    private final CN f41919f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41920g;

    /* renamed from: h, reason: collision with root package name */
    private final Xj0 f41921h = C7033Kq.f69019f;

    /* renamed from: i, reason: collision with root package name */
    private final R90 f41922i;

    /* renamed from: j, reason: collision with root package name */
    private final l0 f41923j;

    /* renamed from: k, reason: collision with root package name */
    private final c0 f41924k;

    /* renamed from: l, reason: collision with root package name */
    private final g0 f41925l;

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            Sc.p.d("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) C7033Kq.f69014a.k0(new Callable() { // from class: Xc.U
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41898a.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f41918e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Sc.p.e("Exception getting click signals with timeout. ", e10);
            Nc.v.s().x(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            Sc.p.d("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) C7033Kq.f69014a.k0(new Callable() { // from class: Xc.S
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41895a.getViewSignals();
                }
            }).get(Math.min(i10, this.f41918e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Sc.p.e("Exception getting view signals with timeout. ", e10);
            Nc.v.s().x(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76750B9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        C7033Kq.f69014a.execute(new Runnable() { // from class: Xc.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f41896a.f(str);
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
                this.f41916c.d(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e10) {
                e = e10;
                Sc.p.e("Failed to parse the touch string. ", e);
                Nc.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e11) {
                e = e11;
                Sc.p.e("Failed to parse the touch string. ", e);
                Nc.v.s().x(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e12) {
            e = e12;
        }
    }

    C5567a(WebView webView, M9 m92, CN cn2, R90 r90, C10123y60 c10123y60, l0 l0Var, c0 c0Var, g0 g0Var) {
        this.f41915b = webView;
        Context context = webView.getContext();
        this.f41914a = context;
        this.f41916c = m92;
        this.f41919f = cn2;
        C8784lf.a(context);
        this.f41918e = ((Integer) Oc.A.c().a(C8784lf.f77407w9)).intValue();
        this.f41920g = ((Boolean) Oc.A.c().a(C8784lf.f77421x9)).booleanValue();
        this.f41922i = r90;
        this.f41917d = c10123y60;
        this.f41923j = l0Var;
        this.f41924k = c0Var;
        this.f41925l = g0Var;
    }

    final /* synthetic */ void e(Bundle bundle, Zc.b bVar) {
        boolean zAcceptThirdPartyCookies;
        CookieManager cookieManagerA = Nc.v.u().a(this.f41914a);
        if (cookieManagerA != null) {
            zAcceptThirdPartyCookies = cookieManagerA.acceptThirdPartyCookies(this.f41915b);
        } else {
            zAcceptThirdPartyCookies = false;
        }
        bundle.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies);
        Zc.a.a(this.f41914a, Gc.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), bVar);
    }

    final /* synthetic */ void f(String str) {
        C10123y60 c10123y60;
        Uri uriA = Uri.parse(str);
        try {
            if (((Boolean) Oc.A.c().a(C8784lf.f76990Sb)).booleanValue() && (c10123y60 = this.f41917d) != null) {
                uriA = c10123y60.a(uriA, this.f41914a, this.f41915b, null);
            } else {
                uriA = this.f41916c.a(uriA, this.f41914a, this.f41915b, null);
            }
        } catch (zzavb e10) {
            Sc.p.c("Failed to append the click signal to URL: ", e10);
            Nc.v.s().x(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.f41922i.d(uriA.toString(), null, null);
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jA = Nc.v.c().a();
            String strD = this.f41916c.c().d(this.f41914a, str, this.f41915b);
            if (this.f41920g) {
                C5569c.d(this.f41919f, null, "csg", new Pair("clat", String.valueOf(Nc.v.c().a() - jA)));
                return strD;
            }
            return strD;
        } catch (RuntimeException e10) {
            Sc.p.e("Exception getting click signals. ", e10);
            Nc.v.s().x(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        Nc.v.t();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final Y y10 = new Y(this, string);
        if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
            this.f41923j.g(this.f41915b, y10);
            return string;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77449z9)).booleanValue()) {
            this.f41921h.execute(new Runnable() { // from class: Xc.V
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41900a.e(bundle, y10);
                }
            });
            return string;
        }
        Zc.a.a(this.f41914a, Gc.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), y10);
        return string;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jA = Nc.v.c().a();
            String strZzh = this.f41916c.c().zzh(this.f41914a, this.f41915b, null);
            if (this.f41920g) {
                C5569c.d(this.f41919f, null, "vsg", new Pair("vlat", String.valueOf(Nc.v.c().a() - jA)));
                return strZzh;
            }
            return strZzh;
        } catch (RuntimeException e10) {
            Sc.p.e("Exception getting view signals. ", e10);
            Nc.v.s().x(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }
}
