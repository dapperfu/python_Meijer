package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
    private Oc.A0 f70906C;

    /* renamed from: D, reason: collision with root package name */
    private final C7584aJ f70907D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f70908a;

    /* renamed from: b, reason: collision with root package name */
    private final II f70909b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f70910c;

    /* renamed from: d, reason: collision with root package name */
    private final C8440iL f70911d;

    /* renamed from: e, reason: collision with root package name */
    private final C10039xI f70912e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f70913f;

    /* renamed from: g, reason: collision with root package name */
    private final C9492sC f70914g;

    /* renamed from: h, reason: collision with root package name */
    private final XB f70915h;

    /* renamed from: i, reason: collision with root package name */
    private final C8112fG f70916i;

    /* renamed from: j, reason: collision with root package name */
    private final Z50 f70917j;

    /* renamed from: k, reason: collision with root package name */
    private final Sc.a f70918k;

    /* renamed from: l, reason: collision with root package name */
    private final C9695u60 f70919l;

    /* renamed from: m, reason: collision with root package name */
    private final C6870Fx f70920m;

    /* renamed from: n, reason: collision with root package name */
    private final ViewOnClickListenerC8010eJ f70921n;

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f70922o;

    /* renamed from: p, reason: collision with root package name */
    private final C7686bG f70923p;

    /* renamed from: q, reason: collision with root package name */
    private final R90 f70924q;

    /* renamed from: r, reason: collision with root package name */
    private final ZL f70925r;

    /* renamed from: s, reason: collision with root package name */
    private final W80 f70926s;

    /* renamed from: t, reason: collision with root package name */
    private final GS f70927t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f70929v;

    /* renamed from: u, reason: collision with root package name */
    private boolean f70928u = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f70930w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f70931x = false;

    /* renamed from: y, reason: collision with root package name */
    private Point f70932y = new Point();

    /* renamed from: z, reason: collision with root package name */
    private Point f70933z = new Point();

    /* renamed from: A, reason: collision with root package name */
    private long f70904A = 0;

    /* renamed from: B, reason: collision with root package name */
    private long f70905B = 0;

    public SH(Context context, II ii2, JSONObject jSONObject, C8440iL c8440iL, C10039xI c10039xI, M9 m92, C9492sC c9492sC, XB xb2, C8112fG c8112fG, Z50 z50, Sc.a aVar, C9695u60 c9695u60, C6870Fx c6870Fx, ViewOnClickListenerC8010eJ viewOnClickListenerC8010eJ, com.google.android.gms.common.util.f fVar, C7686bG c7686bG, R90 r90, W80 w80, GS gs2, ZL zl2, C7584aJ c7584aJ) {
        this.f70908a = context;
        this.f70909b = ii2;
        this.f70910c = jSONObject;
        this.f70911d = c8440iL;
        this.f70912e = c10039xI;
        this.f70913f = m92;
        this.f70914g = c9492sC;
        this.f70915h = xb2;
        this.f70916i = c8112fG;
        this.f70917j = z50;
        this.f70918k = aVar;
        this.f70919l = c9695u60;
        this.f70920m = c6870Fx;
        this.f70921n = viewOnClickListenerC8010eJ;
        this.f70922o = fVar;
        this.f70923p = c7686bG;
        this.f70924q = r90;
        this.f70926s = w80;
        this.f70927t = gs2;
        this.f70925r = zl2;
        this.f70907D = c7584aJ;
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
        this.f70931x = true;
    }

    private final String a(View view) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76786E3)).booleanValue()) {
            return null;
        }
        try {
            return this.f70913f.c().zzh(this.f70908a, view, null);
        } catch (Exception unused) {
            Sc.p.d("Exception getting data.");
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
        int iP = this.f70912e.P();
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
        JSONObject jSONObjectOptJSONObject = this.f70910c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean d() {
        return this.f70910c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) throws JSONException {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f70910c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) Oc.A.c().a(C8784lf.f76786E3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.f70908a;
            JSONObject jSONObject7 = new JSONObject();
            Nc.v.t();
            DisplayMetrics displayMetricsZ = Rc.D0.Z((WindowManager) context.getSystemService("window"));
            RH rh2 = null;
            try {
                jSONObject7.put("width", C4447y.b().e(context, displayMetricsZ.widthPixels));
                jSONObject7.put("height", C4447y.b().e(context, displayMetricsZ.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) Oc.A.c().a(C8784lf.f77434y8)).booleanValue()) {
                this.f70911d.l("/clickRecorded", new OH(this, rh2));
            } else {
                this.f70911d.l("/logScionEvent", new NH(this, rh2));
            }
            this.f70911d.l("/nativeImpression", new PH(this, view, rh2));
            C7134Nq.a(this.f70911d.g("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f70928u) {
                return true;
            }
            Z50 z50 = this.f70917j;
            this.f70928u = Nc.v.w().n(this.f70908a, this.f70918k.f34479a, z50.f72837C.toString(), this.f70919l.f79580f);
            return true;
        } catch (JSONException e10) {
            Sc.p.e("Unable to create impression JSON.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void A(Bundle bundle) throws JSONException {
        if (bundle == null) {
            Sc.p.b("Click data is null. No click is reported.");
        } else if (!c("click_reporting")) {
            Sc.p.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            j(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C4447y.b().m(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void C(View view, Map map) {
        this.f70932y = new Point();
        this.f70933z = new Point();
        if (view != null) {
            this.f70923p.S0(view);
        }
        this.f70929v = false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void E(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) throws JSONException {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.f70910c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.f70931x) {
                Sc.p.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!d()) {
                Sc.p.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectD = Rc.X.d(this.f70908a, map, map2, view2, scaleType);
        JSONObject jSONObjectG = Rc.X.g(this.f70908a, view2);
        boolean z12 = z11;
        JSONObject jSONObjectF = Rc.X.f(view2);
        JSONObject jSONObjectE = Rc.X.e(this.f70908a, view2);
        String strB = b(view, map);
        JSONObject jSONObjectC = Rc.X.c(strB, this.f70908a, this.f70933z, this.f70932y);
        if (z12) {
            try {
                JSONObject jSONObject2 = this.f70910c;
                Point point = this.f70933z;
                Point point2 = this.f70932y;
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
                        Sc.p.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        j(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, jSONObjectC, null, z10, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                Sc.p.e("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                Nc.v.s().x(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        j(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, jSONObjectC, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void F(InterfaceC7226Qh interfaceC7226Qh) {
        if (this.f70910c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f70921n.c(interfaceC7226Qh);
        } else {
            Sc.p.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void G(Oc.D0 d02) {
        try {
            if (this.f70930w) {
                return;
            }
            if (d02 == null) {
                C10039xI c10039xI = this.f70912e;
                if (c10039xI.X() != null) {
                    this.f70930w = true;
                    this.f70924q.d(c10039xI.X().zzf(), this.f70917j.f72908x0, this.f70926s);
                    zzh();
                    return;
                }
            }
            this.f70930w = true;
            this.f70924q.d(d02.zzf(), this.f70917j.f72908x0, this.f70926s);
            zzh();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void H(View view) {
        if (!this.f70910c.optBoolean("custom_one_point_five_click_enabled", false)) {
            Sc.p.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC8010eJ viewOnClickListenerC8010eJ = this.f70921n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(viewOnClickListenerC8010eJ);
        view.setClickable(true);
        viewOnClickListenerC8010eJ.f74648g = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean I(Bundle bundle) {
        if (c("impression_reporting")) {
            return e(null, null, null, null, ((Boolean) Oc.A.c().a(C8784lf.f77311pb)).booleanValue() ? a(null) : null, C4447y.b().m(bundle, null), false, null);
        }
        Sc.p.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void J(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f70932y = new Point();
        this.f70933z = new Point();
        if (!this.f70929v) {
            this.f70923p.R0(view);
            this.f70929v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f70920m.p(this);
        boolean zI = Rc.X.i(this.f70918k.f34481c);
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
    public final void K(Bundle bundle) {
        if (bundle == null) {
            Sc.p.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!c("touch_reporting")) {
            Sc.p.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f70913f.c().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject L(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70908a;
        JSONObject jSONObjectD = Rc.X.d(context, map, map2, view, scaleType);
        JSONObject jSONObjectG = Rc.X.g(context, view);
        JSONObject jSONObjectF = Rc.X.f(view);
        JSONObject jSONObjectE = Rc.X.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectD);
            jSONObject.put("ad_view_signal", jSONObjectG);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectE);
            return jSONObject;
        } catch (JSONException e10) {
            Sc.p.e("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void M(Oc.A0 a02) {
        this.f70906C = a02;
    }

    protected final void j(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) throws JSONException {
        String strD;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f70910c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f70909b.c(this.f70912e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f70912e.P());
            jSONObject8.put("view_aware_api_used", z10);
            C7088Mg c7088Mg = this.f70919l.f79583i;
            jSONObject8.put("custom_mute_requested", c7088Mg != null && c7088Mg.f69528g);
            jSONObject8.put("custom_mute_enabled", (this.f70912e.h().isEmpty() || this.f70912e.X() == null) ? false : true);
            if (this.f70921n.a() != null && this.f70910c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f70922o.a());
            if (this.f70931x && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f70909b.c(this.f70912e.a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f70910c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strD = this.f70913f.c().d(this.f70908a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                Sc.p.e("Exception obtaining click signals", e10);
                strD = null;
            }
            jSONObject8.put("click_signals", strD);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) Oc.A.c().a(C8784lf.f76763C8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f76777D8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.f70922o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.f70904A);
            jSONObject9.put("time_from_last_touch", jA - this.f70905B);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f70917j.b()) {
                JSONObject jSONObject10 = (JSONObject) this.f70910c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f70927t.K9(string, this.f70912e);
                }
            }
            C7134Nq.a(this.f70911d.g("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            Sc.p.e("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void y(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70908a;
        e(Rc.X.g(context, view), Rc.X.d(context, map, map2, view, scaleType), Rc.X.f(view), Rc.X.e(context, view), a(view), null, Rc.X.h(context, this.f70917j), view);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void z(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f70908a;
        JSONObject jSONObjectD = Rc.X.d(context, map, map2, view2, scaleType);
        JSONObject jSONObjectG = Rc.X.g(context, view2);
        JSONObject jSONObjectF = Rc.X.f(view2);
        JSONObject jSONObjectE = Rc.X.e(context, view2);
        String strB = b(view, map);
        j(true == ((Boolean) Oc.A.c().a(C8784lf.f76884L3)).booleanValue() ? view2 : view, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strB, Rc.X.c(strB, context, this.f70933z, this.f70932y), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final int zza() {
        if (this.f70919l.f79583i == null) {
            return 0;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue()) {
            return this.f70919l.f79583i.f69530i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzh() {
        try {
            Oc.A0 a02 = this.f70906C;
            if (a02 != null) {
                a02.zze();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzi() {
        if (this.f70910c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f70921n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzj() {
        this.f70911d.i();
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void zzq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f70910c);
            C7134Nq.a(this.f70911d.g("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            Sc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final void D(View view, MotionEvent motionEvent, View view2) {
        this.f70932y = Rc.X.a(motionEvent, view2);
        long jA = this.f70922o.a();
        this.f70905B = jA;
        if (motionEvent.getAction() == 0) {
            this.f70925r.b(motionEvent);
            this.f70904A = jA;
            this.f70933z = this.f70932y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f70932y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f70913f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final JSONObject N(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectL = L(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f70931x && d()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectL != null) {
                jSONObject.put("nas", jSONObjectL);
            }
            return jSONObject;
        } catch (JSONException e10) {
            Sc.p.e("Unable to create native click meta data JSON.", e10);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.FI
    public final boolean r() {
        if (zza() != 0) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue()) {
                return this.f70919l.f79583i.f69531j;
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
