package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class NO implements InterfaceC7659cC, InterfaceC10118zD, TC {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f68872a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68873b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68874c;

    /* renamed from: f, reason: collision with root package name */
    private SB f68877f;

    /* renamed from: g, reason: collision with root package name */
    private Mc.W0 f68878g;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f68882k;

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f68883l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f68884m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f68885n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68886o;

    /* renamed from: h, reason: collision with root package name */
    private String f68879h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f68880i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f68881j = "";

    /* renamed from: d, reason: collision with root package name */
    private int f68875d = 0;

    /* renamed from: e, reason: collision with root package name */
    private MO f68876e = MO.AD_REQUESTED;

    NO(ZO zo2, C9570u60 c9570u60, String str) {
        this.f68872a = zo2;
        this.f68874c = str;
        this.f68873b = c9570u60.f78740f;
    }

    public final String a() {
        return this.f68874c;
    }

    public final void c() {
        this.f68884m = true;
    }

    public final void d() {
        this.f68885n = true;
    }

    public final boolean e() {
        return this.f68876e != MO.AD_REQUESTED;
    }

    private static JSONObject f(Mc.W0 w02) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", w02.f19161c);
        jSONObject.put("errorCode", w02.f19159a);
        jSONObject.put("errorDescription", w02.f19160b);
        Mc.W0 w03 = w02.f19162d;
        jSONObject.put("underlyingError", w03 == null ? null : f(w03));
        return jSONObject;
    }

    private final JSONObject g(SB sb2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", sb2.zzg());
        jSONObject.put("responseSecsSinceEpoch", sb2.zzc());
        jSONObject.put("responseId", sb2.zzi());
        if (((Boolean) Mc.A.c().a(C8659lf.f76329f9)).booleanValue()) {
            String strZzd = sb2.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                Qc.p.b("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.f68879h)) {
            jSONObject.put("adRequestUrl", this.f68879h);
        }
        if (!TextUtils.isEmpty(this.f68880i)) {
            jSONObject.put("postBody", this.f68880i);
        }
        if (!TextUtils.isEmpty(this.f68881j)) {
            jSONObject.put("adResponseBody", this.f68881j);
        }
        Object obj = this.f68882k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f68883l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76371i9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f68886o);
        }
        JSONArray jSONArray = new JSONArray();
        for (Mc.h2 h2Var : sb2.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", h2Var.f19268a);
            jSONObject2.put("latencyMillis", h2Var.f19269b);
            if (((Boolean) Mc.A.c().a(C8659lf.f76343g9)).booleanValue()) {
                jSONObject2.put("credentials", C4169y.b().k(h2Var.f19271d));
            }
            Mc.W0 w02 = h2Var.f19270c;
            jSONObject2.put("error", w02 == null ? null : f(w02));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
        if (this.f68872a.r()) {
            if (!c8608l60.f75749b.f75336a.isEmpty()) {
                this.f68875d = ((Z50) c8608l60.f75749b.f75336a.get(0)).f72023b;
            }
            if (!TextUtils.isEmpty(c8608l60.f75749b.f75337b.f73113l)) {
                this.f68879h = c8608l60.f75749b.f75337b.f73113l;
            }
            if (!TextUtils.isEmpty(c8608l60.f75749b.f75337b.f73114m)) {
                this.f68880i = c8608l60.f75749b.f75337b.f73114m;
            }
            if (c8608l60.f75749b.f75337b.f73117p.length() > 0) {
                this.f68883l = c8608l60.f75749b.f75337b.f73117p;
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f76371i9)).booleanValue()) {
                if (!this.f68872a.t()) {
                    this.f68886o = true;
                    return;
                }
                if (!TextUtils.isEmpty(c8608l60.f75749b.f75337b.f73115n)) {
                    this.f68881j = c8608l60.f75749b.f75337b.f73115n;
                }
                if (c8608l60.f75749b.f75337b.f73116o.length() > 0) {
                    this.f68882k = c8608l60.f75749b.f75337b.f73116o;
                }
                ZO zo2 = this.f68872a;
                JSONObject jSONObject = this.f68882k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f68881j)) {
                    length += this.f68881j.length();
                }
                zo2.l(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.TC
    public final void C(C6577Az c6577Az) {
        if (this.f68872a.r()) {
            this.f68877f = c6577Az.c();
            this.f68876e = MO.AD_LOADED;
            if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue()) {
                this.f68872a.g(this.f68873b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue() || !this.f68872a.r()) {
            return;
        }
        this.f68872a.g(this.f68873b, this);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectG;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f68876e);
        jSONObject.put("format", Z50.a(this.f68875d));
        if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f68884m);
            if (this.f68884m) {
                jSONObject.put("shown", this.f68885n);
            }
        }
        SB sb2 = this.f68877f;
        if (sb2 != null) {
            jSONObjectG = g(sb2);
        } else {
            Mc.W0 w02 = this.f68878g;
            JSONObject jSONObjectG2 = null;
            if (w02 != null && (iBinder = w02.f19163e) != null) {
                SB sb3 = (SB) iBinder;
                jSONObjectG2 = g(sb3);
                if (sb3.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.f68878g));
                    jSONObjectG2.put("errors", jSONArray);
                }
            }
            jSONObjectG = jSONObjectG2;
        }
        jSONObject.put("responseInfo", jSONObjectG);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(Mc.W0 w02) {
        if (this.f68872a.r()) {
            this.f68876e = MO.AD_LOAD_FAILED;
            this.f68878g = w02;
            if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue()) {
                this.f68872a.g(this.f68873b, this);
            }
        }
    }
}
