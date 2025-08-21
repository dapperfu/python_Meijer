package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzmg;

/* loaded from: classes6.dex */
public abstract class FetchPhotoRequest implements zzmg {
    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5507a getCancellationToken();

    @RecentlyNullable
    public abstract Integer getMaxHeight();

    @RecentlyNullable
    public abstract Integer getMaxWidth();

    @RecentlyNonNull
    public abstract PhotoMetadata getPhotoMetadata();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNullable
        public abstract Integer getMaxHeight();

        @RecentlyNullable
        public abstract Integer getMaxWidth();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        @RecentlyNonNull
        public abstract Builder setMaxHeight(Integer num);

        @RecentlyNonNull
        public abstract Builder setMaxWidth(Integer num);

        abstract PhotoMetadata zzb();

        abstract FetchPhotoRequest zzc();

        @RecentlyNonNull
        public FetchPhotoRequest build() {
            PhotoMetadata photoMetadataZzb = zzb();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = photoMetadataZzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = photoMetadataZzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull PhotoMetadata photoMetadata) {
        zza zzaVar = new zza();
        zzaVar.zza(photoMetadata);
        return zzaVar;
    }

    @RecentlyNonNull
    public static FetchPhotoRequest newInstance(@RecentlyNonNull PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }
}
