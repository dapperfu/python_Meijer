package com.google.android.libraries.places.api.net;

import Td.AbstractC5223a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zze extends FetchPlaceRequest {
    private final String zza;
    private final List zzb;
    private final AutocompleteSessionToken zzc;
    private final AbstractC5223a zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        AbstractC5223a abstractC5223a;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceRequest) {
            FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
            if (this.zza.equals(fetchPlaceRequest.getPlaceId()) && this.zzb.equals(fetchPlaceRequest.getPlaceFields()) && ((autocompleteSessionToken = this.zzc) != null ? autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken()) : fetchPlaceRequest.getSessionToken() == null) && ((abstractC5223a = this.zzd) != null ? abstractC5223a.equals(fetchPlaceRequest.getCancellationToken()) : fetchPlaceRequest.getCancellationToken() == null) && ((str = this.zze) != null ? str.equals(fetchPlaceRequest.getRegionCode()) : fetchPlaceRequest.getRegionCode() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest, com.google.android.libraries.places.internal.zzmg
    public final AbstractC5223a getCancellationToken() {
        return this.zzd;
    }

    public final int hashCode() {
        int iHashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int iHashCode2 = ((iHashCode * 1000003) ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        AbstractC5223a abstractC5223a = this.zzd;
        int iHashCode3 = (iHashCode2 ^ (abstractC5223a == null ? 0 : abstractC5223a.hashCode())) * 1000003;
        String str = this.zze;
        return iHashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        AbstractC5223a abstractC5223a = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(abstractC5223a);
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        String str = this.zze;
        int length4 = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(str2.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        sb2.append("FetchPlaceRequest{placeId=");
        sb2.append(str2);
        sb2.append(", placeFields=");
        sb2.append(string);
        sb2.append(", sessionToken=");
        sb2.append(strValueOf);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf2);
        sb2.append(", regionCode=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zze(String str, List list, AutocompleteSessionToken autocompleteSessionToken, AbstractC5223a abstractC5223a, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = abstractC5223a;
        this.zze = str2;
    }
}
