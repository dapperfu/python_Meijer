package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class SubDestination implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract SubDestination build();

        @RecentlyNonNull
        public abstract Builder setId(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setName(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    public abstract String getId();

    @RecentlyNonNull
    public abstract String getName();

    @RecentlyNonNull
    public static SubDestination newInstance(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        zzbj zzbjVar = new zzbj();
        zzbjVar.setId(str);
        zzbjVar.setName(str2);
        return zzbjVar.build();
    }
}
