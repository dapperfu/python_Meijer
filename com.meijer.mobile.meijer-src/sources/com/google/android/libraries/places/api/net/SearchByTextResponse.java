package com.google.android.libraries.places.api.net;

import Ee.L;
import android.annotation.SuppressLint;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SearchByTextResponse {
    @RecentlyNonNull
    public abstract List<Place> getPlaces();

    @RecentlyNullable
    public abstract List<RoutingSummary> getRoutingSummaries();

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract SearchByTextResponse autoBuild();

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
        public SearchByTextResponse build() {
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
        zzu zzuVar = new zzu();
        zzuVar.setPlaces(list);
        return zzuVar;
    }

    @RecentlyNonNull
    public static SearchByTextResponse newInstance(@RecentlyNonNull List<Place> list) {
        zzu zzuVar = new zzu();
        zzuVar.setPlaces(list);
        return zzuVar.build();
    }
}
