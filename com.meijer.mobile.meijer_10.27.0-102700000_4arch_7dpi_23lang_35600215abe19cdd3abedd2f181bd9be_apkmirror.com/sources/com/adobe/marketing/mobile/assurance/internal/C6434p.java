package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.util.DataReaderException;
import f6.C13845a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6434p implements InterfaceC6456o {

    /* renamed from: a, reason: collision with root package name */
    private final AssuranceExtension f62284a;

    C6434p(AssuranceExtension assuranceExtension) {
        this.f62284a = assuranceExtension;
    }

    @Override // com.adobe.marketing.mobile.InterfaceC6456o
    public void a(C6449h c6449h) {
        String strQ = c6449h.q();
        Map<String, Object> mapO = c6449h.o();
        if (strQ == null) {
            Q5.t.a("Assurance", "AssuranceListenerHubPlacesRequests", "[hear] Event name is null", new Object[0]);
            return;
        }
        if (strQ.equals("requestgetnearbyplaces")) {
            if (F.h(mapO)) {
                Q5.t.a("Assurance", "AssuranceListenerHubPlacesRequests", "[hear] for event requestgetnearbyplaces - Event data is null", new Object[0]);
                return;
            }
            try {
                this.f62284a.o(EnumC6429k.NORMAL, String.format(Locale.US, "Places - Requesting %d nearby POIs from (%.6f, %.6f)", Integer.valueOf(C13845a.d(mapO, "count")), Double.valueOf(C13845a.c(mapO, "latitude")), Double.valueOf(C13845a.c(mapO, "longitude"))));
                return;
            } catch (DataReaderException e10) {
                Q5.t.f("Assurance", "AssuranceListenerHubPlacesRequests", "Unable to log-local Places event: " + e10.getLocalizedMessage(), new Object[0]);
                return;
            }
        }
        if (strQ.equals("requestreset")) {
            this.f62284a.o(EnumC6429k.CRITICAL, "Places - Resetting Location");
        }
    }
}
