package com.adobe.marketing.mobile.campaign;

import R5.A;
import R5.InterfaceC5123j;
import R5.K;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f63262a;

    /* renamed from: b, reason: collision with root package name */
    private final A f63263b = K.f().h();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5123j f63264c = K.f().e();

    /* renamed from: d, reason: collision with root package name */
    private final S5.d f63265d = K.f().b();

    /* renamed from: e, reason: collision with root package name */
    private final String f63266e;

    /* renamed from: f, reason: collision with root package name */
    private File f63267f;

    private boolean d(String str) {
        if (!this.f63267f.exists()) {
            return false;
        }
        File file = new File(this.f63267f + File.separator + str);
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    private void e() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f63264c.o());
            String str = File.separator;
            sb2.append(str);
            sb2.append("aepsdkcache");
            sb2.append(str);
            sb2.append("campaign");
            sb2.append(str);
            sb2.append("messages");
            File file = new File(sb2.toString());
            this.f63267f = file;
            if (file.exists() || this.f63267f.mkdirs()) {
                return;
            }
            R5.t.f("Campaign", "CampaignMessageAssetsDownloader", "createMessageAssetCacheDirectory - Unable to create directory for caching message assets", new Object[0]);
        } catch (Exception e10) {
            R5.t.f("Campaign", "CampaignMessageAssetsDownloader", "createMessageAssetCacheDirectory - An unexpected error occurred while managing assets cache directory: \n %s", e10);
        }
    }

    void f() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f63262a;
        if (list != null && !list.isEmpty()) {
            for (String str : this.f63262a) {
                if (b(str)) {
                    arrayList.add(str);
                }
            }
        }
        x.c(this.f63267f, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str2 = (String) it.next();
            this.f63263b.a(new R5.x(str2, R5.r.GET, null, x.d(this.f63265d.a(this.f63267f + File.separator + this.f63266e, str2)), 5, 5), new R5.w() { // from class: com.adobe.marketing.mobile.campaign.m
                @Override // R5.w
                public final void a(R5.o oVar) throws ParseException {
                    n.a(this.f63260a, str2, oVar);
                }
            });
        }
    }

    n(List<String> list, String str) {
        this.f63262a = list;
        this.f63266e = str;
        e();
    }

    public static /* synthetic */ void a(n nVar, String str, R5.o oVar) throws ParseException {
        nVar.getClass();
        if (oVar == null) {
            R5.t.f("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Internet not available. Failed to download asset from URL: %s", str);
            return;
        }
        if (oVar.d() == 304) {
            R5.t.a("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Asset was cached previously: %s", str);
            oVar.close();
        } else if (oVar.d() != 200) {
            R5.t.a("Campaign", "CampaignMessageAssetsDownloader", "downloadAssetCollection - Failed to download asset from URL: %s", str);
            oVar.close();
        } else {
            nVar.c(oVar, str, nVar.f63266e);
            oVar.close();
        }
    }

    private boolean b(String str) {
        if (g6.l.a(str)) {
            if (str.startsWith("http") || str.startsWith(io.constructor.BuildConfig.SERVICE_SCHEME)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void c(R5.o oVar, String str, String str2) throws ParseException {
        if (!d(str2)) {
            R5.t.a("Campaign", "CampaignMessageAssetsDownloader", "cacheAssetData - Cannot cache asset for message id %s, failed to create cache directory.", str2);
            return;
        }
        R5.t.a("Campaign", "CampaignMessageAssetsDownloader", "cacheAssetData - Caching asset %s for message id %s.", str, str2);
        HashMap<String, String> mapE = x.e(oVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("campaign");
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append("messages");
        sb2.append(str3);
        sb2.append(str2);
        this.f63265d.b(sb2.toString(), str, new S5.a(oVar.c(), S5.b.d(), mapE));
    }
}
