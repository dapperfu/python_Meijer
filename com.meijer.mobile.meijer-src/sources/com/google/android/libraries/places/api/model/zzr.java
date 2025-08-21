package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zzr extends EVChargeOptions {
    private final Integer zza;
    private final List zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EVChargeOptions) {
            EVChargeOptions eVChargeOptions = (EVChargeOptions) obj;
            if (this.zza.equals(eVChargeOptions.getConnectorCount()) && this.zzb.equals(eVChargeOptions.getConnectorAggregations())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final List<ConnectorAggregation> getConnectorAggregations() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final Integer getConnectorCount() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zzb.toString();
        Integer num = this.zza;
        StringBuilder sb2 = new StringBuilder(num.toString().length() + 55 + string.length() + 1);
        sb2.append("EVChargeOptions{connectorCount=");
        sb2.append(num);
        sb2.append(", connectorAggregations=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzr(Integer num, List list) {
        this.zza = num;
        if (list != null) {
            this.zzb = list;
            return;
        }
        throw new NullPointerException("Null connectorAggregations");
    }
}
