package com.google.android.libraries.places.api.net;

import De.p;
import Ee.L;
import Ee.j0;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.internal.zzmg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SearchByTextRequest implements zzmg {

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNullable
        public abstract EVSearchOptions getEvSearchOptions();

        @RecentlyNullable
        public abstract String getIncludedType();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract Integer getMaxResultCount();

        @RecentlyNullable
        public abstract Double getMinRating();

        @RecentlyNonNull
        public abstract List<Place.Field> getPlaceFields();

        @RecentlyNonNull
        public abstract List<Integer> getPriceLevels();

        @RecentlyNullable
        public abstract RankPreference getRankPreference();

        @RecentlyNonNull
        public abstract String getRegionCode();

        @RecentlyNullable
        public abstract RoutingParameters getRoutingParameters();

        @RecentlyNullable
        public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

        @RecentlyNonNull
        public abstract String getTextQuery();

        public abstract boolean isOpenNow();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract boolean isStrictTypeFiltering();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        @RecentlyNonNull
        public abstract Builder setEvSearchOptions(EVSearchOptions eVSearchOptions);

        @RecentlyNonNull
        public abstract Builder setIncludedType(String str);

        @RecentlyNonNull
        public abstract Builder setLocationBias(LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setMaxResultCount(Integer num);

        @RecentlyNonNull
        public abstract Builder setMinRating(Double d10);

        @RecentlyNonNull
        public abstract Builder setOpenNow(boolean z10);

        @RecentlyNonNull
        public abstract Builder setPlaceFields(@RecentlyNonNull List<Place.Field> list);

        @RecentlyNonNull
        public abstract Builder setPriceLevels(@RecentlyNonNull List<Integer> list);

        @RecentlyNonNull
        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z10);

        @RecentlyNonNull
        public abstract Builder setRankPreference(RankPreference rankPreference);

        @RecentlyNonNull
        public abstract Builder setRegionCode(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        @RecentlyNonNull
        public abstract Builder setRoutingSummariesIncluded(boolean z10);

        @RecentlyNonNull
        public abstract Builder setSearchAlongRouteParameters(SearchAlongRouteParameters searchAlongRouteParameters);

        @RecentlyNonNull
        public abstract Builder setStrictTypeFiltering(boolean z10);

        @RecentlyNonNull
        public abstract Builder setTextQuery(@RecentlyNonNull String str);

        abstract SearchByTextRequest zza();

        @RecentlyNonNull
        public SearchByTextRequest build() {
            Double dValueOf = Double.valueOf(5.0d);
            Double dValueOf2 = Double.valueOf(1.0d);
            setPlaceFields(L.s(getPlaceFields()));
            setPriceLevels(L.s(getPriceLevels()));
            Double minRating = getMinRating();
            if (minRating != null) {
                p.n(minRating.doubleValue() >= 1.0d && minRating.doubleValue() <= 5.0d, "Min rating must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, minRating);
            }
            List<Integer> priceLevels = getPriceLevels();
            if (!priceLevels.isEmpty()) {
                for (Integer num : priceLevels) {
                    p.n(j0.d(0, 4).g(num), "Price level must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, num);
                }
            }
            return zza();
        }
    }

    public enum RankPreference {
        DISTANCE,
        RELEVANCE
    }

    @RecentlyNullable
    public abstract EVSearchOptions getEvSearchOptions();

    @RecentlyNullable
    public abstract String getIncludedType();

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract Integer getMaxResultCount();

    @RecentlyNullable
    public abstract Double getMinRating();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNonNull
    public abstract List<Integer> getPriceLevels();

    @RecentlyNullable
    public abstract RankPreference getRankPreference();

    @RecentlyNullable
    public abstract String getRegionCode();

    @RecentlyNullable
    public abstract RoutingParameters getRoutingParameters();

    @RecentlyNullable
    public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

    @RecentlyNonNull
    public abstract String getTextQuery();

    public abstract boolean isOpenNow();

    public abstract boolean isPureServiceAreaBusinessesIncluded();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract boolean isStrictTypeFiltering();

    @RecentlyNonNull
    public abstract Builder zza();

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        zzs zzsVar = new zzs();
        zzsVar.setOpenNow(false);
        zzsVar.setPlaceFields(list);
        zzsVar.setPriceLevels(new ArrayList());
        zzsVar.setTextQuery(str);
        zzsVar.setStrictTypeFiltering(false);
        zzsVar.setRoutingSummariesIncluded(false);
        zzsVar.setPureServiceAreaBusinessesIncluded(false);
        return zzsVar;
    }

    @RecentlyNonNull
    public static SearchByTextRequest newInstance(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        return builder(str, list).build();
    }
}
