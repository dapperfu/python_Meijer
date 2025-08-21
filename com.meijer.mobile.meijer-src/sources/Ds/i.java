package Ds;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.SphericalUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroid/location/Location;", "", "radiusInMeters", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "(Landroid/location/Location;D)Lcom/google/android/gms/maps/model/LatLngBounds;", "Lcom/google/android/gms/maps/model/LatLng;", "b", "(Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLngBounds;", "c", "(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;", "latLng", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {
    public static final LatLngBounds a(Location location, double d10) {
        Intrinsics.j(location, "<this>");
        return b(c(location), d10);
    }

    public static final LatLngBounds b(LatLng latLng, double d10) {
        Intrinsics.j(latLng, "<this>");
        double dSqrt = d10 * Math.sqrt(2.0d);
        return new LatLngBounds(SphericalUtil.computeOffset(latLng, dSqrt, 225.0d), SphericalUtil.computeOffset(latLng, dSqrt, 45.0d));
    }

    public static final LatLng c(Location location) {
        Intrinsics.j(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }
}
