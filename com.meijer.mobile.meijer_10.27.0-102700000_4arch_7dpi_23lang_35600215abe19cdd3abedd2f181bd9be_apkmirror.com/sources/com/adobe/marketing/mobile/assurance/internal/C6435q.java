package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6456o;
import f6.C13845a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6435q implements InterfaceC6456o {

    /* renamed from: a, reason: collision with root package name */
    private final AssuranceExtension f62285a;

    C6435q(AssuranceExtension assuranceExtension) {
        this.f62285a = assuranceExtension;
    }

    @Override // com.adobe.marketing.mobile.InterfaceC6456o
    public void a(C6449h c6449h) {
        String strO;
        String str;
        String strO2;
        String str2;
        String strQ = c6449h.q();
        Map<String, Object> mapO = c6449h.o();
        if (strQ != null && mapO != null) {
            if (strQ.equals("responsegetnearbyplaces")) {
                List<Map> listR = C13845a.r(Map.class, mapO, "nearbypois", new ArrayList());
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.US;
                Integer numValueOf = Integer.valueOf(listR.size());
                if (!listR.isEmpty()) {
                    str = ":";
                } else {
                    str = ".";
                }
                sb2.append(String.format(locale, "Places - Found %d nearby POIs%s", numValueOf, str));
                for (Map map : listR) {
                    if (F.j(map) && (strO2 = C13845a.o(map, "regionname", null)) != null) {
                        boolean zL = C13845a.l(map, "useriswithin", false);
                        Locale locale2 = Locale.US;
                        if (!zL) {
                            str2 = "";
                        } else {
                            str2 = " (inside)";
                        }
                        sb2.append(String.format(locale2, "\n\t- %s%s", strO2, str2));
                    }
                }
                this.f62285a.o(EnumC6429k.NORMAL, sb2.toString());
                return;
            }
            if (strQ.equals("responseprocessregionevent") && (strO = C13845a.o(C13845a.t(Object.class, mapO, "triggeringregion", new HashMap()), "regionname", null)) != null) {
                this.f62285a.o(EnumC6429k.HIGH, String.format(Locale.US, "Places - Processed %s for region \"%s\".", C13845a.o(mapO, "regioneventtype", ""), strO));
                return;
            }
            return;
        }
        Q5.t.a("Assurance", "AssuranceListenerHubPlacesResponses", "[hear] Event data is null", new Object[0]);
    }
}
