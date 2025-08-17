package com.google.android.libraries.places.api.model;

import j$.time.Instant;

/* loaded from: classes6.dex */
abstract class zzp extends ConnectorAggregation {
    private final EVConnectorType zza;
    private final Double zzb;
    private final Integer zzc;
    private final Integer zzd;
    private final Integer zze;
    private final Instant zzf;

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Instant instant;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectorAggregation) {
            ConnectorAggregation connectorAggregation = (ConnectorAggregation) obj;
            if (this.zza.equals(connectorAggregation.getType()) && this.zzb.equals(connectorAggregation.getMaxChargeRateKw()) && this.zzc.equals(connectorAggregation.getCount()) && ((num = this.zzd) != null ? num.equals(connectorAggregation.getAvailableCount()) : connectorAggregation.getAvailableCount() == null) && ((num2 = this.zze) != null ? num2.equals(connectorAggregation.getOutOfServiceCount()) : connectorAggregation.getOutOfServiceCount() == null) && ((instant = this.zzf) != null ? instant.equals(connectorAggregation.getAvailabilityLastUpdateTime()) : connectorAggregation.getAvailabilityLastUpdateTime() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getCount() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Double getMaxChargeRateKw() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final EVConnectorType getType() {
        return this.zza;
    }

    public final int hashCode() {
        int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        Integer num = this.zzd;
        int iHashCode2 = ((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.zze;
        int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Instant instant = this.zzf;
        return iHashCode3 ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzf);
        Double d10 = this.zzb;
        int length2 = d10.toString().length();
        Integer num = this.zzc;
        int length3 = num.toString().length();
        Integer num2 = this.zzd;
        int length4 = String.valueOf(num2).length();
        Integer num3 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + String.valueOf(num3).length() + 29 + strValueOf.length() + 1);
        sb2.append("ConnectorAggregation{type=");
        sb2.append(string);
        sb2.append(", maxChargeRateKw=");
        sb2.append(d10);
        sb2.append(", count=");
        sb2.append(num);
        sb2.append(", availableCount=");
        sb2.append(num2);
        sb2.append(", outOfServiceCount=");
        sb2.append(num3);
        sb2.append(", availabilityLastUpdateTime=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    zzp(EVConnectorType eVConnectorType, Double d10, Integer num, Integer num2, Integer num3, Instant instant) {
        if (eVConnectorType != null) {
            this.zza = eVConnectorType;
            this.zzb = d10;
            this.zzc = num;
            this.zzd = num2;
            this.zze = num3;
            this.zzf = instant;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
