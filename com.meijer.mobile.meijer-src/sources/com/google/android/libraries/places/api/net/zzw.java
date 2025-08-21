package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzw extends SearchNearbyRequest.Builder {
    private String zza;
    private List zzb;
    private List zzc;
    private List zzd;
    private List zze;
    private Integer zzf;
    private LocationRestriction zzg;
    private List zzh;
    private AbstractC5507a zzi;
    private SearchNearbyRequest.RankPreference zzj;
    private RoutingParameters zzk;
    private boolean zzl;
    private byte zzm;

    zzw() {
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final RoutingParameters getRoutingParameters() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setExcludedPrimaryTypes(List<String> list) {
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setExcludedTypes(List<String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setIncludedPrimaryTypes(List<String> list) {
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setIncludedTypes(List<String> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setMaxResultCount(Integer num) {
        this.zzf = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRankPreference(SearchNearbyRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRegionCode(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRoutingParameters(RoutingParameters routingParameters) {
        this.zzk = routingParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRoutingSummariesIncluded(boolean z10) {
        this.zzl = z10;
        this.zzm = (byte) 1;
        return this;
    }

    zzw(SearchNearbyRequest searchNearbyRequest) {
        this.zza = searchNearbyRequest.getRegionCode();
        this.zzb = searchNearbyRequest.getIncludedTypes();
        this.zzc = searchNearbyRequest.getExcludedTypes();
        this.zzd = searchNearbyRequest.getIncludedPrimaryTypes();
        this.zze = searchNearbyRequest.getExcludedPrimaryTypes();
        this.zzf = searchNearbyRequest.getMaxResultCount();
        this.zzg = searchNearbyRequest.getLocationRestriction();
        this.zzh = searchNearbyRequest.getPlaceFields();
        this.zzi = searchNearbyRequest.getCancellationToken();
        this.zzj = searchNearbyRequest.getRankPreference();
        this.zzk = searchNearbyRequest.getRoutingParameters();
        this.zzl = searchNearbyRequest.isRoutingSummariesIncluded();
        this.zzm = (byte) 1;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        LocationRestriction locationRestriction = this.zzg;
        if (locationRestriction != null) {
            return locationRestriction;
        }
        throw new IllegalStateException("Property \"locationRestriction\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<Place.Field> getPlaceFields() {
        List<Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final boolean isRoutingSummariesIncluded() {
        if (this.zzm != 0) {
            return this.zzl;
        }
        throw new IllegalStateException("Property \"routingSummariesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzi = abstractC5507a;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            throw new NullPointerException("Null locationRestriction");
        }
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setPlaceFields(List<Place.Field> list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    final SearchNearbyRequest zza() {
        LocationRestriction locationRestriction;
        List list;
        if (this.zzm == 1 && (locationRestriction = this.zzg) != null && (list = this.zzh) != null) {
            return new zzx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, locationRestriction, list, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzg == null) {
            sb2.append(" locationRestriction");
        }
        if (this.zzh == null) {
            sb2.append(" placeFields");
        }
        if (this.zzm == 0) {
            sb2.append(" routingSummariesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
