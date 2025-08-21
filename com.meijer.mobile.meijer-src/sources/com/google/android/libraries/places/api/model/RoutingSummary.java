package com.google.android.libraries.places.api.model;

import Ee.L;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class RoutingSummary implements Parcelable {
    @RecentlyNonNull
    public abstract List<Leg> getLegs();

    @RecentlyNonNull
    @SuppressLint({"AmbiguousGranuleClass"})
    public static RoutingSummary newInstance(@RecentlyNonNull List<Leg> list) {
        return new zzea(L.s(list));
    }
}
