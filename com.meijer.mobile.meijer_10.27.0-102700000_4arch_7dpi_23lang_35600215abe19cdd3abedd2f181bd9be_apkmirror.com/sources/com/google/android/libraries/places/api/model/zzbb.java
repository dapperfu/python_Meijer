package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.RouteModifiers;

/* loaded from: classes6.dex */
final class zzbb extends RouteModifiers.Builder {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private byte zze;

    zzbb() {
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setFerryAvoided(boolean z10) {
        this.zzc = z10;
        this.zze = (byte) (this.zze | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setHighwayAvoided(boolean z10) {
        this.zzb = z10;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setIndoorAvoided(boolean z10) {
        this.zzd = z10;
        this.zze = (byte) (this.zze | 8);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setTollAvoided(boolean z10) {
        this.zza = z10;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers build() {
        if (this.zze == 15) {
            return new zzdw(this.zza, this.zzb, this.zzc, this.zzd);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb2.append(" tollAvoided");
        }
        if ((this.zze & 2) == 0) {
            sb2.append(" highwayAvoided");
        }
        if ((this.zze & 4) == 0) {
            sb2.append(" ferryAvoided");
        }
        if ((this.zze & 8) == 0) {
            sb2.append(" indoorAvoided");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isFerryAvoided() {
        if ((this.zze & 4) != 0) {
            return this.zzc;
        }
        throw new IllegalStateException("Property \"ferryAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isHighwayAvoided() {
        if ((this.zze & 2) != 0) {
            return this.zzb;
        }
        throw new IllegalStateException("Property \"highwayAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isIndoorAvoided() {
        if ((this.zze & 8) != 0) {
            return this.zzd;
        }
        throw new IllegalStateException("Property \"indoorAvoided\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isTollAvoided() {
        if ((this.zze & 1) != 0) {
            return this.zza;
        }
        throw new IllegalStateException("Property \"tollAvoided\" has not been set");
    }
}
