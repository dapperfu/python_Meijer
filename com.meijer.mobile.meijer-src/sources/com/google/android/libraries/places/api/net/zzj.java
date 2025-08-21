package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzj extends FindAutocompletePredictionsRequest.Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private LatLng zzd;
    private List zze;
    private AutocompleteSessionToken zzf;
    private TypeFilter zzg;
    private List zzh;
    private Integer zzi;
    private String zzj;
    private boolean zzk;
    private AbstractC5507a zzl;
    private byte zzm;

    zzj() {
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final Integer getInputOffset() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final String getRegionCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setInputOffset(Integer num) {
        this.zzi = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationBias(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setOrigin(LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z10) {
        this.zzk = z10;
        this.zzm = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setQuery(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setRegionCode(String str) {
        this.zzj = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getCountries() {
        List<String> list = this.zze;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getTypesFilter() {
        List<String> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"typesFilter\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final boolean isPureServiceAreaBusinessesIncluded() {
        if (this.zzm != 0) {
            return this.zzk;
        }
        throw new IllegalStateException("Property \"pureServiceAreaBusinessesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzl = abstractC5507a;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCountries(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null countries");
        }
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypesFilter(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null typesFilter");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    final FindAutocompletePredictionsRequest zza() {
        List list;
        List list2;
        if (this.zzm == 1 && (list = this.zze) != null && (list2 = this.zzh) != null) {
            return new zzk(this.zza, this.zzb, this.zzc, this.zzd, list, this.zzf, this.zzg, list2, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zze == null) {
            sb2.append(" countries");
        }
        if (this.zzh == null) {
            sb2.append(" typesFilter");
        }
        if (this.zzm == 0) {
            sb2.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
