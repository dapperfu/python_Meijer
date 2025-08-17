package com.adobe.marketing.mobile.campaign;

import Q5.A;
import Q5.InterfaceC5078j;
import Q5.K;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f62423a;

    /* renamed from: b, reason: collision with root package name */
    private final A f62424b = K.f().h();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5078j f62425c = K.f().e();

    /* renamed from: d, reason: collision with root package name */
    private final R5.d f62426d = K.f().b();

    /* renamed from: e, reason: collision with root package name */
    private final String f62427e;

    /* renamed from: f, reason: collision with root package name */
    private File f62428f;

    private boolean d(String str) {
        if (!this.f62428f.exists()) {
            return false;
        }
        File file = new File(this.f62428f + File.separator + str);
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    private void e() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f62425c.o());
            String str = File.separator;
            sb2.append(str);
            sb2.append("aepsdkcache");
            sb2.append(str);
            sb2.append("campaign");
            sb2.append(str);
            sb2.append("messages");
            File file = new File(sb2.toString());
            this.f62428f = file;
            if (file.exists() || this.f62428f.mkdirs()) {
                return;
            }
            Q5.t.f("Campaign", "CampaignMessageAssetsDownloader", "createMessageAssetCacheDirectory - Unable to create directory for caching message assets", new Object[0]);
        } catch (Exception e10) {
            Q5.t.f("Campaign", "CampaignMessageAssetsDownloader", "createMessageAssetCacheDirectory - An unexpected error occurred while managing assets cache directory: \n %s", e10);
        }
    }

    void f() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f62423a;
        if (list != null && !list.isEmpty()) {
            for (String str : this.f62423a) {
                if (b(str)) {
                    arrayList.add(str);
                }
            }
        }
        x.c(this.f62428f, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str2 = (String) it.next();
            this.f62424b.a(new Q5.x(str2, Q5.r.GET, null, x.d(this.f62426d.b(this.f62428f + File.separator + this.f62427e, str2)), 5, 5), new Q5.w() { // from class: com.adobe.marketing.mobile.campaign.m
                @Override // Q5.w
                public final void a(Q5.o oVar) throws ParseException {
                    n.a(this.f62421a, str2, oVar);
                }
            });
        }
    }

    n(List<String> list, String str) {
        this.f62423a = list;
        this.f62427e = str;
        e();
    }

    public static /* synthetic */ void a(n nVar, String str, Q5.o oVar) throws ParseException {
        nVar.getClass();
        if (oVar == null) {
            Q5.t.f("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Internet not available. Failed to download asset from URL: %s", str);
            return;
        }
        if (oVar.d() == 304) {
            Q5.t.a("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Asset was cached previously: %s", str);
            oVar.close();
        } else if (oVar.d() != 200) {
            Q5.t.a("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Failed to download asset from URL: %s", str);
            oVar.close();
        } else {
            nVar.c(oVar, str, nVar.f62427e);
            oVar.close();
        }
    }

    private boolean b(String str) {
        if (f6.l.a(str)) {
            if (str.startsWith("http") || str.startsWith(io.constructor.BuildConfig.SERVICE_SCHEME)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void c(Q5.o oVar, String str, String str2) throws ParseException {
        if (!d(str2)) {
            Q5.t.a("Campaign", "CampaignMessageAssetsDownloader", "cacheAssetData - Cannot cache asset for message id %s, failed to create cache directory.", str2);
            return;
        }
        Q5.t.a("Campaign", "CampaignMessageAssetsDownloader", "cacheAssetData - Caching asset %s for message id %s.", str, str2);
        HashMap<String, String> mapE = x.e(oVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("campaign");
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append("messages");
        sb2.append(str3);
        sb2.append(str2);
        this.f62426d.a(sb2.toString(), str, new R5.a(oVar.c(), R5.b.d(), mapE));
    }
}
