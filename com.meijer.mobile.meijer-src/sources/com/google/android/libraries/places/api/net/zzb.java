package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* loaded from: classes6.dex */
final class zzb extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final AbstractC5507a zzd;

    public final boolean equals(Object obj) {
        AbstractC5507a abstractC5507a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (this.zzc.equals(fetchPhotoRequest.getPhotoMetadata()) && ((abstractC5507a = this.zzd) != null ? abstractC5507a.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzmg
    public final AbstractC5507a getCancellationToken() {
        return this.zzd;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode();
        AbstractC5507a abstractC5507a = this.zzd;
        return (iHashCode2 * 1000003) ^ (abstractC5507a != null ? abstractC5507a.hashCode() : 0);
    }

    public final String toString() {
        AbstractC5507a abstractC5507a = this.zzd;
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(abstractC5507a);
        Integer num = this.zza;
        int length = String.valueOf(num).length();
        Integer num2 = this.zzb;
        int length2 = String.valueOf(num2).length();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 16 + string.length() + 20 + strValueOf.length() + 1);
        sb2.append("FetchPhotoRequest{maxWidth=");
        sb2.append(num);
        sb2.append(", maxHeight=");
        sb2.append(num2);
        sb2.append(", photoMetadata=");
        sb2.append(string);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzb(Integer num, Integer num2, PhotoMetadata photoMetadata, AbstractC5507a abstractC5507a, byte[] bArr) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = abstractC5507a;
    }
}
