package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Money;

/* loaded from: classes6.dex */
final class zzae extends Money.Builder {
    private String zza;
    private Long zzb;
    private Integer zzc;

    zzae() {
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Integer getNanos() {
        Integer num = this.zzc;
        if (num != null) {
            return num;
        }
        throw new IllegalStateException("Property \"nanos\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Long getUnits() {
        Long l10 = this.zzb;
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("Property \"units\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setCurrencyCode(String str) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setNanos(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null nanos");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setUnits(Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Null units");
        }
        this.zzb = l10;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    final Money zza() {
        Long l10;
        Integer num;
        String str = this.zza;
        if (str != null && (l10 = this.zzb) != null && (num = this.zzc) != null) {
            return new zzcy(str, l10, num);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" currencyCode");
        }
        if (this.zzb == null) {
            sb2.append(" units");
        }
        if (this.zzc == null) {
            sb2.append(" nanos");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
