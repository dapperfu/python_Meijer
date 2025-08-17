package com.google.android.libraries.places.api.net;

import Ce.L;
import android.annotation.SuppressLint;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SearchNearbyResponse {
    @RecentlyNonNull
    public abstract List<Place> getPlaces();

    @RecentlyNullable
    public abstract List<RoutingSummary> getRoutingSummaries();

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract SearchNearbyResponse autoBuild();

        @RecentlyNonNull
        public abstract List<Place> getPlaces();

        @RecentlyNullable
        public abstract List<RoutingSummary> getRoutingSummaries();

        @RecentlyNonNull
        public abstract Builder setPlaces(@RecentlyNonNull List<Place> list);

        @RecentlyNonNull
        public abstract Builder setRoutingSummaries(List<RoutingSummary> list);

        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public SearchNearbyResponse build() {
            setPlaces(L.s(getPlaces()));
            List<RoutingSummary> routingSummaries = getRoutingSummaries();
            if (routingSummaries != null) {
                setRoutingSummaries(L.s(routingSummaries));
            }
            return autoBuild();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull List<Place> list) {
        zzy zzyVar = new zzy();
        zzyVar.setPlaces(list);
        return zzyVar;
    }

    @RecentlyNonNull
    public static SearchNearbyResponse newInstance(@RecentlyNonNull List<Place> list) {
        zzy zzyVar = new zzy();
        zzyVar.setPlaces(list);
        return zzyVar.build();
    }
}
