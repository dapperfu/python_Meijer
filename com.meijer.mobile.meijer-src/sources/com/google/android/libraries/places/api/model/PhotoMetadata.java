package com.google.android.libraries.places.api.model;

import De.p;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes6.dex */
public abstract class PhotoMetadata implements Parcelable {
    @RecentlyNonNull
    public abstract String getAttributions();

    @RecentlyNullable
    public abstract AuthorAttributions getAuthorAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    @RecentlyNonNull
    public abstract String zza();

    @RecentlyNullable
    public abstract String zzb();

    @RecentlyNullable
    public abstract Uri zzc();

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract String getAttributions();

        @RecentlyNullable
        public abstract AuthorAttributions getAuthorAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setAuthorAttributions(AuthorAttributions authorAttributions);

        @RecentlyNonNull
        public abstract Builder setHeight(int i10);

        @RecentlyNonNull
        public abstract Builder setWidth(int i10);

        @RecentlyNonNull
        public abstract Builder zzb(String str);

        @RecentlyNonNull
        public abstract Builder zzc(Uri uri);

        abstract PhotoMetadata zzd();

        @RecentlyNonNull
        public PhotoMetadata build() {
            boolean z10;
            PhotoMetadata photoMetadataZzd = zzd();
            int width = photoMetadataZzd.getWidth();
            boolean z11 = false;
            if (width >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p.h(z10, "Width must not be < 0, but was: %s.", width);
            int height = photoMetadataZzd.getHeight();
            if (height >= 0) {
                z11 = true;
            }
            p.h(z11, "Height must not be < 0, but was: %s.", height);
            p.e(!photoMetadataZzd.zza().isEmpty(), "PhotoReference must not be empty.");
            return photoMetadataZzd;
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzao zzaoVar = new zzao();
        zzaoVar.zza(str);
        zzaoVar.setWidth(0);
        zzaoVar.setHeight(0);
        zzaoVar.setAttributions("");
        return zzaoVar;
    }
}
