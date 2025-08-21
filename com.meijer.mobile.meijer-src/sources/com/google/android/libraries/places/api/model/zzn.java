package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
abstract class zzn extends CircularBounds {
    private final LatLng zza;
    private final double zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CircularBounds) {
            CircularBounds circularBounds = (CircularBounds) obj;
            if (this.zza.equals(circularBounds.getCenter()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(circularBounds.getRadius())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final LatLng getCenter() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final double getRadius() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        double d10 = this.zzb;
        return (iHashCode * 1000003) ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        double d10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 31 + String.valueOf(d10).length() + 1);
        sb2.append("CircularBounds{center=");
        sb2.append(string);
        sb2.append(", radius=");
        sb2.append(d10);
        sb2.append("}");
        return sb2.toString();
    }

    zzn(LatLng latLng, double d10) {
        if (latLng != null) {
            this.zza = latLng;
            this.zzb = d10;
            return;
        }
        throw new NullPointerException("Null center");
    }
}
