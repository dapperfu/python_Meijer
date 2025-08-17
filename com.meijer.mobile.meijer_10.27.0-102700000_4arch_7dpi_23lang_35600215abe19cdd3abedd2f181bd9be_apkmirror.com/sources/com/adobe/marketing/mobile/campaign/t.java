package com.adobe.marketing.mobile.campaign;

import Q5.K;
import a6.f;
import android.content.Context;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import f6.C13846b;
import f6.C13851g;
import io.constructor.data.local.PreferencesHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class t extends l {

    /* renamed from: d, reason: collision with root package name */
    private final String f62448d;

    /* renamed from: e, reason: collision with root package name */
    private final R5.d f62449e;

    /* renamed from: f, reason: collision with root package name */
    private final U5.t f62450f;

    /* renamed from: g, reason: collision with root package name */
    private String f62451g;

    /* renamed from: h, reason: collision with root package name */
    private String f62452h;

    /* renamed from: i, reason: collision with root package name */
    private String f62453i;

    /* renamed from: j, reason: collision with root package name */
    private final List<List<String>> f62454j;

    class a implements a6.d {
        @Override // U5.q
        public void a(U5.m<U5.j> mVar, U5.p pVar) {
            Q5.t.a("Campaign", "FullScreenMessage", "onShowFailure -  Fullscreen message failed to show.", new Object[0]);
        }

        @Override // U5.q
        public void b(U5.m<U5.j> mVar) {
        }

        @Override // U5.q
        public void c(U5.m<U5.j> mVar) {
            Q5.t.a("Campaign", "FullScreenMessage", "Fullscreen on dismiss callback received.", new Object[0]);
            t.this.j();
        }

        @Override // a6.d
        public void e(U5.m<U5.j> mVar) {
        }

        @Override // U5.q
        public void f(U5.m<U5.j> mVar) {
            Q5.t.a("Campaign", "FullScreenMessage", "Fullscreen on show callback received.", new Object[0]);
            t.this.i();
        }

        @Override // a6.d
        public boolean g(U5.m<U5.j> mVar, String str) throws NumberFormatException {
            Q5.t.e("Campaign", "Fullscreen overrideUrlLoad callback received with url (%s)", str, new Object[0]);
            if (f6.i.a(str)) {
                Q5.t.a("Campaign", "FullScreenMessage", "Cannot process provided URL string, it is null or empty.", new Object[0]);
                return true;
            }
            try {
                URI uri = new URI(str);
                if (!uri.getScheme().equals("adbinapp")) {
                    Q5.t.a("Campaign", "FullScreenMessage", "overrideUrlLoad -  Invalid message scheme found in URI. (%s)", str);
                    return false;
                }
                String host = uri.getHost();
                if (!host.equals("confirm") && !host.equals("cancel")) {
                    Q5.t.a("Campaign", "FullScreenMessage", "overrideUrlLoad -  Unsupported URI host found, neither \"confirm\" nor \"cancel\". (%s)", str);
                    return false;
                }
                Map<String, String> mapF = x.f(uri.getRawQuery());
                if (mapF != null && !mapF.isEmpty()) {
                    mapF.put("type", host);
                    t.this.m(mapF);
                }
                mVar.dismiss();
                return true;
            } catch (URISyntaxException unused) {
                Q5.t.a("Campaign", "FullScreenMessage", "overrideUrlLoad -  Invalid message URI found (%s).", str);
                return true;
            }
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Map<String, String> map) throws NumberFormatException {
        int i10 = 0;
        if (map == null || map.isEmpty()) {
            Q5.t.a("Campaign", "FullScreenMessage", "processMessageInteraction -  Cannot process message interaction, input query is null or empty.", new Object[0]);
            return;
        }
        if (map.containsKey(PreferencesHelper.PREF_ID)) {
            String[] strArrSplit = map.get(PreferencesHelper.PREF_ID).split(",");
            if (strArrSplit.length != 3) {
                Q5.t.a("Campaign", "FullScreenMessage", "processMessageInteraction -  Cannot process message interaction, input query contains insufficient id tokens.", new Object[0]);
                return;
            }
            try {
                i10 = Integer.parseInt(strArrSplit[2]);
            } catch (NumberFormatException e10) {
                Q5.t.a("Campaign", "FullScreenMessage", "processMessageInteraction -  Cannot parse tag Id from the id field in given query (%s).", e10);
            }
            if (i10 != 3 && i10 != 4 && i10 != 5) {
                Q5.t.a("Campaign", "FullScreenMessage", "processMessageInteraction -  Unsupported tag Id found in the id field in the given query (%s).", Integer.valueOf(i10));
            } else {
                d(map);
                j();
            }
        }
    }

    private Map<String, String> l() throws IOException {
        String str;
        List<List<String>> list = this.f62454j;
        if (list == null || list.isEmpty()) {
            Q5.t.a("Campaign", "FullScreenMessage", "createCachedResourcesMap - No valid remote asset list found for message with id %s.", this.f62453i);
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str2 = this.f62448d + this.f62453i;
        for (List<String> list2 : this.f62454j) {
            if (!list2.isEmpty()) {
                int i10 = 0;
                String str3 = list2.get(0);
                int size = list2.size();
                while (true) {
                    if (i10 >= size) {
                        str = null;
                        break;
                    }
                    if (this.f62449e.b(str2, list2.get(i10)) != null) {
                        str = str2;
                        break;
                    }
                    i10++;
                }
                if (f6.i.a(str)) {
                    String str4 = list2.get(size - 1);
                    if (!f6.l.a(str4)) {
                        try {
                            Context applicationContext = K.f().a().getApplicationContext();
                            if (applicationContext != null) {
                                InputStream inputStreamOpen = applicationContext.getAssets().open(str4);
                                if (!f6.l.a(str3)) {
                                    str3 = "file:///android_asset/" + str3;
                                }
                                this.f62449e.a(str2, str3, new R5.a(inputStreamOpen, R5.b.d(), null));
                                map2.put(str3, str2);
                                inputStreamOpen.close();
                            }
                        } catch (IOException e10) {
                            Q5.t.a("Campaign", "FullScreenMessage", "createCachedResourcesMap - Exception occurred reading bundled asset: %s.", e10.getMessage());
                        }
                    }
                } else {
                    map.put(str3, str);
                }
            }
        }
        map.putAll(map2);
        return map;
    }

    @Override // com.adobe.marketing.mobile.campaign.l
    void h() throws IOException {
        Q5.t.a("Campaign", "FullScreenMessage", "showMessage - Attempting to show fullscreen message with ID %s", this.f62453i);
        if (this.f62450f == null) {
            Q5.t.f("Campaign", "FullScreenMessage", "showMessage - UI Service is unavailable. Unable to show fullscreen message with ID (%s)", this.f62453i);
            return;
        }
        R5.d dVar = this.f62449e;
        if (dVar == null) {
            Q5.t.a("Campaign", "FullScreenMessage", "showMessage - No cache service found, to show fullscreen message with ID %s", this.f62453i);
            return;
        }
        R5.c cVarB = dVar.b("campaign" + File.separator + "campaignRules", this.f62451g);
        if (cVarB == null) {
            Q5.t.a("Campaign", "FullScreenMessage", "showMessage - Unable to find cached html content for fullscreen message with ID %s", this.f62453i);
            return;
        }
        String strA = C13851g.a(cVarB.getData());
        this.f62452h = strA;
        if (f6.i.a(strA)) {
            Q5.t.a("Campaign", "FullScreenMessage", "showMessage -  No html content in file (%s). File is missing or invalid!", this.f62451g);
            return;
        }
        Map<String, String> mapL = l();
        a aVar = new a();
        f.a aVarI = new f.a().e(this.f62452h).h(100).l(100).k(f.b.TOP).i(f.b.CENTER);
        f.c cVar = f.c.BOTTOM;
        this.f62450f.a(new U5.j(aVarI.g(cVar).f(cVar).c(PickupConfig.DEFAULT_ACCENT_TEXT_COLOR).b(0.0f).a(mapL).j(true).d(), aVar), new C13846b()).a();
    }
}
