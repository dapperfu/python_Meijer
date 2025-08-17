package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class Period implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract Period build();

        @RecentlyNullable
        public abstract TimeOfWeek getClose();

        @RecentlyNullable
        public abstract TimeOfWeek getOpen();

        @RecentlyNonNull
        public abstract Builder setClose(TimeOfWeek timeOfWeek);

        @RecentlyNonNull
        public abstract Builder setOpen(TimeOfWeek timeOfWeek);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzam();
    }

    @RecentlyNullable
    public abstract TimeOfWeek getClose();

    @RecentlyNullable
    public abstract TimeOfWeek getOpen();
}
