package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import fsimpl.C14170dq;
import java.util.List;

/* loaded from: classes6.dex */
final class zzs extends SearchByTextRequest.Builder {
    private AbstractC5507a zza;
    private String zzb;
    private LocationBias zzc;
    private LocationRestriction zzd;
    private Integer zze;
    private Double zzf;
    private boolean zzg;
    private List zzh;
    private List zzi;
    private SearchByTextRequest.RankPreference zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private EVSearchOptions zzn;
    private RoutingParameters zzo;
    private SearchAlongRouteParameters zzp;
    private boolean zzq;
    private boolean zzr;
    private byte zzs;

    zzs() {
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final EVSearchOptions getEvSearchOptions() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final RoutingParameters getRoutingParameters() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchAlongRouteParameters getSearchAlongRouteParameters() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setEvSearchOptions(EVSearchOptions eVSearchOptions) {
        this.zzn = eVSearchOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setIncludedType(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationBias(LocationBias locationBias) {
        this.zzc = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzd = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMaxResultCount(Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMinRating(Double d10) {
        this.zzf = d10;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setOpenNow(boolean z10) {
        this.zzg = z10;
        this.zzs = (byte) (this.zzs | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z10) {
        this.zzr = z10;
        this.zzs = (byte) (this.zzs | 8);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRankPreference(SearchByTextRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRegionCode(String str) {
        this.zzk = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRoutingParameters(RoutingParameters routingParameters) {
        this.zzo = routingParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRoutingSummariesIncluded(boolean z10) {
        this.zzq = z10;
        this.zzs = (byte) (this.zzs | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setSearchAlongRouteParameters(SearchAlongRouteParameters searchAlongRouteParameters) {
        this.zzp = searchAlongRouteParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setStrictTypeFiltering(boolean z10) {
        this.zzl = z10;
        this.zzs = (byte) (this.zzs | 2);
        return this;
    }

    zzs(SearchByTextRequest searchByTextRequest) {
        this.zza = searchByTextRequest.getCancellationToken();
        this.zzb = searchByTextRequest.getIncludedType();
        this.zzc = searchByTextRequest.getLocationBias();
        this.zzd = searchByTextRequest.getLocationRestriction();
        this.zze = searchByTextRequest.getMaxResultCount();
        this.zzf = searchByTextRequest.getMinRating();
        this.zzg = searchByTextRequest.isOpenNow();
        this.zzh = searchByTextRequest.getPlaceFields();
        this.zzi = searchByTextRequest.getPriceLevels();
        this.zzj = searchByTextRequest.getRankPreference();
        this.zzk = searchByTextRequest.getRegionCode();
        this.zzl = searchByTextRequest.isStrictTypeFiltering();
        this.zzm = searchByTextRequest.getTextQuery();
        this.zzn = searchByTextRequest.getEvSearchOptions();
        this.zzo = searchByTextRequest.getRoutingParameters();
        this.zzp = searchByTextRequest.getSearchAlongRouteParameters();
        this.zzq = searchByTextRequest.isRoutingSummariesIncluded();
        this.zzr = searchByTextRequest.isPureServiceAreaBusinessesIncluded();
        this.zzs = C14170dq.MULTIPLY;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Place.Field> getPlaceFields() {
        List<Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Integer> getPriceLevels() {
        List<Integer> list = this.zzi;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"priceLevels\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getTextQuery() {
        String str = this.zzm;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"textQuery\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isOpenNow() {
        if ((this.zzs & 1) != 0) {
            return this.zzg;
        }
        throw new IllegalStateException("Property \"openNow\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isPureServiceAreaBusinessesIncluded() {
        if ((this.zzs & 8) != 0) {
            return this.zzr;
        }
        throw new IllegalStateException("Property \"pureServiceAreaBusinessesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isRoutingSummariesIncluded() {
        if ((this.zzs & 4) != 0) {
            return this.zzq;
        }
        throw new IllegalStateException("Property \"routingSummariesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isStrictTypeFiltering() {
        if ((this.zzs & 2) != 0) {
            return this.zzl;
        }
        throw new IllegalStateException("Property \"strictTypeFiltering\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zza = abstractC5507a;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPlaceFields(List<Place.Field> list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPriceLevels(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("Null priceLevels");
        }
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setTextQuery(String str) {
        if (str == null) {
            throw new NullPointerException("Null textQuery");
        }
        this.zzm = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    final SearchByTextRequest zza() {
        List list;
        List list2;
        String str;
        if (this.zzs == 15 && (list = this.zzh) != null && (list2 = this.zzi) != null && (str = this.zzm) != null) {
            return new zzt(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, list, list2, this.zzj, this.zzk, this.zzl, str, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzs & 1) == 0) {
            sb2.append(" openNow");
        }
        if (this.zzh == null) {
            sb2.append(" placeFields");
        }
        if (this.zzi == null) {
            sb2.append(" priceLevels");
        }
        if ((this.zzs & 2) == 0) {
            sb2.append(" strictTypeFiltering");
        }
        if (this.zzm == null) {
            sb2.append(" textQuery");
        }
        if ((this.zzs & 4) == 0) {
            sb2.append(" routingSummariesIncluded");
        }
        if ((this.zzs & 8) == 0) {
            sb2.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
