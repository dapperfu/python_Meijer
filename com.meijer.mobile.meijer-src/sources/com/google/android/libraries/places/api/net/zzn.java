package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zzn extends FindCurrentPlaceRequest {
    private final List zza;
    private final AbstractC5507a zzb;

    public final boolean equals(Object obj) {
        AbstractC5507a abstractC5507a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) && ((abstractC5507a = this.zzb) != null ? abstractC5507a.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzmg
    public final AbstractC5507a getCancellationToken() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        AbstractC5507a abstractC5507a = this.zzb;
        return (iHashCode * 1000003) ^ (abstractC5507a == null ? 0 : abstractC5507a.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 56 + strValueOf.length() + 1);
        sb2.append("FindCurrentPlaceRequest{placeFields=");
        sb2.append(string);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzn(List list, AbstractC5507a abstractC5507a, byte[] bArr) {
        this.zza = list;
        this.zzb = abstractC5507a;
    }
}
