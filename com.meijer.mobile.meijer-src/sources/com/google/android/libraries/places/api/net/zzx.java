package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzx extends SearchNearbyRequest {
    private final String zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final Integer zzf;
    private final LocationRestriction zzg;
    private final List zzh;
    private final AbstractC5507a zzi;
    private final SearchNearbyRequest.RankPreference zzj;
    private final RoutingParameters zzk;
    private final boolean zzl;

    public final boolean equals(Object obj) {
        AbstractC5507a abstractC5507a;
        SearchNearbyRequest.RankPreference rankPreference;
        RoutingParameters routingParameters;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchNearbyRequest) {
            SearchNearbyRequest searchNearbyRequest = (SearchNearbyRequest) obj;
            String str = this.zza;
            if (str != null ? str.equals(searchNearbyRequest.getRegionCode()) : searchNearbyRequest.getRegionCode() == null) {
                List list = this.zzb;
                if (list != null ? list.equals(searchNearbyRequest.getIncludedTypes()) : searchNearbyRequest.getIncludedTypes() == null) {
                    List list2 = this.zzc;
                    if (list2 != null ? list2.equals(searchNearbyRequest.getExcludedTypes()) : searchNearbyRequest.getExcludedTypes() == null) {
                        List list3 = this.zzd;
                        if (list3 != null ? list3.equals(searchNearbyRequest.getIncludedPrimaryTypes()) : searchNearbyRequest.getIncludedPrimaryTypes() == null) {
                            List list4 = this.zze;
                            if (list4 != null ? list4.equals(searchNearbyRequest.getExcludedPrimaryTypes()) : searchNearbyRequest.getExcludedPrimaryTypes() == null) {
                                Integer num = this.zzf;
                                if (num != null ? num.equals(searchNearbyRequest.getMaxResultCount()) : searchNearbyRequest.getMaxResultCount() == null) {
                                    if (this.zzg.equals(searchNearbyRequest.getLocationRestriction()) && this.zzh.equals(searchNearbyRequest.getPlaceFields()) && ((abstractC5507a = this.zzi) != null ? abstractC5507a.equals(searchNearbyRequest.getCancellationToken()) : searchNearbyRequest.getCancellationToken() == null) && ((rankPreference = this.zzj) != null ? rankPreference.equals(searchNearbyRequest.getRankPreference()) : searchNearbyRequest.getRankPreference() == null) && ((routingParameters = this.zzk) != null ? routingParameters.equals(searchNearbyRequest.getRoutingParameters()) : searchNearbyRequest.getRoutingParameters() == null) && this.zzl == searchNearbyRequest.isRoutingSummariesIncluded()) {
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

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public List<String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public List<String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public List<String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public List<String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public LocationRestriction getLocationRestriction() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public List<Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public RoutingParameters getRoutingParameters() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public boolean isRoutingSummariesIncluded() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final SearchNearbyRequest.Builder zza() {
        return new zzw(this);
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest, com.google.android.libraries.places.internal.zzmg
    public AbstractC5507a getCancellationToken() {
        return this.zzi;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.zzb;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int i10 = iHashCode ^ 1000003;
        List list2 = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.zze;
        int iHashCode5 = (iHashCode4 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        Integer num = this.zzf;
        int iHashCode6 = (((((iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        AbstractC5507a abstractC5507a = this.zzi;
        int iHashCode7 = (iHashCode6 ^ (abstractC5507a == null ? 0 : abstractC5507a.hashCode())) * 1000003;
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        int iHashCode8 = (iHashCode7 ^ (rankPreference == null ? 0 : rankPreference.hashCode())) * 1000003;
        RoutingParameters routingParameters = this.zzk;
        return ((iHashCode8 ^ (routingParameters != null ? routingParameters.hashCode() : 0)) * 1000003) ^ (true != this.zzl ? 1237 : 1231);
    }

    public final String toString() {
        RoutingParameters routingParameters = this.zzk;
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        AbstractC5507a abstractC5507a = this.zzi;
        List list = this.zzh;
        LocationRestriction locationRestriction = this.zzg;
        List list2 = this.zze;
        List list3 = this.zzd;
        List list4 = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(list4);
        String strValueOf3 = String.valueOf(list3);
        String strValueOf4 = String.valueOf(list2);
        String string = locationRestriction.toString();
        String string2 = list.toString();
        String strValueOf5 = String.valueOf(abstractC5507a);
        String strValueOf6 = String.valueOf(rankPreference);
        String strValueOf7 = String.valueOf(routingParameters);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        int length5 = strValueOf4.length();
        Integer num = this.zzf;
        int length6 = String.valueOf(num).length();
        int length7 = string.length();
        int length8 = string2.length();
        int length9 = strValueOf5.length();
        int length10 = strValueOf6.length();
        int length11 = strValueOf7.length();
        boolean z10 = this.zzl;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 16 + length3 + 23 + length4 + 23 + length5 + 17 + length6 + 22 + length7 + 14 + length8 + 20 + length9 + 17 + length10 + 20 + length11 + 27 + String.valueOf(z10).length() + 1);
        sb2.append("SearchNearbyRequest{regionCode=");
        sb2.append(str);
        sb2.append(", includedTypes=");
        sb2.append(strValueOf);
        sb2.append(", excludedTypes=");
        sb2.append(strValueOf2);
        sb2.append(", includedPrimaryTypes=");
        sb2.append(strValueOf3);
        sb2.append(", excludedPrimaryTypes=");
        sb2.append(strValueOf4);
        sb2.append(", maxResultCount=");
        sb2.append(num);
        sb2.append(", locationRestriction=");
        sb2.append(string);
        sb2.append(", placeFields=");
        sb2.append(string2);
        sb2.append(", cancellationToken=");
        sb2.append(strValueOf5);
        sb2.append(", rankPreference=");
        sb2.append(strValueOf6);
        sb2.append(", routingParameters=");
        sb2.append(strValueOf7);
        sb2.append(", routingSummariesIncluded=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    /* synthetic */ zzx(String str, List list, List list2, List list3, List list4, Integer num, LocationRestriction locationRestriction, List list5, AbstractC5507a abstractC5507a, SearchNearbyRequest.RankPreference rankPreference, RoutingParameters routingParameters, boolean z10, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
        this.zze = list4;
        this.zzf = num;
        this.zzg = locationRestriction;
        this.zzh = list5;
        this.zzi = abstractC5507a;
        this.zzj = rankPreference;
        this.zzk = routingParameters;
        this.zzl = z10;
    }
}
