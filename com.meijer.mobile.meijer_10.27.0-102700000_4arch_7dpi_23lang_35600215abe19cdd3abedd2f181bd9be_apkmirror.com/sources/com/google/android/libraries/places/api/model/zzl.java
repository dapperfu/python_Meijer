package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzl extends zzek {
    private final int zza;
    private final int zzb;

    zzl(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.zza == zzekVar.zza() && this.zzb == zzekVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzek
    final int zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzek
    final int zzb() {
        return this.zzb;
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 31 + String.valueOf(i11).length() + 1);
        sb2.append("SubstringMatch{offset=");
        sb2.append(i10);
        sb2.append(", length=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
