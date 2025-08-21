package com.radiusnetworks.flybuy.sdk.data.location;

import com.radiusnetworks.flybuy.api.model.Geofence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCircularRegion", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "Lcom/radiusnetworks/flybuy/api/model/Geofence;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CircularRegionKt {
    public static final CircularRegion toCircularRegion(Geofence geofence) {
        Intrinsics.j(geofence, "<this>");
        Double dT = StringsKt.t(geofence.getLatitude());
        if (dT == null) {
            return null;
        }
        double dDoubleValue = dT.doubleValue();
        Double dT2 = StringsKt.t(geofence.getLongitude());
        if (dT2 != null) {
            return new CircularRegion(dDoubleValue, dT2.doubleValue(), geofence.getRadiusMeters());
        }
        return null;
    }
}
