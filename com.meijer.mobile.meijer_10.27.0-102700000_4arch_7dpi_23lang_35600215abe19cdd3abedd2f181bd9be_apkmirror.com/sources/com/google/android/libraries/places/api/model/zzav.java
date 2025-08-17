package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
final class zzav extends zzex {
    private Money zza;
    private Money zzb;

    zzav() {
    }

    @Override // com.google.android.libraries.places.api.model.zzex
    public final zzex zza(Money money) {
        this.zza = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzex
    public final zzex zzb(Money money) {
        this.zzb = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzex
    public final zzey zzc() {
        return new zzdq(this.zza, this.zzb);
    }
}
