package com.adobe.marketing.mobile.campaign;

import M5.RuleConsequence;
import N5.a;
import Q5.C5072d;
import Q5.F;
import Q5.InterfaceC5076h;
import Q5.K;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6448g;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6456o;
import f6.C13845a;
import f6.C13848d;
import f6.C13851g;
import io.constructor.data.local.PreferencesHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CampaignExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name */
    private final String f62383b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6454m f62384c;

    /* renamed from: d, reason: collision with root package name */
    private final F f62385d;

    /* renamed from: e, reason: collision with root package name */
    private final M5.k f62386e;

    /* renamed from: f, reason: collision with root package name */
    private final R5.d f62387f;

    /* renamed from: g, reason: collision with root package name */
    private final q f62388g;

    /* renamed from: h, reason: collision with root package name */
    private final r f62389h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC5076h f62390i;

    /* renamed from: j, reason: collision with root package name */
    private String f62391j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f62392k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f62393l;

    public CampaignExtension(AbstractC6454m abstractC6454m) throws SecurityException {
        super(abstractC6454m);
        this.f62383b = "CampaignExtension";
        this.f62392k = false;
        this.f62393l = true;
        this.f62384c = abstractC6454m;
        this.f62390i = K.f().d();
        x(s());
        M5.k kVar = new M5.k("com.adobe.module.campaign.rulesengine", abstractC6454m);
        this.f62386e = kVar;
        R5.d dVarB = K.f().b();
        this.f62387f = dVarB;
        this.f62388g = new q(abstractC6454m, kVar, s(), dVarB);
        this.f62385d = new F(K.f().c().a("com.adobe.module.campaign"), new k());
        this.f62389h = new r();
    }

    void B() {
        Q5.t.e("Campaign", "CampaignExtension", "processPrivacyOptOut -  Clearing out cached data.", new Object[0]);
        this.f62391j = "";
        this.f62386e.c(null);
        n();
        m();
    }

    void t(C6449h c6449h) {
        if (c6449h == null) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        if (c6449h.t().equals("com.adobe.eventSource.requestReset")) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Resetting linkage fields.", new Object[0]);
            u();
            return;
        }
        Map<String, Object> mapO = c6449h.o();
        if (mapO == null || mapO.isEmpty()) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Ignoring event with null or empty EventData.", new Object[0]);
            return;
        }
        Map<String, String> mapQ = C13845a.q(mapO, "linkagefields", null);
        if (mapQ == null || mapQ.isEmpty()) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent - Unable to set linkage fields, received linkage fields are null or empty.", new Object[0]);
            return;
        }
        String string = new JSONObject(mapQ).toString();
        if (f6.i.a(string)) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Cannot set linkage fields, linkageFields JSON string is null or empty.", new Object[0]);
            return;
        }
        String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
        this.f62391j = strEncodeToString;
        if (f6.i.a(strEncodeToString)) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Cannot set linkage fields, base64 encoded linkage fields string is empty.", new Object[0]);
        } else if (!this.f62389h.a()) {
            Q5.t.a("Campaign", "CampaignExtension", "handleLinkageFieldsEvent -  Campaign extension is not configured to download campaign rules.", new Object[0]);
        } else {
            n();
            F();
        }
    }

    void z(C6449h c6449h) {
        if (c6449h == null) {
            Q5.t.a("Campaign", "CampaignExtension", "processLifecycleUpdate - Unable to process event, event received is null.", new Object[0]);
        } else if (this.f62389h.b()) {
            C(k(this.f62389h.h(), this.f62389h.e(), this.f62389h.j()), j("gcm", this.f62389h.j(), new HashMap()), this.f62389h, c6449h);
        } else {
            Q5.t.a("Campaign", "CampaignExtension", "processLifecycleUpdate -  Campaign extension is not configured to send registration request.", new Object[0]);
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

    private Q5.v s() {
        return this.f62390i.a("CampaignCollection");
    }

    private void u() {
        this.f62391j = "";
        this.f62386e.c(new ArrayList());
        n();
        F();
    }

    private void x(Q5.v vVar) throws SecurityException {
        if (vVar == null) {
            Q5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, provided datastore is null.", new Object[0]);
            return;
        }
        Context applicationContext = B.h().getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext != null ? applicationContext.getSharedPreferences("CampaignDataStore", 0) : null;
        if (sharedPreferences == null) {
            Q5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, shared preferences are null.", new Object[0]);
            return;
        }
        if (sharedPreferences.getAll().isEmpty()) {
            Q5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Will not perform migration, existing shared preferences not found.", new Object[0]);
            return;
        }
        Q5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Campaign preferences found, migrating existing shared preferences.", new Object[0]);
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
            Q5.t.e("Campaign", "CampaignExtension", "migrateFromACPCampaign - Deleting migrated shared preferences file (%s).", file.getName());
            s.b(file, false);
        }
    }

    void A(C6449h c6449h) {
        if (!this.f62389h.c()) {
            Q5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Campaign extension is not configured to send message track request.", new Object[0]);
            return;
        }
        if (c6449h == null) {
            Q5.t.a("Campaign", "CampaignExtension", "processMessageInformation - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6449h.o();
        if (mapO == null || mapO.isEmpty()) {
            Q5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Cannot send message track request, eventData is null.", new Object[0]);
            return;
        }
        String strO = C13845a.o(mapO, "broadlogId", "");
        String strO2 = C13845a.o(mapO, "deliveryId", "");
        String strO3 = C13845a.o(mapO, "action", "");
        if (f6.i.a(strO) || f6.i.a(strO2) || f6.i.a(strO3)) {
            Q5.t.a("Campaign", "CampaignExtension", "processMessageInformation -  Cannot send message track request, %s %s %s null or empty.", f6.i.a(strO) ? "broadlogId" : "", f6.i.a(strO2) ? "deliveryId" : "", f6.i.a(strO3) ? "action" : "");
        } else {
            o(strO3, strO2);
            C(l(this.f62389h.h(), strO, strO2, strO3, this.f62389h.j()), "", this.f62389h, c6449h);
        }
    }

    void F() {
        this.f62388g.i(String.format("https://%s/%s/%s/%s/rules.zip", this.f62389h.d(), this.f62389h.h(), this.f62389h.l(), this.f62389h.j()), r());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Campaign";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
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
            Q5.t.e("Campaign", "CampaignExtension", "dispatchMessageEvent -  Action received is other than viewed or clicked, so cannot dispatch Campaign response. ", new Object[0]);
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
        this.f62384c.c(new C6449h.b("InternalGenericDataEvent", "com.adobe.eventType.generic.data", "com.adobe.eventSource.os").d(map).a());
    }

    void q(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            Q5.t.a("Campaign", "CampaignExtension", "dispatchMessageInteraction -  Cannot dispatch Campaign response event, message interaction data is null or empty.", new Object[0]);
        } else {
            this.f62384c.c(new C6449h.b("DataForMessageRequest", "com.adobe.eventType.campaign", "com.adobe.eventSource.responseContent").d(map).a());
        }
    }

    String r() {
        return this.f62391j;
    }

    void w(C6449h c6449h) {
        this.f62386e.b(c6449h);
    }

    void y(C6449h c6449h) {
        if (c6449h == null) {
            Q5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse - Unable to process event, event received is null.", new Object[0]);
            return;
        }
        Map<String, Object> mapO = c6449h.o();
        if (mapO == null || mapO.isEmpty()) {
            Q5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse - Configuration response event is null", new Object[0]);
            return;
        }
        D(c6449h);
        if (!this.f62392k) {
            R5.d dVar = this.f62387f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("campaign");
            String str = File.separator;
            sb2.append(str);
            sb2.append("campaignRules");
            if (dVar.b(sb2.toString(), "campaign_rules.zip") != null) {
                R5.c cVarB = this.f62387f.b("campaign" + str + "campaignRules", "rules.json");
                if (cVarB != null) {
                    this.f62388g.k(new N5.a(C13851g.a(cVarB.getData()), a.EnumC0338a.SUCCESS));
                    this.f62392k = true;
                }
            }
        }
        D dK = this.f62389h.k();
        this.f62385d.d(dK);
        if (dK.equals(D.OPT_OUT)) {
            B();
            return;
        }
        if (this.f62393l && this.f62389h.a()) {
            this.f62393l = false;
            F();
        } else {
            Q5.t.a("Campaign", "CampaignExtension", "processConfigurationResponse -  Campaign extension is not configured to download campaign rules.", new Object[0]);
            this.f62393l = true;
        }
    }

    private void C(String str, String str2, r rVar, C6449h c6449h) {
        if (!f6.i.a(str2) && !E(rVar, c6449h.u())) {
            return;
        }
        C5072d c5072d = new C5072d(new i(str, str2, rVar.i()).toString());
        Q5.t.a("Campaign", "CampaignExtension", "processRequest - Campaign Request Queued with url (%s) and body (%s)", str, str2);
        this.f62385d.e(c5072d);
    }

    private boolean E(r rVar, long j10) {
        if (rVar.g()) {
            Q5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest -  Registration requests are paused.", new Object[0]);
            return false;
        }
        Q5.v vVarS = s();
        String string = vVarS.getString("ExperienceCloudId", "");
        String strJ = rVar.j();
        long j11 = vVarS.getLong("CampaignRegistrationTimestamp", -1L);
        int iF = rVar.f();
        long millis = TimeUnit.DAYS.toMillis(iF);
        if (!string.equals(strJ)) {
            Q5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest - The current ecid (%s) is new, sending the registration request.", strJ);
            G(strJ);
            return true;
        }
        if (j10 - j11 >= millis) {
            Q5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest -  Registration delay of (%d) days has elapsed. Sending the Campaign registration request.", Integer.valueOf(iF));
            return true;
        }
        Q5.t.a("Campaign", "CampaignExtension", "shouldSendRegistrationRequest - The registration request will not be sent because the registration delay of (%d) days has not elapsed.", Integer.valueOf(iF));
        return false;
    }

    private void G(String str) {
        Q5.v vVarS = s();
        if (vVarS == null) {
            Q5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection - Campaign Named Collection is null, cannot store ecid.", new Object[0]);
        } else if (f6.i.a(str)) {
            Q5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection -  Removing experience cloud id key in Campaign Named Collection.", new Object[0]);
            vVarS.remove("ExperienceCloudId");
        } else {
            Q5.t.e("Campaign", "CampaignExtension", "updateEcidInNamedCollection -  Persisting experience cloud id (%s) in Campaign Named Collection.", str);
            vVarS.d("ExperienceCloudId", str);
        }
    }

    private void m() {
        Q5.v vVarS = s();
        if (vVarS == null) {
            Q5.t.a("Campaign", "CampaignExtension", "clearCampaignNamedCollection -  Campaign Named Collection is not available to be cleared.", new Object[0]);
        } else {
            vVarS.g();
        }
    }

    void D(C6449h c6449h) {
        AbstractC6454m abstractC6454mA = a();
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.LAST_SET;
        this.f62389h.o(abstractC6454mA.e("com.adobe.module.configuration", c6449h, false, f10), a().e("com.adobe.module.identity", c6449h, false, f10));
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return C6448g.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        Q5.t.a("Campaign", "CampaignExtension", "Registered Campaign extension - version %s", f());
        a().h("com.adobe.eventType.campaign", "com.adobe.eventSource.requestIdentity", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.c
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62402a.t(c6449h);
            }
        });
        a().h("com.adobe.eventType.campaign", "com.adobe.eventSource.requestReset", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.c
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62402a.t(c6449h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.d
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62403a.y(c6449h);
            }
        });
        a().h("com.adobe.eventType.generic.data", "com.adobe.eventSource.os", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.e
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62404a.A(c6449h);
            }
        });
        a().h("com.adobe.eventType.lifecycle", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.f
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62405a.z(c6449h);
            }
        });
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.g
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62406a.w(c6449h);
            }
        });
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.campaign.h
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62407a.v(c6449h);
            }
        });
        s.a("ADBMobileCampaign.sqlite");
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h c6449h) {
        if (C13845a.o(c6449h.o(), "stateowner", "").equals("com.adobe.module.identity")) {
            D(c6449h);
            if (this.f62393l && this.f62389h.a()) {
                this.f62393l = false;
                F();
            }
        }
        AbstractC6454m abstractC6454mA = a();
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.ANY;
        H hE = abstractC6454mA.e("com.adobe.module.configuration", c6449h, false, f10);
        H hE2 = a().e("com.adobe.module.identity", c6449h, false, f10);
        if (hE != null) {
            I iA = hE.a();
            I i10 = I.SET;
            if (iA == i10 && hE2 != null && hE2.a() == i10) {
                return true;
            }
        }
        return false;
    }

    void v(C6449h c6449h) {
        if (!x.g(c6449h)) {
            return;
        }
        Map mapT = C13845a.t(Object.class, c6449h.o(), "triggeredconsequence", null);
        if (C13848d.a(mapT)) {
            Q5.t.e("Campaign", "CampaignExtension", "handleRulesResponseEvents - null or empty consequences found. Will not handle rules response event.", new Object[0]);
            return;
        }
        String strO = C13845a.o(mapT, PreferencesHelper.PREF_ID, "");
        String strO2 = C13845a.o(mapT, "type", "");
        Map mapT2 = C13845a.t(Object.class, mapT, "detail", null);
        if (C13848d.a(mapT2)) {
            Q5.t.e("Campaign", "CampaignExtension", "handleRulesResponseEvents - null or empty consequence details found. Will not handle rules response event.", new Object[0]);
            return;
        }
        try {
            l lVarE = l.e(this, new RuleConsequence(strO, strO2, mapT2));
            if (lVarE == null) {
                Q5.t.b("Campaign", "CampaignExtension", "handleRulesResponseEvents -  Campaign message creation failed.", new Object[0]);
            } else {
                lVarE.h();
            }
        } catch (o e10) {
            Q5.t.b("Campaign", "CampaignExtension", "handleRulesResponseEvents -  Error reading message definition: \n %s", e10);
        }
    }

    CampaignExtension(AbstractC6454m abstractC6454m, F f10, InterfaceC5076h interfaceC5076h, M5.k kVar, r rVar, R5.d dVar, q qVar) {
        super(abstractC6454m);
        this.f62383b = "CampaignExtension";
        this.f62392k = false;
        this.f62393l = true;
        this.f62384c = abstractC6454m;
        this.f62390i = interfaceC5076h;
        this.f62386e = kVar;
        this.f62387f = dVar;
        this.f62388g = qVar;
        this.f62385d = f10;
        this.f62389h = rVar;
    }
}
