package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.EVSearchOptions;
import java.util.List;

/* loaded from: classes6.dex */
final class zzs extends EVSearchOptions.Builder {
    private Double zza;
    private List zzb;

    zzs() {
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions build() {
        return new zzck(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final List<EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final Double getMinimumChargingRateKw() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions.Builder setConnectorTypes(List<EVConnectorType> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions.Builder setMinimumChargingRateKw(Double d10) {
        this.zza = d10;
        return this;
    }
}
