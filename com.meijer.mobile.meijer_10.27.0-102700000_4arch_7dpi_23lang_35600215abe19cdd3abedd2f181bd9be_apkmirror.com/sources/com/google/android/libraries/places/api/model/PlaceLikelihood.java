package com.google.android.libraries.places.api.model;

import Be.p;
import Ce.j0;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    public abstract double getLikelihood();

    @RecentlyNonNull
    public abstract Place getPlace();

    @RecentlyNonNull
    public static PlaceLikelihood newInstance(@RecentlyNonNull Place place, double d10) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        j0 j0VarD = j0.d(dValueOf, dValueOf2);
        Double dValueOf3 = Double.valueOf(d10);
        p.n(j0VarD.g(dValueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dValueOf3);
        return new zzdm(place, d10);
    }
}
