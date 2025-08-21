package com.google.android.libraries.places.api.model;

import De.p;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class AuthorAttribution implements Parcelable {
    @RecentlyNonNull
    public abstract String getName();

    @RecentlyNullable
    public abstract String getPhotoUri();

    @RecentlyNullable
    public abstract String getUri();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract String getPhotoUri();

        @RecentlyNullable
        public abstract String getUri();

        @RecentlyNonNull
        public abstract Builder setPhotoUri(String str);

        @RecentlyNonNull
        public abstract Builder setUri(String str);

        abstract AuthorAttribution zzb();

        @RecentlyNonNull
        public AuthorAttribution build() {
            p.e(!zzb().getName().isEmpty(), "Name must not be empty.");
            return zzb();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzf zzfVar = new zzf();
        zzfVar.zza(str);
        return zzfVar;
    }
}
