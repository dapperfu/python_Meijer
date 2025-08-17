package com.google.android.libraries.places.api.net;

import Td.AbstractC5223a;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzt extends SearchByTextRequest {
    private final AbstractC5223a zza;
    private final String zzb;
    private final LocationBias zzc;
    private final LocationRestriction zzd;
    private final Integer zze;
    private final Double zzf;
    private final boolean zzg;
    private final List zzh;
    private final List zzi;
    private final SearchByTextRequest.RankPreference zzj;
    private final String zzk;
    private final boolean zzl;
    private final String zzm;
    private final EVSearchOptions zzn;
    private final RoutingParameters zzo;
    private final SearchAlongRouteParameters zzp;
    private final boolean zzq;
    private final boolean zzr;

    /* synthetic */ zzt(AbstractC5223a abstractC5223a, String str, LocationBias locationBias, LocationRestriction locationRestriction, Integer num, Double d10, boolean z10, List list, List list2, SearchByTextRequest.RankPreference rankPreference, String str2, boolean z11, String str3, EVSearchOptions eVSearchOptions, RoutingParameters routingParameters, SearchAlongRouteParameters searchAlongRouteParameters, boolean z12, boolean z13, byte[] bArr) {
        this.zza = abstractC5223a;
        this.zzb = str;
        this.zzc = locationBias;
        this.zzd = locationRestriction;
        this.zze = num;
        this.zzf = d10;
        this.zzg = z10;
        this.zzh = list;
        this.zzi = list2;
        this.zzj = rankPreference;
        this.zzk = str2;
        this.zzl = z11;
        this.zzm = str3;
        this.zzn = eVSearchOptions;
        this.zzo = routingParameters;
        this.zzp = searchAlongRouteParameters;
        this.zzq = z12;
        this.zzr = z13;
    }

    public final boolean equals(Object obj) {
        SearchByTextRequest.RankPreference rankPreference;
        String str;
        EVSearchOptions eVSearchOptions;
        RoutingParameters routingParameters;
        SearchAlongRouteParameters searchAlongRouteParameters;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchByTextRequest) {
            SearchByTextRequest searchByTextRequest = (SearchByTextRequest) obj;
            AbstractC5223a abstractC5223a = this.zza;
            if (abstractC5223a != null ? abstractC5223a.equals(searchByTextRequest.getCancellationToken()) : searchByTextRequest.getCancellationToken() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(searchByTextRequest.getIncludedType()) : searchByTextRequest.getIncludedType() == null) {
                    LocationBias locationBias = this.zzc;
                    if (locationBias != null ? locationBias.equals(searchByTextRequest.getLocationBias()) : searchByTextRequest.getLocationBias() == null) {
                        LocationRestriction locationRestriction = this.zzd;
                        if (locationRestriction != null ? locationRestriction.equals(searchByTextRequest.getLocationRestriction()) : searchByTextRequest.getLocationRestriction() == null) {
                            Integer num = this.zze;
                            if (num != null ? num.equals(searchByTextRequest.getMaxResultCount()) : searchByTextRequest.getMaxResultCount() == null) {
                                Double d10 = this.zzf;
                                if (d10 != null ? d10.equals(searchByTextRequest.getMinRating()) : searchByTextRequest.getMinRating() == null) {
                                    if (this.zzg == searchByTextRequest.isOpenNow() && this.zzh.equals(searchByTextRequest.getPlaceFields()) && this.zzi.equals(searchByTextRequest.getPriceLevels()) && ((rankPreference = this.zzj) != null ? rankPreference.equals(searchByTextRequest.getRankPreference()) : searchByTextRequest.getRankPreference() == null) && ((str = this.zzk) != null ? str.equals(searchByTextRequest.getRegionCode()) : searchByTextRequest.getRegionCode() == null) && this.zzl == searchByTextRequest.isStrictTypeFiltering() && this.zzm.equals(searchByTextRequest.getTextQuery()) && ((eVSearchOptions = this.zzn) != null ? eVSearchOptions.equals(searchByTextRequest.getEvSearchOptions()) : searchByTextRequest.getEvSearchOptions() == null) && ((routingParameters = this.zzo) != null ? routingParameters.equals(searchByTextRequest.getRoutingParameters()) : searchByTextRequest.getRoutingParameters() == null) && ((searchAlongRouteParameters = this.zzp) != null ? searchAlongRouteParameters.equals(searchByTextRequest.getSearchAlongRouteParameters()) : searchByTextRequest.getSearchAlongRouteParameters() == null) && this.zzq == searchByTextRequest.isRoutingSummariesIncluded() && this.zzr == searchByTextRequest.isPureServiceAreaBusinessesIncluded()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public EVSearchOptions getEvSearchOptions() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public List<Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public List<Integer> getPriceLevels() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public RoutingParameters getRoutingParameters() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public SearchAlongRouteParameters getSearchAlongRouteParameters() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public String getTextQuery() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public boolean isOpenNow() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public boolean isPureServiceAreaBusinessesIncluded() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public boolean isRoutingSummariesIncluded() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public boolean isStrictTypeFiltering() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final SearchByTextRequest.Builder zza() {
        return new zzs(this);
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public final AbstractC5223a getCancellationToken() {
        return this.zza;
    }

    public final int hashCode() {
        AbstractC5223a abstractC5223a = this.zza;
        int iHashCode = abstractC5223a == null ? 0 : abstractC5223a.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i10 = iHashCode ^ 1000003;
        LocationBias locationBias = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        Integer num = this.zze;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d10 = this.zzf;
        int iHashCode6 = (((((((iHashCode5 ^ (d10 == null ? 0 : d10.hashCode())) * 1000003) ^ (true != this.zzg ? 1237 : 1231)) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003;
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        int iHashCode7 = (iHashCode6 ^ (rankPreference == null ? 0 : rankPreference.hashCode())) * 1000003;
        String str2 = this.zzk;
        int iHashCode8 = (((((iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.zzl ? 1237 : 1231)) * 1000003) ^ this.zzm.hashCode()) * 1000003;
        EVSearchOptions eVSearchOptions = this.zzn;
        int iHashCode9 = (iHashCode8 ^ (eVSearchOptions == null ? 0 : eVSearchOptions.hashCode())) * 1000003;
        RoutingParameters routingParameters = this.zzo;
        int iHashCode10 = (iHashCode9 ^ (routingParameters == null ? 0 : routingParameters.hashCode())) * 1000003;
        SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        return ((((iHashCode10 ^ (searchAlongRouteParameters != null ? searchAlongRouteParameters.hashCode() : 0)) * 1000003) ^ (true != this.zzq ? 1237 : 1231)) * 1000003) ^ (true != this.zzr ? 1237 : 1231);
    }

    public final String toString() {
        SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        RoutingParameters routingParameters = this.zzo;
        EVSearchOptions eVSearchOptions = this.zzn;
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        List list = this.zzi;
        List list2 = this.zzh;
        LocationRestriction locationRestriction = this.zzd;
        LocationBias locationBias = this.zzc;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(locationBias);
        String strValueOf3 = String.valueOf(locationRestriction);
        String string = list2.toString();
        String string2 = list.toString();
        String strValueOf4 = String.valueOf(rankPreference);
        String strValueOf5 = String.valueOf(eVSearchOptions);
        String strValueOf6 = String.valueOf(routingParameters);
        String strValueOf7 = String.valueOf(searchAlongRouteParameters);
        int length = strValueOf.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        Integer num = this.zze;
        int length5 = String.valueOf(num).length();
        Double d10 = this.zzf;
        int length6 = String.valueOf(d10).length();
        boolean z10 = this.zzg;
        int length7 = String.valueOf(z10).length();
        int length8 = string.length();
        int length9 = string2.length();
        int length10 = strValueOf4.length();
        String str2 = this.zzk;
        int length11 = String.valueOf(str2).length();
        boolean z11 = this.zzl;
        int length12 = String.valueOf(z11).length();
        int length13 = strValueOf5.length();
        int length14 = strValueOf6.length();
        int length15 = strValueOf7.length();
        boolean z12 = this.zzq;
        int length16 = String.valueOf(z12).length();
        String str3 = this.zzm;
        int length17 = length + 53 + length2 + 15 + length3 + 22 + length4 + 17 + length5 + 12 + length6 + 10 + length7 + 14 + length8 + 14 + length9 + 17 + length10 + 13 + length11 + 22 + length12 + 12 + str3.length() + 18 + length13 + 20 + length14 + 29 + length15;
        boolean z13 = this.zzr;
        StringBuilder sb2 = new StringBuilder(length17 + 27 + length16 + 36 + String.valueOf(z13).length() + 1);
        sb2.append("SearchByTextRequest{cancellationToken=");
        sb2.append(strValueOf);
        sb2.append(", includedType=");
        sb2.append(str);
        sb2.append(", locationBias=");
        sb2.append(strValueOf2);
        sb2.append(", locationRestriction=");
        sb2.append(strValueOf3);
        sb2.append(", maxResultCount=");
        sb2.append(num);
        sb2.append(", minRating=");
        sb2.append(d10);
        sb2.append(", openNow=");
        sb2.append(z10);
        sb2.append(", placeFields=");
        sb2.append(string);
        sb2.append(", priceLevels=");
        sb2.append(string2);
        sb2.append(", rankPreference=");
        sb2.append(strValueOf4);
        sb2.append(", regionCode=");
        sb2.append(str2);
        sb2.append(", strictTypeFiltering=");
        sb2.append(z11);
        sb2.append(", textQuery=");
        sb2.append(str3);
        sb2.append(", evSearchOptions=");
        sb2.append(strValueOf5);
        sb2.append(", routingParameters=");
        sb2.append(strValueOf6);
        sb2.append(", searchAlongRouteParameters=");
        sb2.append(strValueOf7);
        sb2.append(", routingSummariesIncluded=");
        sb2.append(z12);
        sb2.append(", pureServiceAreaBusinessesIncluded=");
        sb2.append(z13);
        sb2.append("}");
        return sb2.toString();
    }
}
