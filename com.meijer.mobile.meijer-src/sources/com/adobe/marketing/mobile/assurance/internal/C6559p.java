package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.util.DataReaderException;
import g6.C14328a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6559p implements InterfaceC6581o {

    /* renamed from: a, reason: collision with root package name */
    private final AssuranceExtension f63123a;

    C6559p(AssuranceExtension assuranceExtension) {
        this.f63123a = assuranceExtension;
    }

    @Override // com.adobe.marketing.mobile.InterfaceC6581o
    public void a(C6574h c6574h) {
        String strQ = c6574h.q();
        Map<String, Object> mapO = c6574h.o();
        if (strQ == null) {
            R5.t.a("Assurance", "AssuranceListenerHubPlacesRequests", "[hear] Event name is null", new Object[0]);
            return;
        }
        if (strQ.equals("requestgetnearbyplaces")) {
            if (F.h(mapO)) {
                R5.t.a("Assurance", "AssuranceListenerHubPlacesRequests", "[hear] for event requestgetnearbyplaces - Event data is null", new Object[0]);
                return;
            }
            try {
                this.f63123a.o(EnumC6554k.NORMAL, String.format(Locale.US, "Places - Requesting %d nearby POIs from (%.6f, %.6f)", Integer.valueOf(C14328a.d(mapO, "count")), Double.valueOf(C14328a.c(mapO, "latitude")), Double.valueOf(C14328a.c(mapO, "longitude"))));
                return;
            } catch (DataReaderException e10) {
                R5.t.f("Assurance", "AssuranceListenerHubPlacesRequests", "Unable to log-local Places event: " + e10.getLocalizedMessage(), new Object[0]);
                return;
            }
        }
        if (strQ.equals("requestreset")) {
            this.f63123a.o(EnumC6554k.CRITICAL, "Places - Resetting Location");
        }
    }
}
