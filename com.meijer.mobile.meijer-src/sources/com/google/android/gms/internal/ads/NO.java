package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class NO implements InterfaceC7784cC, InterfaceC10243zD, TC {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f69712a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69714c;

    /* renamed from: f, reason: collision with root package name */
    private SB f69717f;

    /* renamed from: g, reason: collision with root package name */
    private Oc.W0 f69718g;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f69722k;

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f69723l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f69724m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f69725n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f69726o;

    /* renamed from: h, reason: collision with root package name */
    private String f69719h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f69720i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f69721j = "";

    /* renamed from: d, reason: collision with root package name */
    private int f69715d = 0;

    /* renamed from: e, reason: collision with root package name */
    private MO f69716e = MO.AD_REQUESTED;

    NO(ZO zo2, C9695u60 c9695u60, String str) {
        this.f69712a = zo2;
        this.f69714c = str;
        this.f69713b = c9695u60.f79580f;
    }

    public final String a() {
        return this.f69714c;
    }

    public final void c() {
        this.f69724m = true;
    }

    public final void d() {
        this.f69725n = true;
    }

    public final boolean e() {
        return this.f69716e != MO.AD_REQUESTED;
    }

    private static JSONObject f(Oc.W0 w02) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", w02.f23348c);
        jSONObject.put("errorCode", w02.f23346a);
        jSONObject.put("errorDescription", w02.f23347b);
        Oc.W0 w03 = w02.f23349d;
        jSONObject.put("underlyingError", w03 == null ? null : f(w03));
        return jSONObject;
    }

    private final JSONObject g(SB sb2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", sb2.zzg());
        jSONObject.put("responseSecsSinceEpoch", sb2.zzc());
        jSONObject.put("responseId", sb2.zzi());
        if (((Boolean) Oc.A.c().a(C8784lf.f77169f9)).booleanValue()) {
            String strZzd = sb2.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                Sc.p.b("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.f69719h)) {
            jSONObject.put("adRequestUrl", this.f69719h);
        }
        if (!TextUtils.isEmpty(this.f69720i)) {
            jSONObject.put("postBody", this.f69720i);
        }
        if (!TextUtils.isEmpty(this.f69721j)) {
            jSONObject.put("adResponseBody", this.f69721j);
        }
        Object obj = this.f69722k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f69723l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77211i9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f69726o);
        }
        JSONArray jSONArray = new JSONArray();
        for (Oc.h2 h2Var : sb2.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", h2Var.f23455a);
            jSONObject2.put("latencyMillis", h2Var.f23456b);
            if (((Boolean) Oc.A.c().a(C8784lf.f77183g9)).booleanValue()) {
                jSONObject2.put("credentials", C4447y.b().k(h2Var.f23458d));
            }
            Oc.W0 w02 = h2Var.f23457c;
            jSONObject2.put("error", w02 == null ? null : f(w02));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(Oc.W0 w02) {
        if (this.f69712a.r()) {
            this.f69716e = MO.AD_LOAD_FAILED;
            this.f69718g = w02;
            if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue()) {
                this.f69712a.g(this.f69713b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.TC
    public final void J(C6702Az c6702Az) {
        if (this.f69712a.r()) {
            this.f69717f = c6702Az.c();
            this.f69716e = MO.AD_LOADED;
            if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue()) {
                this.f69712a.g(this.f69713b, this);
            }
        }
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectG;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f69716e);
        jSONObject.put("format", Z50.a(this.f69715d));
        if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f69724m);
            if (this.f69724m) {
                jSONObject.put("shown", this.f69725n);
            }
        }
        SB sb2 = this.f69717f;
        if (sb2 != null) {
            jSONObjectG = g(sb2);
        } else {
            Oc.W0 w02 = this.f69718g;
            JSONObject jSONObjectG2 = null;
            if (w02 != null && (iBinder = w02.f23350e) != null) {
                SB sb3 = (SB) iBinder;
                jSONObjectG2 = g(sb3);
                if (sb3.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.f69718g));
                    jSONObjectG2.put("errors", jSONArray);
                }
            }
            jSONObjectG = jSONObjectG2;
        }
        jSONObject.put("responseInfo", jSONObjectG);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue() || !this.f69712a.r()) {
            return;
        }
        this.f69712a.g(this.f69713b, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
        if (this.f69712a.r()) {
            if (!c8733l60.f76589b.f76176a.isEmpty()) {
                this.f69715d = ((Z50) c8733l60.f76589b.f76176a.get(0)).f72863b;
            }
            if (!TextUtils.isEmpty(c8733l60.f76589b.f76177b.f73953l)) {
                this.f69719h = c8733l60.f76589b.f76177b.f73953l;
            }
            if (!TextUtils.isEmpty(c8733l60.f76589b.f76177b.f73954m)) {
                this.f69720i = c8733l60.f76589b.f76177b.f73954m;
            }
            if (c8733l60.f76589b.f76177b.f73957p.length() > 0) {
                this.f69723l = c8733l60.f76589b.f76177b.f73957p;
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f77211i9)).booleanValue()) {
                if (!this.f69712a.t()) {
                    this.f69726o = true;
                    return;
                }
                if (!TextUtils.isEmpty(c8733l60.f76589b.f76177b.f73955n)) {
                    this.f69721j = c8733l60.f76589b.f76177b.f73955n;
                }
                if (c8733l60.f76589b.f76177b.f73956o.length() > 0) {
                    this.f69722k = c8733l60.f76589b.f76177b.f73956o;
                }
                ZO zo2 = this.f69712a;
                JSONObject jSONObject = this.f69722k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f69721j)) {
                    length += this.f69721j.length();
                }
                zo2.l(length);
            }
        }
    }
}
