package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzad extends LocalTime {
    private final int zza;
    private final int zzb;

    zzad(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.zza == localTime.getHours() && this.zzb == localTime.getMinutes()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getHours() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getMinutes() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(i11).length() + 1);
        sb2.append("LocalTime{hours=");
        sb2.append(i10);
        sb2.append(", minutes=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
