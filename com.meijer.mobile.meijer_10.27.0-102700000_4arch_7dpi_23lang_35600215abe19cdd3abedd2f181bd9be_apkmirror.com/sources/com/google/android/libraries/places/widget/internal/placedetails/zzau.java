package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.view.C5988D;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class zzau {
    private final PhotoMetadata zza;
    private final int zzb;
    private final C5988D zzc;

    public zzau(PhotoMetadata metadata, int i10, C5988D destination) {
        Intrinsics.j(metadata, "metadata");
        Intrinsics.j(destination, "destination");
        this.zza = metadata;
        this.zzb = i10;
        this.zzc = destination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzau)) {
            return false;
        }
        zzau zzauVar = (zzau) obj;
        return Intrinsics.e(this.zza, zzauVar.zza) && this.zzb == zzauVar.zzb && Intrinsics.e(this.zzc, zzauVar.zzc);
    }

    public final int hashCode() {
        return (((this.zza.hashCode() * 31) + Integer.hashCode(this.zzb)) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        PhotoMetadata photoMetadata = this.zza;
        int length = String.valueOf(photoMetadata).length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        C5988D c5988d = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 14 + String.valueOf(c5988d).length() + 1);
        sb2.append("PhotoUriRequest(metadata=");
        sb2.append(photoMetadata);
        sb2.append(", maxDimension=");
        sb2.append(i10);
        sb2.append(", destination=");
        sb2.append(c5988d);
        sb2.append(")");
        return sb2.toString();
    }

    public final PhotoMetadata zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final C5988D zzc() {
        return this.zzc;
    }
}
