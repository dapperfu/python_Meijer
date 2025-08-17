package com.bazaarvoice.bvandroidsdk;

import Va.n;

@Deprecated
/* loaded from: classes4.dex */
class LocationAnalyticsManager {
    static final String ENTRY = "Entry";
    static final String EXIT = "Exit";

    static void sendLocationEventForGimbalVisit(n nVar, String str) {
        if (nVar == null || nVar.c() == null) {
            return;
        }
        BVSDK.getInstance().getBvPixel().track(new BVLocationEvent(str, nVar.c().a().getValue(PlaceAttribute.Id.getKey()), nVar.a() > 0 ? nVar.b() / 1000 : 0L));
    }

    LocationAnalyticsManager() {
    }
}
