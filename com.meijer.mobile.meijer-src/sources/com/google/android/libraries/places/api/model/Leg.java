package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import j$.time.Duration;

/* loaded from: classes6.dex */
public abstract class Leg implements Parcelable {
    public abstract int getDistanceMeters();

    @RecentlyNonNull
    public abstract Duration getDuration();

    @RecentlyNonNull
    public static Leg newInstance(@RecentlyNonNull Duration duration, int i10) {
        return new zzcs(duration, i10);
    }
}
