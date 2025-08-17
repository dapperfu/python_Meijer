package Yq;

import Tq.k;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.StoreDetails;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lok/h;", "LTq/k;", "preferredStore", "", "markerId", "LYq/e;", "c", "(Lok/h;LTq/k;Ljava/lang/String;)LYq/e;", "", "b", "(Lok/h;LTq/k;)Z", "Lcom/google/android/gms/maps/model/LatLng;", "a", "(Lok/h;)Lcom/google/android/gms/maps/model/LatLng;", "latLng", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class f {
    public static final LatLng a(StoreDetails storeDetails) {
        Intrinsics.j(storeDetails, "<this>");
        Double latitude = storeDetails.getLatitude();
        if (Intrinsics.b(latitude, 0.0d)) {
            latitude = null;
        }
        if (latitude == null) {
            uw.a.INSTANCE.s("Latitude was null for store " + storeDetails.getStoreId(), new Object[0]);
            return null;
        }
        double dDoubleValue = latitude.doubleValue();
        Double longitude = storeDetails.getLongitude();
        if (Intrinsics.b(longitude, 0.0d)) {
            longitude = null;
        }
        if (longitude != null) {
            return new LatLng(dDoubleValue, longitude.doubleValue());
        }
        uw.a.INSTANCE.s("Longitude was null for store " + storeDetails.getStoreId(), new Object[0]);
        Unit unit = Unit.f142422a;
        return null;
    }

    public static final boolean b(StoreDetails storeDetails, k kVar) {
        if (storeDetails != null) {
            return (kVar == null || kVar.getStoreId() != 0) && kVar != null && kVar.getStoreId() == storeDetails.getStoreId();
        }
        return false;
    }

    public static final StoreMarker c(StoreDetails storeDetails, k kVar, String str) {
        Intrinsics.j(storeDetails, "<this>");
        return new StoreMarker(storeDetails, b(storeDetails, kVar), null, null, str, null, 0, null, 236, null);
    }

    public static /* synthetic */ StoreMarker d(StoreDetails storeDetails, k kVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return c(storeDetails, kVar, str);
    }
}
