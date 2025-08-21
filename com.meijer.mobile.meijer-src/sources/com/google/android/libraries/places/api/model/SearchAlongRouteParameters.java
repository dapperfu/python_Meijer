package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class SearchAlongRouteParameters implements Parcelable {
    @RecentlyNonNull
    public abstract Polyline getPolyline();

    @RecentlyNonNull
    public static SearchAlongRouteParameters newInstance(@RecentlyNonNull Polyline polyline) {
        return new zzec(polyline);
    }
}
