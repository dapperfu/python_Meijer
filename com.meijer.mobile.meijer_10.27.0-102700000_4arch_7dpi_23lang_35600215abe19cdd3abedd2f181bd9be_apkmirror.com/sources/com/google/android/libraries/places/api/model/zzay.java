package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
abstract class zzay extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            if (this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getNortheast() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getSouthwest() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 40 + string2.length() + 1);
        sb2.append("RectangularBounds{southwest=");
        sb2.append(string);
        sb2.append(", northeast=");
        sb2.append(string2);
        sb2.append("}");
        return sb2.toString();
    }

    zzay(LatLng latLng, LatLng latLng2) {
        if (latLng != null) {
            this.zza = latLng;
            if (latLng2 != null) {
                this.zzb = latLng2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }
}
