package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzbc extends RouteModifiers {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzbc(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RouteModifiers) {
            RouteModifiers routeModifiers = (RouteModifiers) obj;
            if (this.zza == routeModifiers.isTollAvoided() && this.zzb == routeModifiers.isHighwayAvoided() && this.zzc == routeModifiers.isFerryAvoided() && this.zzd == routeModifiers.isIndoorAvoided()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = true != this.zza ? 1237 : 1231;
        return ((((((i10 ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isFerryAvoided() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isHighwayAvoided() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isIndoorAvoided() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isTollAvoided() {
        return this.zza;
    }

    public final String toString() {
        boolean z10 = this.zza;
        int length = String.valueOf(z10).length();
        boolean z11 = this.zzb;
        int length2 = String.valueOf(z11).length();
        boolean z12 = this.zzc;
        int length3 = String.valueOf(z12).length();
        boolean z13 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 15 + length3 + 16 + String.valueOf(z13).length() + 1);
        sb2.append("RouteModifiers{tollAvoided=");
        sb2.append(z10);
        sb2.append(", highwayAvoided=");
        sb2.append(z11);
        sb2.append(", ferryAvoided=");
        sb2.append(z12);
        sb2.append(", indoorAvoided=");
        sb2.append(z13);
        sb2.append("}");
        return sb2.toString();
    }
}
