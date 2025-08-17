package com.google.android.libraries.places.api.net;

import Td.AbstractC5223a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

/* loaded from: classes6.dex */
final class zzk extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final LatLng zzd;
    private final List zze;
    private final AutocompleteSessionToken zzf;
    private final TypeFilter zzg;
    private final List zzh;
    private final Integer zzi;
    private final String zzj;
    private final boolean zzk;
    private final AbstractC5223a zzl;

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        TypeFilter typeFilter;
        Integer num;
        String str;
        AbstractC5223a abstractC5223a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsRequest) {
            FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
            String str2 = this.zza;
            if (str2 != null ? str2.equals(findAutocompletePredictionsRequest.getQuery()) : findAutocompletePredictionsRequest.getQuery() == null) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(findAutocompletePredictionsRequest.getLocationBias()) : findAutocompletePredictionsRequest.getLocationBias() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction()) : findAutocompletePredictionsRequest.getLocationRestriction() == null) {
                        LatLng latLng = this.zzd;
                        if (latLng != null ? latLng.equals(findAutocompletePredictionsRequest.getOrigin()) : findAutocompletePredictionsRequest.getOrigin() == null) {
                            if (this.zze.equals(findAutocompletePredictionsRequest.getCountries()) && ((autocompleteSessionToken = this.zzf) != null ? autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken()) : findAutocompletePredictionsRequest.getSessionToken() == null) && ((typeFilter = this.zzg) != null ? typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter()) : findAutocompletePredictionsRequest.getTypeFilter() == null) && this.zzh.equals(findAutocompletePredictionsRequest.getTypesFilter()) && ((num = this.zzi) != null ? num.equals(findAutocompletePredictionsRequest.getInputOffset()) : findAutocompletePredictionsRequest.getInputOffset() == null) && ((str = this.zzj) != null ? str.equals(findAutocompletePredictionsRequest.getRegionCode()) : findAutocompletePredictionsRequest.getRegionCode() == null) && this.zzk == findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded() && ((abstractC5223a = this.zzl) != null ? abstractC5223a.equals(findAutocompletePredictionsRequest.getCancellationToken()) : findAutocompletePredictionsRequest.getCancellationToken() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final Integer getInputOffset() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getRegionCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Deprecated
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getTypesFilter() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final boolean isPureServiceAreaBusinessesIncluded() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmg
    public final AbstractC5223a getCancellationToken() {
        return this.zzl;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        LocationBias locationBias = this.zzb;
        int iHashCode2 = locationBias == null ? 0 : locationBias.hashCode();
        int i10 = iHashCode ^ 1000003;
        LocationRestriction locationRestriction = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        LatLng latLng = this.zzd;
        int iHashCode4 = (((iHashCode3 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003) ^ this.zze.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        int iHashCode5 = (iHashCode4 ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        TypeFilter typeFilter = this.zzg;
        int iHashCode6 = (((iHashCode5 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        Integer num = this.zzi;
        int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.zzj;
        int iHashCode8 = (((iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003;
        AbstractC5223a abstractC5223a = this.zzl;
        return iHashCode8 ^ (abstractC5223a != null ? abstractC5223a.hashCode() : 0);
    }

    public final String toString() {
        AbstractC5223a abstractC5223a = this.zzl;
        List list = this.zzh;
        TypeFilter typeFilter = this.zzg;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        List list2 = this.zze;
        LatLng latLng = this.zzd;
        LocationRestriction locationRestriction = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(locationRestriction);
        String strValueOf3 = String.valueOf(latLng);
        String string = list2.toString();
        String strValueOf4 = String.valueOf(autocompleteSessionToken);
        String strValueOf5 = String.valueOf(typeFilter);
        String string2 = list.toString();
        String strValueOf6 = String.valueOf(abstractC5223a);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        int length5 = string.length();
        int length6 = strValueOf4.length();
        int length7 = strValueOf5.length();
        int length8 = string2.length();
        Integer num = this.zzi;
        int length9 = String.valueOf(num).length();
        String str2 = this.zzj;
        int length10 = String.valueOf(str2).length();
        boolean z10 = this.zzk;
        StringBuilder sb2 = new StringBuilder(length + 56 + length2 + 22 + length3 + 9 + length4 + 12 + length5 + 15 + length6 + 13 + length7 + 14 + length8 + 14 + length9 + 13 + length10 + 36 + String.valueOf(z10).length() + 20 + strValueOf6.length() + 1);
        sb2.append("FindAutocompletePredictionsRequest{query=");
        sb2.append(str);
        sb2.append(", locationBias=");
        sb2.append(strValueOf);
        sb2.append(", locationRestriction=");
        sb2.append(strValueOf2);
        sb2.append(", origin=");
        sb2.append(strValueOf3);
        sb2.append(", countries=");
        sb2.append(string);
        sb2.append(", sessionToken=");
        sb2.append(strValueOf4);
        sb2.append(", typeFilter=");
        sb2.append(strValueOf5);
        sb2.append(", typesFilter=");
        sb2.append(string2);
        sb2.append(", inputOffset=");
        sb2.append(num);
        sb2.append(", regionCode=");
        sb2.append(str2);
        sb2.append(", pureServiceAreaBusinessesIncluded=");
        sb2.append(z10);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf6);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzk(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, List list2, Integer num, String str2, boolean z10, AbstractC5223a abstractC5223a, byte[] bArr) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = list2;
        this.zzi = num;
        this.zzj = str2;
        this.zzk = z10;
        this.zzl = abstractC5223a;
    }
}
