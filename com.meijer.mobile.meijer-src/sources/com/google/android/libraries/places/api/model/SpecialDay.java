package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class SpecialDay implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract SpecialDay build();

        @RecentlyNonNull
        public abstract LocalDate getDate();

        public abstract boolean isExceptional();

        @RecentlyNonNull
        public abstract Builder setDate(@RecentlyNonNull LocalDate localDate);

        @RecentlyNonNull
        public abstract Builder setExceptional(boolean z10);
    }

    @RecentlyNonNull
    public abstract LocalDate getDate();

    public abstract boolean isExceptional();

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull LocalDate localDate) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.setDate(localDate);
        zzbhVar.setExceptional(false);
        return zzbhVar;
    }
}
