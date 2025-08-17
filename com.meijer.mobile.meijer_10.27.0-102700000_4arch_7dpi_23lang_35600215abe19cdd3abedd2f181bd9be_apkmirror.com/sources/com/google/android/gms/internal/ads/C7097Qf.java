package com.google.android.gms.internal.ads;

import Vc.C5366c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.c;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7097Qf {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f69605a;

    /* renamed from: b, reason: collision with root package name */
    private final Vc.l0 f69606b;

    /* renamed from: c, reason: collision with root package name */
    private final Vc.c0 f69607c;

    /* renamed from: d, reason: collision with root package name */
    private final CN f69608d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f69609e;

    /* renamed from: f, reason: collision with root package name */
    private C6995Nf f69610f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.browser.customtabs.f f69611g;

    /* renamed from: h, reason: collision with root package name */
    private String f69612h;

    /* renamed from: i, reason: collision with root package name */
    private long f69613i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f69614j;

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f69615k;

    /* renamed from: l, reason: collision with root package name */
    private Context f69616l;

    public final androidx.browser.customtabs.f b() {
        return this.f69611g;
    }

    public final void i(long j10) {
        this.f69614j = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) Mc.A.c().a(com.google.android.gms.internal.ads.C8659lf.f76036K9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Nf r0 = r5.f69610f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            Qc.p.d(r0)
            return
        La:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f69612h
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f69611g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f69605a
            if (r0 == 0) goto L70
            long r0 = r5.f69613i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.f r0 = Lc.v.c()
            long r0 = r0.c()
            long r2 = r5.f69613i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76036K9
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.f r0 = r5.f69611g
            java.lang.String r1 = r5.f69612h
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.f69605a
            java.lang.Runnable r1 = r5.f69609e
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76050L9
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            Pc.p0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7097Qf.j():void");
    }

    private final void k(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f69615k == null) {
                this.f69615k = new JSONArray((String) Mc.A.c().a(C8659lf.f76078N9));
            }
            jSONObject.put("eids", this.f69615k);
        } catch (JSONException e10) {
            Qc.p.e("Error fetching the PACT active eids JSON: ", e10);
        }
    }

    final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) C9302rg.f78051c.e()).booleanValue() ? ((Long) C9302rg.f78054f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
            jSONObject.put("as", this.f69607c.a());
        }
        return jSONObject;
    }

    final JSONObject d(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) C9302rg.f78051c.e()).booleanValue() ? ((Long) C9302rg.f78054f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
            jSONObject.put("as", this.f69607c.a());
        }
        return jSONObject;
    }

    public final void g(Context context, androidx.browser.customtabs.c cVar, String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f69616l = context;
        this.f69612h = str;
        C6995Nf c6995Nf = new C6995Nf(this, bVar, this.f69608d);
        this.f69610f = c6995Nf;
        androidx.browser.customtabs.f fVarE = cVar.e(c6995Nf);
        this.f69611g = fVarE;
        if (fVarE == null) {
            Qc.p.d("CustomTabsClient failed to create new session.");
        }
        C5366c.d(this.f69608d, null, "pact_action", new Pair("pe", "pact_init"));
    }

    final void h(String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f69611g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f69614j).toString());
            k(jSONObject);
            if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
                jSONObject.put("as", this.f69607c.a());
            }
            fVar.g(jSONObject.toString(), null);
            C7063Pf c7063Pf = new C7063Pf(this, str);
            if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
                this.f69606b.g(this.f69611g, c7063Pf);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            Xc.a.a(this.f69616l, Ec.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), c7063Pf);
        } catch (JSONException e10) {
            Qc.p.e("Error creating JSON: ", e10);
        }
    }

    public C7097Qf(ScheduledExecutorService scheduledExecutorService, Vc.l0 l0Var, Vc.c0 c0Var, CN cn2) {
        this.f69605a = scheduledExecutorService;
        this.f69606b = l0Var;
        this.f69607c = c0Var;
        this.f69608d = cn2;
    }

    final void f() {
        this.f69613i = Lc.v.c().c() + ((Integer) Mc.A.c().a(C8659lf.f76022J9)).intValue();
        if (this.f69609e == null) {
            this.f69609e = new Runnable() { // from class: com.google.android.gms.internal.ads.Of
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69127a.j();
                }
            };
        }
        j();
    }
}
