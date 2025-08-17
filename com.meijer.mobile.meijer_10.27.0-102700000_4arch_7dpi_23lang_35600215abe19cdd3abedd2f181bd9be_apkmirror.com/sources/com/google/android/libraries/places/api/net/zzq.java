package com.google.android.libraries.places.api.net;

import Td.AbstractC5223a;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzq extends IsOpenRequest {
    private final Place zza;
    private final String zzb;
    private final long zzc;
    private final AbstractC5223a zzd;

    public final boolean equals(Object obj) {
        AbstractC5223a abstractC5223a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IsOpenRequest) {
            IsOpenRequest isOpenRequest = (IsOpenRequest) obj;
            Place place = this.zza;
            if (place != null ? place.equals(isOpenRequest.getPlace()) : isOpenRequest.getPlace() == null) {
                String str = this.zzb;
                if (str != null ? str.equals(isOpenRequest.getPlaceId()) : isOpenRequest.getPlaceId() == null) {
                    if (this.zzc == isOpenRequest.getUtcTimeMillis() && ((abstractC5223a = this.zzd) != null ? abstractC5223a.equals(isOpenRequest.getCancellationToken()) : isOpenRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final long getUtcTimeMillis() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest, com.google.android.libraries.places.internal.zzmg
    public final AbstractC5223a getCancellationToken() {
        return this.zzd;
    }

    public final int hashCode() {
        Place place = this.zza;
        int iHashCode = place == null ? 0 : place.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i10 = iHashCode ^ 1000003;
        long j10 = this.zzc;
        AbstractC5223a abstractC5223a = this.zzd;
        return (((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (abstractC5223a != null ? abstractC5223a.hashCode() : 0);
    }

    public final String toString() {
        AbstractC5223a abstractC5223a = this.zzd;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(abstractC5223a);
        int length = strValueOf.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        long j10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 16 + String.valueOf(j10).length() + 20 + strValueOf2.length() + 1);
        sb2.append("IsOpenRequest{place=");
        sb2.append(strValueOf);
        sb2.append(", placeId=");
        sb2.append(str);
        sb2.append(", utcTimeMillis=");
        sb2.append(j10);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf2);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzq(Place place, String str, long j10, AbstractC5223a abstractC5223a, byte[] bArr) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = abstractC5223a;
    }
}
