package com.google.android.libraries.places.api.net;

import De.p;
import Ee.L;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.internal.zzmg;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SearchNearbyRequest implements zzmg {

    public enum RankPreference {
        DISTANCE,
        POPULARITY
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5507a getCancellationToken();

    @RecentlyNullable
    public abstract List<String> getExcludedPrimaryTypes();

    @RecentlyNullable
    public abstract List<String> getExcludedTypes();

    @RecentlyNullable
    public abstract List<String> getIncludedPrimaryTypes();

    @RecentlyNullable
    public abstract List<String> getIncludedTypes();

    @RecentlyNonNull
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract Integer getMaxResultCount();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNullable
    public abstract RankPreference getRankPreference();

    @RecentlyNullable
    public abstract String getRegionCode();

    @RecentlyNullable
    public abstract RoutingParameters getRoutingParameters();

    public abstract boolean isRoutingSummariesIncluded();

    @RecentlyNonNull
    public abstract Builder zza();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNullable
        public abstract List<String> getExcludedPrimaryTypes();

        @RecentlyNullable
        public abstract List<String> getExcludedTypes();

        @RecentlyNullable
        public abstract List<String> getIncludedPrimaryTypes();

        @RecentlyNullable
        public abstract List<String> getIncludedTypes();

        @RecentlyNonNull
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract Integer getMaxResultCount();

        @RecentlyNonNull
        public abstract List<Place.Field> getPlaceFields();

        @RecentlyNullable
        public abstract RankPreference getRankPreference();

        @RecentlyNullable
        public abstract String getRegionCode();

        @RecentlyNullable
        public abstract RoutingParameters getRoutingParameters();

        public abstract boolean isRoutingSummariesIncluded();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        @RecentlyNonNull
        public abstract Builder setExcludedPrimaryTypes(List<String> list);

        @RecentlyNonNull
        public abstract Builder setExcludedTypes(List<String> list);

        @RecentlyNonNull
        public abstract Builder setIncludedPrimaryTypes(List<String> list);

        @RecentlyNonNull
        public abstract Builder setIncludedTypes(List<String> list);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(@RecentlyNonNull LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setMaxResultCount(Integer num);

        @RecentlyNonNull
        public abstract Builder setPlaceFields(@RecentlyNonNull List<Place.Field> list);

        @RecentlyNonNull
        public abstract Builder setRankPreference(RankPreference rankPreference);

        @RecentlyNonNull
        public abstract Builder setRegionCode(String str);

        @RecentlyNonNull
        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        @RecentlyNonNull
        public abstract Builder setRoutingSummariesIncluded(boolean z10);

        abstract SearchNearbyRequest zza();

        @RecentlyNonNull
        public SearchNearbyRequest build() {
            List<Place.Field> placeFields = getPlaceFields();
            boolean z10 = getLocationRestriction() instanceof CircularBounds;
            List<String> includedTypes = getIncludedTypes();
            List<String> excludedTypes = getExcludedTypes();
            List<String> includedPrimaryTypes = getIncludedPrimaryTypes();
            List<String> excludedPrimaryTypes = getExcludedPrimaryTypes();
            p.e(z10, "LocationRestriction must be of type CircularBounds.");
            setPlaceFields(L.s(placeFields));
            if (includedTypes != null) {
                setIncludedTypes(L.s(includedTypes));
            }
            if (excludedTypes != null) {
                setExcludedTypes(L.s(excludedTypes));
            }
            if (includedPrimaryTypes != null) {
                setIncludedPrimaryTypes(L.s(includedPrimaryTypes));
            }
            if (excludedPrimaryTypes != null) {
                setExcludedPrimaryTypes(L.s(excludedPrimaryTypes));
            }
            return zza();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull LocationRestriction locationRestriction, @RecentlyNonNull List<Place.Field> list) {
        zzw zzwVar = new zzw();
        zzwVar.setLocationRestriction(locationRestriction);
        zzwVar.setPlaceFields(list);
        zzwVar.setRoutingSummariesIncluded(false);
        return zzwVar;
    }

    @RecentlyNonNull
    public static SearchNearbyRequest newInstance(@RecentlyNonNull LocationRestriction locationRestriction, @RecentlyNonNull List<Place.Field> list) {
        return builder(locationRestriction, list).build();
    }
}
