package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7801cN implements InterfaceC10243zD, PC, InterfaceC7784cC, InterfaceC9607tG {

    /* renamed from: a, reason: collision with root package name */
    private final C9296qN f73999a;

    /* renamed from: b, reason: collision with root package name */
    private final CN f74000b;

    /* renamed from: c, reason: collision with root package name */
    private final int f74001c;

    C7801cN(C9296qN c9296qN, CN cn2, int i10) {
        this.f73999a = c9296qN;
        this.f74000b = cn2;
        this.f74001c = i10;
    }

    private final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f73999a.c(str, String.valueOf(j10));
            }
        }
    }

    private final void c(Bundle bundle, AbstractC8042eh0 abstractC8042eh0) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(EnumC8014eN.PUBLIC_API_CALLBACK.a(), Nc.v.c().a());
        if (bundle.containsKey("ls")) {
            this.f73999a.c("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = abstractC8042eh0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8121fN c8121fN = (C8121fN) abstractC8042eh0.get(i10);
            long j10 = bundle.getLong(c8121fN.a().a(), -1L);
            long j11 = bundle.getLong(c8121fN.b().a(), -1L);
            if (j10 > 0 && j11 > 0) {
                this.f73999a.c(c8121fN.c(), String.valueOf(j11 - j10));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) Oc.A.c().a(C8784lf.f77321q7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.f73999a.c("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.f73999a.c("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(Oc.W0 w02) {
        this.f73999a.b().put("action", "ftl");
        this.f73999a.c("ftl", String.valueOf(w02.f23346a));
        this.f73999a.c("ed", w02.f23348c);
        if (((Boolean) Oc.A.c().a(C8784lf.f77069Y6)).booleanValue()) {
            this.f73999a.c("emsg", w02.f23347b);
        }
        this.f74000b.g(this.f73999a.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void a(Xc.N n10) {
        String str;
        if (((Boolean) Oc.A.c().a(C8784lf.f76901M6)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77321q7)).booleanValue()) {
                this.f73999a.b().put("sgw", String.valueOf(this.f74001c));
            }
            if (n10 == null) {
                this.f73999a.b().put("action", "sgs");
                this.f73999a.b().put("request_id", "-1");
                this.f74000b.g(this.f73999a.b());
                return;
            }
            C9978wo c9978wo = n10.f41882d;
            Bundle bundle = n10.f41883e;
            if (c9978wo != null) {
                c(c9978wo.f80378m, C8121fN.f74931d);
            } else if (bundle != null && !bundle.isEmpty()) {
                c(bundle, C8121fN.f74931d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(n10.f41881c) ? n10.f41880b : n10.f41881c);
                this.f73999a.b().put("action", "sgs");
                Map mapB = this.f73999a.b();
                if (((Boolean) Oc.A.c().a(C8784lf.f76736A9)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        Sc.p.e("Error retrieving JSONObject from the requestJson, ", e10);
                    }
                } else {
                    str = "na";
                }
                mapB.put("tpc", str);
                C9978wo c9978wo2 = n10.f41882d;
                if (c9978wo2 != null) {
                    this.f73999a.e(c9978wo2.f80366a);
                }
                this.f74000b.g(this.f73999a.b());
            } catch (JSONException unused) {
                this.f73999a.b().put("action", "sgf");
                this.f73999a.b().put("sgf_reason", "request_invalid");
                this.f74000b.g(this.f73999a.b());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
        this.f73999a.e(c9978wo.f80366a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void i(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76901M6)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77321q7)).booleanValue()) {
                this.f73999a.b().put("sgw", String.valueOf(this.f74001c));
            }
            this.f73999a.b().put("action", "sgf");
            this.f73999a.c("sgf_reason", str);
            this.f74000b.g(this.f73999a.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
        this.f73999a.d(c8733l60);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        this.f73999a.b().put("action", "loaded");
        c(this.f73999a.a(), C8121fN.f74932e);
        if (((Boolean) Oc.A.c().a(C8784lf.f77424xc)).booleanValue()) {
            this.f73999a.b().put("mafe", true != M4.f.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.f74000b.g(this.f73999a.b());
    }
}
