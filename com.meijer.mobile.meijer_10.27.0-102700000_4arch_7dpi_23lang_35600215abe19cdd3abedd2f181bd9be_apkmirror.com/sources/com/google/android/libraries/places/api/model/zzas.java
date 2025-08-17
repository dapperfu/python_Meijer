package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzas extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            if (this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final double getLikelihood() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final Place getPlace() {
        return this.zza;
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
        StringBuilder sb2 = new StringBuilder(length + 35 + String.valueOf(d10).length() + 1);
        sb2.append("PlaceLikelihood{place=");
        sb2.append(string);
        sb2.append(", likelihood=");
        sb2.append(d10);
        sb2.append("}");
        return sb2.toString();
    }

    zzas(Place place, double d10) {
        if (place != null) {
            this.zza = place;
            this.zzb = d10;
            return;
        }
        throw new NullPointerException("Null place");
    }
}
