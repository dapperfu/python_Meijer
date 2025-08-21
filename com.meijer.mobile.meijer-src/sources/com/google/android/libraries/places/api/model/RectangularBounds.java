package com.google.android.libraries.places.api.model;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLng latLng, @RecentlyNonNull LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }

    @RecentlyNonNull
    public abstract LatLng getNortheast();

    @RecentlyNonNull
    public abstract LatLng getSouthwest();

    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLngBounds latLngBounds) {
        zzax zzaxVar = new zzax();
        zzaxVar.zza(latLngBounds.f85656a);
        zzaxVar.zzb(latLngBounds.f85657b);
        return zzaxVar.zzc();
    }
}
