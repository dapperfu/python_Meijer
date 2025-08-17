package com.adobe.marketing.mobile.audience;

import Q5.F;
import Q5.InterfaceC5073e;
import Q5.InterfaceC5075g;
import Q5.InterfaceC5078j;
import Q5.K;
import Q5.o;
import Q5.r;
import Q5.t;
import Q5.w;
import Q5.x;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6447f;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.G;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6456o;
import f6.C13845a;
import f6.C13848d;
import f6.C13849e;
import f6.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AudienceExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name */
    private final n f62341b;

    /* renamed from: c, reason: collision with root package name */
    private F f62342c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentMap<String, G> f62343d;

    /* renamed from: e, reason: collision with root package name */
    final m f62344e;

    class a extends HashMap<String, Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f62345a;

        a(Map map) {
            this.f62345a = map;
            put("aamprofile", map);
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f62347a;

        b(boolean z10) {
            this.f62347a = z10;
            put("optedouthitsent", Boolean.valueOf(z10));
        }
    }

    private class c implements m {

        /* renamed from: a, reason: collision with root package name */
        private n f62349a;

        @Override // com.adobe.marketing.mobile.audience.m
        public void a(String str, C6449h c6449h) throws JSONException {
            if (c6449h == null) {
                t.f("Audience", "AudienceNetworkResponseHandler", "Unable to process network response, invalid request event.", new Object[0]);
                return;
            }
            if (c6449h.u() < this.f62349a.b()) {
                t.a("Audience", "AudienceNetworkResponseHandler", "Not dispatching Audience hit response since resetIdentities API was called after queuing this hit.", new Object[0]);
                AudienceExtension.this.I(c6449h);
                return;
            }
            HashMap map = new HashMap();
            if (f6.i.a(str)) {
                t.a("Audience", "AudienceNetworkResponseHandler", "Null/empty response from server, nothing to process.", new Object[0]);
                AudienceExtension.this.I(c6449h);
                AudienceExtension.this.q(map, c6449h);
            } else {
                Map mapG = AudienceExtension.this.G(str, c6449h);
                AudienceExtension.this.I(c6449h);
                if (mapG != null && !mapG.isEmpty()) {
                    AudienceExtension.this.q(mapG, null);
                }
                AudienceExtension.this.q(mapG, c6449h);
            }
        }

        c(n nVar) {
            this.f62349a = nVar;
        }
    }

    AudienceExtension(AbstractC6454m abstractC6454m) {
        this(abstractC6454m, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F(org.json.JSONObject r13, int r14) throws org.json.JSONException {
        /*
            r12 = this;
            r0 = 0
            java.lang.String r1 = "dests"
            org.json.JSONArray r13 = r13.getJSONArray(r1)     // Catch: org.json.JSONException -> L48
            r1 = r0
        L8:
            int r2 = r13.length()     // Catch: org.json.JSONException -> L48
            if (r1 >= r2) goto L47
            org.json.JSONObject r2 = r13.getJSONObject(r1)     // Catch: org.json.JSONException -> L48
            int r3 = r2.length()     // Catch: org.json.JSONException -> L48
            if (r3 != 0) goto L1a
        L18:
            r10 = r14
            goto L43
        L1a:
            java.lang.String r3 = "c"
            java.lang.String r4 = ""
            java.lang.String r6 = r2.optString(r3, r4)     // Catch: org.json.JSONException -> L48
            boolean r2 = f6.i.a(r6)     // Catch: org.json.JSONException -> L48
            if (r2 != 0) goto L18
            Q5.x r5 = new Q5.x     // Catch: org.json.JSONException -> L48
            Q5.r r7 = Q5.r.GET     // Catch: org.json.JSONException -> L48
            r8 = 0
            r9 = 0
            r11 = r14
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: org.json.JSONException -> L48
            Q5.K r14 = Q5.K.f()     // Catch: org.json.JSONException -> L48
            Q5.A r14 = r14.h()     // Catch: org.json.JSONException -> L48
            com.adobe.marketing.mobile.audience.i r2 = new com.adobe.marketing.mobile.audience.i     // Catch: org.json.JSONException -> L48
            r2.<init>()     // Catch: org.json.JSONException -> L48
            r14.a(r5, r2)     // Catch: org.json.JSONException -> L48
        L43:
            int r1 = r1 + 1
            r14 = r10
            goto L8
        L47:
            return
        L48:
            java.lang.String r13 = "No destinations ('dests') in response."
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r0 = "Audience"
            java.lang.String r1 = "AudienceExtension"
            Q5.t.e(r0, r1, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.audience.AudienceExtension.F(org.json.JSONObject, int):void");
    }

    public static /* synthetic */ void j(o oVar) {
        if (oVar == null) {
            t.e("Audience", "AudienceExtension", "processDestsArray - Failed to forward destinations because the connection is null (network is offline).", new Object[0]);
            return;
        }
        if (oVar.d() == 200) {
            t.e("Audience", "AudienceExtension", "Successfully forwarded 'dest'.", new Object[0]);
        } else {
            t.e("Audience", "AudienceExtension", "Failed to process dest - connection status \"%s\".", Integer.valueOf(oVar.d()));
        }
        oVar.close();
    }

    public static /* synthetic */ void k(o oVar) {
        if (oVar == null) {
            t.e("Audience", "AudienceExtension", "sendOptOutHit - Failed to send the opt-out hit because the connection is null (network is offline).", new Object[0]);
            return;
        }
        if (oVar.d() == 200) {
            t.e("Audience", "AudienceExtension", "Successfully sent the optOut hit.", new Object[0]);
        } else {
            t.e("Audience", "AudienceExtension", "Failed to send the optOut hit with connection status (%s).", Integer.valueOf(oVar.d()));
        }
        oVar.close();
    }

    private String r(List<Map<String, Object>> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map<String, Object> map : list) {
            if (map != null) {
                sb2.append(K("d_cid_ic", C13845a.o(map, "ID_TYPE", null)));
                String strB = f6.l.b(C13845a.o(map, "ID", null));
                if (!f6.i.a(strB)) {
                    sb2.append("%01");
                    sb2.append(strB);
                }
                sb2.append("%01");
                sb2.append(C13845a.m(map, "STATE", 0));
            }
        }
        return sb2.toString();
    }

    void E(C6449h c6449h) {
        F f10;
        t.a("Audience", "AudienceExtension", "Resetting stored Audience Manager identities and visitor profile.", new Object[0]);
        if ("com.adobe.eventType.generic.identity".equals(c6449h.w()) && (f10 = this.f62342c) != null) {
            f10.b();
        }
        this.f62341b.a();
        this.f62341b.g(c6449h.u());
        M(c6449h);
    }

    AudienceExtension(AbstractC6454m abstractC6454m, n nVar, F f10) {
        InterfaceC5073e interfaceC5073eA;
        super(abstractC6454m);
        this.f62343d = new ConcurrentHashMap();
        nVar = nVar == null ? new n() : nVar;
        this.f62341b = nVar;
        c cVar = new c(nVar);
        this.f62344e = cVar;
        if (f10 != null) {
            this.f62342c = f10;
            return;
        }
        InterfaceC5075g interfaceC5075gC = K.f().c();
        if (interfaceC5075gC == null || (interfaceC5073eA = interfaceC5075gC.a(e())) == null) {
            return;
        }
        this.f62342c = new F(interfaceC5073eA, new l(cVar));
    }

    private Map<String, String> H(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("stuff");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2 != null && jSONObject2.length() != 0) {
                    String strOptString = jSONObject2.optString("cn", "");
                    String strOptString2 = jSONObject2.optString("cv", "");
                    if (!strOptString.isEmpty()) {
                        map.put(strOptString, strOptString2);
                    }
                }
            }
            return map;
        } catch (JSONException unused) {
            t.e("Audience", "AudienceExtension", "No 'stuff' array in response.", new Object[0]);
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(C6449h c6449h) {
        G g10;
        if (c6449h == null || (g10 = this.f62343d.get(c6449h.x())) == null) {
            return;
        }
        g10.a(this.f62341b.d());
        this.f62343d.remove(c6449h.x());
    }

    private void J(Map<String, Object> map) {
        String strO = C13845a.o(map, "audience.server", null);
        String strE = this.f62341b.e();
        boolean z10 = (f6.i.a(strO) || f6.i.a(strE)) ? false : true;
        if (z10) {
            String str = v(strO) + w(strE);
            int iM = C13845a.m(map, "audience.timeout", 2);
            K.f().h().a(new x(str, r.GET, null, null, iM, iM), new w() { // from class: com.adobe.marketing.mobile.audience.j
                @Override // Q5.w
                public final void a(o oVar) {
                    AudienceExtension.k(oVar);
                }
            });
        }
        a().c(new C6449h.b("Audience Manager Opt Out Event", "com.adobe.eventType.audienceManager", "com.adobe.eventSource.responseContent").d(new b(z10)).a());
    }

    private boolean L(C6449h c6449h) {
        H hY = y("com.adobe.module.configuration", c6449h);
        if (hY != null && hY.a() == I.SET) {
            return C13845a.l(hY.b(), "analytics.aamForwardingEnabled", false);
        }
        t.e("Audience", "AudienceExtension", "Attempted to retrieve AAM configuration for server-side forwarding but shared state was not set.", new Object[0]);
        return false;
    }

    private void N(C6449h c6449h) {
        Map<String, String> mapQ;
        Map<String, Object> mapB = y("com.adobe.module.configuration", c6449h).b();
        String strO = C13845a.o(mapB, "audience.server", null);
        int iM = C13845a.m(mapB, "audience.timeout", 2);
        D dB = D.b(C13845a.o(mapB, "global.privacy", com.adobe.marketing.mobile.audience.a.f62351a.e()));
        if (f6.i.a(strO) || dB == D.OPT_OUT) {
            t.a("Audience", "AudienceExtension", "Dropping Audience hit, AAM server configuration is unavailable or privacy status is opted-out. Dispatching an empty profile.", new Object[0]);
            q(null, c6449h);
            return;
        }
        if (c6449h.u() < this.f62341b.b()) {
            t.a("Audience", "AudienceExtension", "Dropping Audience hit, resetIdentities API was called after this request.", new Object[0]);
            q(null, c6449h);
            return;
        }
        if (dB == D.UNKNOWN) {
            t.a("Audience", "AudienceExtension", "Dispatching an empty profile - privacy status is unknown.", new Object[0]);
            q(null, c6449h);
        }
        if (this.f62342c == null) {
            t.f("Audience", "AudienceExtension", "Unable to queue AAM request as Audience Database not initialized.", new Object[0]);
            return;
        }
        G gA = a().a(c6449h);
        if (gA != null) {
            this.f62343d.put(c6449h.x(), gA);
        }
        if ("com.adobe.eventType.lifecycle".equals(c6449h.w())) {
            t.a("Audience", "AudienceExtension", "Lifecycle response event found, processing context data.", new Object[0]);
            mapQ = u(C13845a.q(c6449h.o(), "lifecyclecontextdata", null));
        } else {
            Map<String, Object> mapO = c6449h.o();
            mapQ = mapO != null ? C13845a.q(mapO, "aamtraits", null) : null;
        }
        String strO2 = o(strO, mapQ, c6449h);
        t.a("Audience", "AudienceExtension", "Queuing hit for url: %s", strO2);
        if (strO2 != null) {
            this.f62342c.e(new com.adobe.marketing.mobile.audience.b(c6449h, strO2, iM).e());
        } else {
            t.f("Audience", "AudienceExtension", "submitSignal - Dropping request with event id '%s' because URL is invalid.", c6449h.x());
        }
    }

    private String o(String str, Map<String, String> map, C6449h c6449h) {
        f6.k kVarA = new f6.k().f(true).g(str).a("event");
        String strS = s(map);
        k.a aVar = k.a.NONE;
        return kVarA.b(strS, aVar).b(t(c6449h), aVar).b(x(), aVar).b("d_dst=1", aVar).b("d_rtbd=json", aVar).e();
    }

    private void p() {
        C13849e.a("ADBMobileAAM.sqlite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Map<String, String> map, C6449h c6449h) {
        a aVar = new a(map);
        a().c(c6449h != null ? new C6449h.b("Audience Manager Profile", "com.adobe.eventType.audienceManager", "com.adobe.eventSource.responseContent").d(aVar).c(c6449h).a() : new C6449h.b("Audience Manager Profile", "com.adobe.eventType.audienceManager", "com.adobe.eventSource.responseContent").d(aVar).a());
    }

    private String t(C6449h c6449h) {
        H hY = y("com.adobe.module.identity", c6449h);
        Map<String, Object> mapB = hY != null ? hY.b() : null;
        H hY2 = y("com.adobe.module.configuration", c6449h);
        Map<String, Object> mapB2 = hY2 != null ? hY2.b() : null;
        StringBuilder sb2 = new StringBuilder(1024);
        if (mapB != null) {
            String strO = C13845a.o(mapB, "mid", null);
            String strO2 = C13845a.o(mapB, "blob", null);
            String strO3 = C13845a.o(mapB, "locationhint", null);
            if (!f6.i.a(strO)) {
                sb2.append(K("d_mid", strO));
            }
            if (!f6.i.a(strO2)) {
                sb2.append(K("d_blob", strO2));
            }
            if (!f6.i.a(strO3)) {
                sb2.append(K("dcs_region", strO3));
            }
            String strR = r(C13845a.s(Object.class, mapB, "visitoridslist", null));
            if (!f6.i.a(strR)) {
                sb2.append(strR);
            }
        }
        if (mapB2 != null) {
            String strO4 = C13845a.o(mapB2, "experienceCloud.org", null);
            if (!f6.i.a(strO4)) {
                sb2.append(K("d_orgid", strO4));
            }
        }
        n nVar = this.f62341b;
        if (nVar != null) {
            String strE = nVar.e();
            if (!f6.i.a(strE)) {
                sb2.append(K("d_uuid", strE));
            }
        }
        return sb2.length() > 0 ? sb2.substring(1) : "";
    }

    private HashMap<String, String> u(Map<String, String> map) {
        HashMap<String, String> map2 = new HashMap<>();
        if (C13848d.a(map)) {
            return map2;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry<String, String> entry : com.adobe.marketing.mobile.audience.a.f62352b.entrySet()) {
            String str = map3.get(entry.getKey());
            if (!f6.i.a(str)) {
                map2.put(entry.getValue(), str);
                map3.remove(entry.getKey());
            }
        }
        map2.putAll(map3);
        return map2;
    }

    private String v(String str) {
        return String.format("https://%s/demoptout.jpg?", str);
    }

    private String w(String str) {
        return String.format("d_uuid=%s", str);
    }

    void B(C6449h c6449h) {
        HashMap map = new HashMap();
        map.put("aamprofile", this.f62341b.f());
        a().c(new C6449h.b("Audience Manager Identities", "com.adobe.eventType.audienceManager", "com.adobe.eventSource.responseIdentity").d(map).c(c6449h).a());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Audience";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.audience";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h c6449h) {
        H hY = y("com.adobe.module.configuration", c6449h);
        if ((!c6449h.w().equals("com.adobe.eventType.audienceManager") || !c6449h.t().equals("com.adobe.eventSource.requestContent")) && (!c6449h.w().equals("com.adobe.eventType.lifecycle") || !c6449h.t().equals("com.adobe.eventSource.responseContent"))) {
            return hY.a() == I.SET;
        }
        H hY2 = y("com.adobe.module.identity", c6449h);
        I iA = hY.a();
        I i10 = I.PENDING;
        return (iA == i10 || hY2.a() == i10) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> G(String str, C6449h c6449h) throws JSONException {
        if (f6.i.a(str)) {
            t.e("Audience", "AudienceExtension", "Unable to process Audience Manager server response - response was null or empty.", new Object[0]);
            return null;
        }
        H hY = y("com.adobe.module.configuration", c6449h);
        if (hY != null && hY.a() != I.PENDING) {
            int iM = C13845a.m(hY.b(), "audience.timeout", 2);
            try {
                JSONObject jSONObject = new JSONObject(str);
                F(jSONObject, iM);
                try {
                    this.f62341b.i(jSONObject.getString("uuid"));
                } catch (JSONException e10) {
                    t.a("Audience", "AudienceExtension", "Unable to retrieve UUID from Audience Manager response - %s", e10.getLocalizedMessage());
                }
                Map<String, String> mapH = H(jSONObject);
                if (mapH.size() > 0) {
                    t.e("Audience", "AudienceExtension", "Response received from server: %s", mapH);
                } else {
                    t.e("Audience", "AudienceExtension", "Response received from server was empty.", new Object[0]);
                }
                this.f62341b.j(mapH);
                return mapH;
            } catch (JSONException e11) {
                t.f("Audience", "AudienceExtension", "Failed to parse response from Audience Manager server - %s", e11.getLocalizedMessage());
                return null;
            }
        }
        t.e("Audience", "AudienceExtension", "Unable to process Audience Manager server response - configuration shared state is pending.", new Object[0]);
        return null;
    }

    private String K(String str, String str2) {
        if (!f6.i.a(str) && str2 != null) {
            return "&" + str + "=" + str2;
        }
        return null;
    }

    private void M(C6449h c6449h) {
        a().b(this.f62341b.d(), c6449h);
    }

    private String s(Map<String, String> map) {
        if (C13848d.a(map)) {
            t.a("Audience", "AudienceExtension", "No data found converting customer data for URL parameters.", new Object[0]);
            return "";
        }
        StringBuilder sb2 = new StringBuilder(1024);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!f6.i.a(key) && !f6.i.a(value)) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append("c_");
                sb2.append(f6.l.b(key.replace(".", "_")));
                sb2.append("=");
                sb2.append(f6.l.b(value));
            }
        }
        return sb2.toString();
    }

    private String x() {
        InterfaceC5078j interfaceC5078jE = K.f().e();
        String str = "java";
        if (interfaceC5078jE == null) {
            return "d_ptfm=java";
        }
        String strM = interfaceC5078jE.m();
        if (!f6.i.a(strM)) {
            str = strM;
        }
        return "d_ptfm=" + str;
    }

    private H y(String str, C6449h c6449h) {
        return a().e(str, c6449h, false, com.adobe.marketing.mobile.F.LAST_SET);
    }

    void A(C6449h c6449h) {
        N(c6449h);
    }

    void C(C6449h c6449h) {
        Map<String, Object> mapO = c6449h.o();
        D dB = D.b(C13845a.o(mapO, "global.privacy", ""));
        if (dB.equals(D.OPT_OUT)) {
            J(mapO);
        }
        this.f62341b.h(dB);
        F f10 = this.f62342c;
        if (f10 != null) {
            f10.d(dB);
        }
        M(c6449h);
    }

    void D(C6449h c6449h) {
        if (L(c6449h)) {
            t.e("Audience", "AudienceExtension", "Ignoring Lifecycle response event because AAM forwarding is enabled in configuration.", new Object[0]);
        } else if (C13848d.a(c6449h.o())) {
            t.e("Audience", "AudienceExtension", "Ignoring Lifecycle response event with absent or empty event data.", new Object[0]);
        } else {
            N(c6449h);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return C6447f.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        a().h("com.adobe.eventType.analytics", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.c
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) throws JSONException {
                this.f62356a.z(c6449h);
            }
        });
        a().h("com.adobe.eventType.audienceManager", "com.adobe.eventSource.requestContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.d
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62357a.A(c6449h);
            }
        });
        a().h("com.adobe.eventType.audienceManager", "com.adobe.eventSource.requestIdentity", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.e
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62358a.B(c6449h);
            }
        });
        a().h("com.adobe.eventType.audienceManager", "com.adobe.eventSource.requestReset", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.f
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62359a.E(c6449h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.g
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62360a.C(c6449h);
            }
        });
        a().h("com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestReset", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.f
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62359a.E(c6449h);
            }
        });
        a().h("com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.audience.h
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62361a.D(c6449h);
            }
        });
        t.e("Audience", "AudienceExtension", "Setting bootup Audience shared state.", new Object[0]);
        M(null);
        p();
    }

    void z(C6449h c6449h) throws JSONException {
        if (!L(c6449h)) {
            t.e("Audience", "AudienceExtension", "Not processing Analytics response event - AAM forwarding is disabled in configuration.", new Object[0]);
            return;
        }
        String strO = C13845a.o(c6449h.o(), "analyticsserverresponse", "");
        if (f6.i.a(strO)) {
            t.e("Audience", "AudienceExtension", "Ignoring Analytics response event - the response is null or empty.", new Object[0]);
            return;
        }
        t.e("Audience", "AudienceExtension", "AAM forwarding is enabled, handling Analytics response: %s", strO);
        G(strO, c6449h);
        M(c6449h);
    }
}
