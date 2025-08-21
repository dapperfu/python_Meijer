package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.R;

/* loaded from: classes6.dex */
final class zzbr {
    private final int zza;
    private final boolean zzb;

    public zzbr(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbr)) {
            return false;
        }
        zzbr zzbrVar = (zzbr) obj;
        return this.zza == zzbrVar.zza && this.zzb == zzbrVar.zzb;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.zza) * 31) + Boolean.hashCode(this.zzb);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        boolean z10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 40 + String.valueOf(z10).length() + 1);
        sb2.append("StarsModel(numWholeStars=");
        sb2.append(i10);
        sb2.append(", showHalfStar=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    public final int zza(int i10) {
        int i11 = this.zza;
        return i10 < i11 ? R.drawable.ratings_full_star : i10 == i11 ? this.zzb ? R.drawable.ratings_half_star : R.drawable.ratings_empty_star : R.drawable.ratings_empty_star;
    }
}
