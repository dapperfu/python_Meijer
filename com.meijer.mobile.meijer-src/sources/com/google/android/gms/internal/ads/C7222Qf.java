package com.google.android.gms.internal.ads;

import Xc.C5569c;
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
public final class C7222Qf {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f70445a;

    /* renamed from: b, reason: collision with root package name */
    private final Xc.l0 f70446b;

    /* renamed from: c, reason: collision with root package name */
    private final Xc.c0 f70447c;

    /* renamed from: d, reason: collision with root package name */
    private final CN f70448d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f70449e;

    /* renamed from: f, reason: collision with root package name */
    private C7120Nf f70450f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.browser.customtabs.f f70451g;

    /* renamed from: h, reason: collision with root package name */
    private String f70452h;

    /* renamed from: i, reason: collision with root package name */
    private long f70453i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f70454j;

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f70455k;

    /* renamed from: l, reason: collision with root package name */
    private Context f70456l;

    public final androidx.browser.customtabs.f b() {
        return this.f70451g;
    }

    public final void i(long j10) {
        this.f70454j = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) Oc.A.c().a(com.google.android.gms.internal.ads.C8784lf.f76876K9)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.Nf r0 = r5.f70450f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            Sc.p.d(r0)
            return
        La:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f70452h
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f70451g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f70445a
            if (r0 == 0) goto L70
            long r0 = r5.f70453i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.f r0 = Nc.v.c()
            long r0 = r0.c()
            long r2 = r5.f70453i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f76876K9
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.f r0 = r5.f70451g
            java.lang.String r1 = r5.f70452h
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.f70445a
            java.lang.Runnable r1 = r5.f70449e
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f76890L9
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            Rc.p0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7222Qf.j():void");
    }

    private final void k(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f70455k == null) {
                this.f70455k = new JSONArray((String) Oc.A.c().a(C8784lf.f76918N9));
            }
            jSONObject.put("eids", this.f70455k);
        } catch (JSONException e10) {
            Sc.p.e("Error fetching the PACT active eids JSON: ", e10);
        }
    }

    final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) C9427rg.f78891c.e()).booleanValue() ? ((Long) C9427rg.f78894f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
            jSONObject.put("as", this.f70447c.a());
        }
        return jSONObject;
    }

    final JSONObject d(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) C9427rg.f78891c.e()).booleanValue() ? ((Long) C9427rg.f78894f.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
            jSONObject.put("as", this.f70447c.a());
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
        this.f70456l = context;
        this.f70452h = str;
        C7120Nf c7120Nf = new C7120Nf(this, bVar, this.f70448d);
        this.f70450f = c7120Nf;
        androidx.browser.customtabs.f fVarE = cVar.e(c7120Nf);
        this.f70451g = fVarE;
        if (fVarE == null) {
            Sc.p.d("CustomTabsClient failed to create new session.");
        }
        C5569c.d(this.f70448d, null, "pact_action", new Pair("pe", "pact_init"));
    }

    final void h(String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f70451g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f70454j).toString());
            k(jSONObject);
            if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
                jSONObject.put("as", this.f70447c.a());
            }
            fVar.g(jSONObject.toString(), null);
            C7188Pf c7188Pf = new C7188Pf(this, str);
            if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
                this.f70446b.g(this.f70451g, c7188Pf);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            Zc.a.a(this.f70456l, Gc.b.BANNER, new c.a().b(AdMobAdapter.class, bundle).g(), c7188Pf);
        } catch (JSONException e10) {
            Sc.p.e("Error creating JSON: ", e10);
        }
    }

    public C7222Qf(ScheduledExecutorService scheduledExecutorService, Xc.l0 l0Var, Xc.c0 c0Var, CN cn2) {
        this.f70445a = scheduledExecutorService;
        this.f70446b = l0Var;
        this.f70447c = c0Var;
        this.f70448d = cn2;
    }

    final void f() {
        this.f70453i = Nc.v.c().c() + ((Integer) Oc.A.c().a(C8784lf.f76862J9)).intValue();
        if (this.f70449e == null) {
            this.f70449e = new Runnable() { // from class: com.google.android.gms.internal.ads.Of
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69967a.j();
                }
            };
        }
        j();
    }
}
