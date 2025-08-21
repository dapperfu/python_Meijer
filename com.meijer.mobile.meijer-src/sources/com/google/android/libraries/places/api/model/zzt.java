package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zzt extends EVSearchOptions {
    private final Double zza;
    private final List zzb;

    zzt(Double d10, List list) {
        this.zza = d10;
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EVSearchOptions) {
            EVSearchOptions eVSearchOptions = (EVSearchOptions) obj;
            Double d10 = this.zza;
            if (d10 != null ? d10.equals(eVSearchOptions.getMinimumChargingRateKw()) : eVSearchOptions.getMinimumChargingRateKw() == null) {
                List list = this.zzb;
                if (list != null ? list.equals(eVSearchOptions.getConnectorTypes()) : eVSearchOptions.getConnectorTypes() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final List<EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final Double getMinimumChargingRateKw() {
        return this.zza;
    }

    public final int hashCode() {
        Double d10 = this.zza;
        int iHashCode = d10 == null ? 0 : d10.hashCode();
        List list = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        Double d10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 55 + strValueOf.length() + 1);
        sb2.append("EVSearchOptions{minimumChargingRateKw=");
        sb2.append(d10);
        sb2.append(", connectorTypes=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
