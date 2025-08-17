package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class SH implements FI {

    /* renamed from: C, reason: collision with root package name */
    private Mc.A0 f70066C;

    /* renamed from: D, reason: collision with root package name */
    private final C7459aJ f70067D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f70068a;

    /* renamed from: b, reason: collision with root package name */
    private final II f70069b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f70070c;

    /* renamed from: d, reason: collision with root package name */
    private final C8315iL f70071d;

    /* renamed from: e, reason: collision with root package name */
    private final C9914xI f70072e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f70073f;

    /* renamed from: g, reason: collision with root package name */
    private final C9367sC f70074g;

    /* renamed from: h, reason: collision with root package name */
    private final XB f70075h;

    /* renamed from: i, reason: collision with root package name */
    private final C7987fG f70076i;

    /* renamed from: j, reason: collision with root package name */
    private final Z50 f70077j;

    /* renamed from: k, reason: collision with root package name */
    private final Qc.a f70078k;

    /* renamed from: l, reason: collision with root package name */
    private final C9570u60 f70079l;

    /* renamed from: m, reason: collision with root package name */
    private final C6745Fx f70080m;

    /* renamed from: n, reason: collision with root package name */
    private final ViewOnClickListenerC7885eJ f70081n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f70082o;

    /* renamed from: p, reason: collision with root package name */
    private final C7561bG f70083p;

    /* renamed from: q, reason: collision with root package name */
    private final R90 f70084q;

    /* renamed from: r, reason: collision with root package name */
    private final ZL f70085r;

    /* renamed from: s, reason: collision with root package name */
    private final W80 f70086s;

    /* renamed from: t, reason: collision with root package name */
    private final GS f70087t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f70089v;

    /* renamed from: u, reason: collision with root package name */
    private boolean f70088u = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f70090w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f70091x = false;

    /* renamed from: y, reason: collision with root package name */
    private Point f70092y = new Point();

    /* renamed from: z, reason: collision with root package name */
    private Point f70093z = new Point();

    /* renamed from: A, reason: collision with root package name */
    private long f70064A = 0;

    /* renamed from: B, reason: collision with root package name */
    private long f70065B = 0;

    public SH(Context context, II ii2, JSONObject jSONObject, C8315iL c8315iL, C9914xI c9914xI, M9 m92, C9367sC c9367sC, XB xb2, C7987fG c7987fG, Z50 z50, Qc.a aVar, C9570u60 c9570u60, C6745Fx c6745Fx, ViewOnClickListenerC7885eJ viewOnClickListenerC7885eJ, com.google.android.gms.common.util.f fVar, C7561bG c7561bG, R90 r90, W80 w80, GS gs2, ZL zl2, C7459aJ c7459aJ) {
        this.f70068a = context;
        this.f70069b = ii2;
        this.f70070c = jSONObject;
        this.f70071d = c8315iL;
        this.f70072e = c9914xI;
        this.f70073f = m92;
        this.f70074g = c9367sC;
        this.f70075h = xb2;
        this.f70076i = c7987fG;
        this.f70077j = z50;
        this.f70078k = aVar;
        this.f70079l = c9570u60;
        this.f70080m = c6745Fx;
        this.f70081n = viewOnClickListenerC7885eJ;
        this.f70082o = fVar;
        this.f70083p = c7561bG;
        this.f70084q = r90;
        this.f70086s = w80;
        this.f70087t = gs2;
        this.f70085r = zl2;
        this.f70067D = c7459aJ;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void B(String str) throws JSONException {
        j(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzs() throws JSONException {
        e(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzw() {
        this.f70091x = true;
    }

    private final String a(View view) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f75946E3)).booleanValue()) {
            return null;
        }
        try {
            return this.f70073f.c().zzh(this.f70068a, view, null);
        } catch (Exception unused) {
            Qc.p.d("Exception getting data.");
            return null;
        }
    }

    private final String b(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iP = this.f70072e.P();
        if (iP == 1) {
            return "1099";
        }
        if (iP == 2) {
            return "2099";
        }
        if (iP != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean c(String str) {
        JSONObject jSONObjectOptJSONObject = this.f70070c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean d() {
        return this.f70070c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) throws JSONException {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f70070c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) Mc.A.c().a(C8659lf.f75946E3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.f70068a;
            JSONObject jSONObject7 = new JSONObject();
            Lc.v.t();
            DisplayMetrics displayMetricsZ = Pc.D0.Z((WindowManager) context.getSystemService("window"));
            RH rh2 = null;
            try {
                jSONObject7.put("width", C4169y.b().e(context, displayMetricsZ.widthPixels));
                jSONObject7.put("height", C4169y.b().e(context, displayMetricsZ.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) Mc.A.c().a(C8659lf.f76594y8)).booleanValue()) {
                this.f70071d.l("/clickRecorded", new OH(this, rh2));
            } else {
                this.f70071d.l("/logScionEvent", new NH(this, rh2));
            }
            this.f70071d.l("/nativeImpression", new PH(this, view, rh2));
            C7009Nq.a(this.f70071d.g("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f70088u) {
                return true;
            }
            Z50 z50 = this.f70077j;
            this.f70088u = Lc.v.w().n(this.f70068a, this.f70078k.f29929a, z50.f71997C.toString(), this.f70079l.f78740f);
            return true;
        } catch (JSONException e10) {
            Qc.p.e("Unable to create impression JSON.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void A(Bundle bundle) throws JSONException {
        if (bundle == null) {
            Qc.p.b("Click data is null. No click is reported.");
        } else if (!c("click_reporting")) {
            Qc.p.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            j(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C4169y.b().m(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void C(View view, Map map) {
        this.f70092y = new Point();
        this.f70093z = new Point();
        if (view != null) {
            this.f70083p.S0(view);
        }
        this.f70089v = false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void E(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) throws JSONException {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.f70070c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.f70091x) {
                Qc.p.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!d()) {
                Qc.p.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectD = Pc.X.d(this.f70068a, map, map2, view2, scaleType);
        JSONObject jSONObjectG = Pc.X.g(this.f70068a, view2);
        boolean z12 = z11;
        JSONObject jSONObjectF = Pc.X.f(view2);
        JSONObject jSONObjectE = Pc.X.e(this.f70068a, view2);
        String strB = b(view, map);
        JSONObject jSONObjectC = Pc.X.c(strB, this.f70068a, this.f70093z, this.f70092y);
        if (z12) {
            try {
                JSONObject jSONObject2 = this.f70070c;
                Point point = this.f70093z;
                Point point2 = this.f70092y;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e10) {
                        e = e10;
                        Qc.p.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        j(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, jSONObjectC, null, z10, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                Qc.p.e("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                Lc.v.s().x(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        j(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, jSONObjectC, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void F(InterfaceC7101Qh interfaceC7101Qh) {
        if (this.f70070c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f70081n.c(interfaceC7101Qh);
        } else {
            Qc.p.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void G(Mc.D0 d02) {
        try {
            if (this.f70090w) {
                return;
            }
            if (d02 == null) {
                C9914xI c9914xI = this.f70072e;
                if (c9914xI.X() != null) {
                    this.f70090w = true;
                    this.f70084q.d(c9914xI.X().zzf(), this.f70077j.f72068x0, this.f70086s);
                    zzh();
                    return;
                }
            }
            this.f70090w = true;
            this.f70084q.d(d02.zzf(), this.f70077j.f72068x0, this.f70086s);
            zzh();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void H(View view) {
        if (!this.f70070c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Qc.p.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC7885eJ viewOnClickListenerC7885eJ = this.f70081n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(viewOnClickListenerC7885eJ);
        view.setClickable(true);
        viewOnClickListenerC7885eJ.f73808g = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void I(Mc.A0 a02) {
        this.f70066C = a02;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean J(Bundle bundle) {
        if (c("impression_reporting")) {
            return e(null, null, null, null, ((Boolean) Mc.A.c().a(C8659lf.f76471pb)).booleanValue() ? a(null) : null, C4169y.b().m(bundle, null), false, null);
        }
        Qc.p.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void K(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f70092y = new Point();
        this.f70093z = new Point();
        if (!this.f70089v) {
            this.f70083p.R0(view);
            this.f70089v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f70080m.p(this);
        boolean zI = Pc.X.i(this.f70078k.f29931c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zI) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zI) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void L(Bundle bundle) {
        if (bundle == null) {
            Qc.p.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!c("touch_reporting")) {
            Qc.p.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f70073f.c().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject M(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70068a;
        JSONObject jSONObjectD = Pc.X.d(context, map, map2, view, scaleType);
        JSONObject jSONObjectG = Pc.X.g(context, view);
        JSONObject jSONObjectF = Pc.X.f(view);
        JSONObject jSONObjectE = Pc.X.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectD);
            jSONObject.put("ad_view_signal", jSONObjectG);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectE);
            return jSONObject;
        } catch (JSONException e10) {
            Qc.p.e("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    protected final void j(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) throws JSONException {
        String strD;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f70070c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f70069b.c(this.f70072e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f70072e.P());
            jSONObject8.put("view_aware_api_used", z10);
            C6963Mg c6963Mg = this.f70079l.f78743i;
            jSONObject8.put("custom_mute_requested", c6963Mg != null && c6963Mg.f68688g);
            jSONObject8.put("custom_mute_enabled", (this.f70072e.h().isEmpty() || this.f70072e.X() == null) ? false : true);
            if (this.f70081n.a() != null && this.f70070c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f70082o.a());
            if (this.f70091x && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f70069b.c(this.f70072e.a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f70070c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strD = this.f70073f.c().d(this.f70068a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                Qc.p.e("Exception obtaining click signals", e10);
                strD = null;
            }
            jSONObject8.put("click_signals", strD);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) Mc.A.c().a(C8659lf.f75923C8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f75937D8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.f70082o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.f70064A);
            jSONObject9.put("time_from_last_touch", jA - this.f70065B);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f70077j.b()) {
                JSONObject jSONObject10 = (JSONObject) this.f70070c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f70087t.K9(string, this.f70072e);
                }
            }
            C7009Nq.a(this.f70071d.g("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            Qc.p.e("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void y(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70068a;
        e(Pc.X.g(context, view), Pc.X.d(context, map, map2, view, scaleType), Pc.X.f(view), Pc.X.e(context, view), a(view), null, Pc.X.h(context, this.f70077j), view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void z(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70068a;
        JSONObject jSONObjectD = Pc.X.d(context, map, map2, view2, scaleType);
        JSONObject jSONObjectG = Pc.X.g(context, view2);
        JSONObject jSONObjectF = Pc.X.f(view2);
        JSONObject jSONObjectE = Pc.X.e(context, view2);
        String strB = b(view, map);
        j(true == ((Boolean) Mc.A.c().a(C8659lf.f76044L3)).booleanValue() ? view2 : view, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, Pc.X.c(strB, context, this.f70093z, this.f70092y), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final int zza() {
        if (this.f70079l.f78743i == null) {
            return 0;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue()) {
            return this.f70079l.f78743i.f68690i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzh() {
        try {
            Mc.A0 a02 = this.f70066C;
            if (a02 != null) {
                a02.zze();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzi() {
        if (this.f70070c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f70081n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzj() {
        this.f70071d.i();
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f70070c);
            C7009Nq.a(this.f70071d.g("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            Qc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void D(View view, MotionEvent motionEvent, View view2) {
        this.f70092y = Pc.X.a(motionEvent, view2);
        long jA = this.f70082o.a();
        this.f70065B = jA;
        if (motionEvent.getAction() == 0) {
            this.f70085r.b(motionEvent);
            this.f70064A = jA;
            this.f70093z = this.f70092y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f70092y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f70073f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject N(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectM = M(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f70091x && d()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectM != null) {
                jSONObject.put("nas", jSONObjectM);
            }
            return jSONObject;
        } catch (JSONException e10) {
            Qc.p.e("Unable to create native click meta data JSON.", e10);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean r() {
        if (zza() != 0) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue()) {
                return this.f70079l.f78743i.f68691j;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean x() {
        return d();
    }
}
