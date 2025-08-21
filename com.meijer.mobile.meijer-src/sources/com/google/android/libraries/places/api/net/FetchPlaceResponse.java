package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
public abstract class FetchPlaceResponse {
    @RecentlyNonNull
    public abstract Place getPlace();

    @RecentlyNonNull
    public static FetchPlaceResponse newInstance(@RecentlyNonNull Place place) {
        return new zzf(place);
    }
}
