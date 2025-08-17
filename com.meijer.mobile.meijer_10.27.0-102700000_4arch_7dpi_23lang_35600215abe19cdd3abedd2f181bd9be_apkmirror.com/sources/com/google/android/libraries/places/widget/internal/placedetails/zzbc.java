package com.google.android.libraries.places.widget.internal.placedetails;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzbc {
    private final boolean zza;
    private final List zzb;
    private final int zzc;
    private final int zzd;

    public zzbc(boolean z10, List fieldsToLoad, int i10, int i11) {
        Intrinsics.j(fieldsToLoad, "fieldsToLoad");
        this.zza = z10;
        this.zzb = fieldsToLoad;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return this.zza == zzbcVar.zza && Intrinsics.e(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.zza) * 31) + this.zzb.hashCode()) * 31) + Integer.hashCode(this.zzc)) * 31) + Integer.hashCode(this.zzd);
    }

    public final String toString() {
        boolean z10 = this.zza;
        int length = String.valueOf(z10).length();
        List list = this.zzb;
        int length2 = String.valueOf(list).length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 51 + length2 + 29 + length3 + 29 + String.valueOf(i11).length() + 1);
        sb2.append("RequestConfiguration(mediaRequested=");
        sb2.append(z10);
        sb2.append(", fieldsToLoad=");
        sb2.append(list);
        sb2.append(", thumbSizeDimensionInPixels=");
        sb2.append(i10);
        sb2.append(", screenMaxDimensionInPixels=");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
