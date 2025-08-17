package com.google.android.libraries.places.api.net;

import Ce.L;
import Ce.Q;
import Td.AbstractC5223a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FindAutocompletePredictionsRequest implements zzmg {

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5223a getCancellationToken();

        @RecentlyNonNull
        public abstract List<String> getCountries();

        @RecentlyNullable
        public abstract Integer getInputOffset();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract LatLng getOrigin();

        @RecentlyNullable
        public abstract String getQuery();

        @RecentlyNullable
        public abstract String getRegionCode();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNullable
        @Deprecated
        public abstract TypeFilter getTypeFilter();

        @RecentlyNonNull
        public abstract List<String> getTypesFilter();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5223a abstractC5223a);

        @RecentlyNonNull
        public abstract Builder setCountries(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public Builder setCountries(@RecentlyNonNull String... strArr) {
            return setCountries(L.t(strArr));
        }

        @RecentlyNonNull
        public abstract Builder setInputOffset(Integer num);

        @RecentlyNonNull
        public abstract Builder setLocationBias(LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setOrigin(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z10);

        @RecentlyNonNull
        public abstract Builder setQuery(String str);

        @RecentlyNonNull
        public abstract Builder setRegionCode(String str);

        @RecentlyNonNull
        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setTypeFilter(TypeFilter typeFilter);

        @RecentlyNonNull
        public abstract Builder setTypesFilter(@RecentlyNonNull List<String> list);

        abstract FindAutocompletePredictionsRequest zza();

        @RecentlyNonNull
        @Deprecated
        public Builder setCountry(String str) {
            setCountries(str == null ? L.x() : L.y(str));
            return this;
        }

        @RecentlyNonNull
        public FindAutocompletePredictionsRequest build() {
            setCountries(L.s(getCountries()));
            setTypesFilter(L.s(getTypesFilter()));
            return zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5223a getCancellationToken();

    @RecentlyNonNull
    public abstract List<String> getCountries();

    @RecentlyNullable
    public abstract Integer getInputOffset();

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract LatLng getOrigin();

    @RecentlyNullable
    public abstract String getQuery();

    @RecentlyNullable
    public abstract String getRegionCode();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();

    @RecentlyNullable
    @Deprecated
    public abstract TypeFilter getTypeFilter();

    @RecentlyNonNull
    public abstract List<String> getTypesFilter();

    public abstract boolean isPureServiceAreaBusinessesIncluded();

    @RecentlyNonNull
    public static Builder builder() {
        zzj zzjVar = new zzj();
        zzjVar.setCountries(new ArrayList());
        zzjVar.setTypesFilter(new ArrayList());
        zzjVar.setPureServiceAreaBusinessesIncluded(false);
        return zzjVar;
    }

    @RecentlyNonNull
    public static FindAutocompletePredictionsRequest newInstance(String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @RecentlyNullable
    @Deprecated
    public String getCountry() {
        if (getCountries().size() <= 1) {
            return (String) Q.e(getCountries(), null);
        }
        throw new UnsupportedOperationException("Multiple countries found in this request - use getCountries() instead of getCountry().");
    }
}
