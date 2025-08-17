package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ConnectorAggregation;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzo extends ConnectorAggregation.Builder {
    private EVConnectorType zza;
    private Double zzb;
    private Integer zzc;
    private Integer zzd;
    private Integer zze;
    private Instant zzf;

    zzo() {
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailabilityLastUpdateTime(Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailableCount(Integer num) {
        this.zzd = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setOutOfServiceCount(Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation build() {
        Double d10;
        Integer num;
        EVConnectorType eVConnectorType = this.zza;
        if (eVConnectorType != null && (d10 = this.zzb) != null && (num = this.zzc) != null) {
            return new zzcg(eVConnectorType, d10, num, this.zzd, this.zze, this.zzf);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" type");
        }
        if (this.zzb == null) {
            sb2.append(" maxChargeRateKw");
        }
        if (this.zzc == null) {
            sb2.append(" count");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setCount(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null count");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setMaxChargeRateKw(Double d10) {
        if (d10 == null) {
            throw new NullPointerException("Null maxChargeRateKw");
        }
        this.zzb = d10;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setType(EVConnectorType eVConnectorType) {
        if (eVConnectorType == null) {
            throw new NullPointerException("Null type");
        }
        this.zza = eVConnectorType;
        return this;
    }
}
