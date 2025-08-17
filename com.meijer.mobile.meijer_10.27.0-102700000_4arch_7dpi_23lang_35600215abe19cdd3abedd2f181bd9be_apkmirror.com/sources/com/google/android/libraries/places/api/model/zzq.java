package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.EVChargeOptions;
import java.util.List;

/* loaded from: classes6.dex */
final class zzq extends EVChargeOptions.Builder {
    private Integer zza;
    private List zzb;

    zzq() {
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions build() {
        List list;
        Integer num = this.zza;
        if (num != null && (list = this.zzb) != null) {
            return new zzci(num, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" connectorCount");
        }
        if (this.zzb == null) {
            sb2.append(" connectorAggregations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorAggregations(List<ConnectorAggregation> list) {
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorCount(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null connectorCount");
        }
        this.zza = num;
        return this;
    }
}
