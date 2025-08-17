package com.adobe.marketing.mobile.campaign;

import M5.LaunchRule;
import M5.RuleConsequence;
import N5.a;
import Q5.A;
import Q5.K;
import com.adobe.marketing.mobile.AbstractC6454m;
import f6.C13845a;
import f6.C13851g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6454m f62431a;

    /* renamed from: b, reason: collision with root package name */
    private final M5.k f62432b;

    /* renamed from: c, reason: collision with root package name */
    private final Q5.v f62433c;

    /* renamed from: d, reason: collision with root package name */
    private final R5.d f62434d;

    /* renamed from: e, reason: collision with root package name */
    private final A f62435e = K.f().h();

    /* renamed from: f, reason: collision with root package name */
    private n f62436f;

    private List<String> d(Map<String, Object> map) {
        ArrayList arrayList = null;
        if (map == null) {
            return null;
        }
        List list = (List) map.get("remoteAssets");
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll((List) it.next());
            }
        }
        return arrayList;
    }

    void c(List<LaunchRule> list) {
        if (list == null || list.isEmpty()) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Cannot load consequences, campaign rules list is null or empty.", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<LaunchRule> it = list.iterator();
        while (it.hasNext()) {
            for (RuleConsequence ruleConsequence : it.next().b()) {
                String type = ruleConsequence.getType();
                Map<String, Object> mapA = ruleConsequence.a();
                String strO = C13845a.o(mapA, "template", "");
                if (!f6.i.a(type) && type.equals("iam") && strO.equals("fullscreen")) {
                    String id2 = ruleConsequence.getId();
                    if (f6.i.a(id2)) {
                        Q5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Can't download assets, Consequence id is null", new Object[0]);
                    } else {
                        arrayList.add(id2);
                        List<String> listD = d(mapA);
                        if (listD == null || listD.isEmpty()) {
                            Q5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Can't download assets, no remote assets found in consequence for message id %s", ruleConsequence.getId());
                            break;
                        } else {
                            n nVar = new n(listD, id2);
                            this.f62436f = nVar;
                            nVar.f();
                        }
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o());
        String str = File.separator;
        sb2.append(str);
        sb2.append("campaign");
        sb2.append(str);
        sb2.append("messages");
        x.c(new File(sb2.toString()), arrayList);
    }

    public static /* synthetic */ void a(q qVar, String str, Q5.o oVar) throws SecurityException {
        if (oVar != null) {
            qVar.j(str, oVar);
        } else {
            qVar.getClass();
            Q5.t.f("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - No internet connection. Unable to download rules.", str);
        }
    }

    private N5.a f(String str, InputStream inputStream, Map<String, String> map) throws SecurityException {
        if (inputStream == null) {
            Q5.t.a("Campaign", "campaign", "Zip content stream is null", new Object[0]);
            return new N5.a(null, a.EnumC0338a.NO_DATA);
        }
        File fileG = g(str);
        if (!fileG.exists() && !fileG.mkdirs()) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "Cannot access application cache directory to create temp dir.", new Object[0]);
            return new N5.a(null, a.EnumC0338a.CANNOT_CREATE_TEMP_DIR);
        }
        if (!s.d(h(str), inputStream, false)) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "Couldn't extract zip contents to temp directory.", new Object[0]);
            return new N5.a(null, a.EnumC0338a.CANNOT_STORE_IN_TEMP_DIR);
        }
        if (!s.c(h(str), fileG.getPath())) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "Failed to extract rules response zip into temp dir.", new Object[0]);
            return new N5.a(null, a.EnumC0338a.ZIP_EXTRACTION_FAILED);
        }
        if (!b(fileG, map)) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "Could not cache rules from source %s", str);
        }
        e(str);
        return new N5.a(C13851g.a(this.f62434d.b("campaign" + File.separator + "campaignRules", "rules.json").getData()), a.EnumC0338a.SUCCESS);
    }

    private File h(String str) {
        return new File(g(str).getPath() + File.separator + "campaign_rules.zip");
    }

    private void l(String str) {
        if (this.f62433c == null) {
            Q5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Campaign Named Collection is null, cannot store url.", new Object[0]);
        } else if (f6.i.a(str)) {
            Q5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Removing remotes URL key in Campaign Named Collection.", new Object[0]);
            this.f62433c.remove("CampaignRemoteUrl");
        } else {
            Q5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Persisting remotes URL (%s) in Campaign Named Collection.", str);
            this.f62433c.d("CampaignRemoteUrl", str);
        }
    }

    void i(final String str, String str2) {
        if (this.f62435e == null) {
            Q5.t.a("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - Cannot download rules, the network service is unavailable.", new Object[0]);
            return;
        }
        if (f6.i.a(str)) {
            Q5.t.f("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - Cannot download rules, provided url is null or empty. Cached rules will be used if present.", new Object[0]);
            return;
        }
        Map map = new HashMap();
        R5.c cVarB = this.f62434d.b("campaign" + File.separator + "campaignRules", "campaign_rules.zip");
        if (cVarB != null) {
            map = x.d(cVarB);
        }
        Map map2 = map;
        if (!f6.i.a(str2)) {
            map2.put("X-InApp-Auth", str2);
        }
        this.f62435e.a(new Q5.x(str, Q5.r.GET, null, map2, 5, 5), new Q5.w() { // from class: com.adobe.marketing.mobile.campaign.p
            @Override // Q5.w
            public final void a(Q5.o oVar) throws SecurityException {
                q.a(this.f62429a, str, oVar);
            }
        });
    }

    q(AbstractC6454m abstractC6454m, M5.k kVar, Q5.v vVar, R5.d dVar) {
        this.f62431a = abstractC6454m;
        this.f62432b = kVar;
        this.f62433c = vVar;
        this.f62434d = dVar;
    }

    private boolean b(File file, Map<String, String> map) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2, map);
            } else {
                try {
                    String name = file2.getName();
                    Q5.t.e("Campaign", "CampaignRulesDownloader", "Caching file (%s)", name);
                    this.f62434d.a("campaign" + File.separator + "campaignRules", name, new R5.a(new FileInputStream(file2), R5.b.d(), map));
                } catch (FileNotFoundException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    private void e(String str) throws SecurityException {
        if (f6.i.a(str)) {
            return;
        }
        s.b(g(str), true);
    }

    private File g(String str) {
        String strA = L5.o.a(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o().getPath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("campaign_temp");
        sb2.append(str2);
        sb2.append(strA);
        return new File(sb2.toString());
    }

    private void j(String str, Q5.o oVar) throws SecurityException {
        int iD = oVar.d();
        if (iD != 200) {
            if (iD != 304) {
                Q5.t.b("Campaign", "CampaignRulesDownloader", "Received download response: %s", Integer.valueOf(oVar.d()));
                oVar.close();
                return;
            } else {
                Q5.t.e("Campaign", "CampaignRulesDownloader", "Rules from %s have not been modified. Will not re-download rules.", str);
                oVar.close();
                return;
            }
        }
        N5.a aVarF = f(str, oVar.c(), x.e(oVar));
        if (aVarF.b() == a.EnumC0338a.SUCCESS) {
            l(str);
        }
        oVar.close();
        k(aVarF);
    }

    void k(N5.a aVar) {
        List<LaunchRule> listA;
        if (aVar.a() != null && (listA = O5.j.a(aVar.a(), this.f62431a)) != null) {
            Q5.t.e("Campaign", "CampaignRulesDownloader", "Registering %s Campaign rule(s).", Integer.valueOf(listA.size()));
            this.f62432b.c(listA);
            c(listA);
        }
    }
}
