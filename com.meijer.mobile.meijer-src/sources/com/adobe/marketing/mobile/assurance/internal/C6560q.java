package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.InterfaceC6581o;
import g6.C14328a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6560q implements InterfaceC6581o {

    /* renamed from: a, reason: collision with root package name */
    private final AssuranceExtension f63124a;

    C6560q(AssuranceExtension assuranceExtension) {
        this.f63124a = assuranceExtension;
    }

    @Override // com.adobe.marketing.mobile.InterfaceC6581o
    public void a(C6574h c6574h) {
        String strO;
        String str;
        String strO2;
        String str2;
        String strQ = c6574h.q();
        Map<String, Object> mapO = c6574h.o();
        if (strQ != null && mapO != null) {
            if (strQ.equals("responsegetnearbyplaces")) {
                List<Map> listR = C14328a.r(Map.class, mapO, "nearbypois", new ArrayList());
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
                    if (F.j(map) && (strO2 = C14328a.o(map, "regionname", null)) != null) {
                        boolean zL = C14328a.l(map, "useriswithin", false);
                        Locale locale2 = Locale.US;
                        if (!zL) {
                            str2 = "";
                        } else {
                            str2 = " (inside)";
                        }
                        sb2.append(String.format(locale2, "\n\t- %s%s", strO2, str2));
                    }
                }
                this.f63124a.o(EnumC6554k.NORMAL, sb2.toString());
                return;
            }
            if (strQ.equals("responseprocessregionevent") && (strO = C14328a.o(C14328a.t(Object.class, mapO, "triggeringregion", new HashMap()), "regionname", null)) != null) {
                this.f63124a.o(EnumC6554k.HIGH, String.format(Locale.US, "Places - Processed %s for region \"%s\".", C14328a.o(mapO, "regioneventtype", ""), strO));
                return;
            }
            return;
        }
        R5.t.a("Assurance", "AssuranceListenerHubPlacesResponses", "[hear] Event data is null", new Object[0]);
    }
}
