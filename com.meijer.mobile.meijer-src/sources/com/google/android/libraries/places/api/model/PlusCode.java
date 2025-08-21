package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class PlusCode implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract PlusCode build();

        @RecentlyNullable
        public abstract String getCompoundCode();

        @RecentlyNullable
        public abstract String getGlobalCode();

        @RecentlyNonNull
        public abstract Builder setCompoundCode(String str);

        @RecentlyNonNull
        public abstract Builder setGlobalCode(String str);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzat();
    }

    @RecentlyNullable
    public abstract String getCompoundCode();

    @RecentlyNullable
    public abstract String getGlobalCode();
}
