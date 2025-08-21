package com.adobe.marketing.mobile.campaign;

import N5.LaunchRule;
import N5.RuleConsequence;
import O5.a;
import R5.A;
import R5.K;
import com.adobe.marketing.mobile.AbstractC6579m;
import g6.C14328a;
import g6.C14334g;
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
    private final AbstractC6579m f63270a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.k f63271b;

    /* renamed from: c, reason: collision with root package name */
    private final R5.v f63272c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.d f63273d;

    /* renamed from: e, reason: collision with root package name */
    private final A f63274e = K.f().h();

    /* renamed from: f, reason: collision with root package name */
    private n f63275f;

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
            R5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Cannot load consequences, campaign rules list is null or empty.", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<LaunchRule> it = list.iterator();
        while (it.hasNext()) {
            for (RuleConsequence ruleConsequence : it.next().b()) {
                String type = ruleConsequence.getType();
                Map<String, Object> mapA = ruleConsequence.a();
                String strO = C14328a.o(mapA, "template", "");
                if (!g6.i.a(type) && type.equals("iam") && strO.equals("fullscreen")) {
                    String id2 = ruleConsequence.getId();
                    if (g6.i.a(id2)) {
                        R5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Can't download assets, Consequence id is null", new Object[0]);
                    } else {
                        arrayList.add(id2);
                        List<String> listD = d(mapA);
                        if (listD == null || listD.isEmpty()) {
                            R5.t.a("Campaign", "CampaignRulesDownloader", "cacheRemoteAssets - Can't download assets, no remote assets found in consequence for message id %s", ruleConsequence.getId());
                            break;
                        } else {
                            n nVar = new n(listD, id2);
                            this.f63275f = nVar;
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

    public static /* synthetic */ void a(q qVar, String str, R5.o oVar) throws SecurityException {
        if (oVar != null) {
            qVar.j(str, oVar);
        } else {
            qVar.getClass();
            R5.t.f("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - No internet connection. Unable to download rules.", str);
        }
    }

    private O5.a f(String str, InputStream inputStream, Map<String, String> map) throws SecurityException {
        if (inputStream == null) {
            R5.t.a("Campaign", "campaign", "Zip content stream is null", new Object[0]);
            return new O5.a(null, a.EnumC0380a.NO_DATA);
        }
        File fileG = g(str);
        if (!fileG.exists() && !fileG.mkdirs()) {
            R5.t.a("Campaign", "CampaignRulesDownloader", "Cannot access application cache directory to create temp dir.", new Object[0]);
            return new O5.a(null, a.EnumC0380a.CANNOT_CREATE_TEMP_DIR);
        }
        if (!s.d(h(str), inputStream, false)) {
            R5.t.a("Campaign", "CampaignRulesDownloader", "Couldn't extract zip contents to temp directory.", new Object[0]);
            return new O5.a(null, a.EnumC0380a.CANNOT_STORE_IN_TEMP_DIR);
        }
        if (!s.c(h(str), fileG.getPath())) {
            R5.t.a("Campaign", "CampaignRulesDownloader", "Failed to extract rules response zip into temp dir.", new Object[0]);
            return new O5.a(null, a.EnumC0380a.ZIP_EXTRACTION_FAILED);
        }
        if (!b(fileG, map)) {
            R5.t.a("Campaign", "CampaignRulesDownloader", "Could not cache rules from source %s", str);
        }
        e(str);
        return new O5.a(C14334g.a(this.f63273d.a("campaign" + File.separator + "campaignRules", "rules.json").getData()), a.EnumC0380a.SUCCESS);
    }

    private File h(String str) {
        return new File(g(str).getPath() + File.separator + "campaign_rules.zip");
    }

    private void l(String str) {
        if (this.f63272c == null) {
            R5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Campaign Named Collection is null, cannot store url.", new Object[0]);
        } else if (g6.i.a(str)) {
            R5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Removing remotes URL key in Campaign Named Collection.", new Object[0]);
            this.f63272c.remove("CampaignRemoteUrl");
        } else {
            R5.t.e("Campaign", "CampaignRulesDownloader", "updateUrlInNamedCollection - Persisting remotes URL (%s) in Campaign Named Collection.", str);
            this.f63272c.d("CampaignRemoteUrl", str);
        }
    }

    void i(final String str, String str2) {
        if (this.f63274e == null) {
            R5.t.a("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - Cannot download rules, the network service is unavailable.", new Object[0]);
            return;
        }
        if (g6.i.a(str)) {
            R5.t.f("Campaign", "CampaignRulesDownloader", "loadRulesFromUrl - Cannot download rules, provided url is null or empty. Cached rules will be used if present.", new Object[0]);
            return;
        }
        Map map = new HashMap();
        S5.c cVarA = this.f63273d.a("campaign" + File.separator + "campaignRules", "campaign_rules.zip");
        if (cVarA != null) {
            map = x.d(cVarA);
        }
        Map map2 = map;
        if (!g6.i.a(str2)) {
            map2.put("X-InApp-Auth", str2);
        }
        this.f63274e.a(new R5.x(str, R5.r.GET, null, map2, 5, 5), new R5.w() { // from class: com.adobe.marketing.mobile.campaign.p
            @Override // R5.w
            public final void a(R5.o oVar) throws SecurityException {
                q.a(this.f63268a, str, oVar);
            }
        });
    }

    q(AbstractC6579m abstractC6579m, N5.k kVar, R5.v vVar, S5.d dVar) {
        this.f63270a = abstractC6579m;
        this.f63271b = kVar;
        this.f63272c = vVar;
        this.f63273d = dVar;
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
                    R5.t.e("Campaign", "CampaignRulesDownloader", "Caching file (%s)", name);
                    this.f63273d.b("campaign" + File.separator + "campaignRules", name, new S5.a(new FileInputStream(file2), S5.b.d(), map));
                } catch (FileNotFoundException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    private void e(String str) throws SecurityException {
        if (g6.i.a(str)) {
            return;
        }
        s.b(g(str), true);
    }

    private File g(String str) {
        String strA = M5.o.a(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o().getPath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("campaign_temp");
        sb2.append(str2);
        sb2.append(strA);
        return new File(sb2.toString());
    }

    private void j(String str, R5.o oVar) throws SecurityException {
        int iD = oVar.d();
        if (iD != 200) {
            if (iD != 304) {
                R5.t.b("Campaign", "CampaignRulesDownloader", "Received download response: %s", Integer.valueOf(oVar.d()));
                oVar.close();
                return;
            } else {
                R5.t.e("Campaign", "CampaignRulesDownloader", "Rules from %s have not been modified. Will not re-download rules.", str);
                oVar.close();
                return;
            }
        }
        O5.a aVarF = f(str, oVar.c(), x.e(oVar));
        if (aVarF.b() == a.EnumC0380a.SUCCESS) {
            l(str);
        }
        oVar.close();
        k(aVarF);
    }

    void k(O5.a aVar) {
        List<LaunchRule> listA;
        if (aVar.a() != null && (listA = P5.j.a(aVar.a(), this.f63270a)) != null) {
            R5.t.e("Campaign", "CampaignRulesDownloader", "Registering %s Campaign rule(s).", Integer.valueOf(listA.size()));
            this.f63271b.c(listA);
            c(listA);
        }
    }
}
