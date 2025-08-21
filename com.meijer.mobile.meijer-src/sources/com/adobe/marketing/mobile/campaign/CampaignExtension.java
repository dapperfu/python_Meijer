package com.adobe.marketing.mobile.campaign;

import N5.RuleConsequence;
import O5.a;
import R5.C5117d;
import R5.F;
import R5.InterfaceC5121h;
import R5.K;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6573g;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6581o;
import g6.C14328a;
import g6.C14331d;
import g6.C14334g;
import io.constructor.data.local.PreferencesHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CampaignExtension extends AbstractC6578l {

    /* renamed from: b, reason: collision with root package name */
    private final String f63222b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6579m f63223c;

    /* renamed from: d, reason: collision with root package name */
    private final F f63224d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.k f63225e;

    /* renamed from: f, reason: collision with root package name */
    private final S5.d f63226f;

    /* renamed from: g, reason: collision with root package name */
    private final q f63227g;

    /* renamed from: h, reason: collision with root package name */
    private final r f63228h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC5121h f63229i;

    /* renamed from: j, reason: collision with root package name */
    private String f63230j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f63231k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f63232l;

    public CampaignExtension(AbstractC6579m abstractC6579m) throws SecurityException {
        super(abstractC6579m);
        this.f63222b = "CampaignExtension";
        this.f63231k = false;
        this.f63232l = true;
        this.f63223c = abstractC6579m;
        this.f63229i = K.f().d();
        x(s());
        N5.k kVar = new N5.k("com.adobe.module.campaign.rulesengine", abstractC6579m);
        this.f63225e = kVar;
        S5.d dVarB = K.f().b();
        this.f63226f = dVarB;
        this.f63227g = new q(abstractC6579m, kVar, s(), dVarB);
        this.f63224d = new F(K.f().c().a("com.adobe.module.campaign"), new k());
        this.f63228h = new r();
    }

    void B() {
        R5.t.e("Campaign", "CampaignExtension", "processPrivacyOptOut -  Clearing out cached data.", new Object[0]);
        this.f63230j = "";
        this.f63225e.c(null);
        n();
        m();
    }

    void t(C6574h c6574h) {
        if (c6574h == null) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        if (c6574h.t().equals("com.adobe.eventSource.requestReset")) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Resetting linkage fields.", new Object[0]);
            u();
            return;
        }
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || mapO.isEmpty()) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Ignoring event with null or empty EventData.", new Object[0]);
            return;
        }
        Map<String, String> mapQ = C14328a.q(mapO, "linkagefields", null);
        if (mapQ == null || mapQ.isEmpty()) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Unable to set linkage fields, received linkage fields are null or empty.", new Object[0]);
            return;
        }
        String string = new JSONObject(mapQ).toString();
        if (g6.i.a(string)) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Cannot set linkage fields, linkageFields JSON string is null or empty.", new Object[0]);
            return;
        }
        String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
        this.f63230j = strEncodeToString;
        if (g6.i.a(strEncodeToString)) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Cannot set linkage fields, base64 encoded linkage fields string is empty.", new Object[0]);
        } else if (!this.f63228h.a()) {
            R5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Campaign extension is not configured to download campaign rules.", new Object[0]);
        } else {
            n();
            F();
        }
    }

    void z(C6574h c6574h) {
        if (c6574h == null) {
            R5.t.a("Campaign", "CampaignExtension", "processLifecycleUpdate - Unable to process event, event received is null.", new Object[0]);
        } else if (this.f63228h.b()) {
            C(k(this.f63228h.h(), this.f63228h.e(), this.f63228h.j()), j("gcm", this.f63228h.j(), new HashMap()), this.f63228h, c6574h);
        } else {
            R5.t.a("Campaign", "CampaignExtension", "processLifecycleUpdate -  Campaign extension is not configured to send registration request.", new Object[0]);
        }
    }

    private String j(String str, String str2, Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        map2.put("pushPlatform", str);
        map2.put("marketingCloudId", str2);
        return new JSONObject(map2).toString();
    }

    private String k(String str, String str2, String str3) {
        return String.format("https://%s/rest/head/mobileAppV5/%s/subscriptions/%s", str, str2, str3);
    }

    private String l(String str, String str2, String str3, String str4, String str5) {
        return String.format("https://%s/r/?id=%s,%s,%s&mcId=%s", str, str2, str3, str4, str5);
    }

    private R5.v s() {
        return this.f63229i.a("CampaignCollection");
    }

    private void u() {
        this.f63230j = "";
        this.f63225e.c(new ArrayList());
        n();
        F();
    }

    private void x(R5.v vVar) throws SecurityException {
        if (vVar == null) {
            R5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, provided datastore is null.", new Object[0]);
            return;
        }
        Context applicationContext = B.h().getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext != null ? applicationContext.getSharedPreferences("CampaignDataStore", 0) : null;
        if (sharedPreferences == null) {
            R5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, shared preferences are null.", new Object[0]);
            return;
        }
        if (sharedPreferences.getAll().isEmpty()) {
            R5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, existing shared preferences not found.", new Object[0]);
            return;
        }
        R5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Campaign preferences found, migrating existing shared preferences.", new Object[0]);
        vVar.d("ExperienceCloudId", sharedPreferences.getString("ExperienceCloudId", ""));
        vVar.d("CampaignRemoteUrl", sharedPreferences.getString("CampaignRemoteUrl", ""));
        vVar.b("CampaignRegistrationTimestamp", sharedPreferences.getLong("CampaignRegistrationTimestamp", -1L));
        File fileW = K.f().e().w();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileW.getPath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("shared_prefs");
        sb2.append(str);
        sb2.append("CampaignDataStore");
        sb2.append(".xml");
        File file = new File(sb2.toString());
        if (file.exists()) {
            R5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Deleting migrated shared preferences file (%s).", file.getName());
            s.b(file, false);
        }
    }

    void A(C6574h c6574h) {
        if (!this.f63228h.c()) {
            R5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Campaign extension is not configured to send message track request.", new Object[0]);
            return;
        }
        if (c6574h == null) {
            R5.t.a("Campaign", "CampaignExtension", "processMessageInformation - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || mapO.isEmpty()) {
            R5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Cannot send message track request, eventData is null.", new Object[0]);
            return;
        }
        String strO = C14328a.o(mapO, "broadlogId", "");
        String strO2 = C14328a.o(mapO, "deliveryId", "");
        String strO3 = C14328a.o(mapO, "action", "");
        if (g6.i.a(strO) || g6.i.a(strO2) || g6.i.a(strO3)) {
            R5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Cannot send message track request, %s %s %s null or empty.", g6.i.a(strO) ? "broadlogId" : "", g6.i.a(strO2) ? "deliveryId" : "", g6.i.a(strO3) ? "action" : "");
        } else {
            o(strO3, strO2);
            C(l(this.f63228h.h(), strO, strO2, strO3, this.f63228h.j()), "", this.f63228h, c6574h);
        }
    }

    void F() {
        this.f63227g.i(String.format("https://%s/%s/%s/%s/rules.zip", this.f63228h.d(), this.f63228h.h(), this.f63228h.l(), this.f63228h.j()), r());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "Campaign";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.campaign";
    }

    void n() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o());
        String str = File.separator;
        sb2.append(str);
        sb2.append("aepsdkcache");
        sb2.append(str);
        sb2.append("campaign");
        sb2.append(str);
        sb2.append("campaignRules");
        x.b(new File(sb2.toString()));
    }

    void o(String str, String str2) {
        String str3 = "2".equals(str) ? "a.message.clicked" : "1".equals(str) ? "a.message.viewed" : null;
        if (str3 == null) {
            R5.t.e("Campaign", "CampaignExtension", "dispatchMessageEvent -  Action received is other than viewed or clicked, so cannot dispatch Campaign response. ", new Object[0]);
            return;
        }
        HashMap map = new HashMap(2);
        map.put("a.message.id", String.valueOf(Integer.parseInt(str2, 16)));
        map.put(str3, String.valueOf(1));
        q(map);
    }

    void p(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("broadlogId", str);
        map.put("deliveryId", str2);
        map.put("action", str3);
        this.f63223c.c(new C6574h.b("InternalGenericDataEvent", "com.adobe.eventType.generic.data", "com.adobe.eventSource.os").d(map).a());
    }

    void q(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            R5.t.a("Campaign", "CampaignExtension", "dispatchMessageInteraction -  Cannot dispatch Campaign response event, message interaction data is null or empty.", new Object[0]);
        } else {
            this.f63223c.c(new C6574h.b("DataForMessageRequest", "com.adobe.eventType.campaign", "com.adobe.eventSource.responseContent").d(map).a());
        }
    }

    String r() {
        return this.f63230j;
    }

    void w(C6574h c6574h) {
        this.f63225e.b(c6574h);
    }

    void y(C6574h c6574h) {
        if (c6574h == null) {
            R5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || mapO.isEmpty()) {
            R5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse - Configuration response event is null", new Object[0]);
            return;
        }
        D(c6574h);
        if (!this.f63231k) {
            S5.d dVar = this.f63226f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("campaign");
            String str = File.separator;
            sb2.append(str);
            sb2.append("campaignRules");
            if (dVar.a(sb2.toString(), "campaign_rules.zip") != null) {
                S5.c cVarA = this.f63226f.a("campaign" + str + "campaignRules", "rules.json");
                if (cVarA != null) {
                    this.f63227g.k(new O5.a(C14334g.a(cVarA.getData()), a.EnumC0380a.SUCCESS));
                    this.f63231k = true;
                }
            }
        }
        D dK = this.f63228h.k();
        this.f63224d.d(dK);
        if (dK.equals(D.OPT_OUT)) {
            B();
            return;
        }
        if (this.f63232l && this.f63228h.a()) {
            this.f63232l = false;
            F();
        } else {
            R5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse -  Campaign extension is not configured to download campaign rules.", new Object[0]);
            this.f63232l = true;
        }
    }

    private void C(String str, String str2, r rVar, C6574h c6574h) {
        if (!g6.i.a(str2) && !E(rVar, c6574h.u())) {
            return;
        }
        C5117d c5117d = new C5117d(new i(str, str2, rVar.i()).toString());
        R5.t.a("Campaign", "CampaignExtension", "processRequest - Campaign Request Queued with url (%s) and body (%s)", str, str2);
        this.f63224d.e(c5117d);
    }

    private boolean E(r rVar, long j10) {
        if (rVar.g()) {
            R5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest -  Registration requests are paused.", new Object[0]);
            return false;
        }
        R5.v vVarS = s();
        String string = vVarS.getString("ExperienceCloudId", "");
        String strJ = rVar.j();
        long j11 = vVarS.getLong("CampaignRegistrationTimestamp", -1L);
        int iF = rVar.f();
        long millis = TimeUnit.DAYS.toMillis(iF);
        if (!string.equals(strJ)) {
            R5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest - The current ecid (%s) is new, sending the registration request.", strJ);
            G(strJ);
            return true;
        }
        if (j10 - j11 >= millis) {
            R5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest -  Registration delay of (%d) days has elapsed. Sending the Campaign registration request.", Integer.valueOf(iF));
            return true;
        }
        R5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest - The registration request will not be sent because the registration delay of (%d) days has not elapsed.", Integer.valueOf(iF));
        return false;
    }

    private void G(String str) {
        R5.v vVarS = s();
        if (vVarS == null) {
            R5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection - Campaign Named Collection is null, cannot store ecid.", new Object[0]);
        } else if (g6.i.a(str)) {
            R5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection -  Removing experience cloud id key in Campaign Named Collection.", new Object[0]);
            vVarS.remove("ExperienceCloudId");
        } else {
            R5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection -  Persisting experience cloud id (%s) in Campaign Named Collection.", str);
            vVarS.d("ExperienceCloudId", str);
        }
    }

    private void m() {
        R5.v vVarS = s();
        if (vVarS == null) {
            R5.t.a("Campaign", "CampaignExtension", "clearCampaignNamedCollection -  Campaign Named Collection is not available to be cleared.", new Object[0]);
        } else {
            vVarS.g();
        }
    }

    void D(C6574h c6574h) {
        AbstractC6579m abstractC6579mA = a();
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.LAST_SET;
        this.f63228h.o(abstractC6579mA.e("com.adobe.module.configuration", c6574h, false, f10), a().e("com.adobe.module.identity", c6574h, false, f10));
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return C6573g.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        R5.t.a("Campaign", "CampaignExtension", "Registered Campaign extension - version %s", f());
        a().h("com.adobe.eventType.campaign", "com.adobe.eventSource.requestIdentity", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63241a.t(c6574h);
            }
        });
        a().h("com.adobe.eventType.campaign", "com.adobe.eventSource.requestReset", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63241a.t(c6574h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.d
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63242a.y(c6574h);
            }
        });
        a().h("com.adobe.eventType.generic.data", "com.adobe.eventSource.os", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.e
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63243a.A(c6574h);
            }
        });
        a().h("com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.f
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63244a.z(c6574h);
            }
        });
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.g
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63245a.w(c6574h);
            }
        });
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.campaign.h
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63246a.v(c6574h);
            }
        });
        s.a("ADBMobileCampaign.sqlite");
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    public boolean i(C6574h c6574h) {
        if (C14328a.o(c6574h.o(), "stateowner", "").equals("com.adobe.module.identity")) {
            D(c6574h);
            if (this.f63232l && this.f63228h.a()) {
                this.f63232l = false;
                F();
            }
        }
        AbstractC6579m abstractC6579mA = a();
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.ANY;
        H hE = abstractC6579mA.e("com.adobe.module.configuration", c6574h, false, f10);
        H hE2 = a().e("com.adobe.module.identity", c6574h, false, f10);
        if (hE != null) {
            I iA = hE.a();
            I i10 = I.SET;
            if (iA == i10 && hE2 != null && hE2.a() == i10) {
                return true;
            }
        }
        return false;
    }

    void v(C6574h c6574h) {
        if (!x.g(c6574h)) {
            return;
        }
        Map mapT = C14328a.t(Object.class, c6574h.o(), "triggeredconsequence", null);
        if (C14331d.a(mapT)) {
            R5.t.e("Campaign", "CampaignExtension", "handleRulesResponseEvents - null or empty consequences found. Will not handle rules response event.", new Object[0]);
            return;
        }
        String strO = C14328a.o(mapT, PreferencesHelper.PREF_ID, "");
        String strO2 = C14328a.o(mapT, "type", "");
        Map mapT2 = C14328a.t(Object.class, mapT, "detail", null);
        if (C14331d.a(mapT2)) {
            R5.t.e("Campaign", "CampaignExtension", "handleRulesResponseEvents - null or empty consequence details found. Will not handle rules response event.", new Object[0]);
            return;
        }
        try {
            l lVarE = l.e(this, new RuleConsequence(strO, strO2, mapT2));
            if (lVarE == null) {
                R5.t.b("Campaign", "CampaignExtension", "handleRulesResponseEvents -  Campaign message creation failed.", new Object[0]);
            } else {
                lVarE.h();
            }
        } catch (o e10) {
            R5.t.b("Campaign", "CampaignExtension", "handleRulesResponseEvents -  Error reading message definition: \n %s", e10);
        }
    }

    CampaignExtension(AbstractC6579m abstractC6579m, F f10, InterfaceC5121h interfaceC5121h, N5.k kVar, r rVar, S5.d dVar, q qVar) {
        super(abstractC6579m);
        this.f63222b = "CampaignExtension";
        this.f63231k = false;
        this.f63232l = true;
        this.f63223c = abstractC6579m;
        this.f63229i = interfaceC5121h;
        this.f63225e = kVar;
        this.f63226f = dVar;
        this.f63227g = qVar;
        this.f63224d = f10;
        this.f63228h = rVar;
    }
}
