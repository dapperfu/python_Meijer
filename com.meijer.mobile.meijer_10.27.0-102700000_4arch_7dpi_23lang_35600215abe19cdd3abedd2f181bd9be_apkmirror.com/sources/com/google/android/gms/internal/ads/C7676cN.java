package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7676cN implements InterfaceC10118zD, PC, InterfaceC7659cC, InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private final C9171qN f73159a;

    /* renamed from: b, reason: collision with root package name */
    private final CN f73160b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73161c;

    C7676cN(C9171qN c9171qN, CN cn2, int i10) {
        this.f73159a = c9171qN;
        this.f73160b = cn2;
        this.f73161c = i10;
    }

    private final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f73159a.c(str, String.valueOf(j10));
            }
        }
    }

    private final void c(Bundle bundle, AbstractC7917eh0 abstractC7917eh0) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(EnumC7889eN.PUBLIC_API_CALLBACK.a(), Lc.v.c().a());
        if (bundle.containsKey("ls")) {
            this.f73159a.c("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = abstractC7917eh0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7996fN c7996fN = (C7996fN) abstractC7917eh0.get(i10);
            long j10 = bundle.getLong(c7996fN.a().a(), -1L);
            long j11 = bundle.getLong(c7996fN.b().a(), -1L);
            if (j10 > 0 && j11 > 0) {
                this.f73159a.c(c7996fN.c(), String.valueOf(j11 - j10));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) Mc.A.c().a(C8659lf.f76481q7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.f73159a.c("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.f73159a.c("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
        this.f73159a.d(c8608l60);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
        this.f73159a.e(c9853wo.f79526a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(Vc.N n10) {
        String str;
        if (((Boolean) Mc.A.c().a(C8659lf.f76061M6)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76481q7)).booleanValue()) {
                this.f73159a.b().put("sgw", String.valueOf(this.f73161c));
            }
            if (n10 == null) {
                this.f73159a.b().put("action", "sgs");
                this.f73159a.b().put("request_id", "-1");
                this.f73160b.g(this.f73159a.b());
                return;
            }
            C9853wo c9853wo = n10.f37170d;
            Bundle bundle = n10.f37171e;
            if (c9853wo != null) {
                c(c9853wo.f79538m, C7996fN.f74091d);
            } else if (bundle != null && !bundle.isEmpty()) {
                c(bundle, C7996fN.f74091d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(n10.f37169c) ? n10.f37168b : n10.f37169c);
                this.f73159a.b().put("action", "sgs");
                Map mapB = this.f73159a.b();
                if (((Boolean) Mc.A.c().a(C8659lf.f75896A9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        Qc.p.e("Error retrieving JSONObject from the requestJson, ", e10);
                    }
                } else {
                    str = "na";
                }
                mapB.put("tpc", str);
                C9853wo c9853wo2 = n10.f37170d;
                if (c9853wo2 != null) {
                    this.f73159a.e(c9853wo2.f79526a);
                }
                this.f73160b.g(this.f73159a.b());
            } catch (JSONException unused) {
                this.f73159a.b().put("action", "sgf");
                this.f73159a.b().put("sgf_reason", "request_invalid");
                this.f73160b.g(this.f73159a.b());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(Mc.W0 w02) {
        this.f73159a.b().put("action", "ftl");
        this.f73159a.c("ftl", String.valueOf(w02.f19159a));
        this.f73159a.c("ed", w02.f19161c);
        if (((Boolean) Mc.A.c().a(C8659lf.f76229Y6)).booleanValue()) {
            this.f73159a.c("emsg", w02.f19160b);
        }
        this.f73160b.g(this.f73159a.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76061M6)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76481q7)).booleanValue()) {
                this.f73159a.b().put("sgw", String.valueOf(this.f73161c));
            }
            this.f73159a.b().put("action", "sgf");
            this.f73159a.c("sgf_reason", str);
            this.f73160b.g(this.f73159a.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        this.f73159a.b().put("action", "loaded");
        c(this.f73159a.a(), C7996fN.f74092e);
        if (((Boolean) Mc.A.c().a(C8659lf.f76584xc)).booleanValue()) {
            this.f73159a.b().put("mafe", true != L4.f.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.f73160b.g(this.f73159a.b());
    }
}
