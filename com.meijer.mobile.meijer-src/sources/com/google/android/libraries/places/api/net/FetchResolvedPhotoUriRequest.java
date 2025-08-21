package com.google.android.libraries.places.api.net;

import De.p;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzmg;

/* loaded from: classes6.dex */
public abstract class FetchResolvedPhotoUriRequest implements zzmg {
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

        abstract FetchResolvedPhotoUriRequest zzc();

        @RecentlyNonNull
        public FetchResolvedPhotoUriRequest build() {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            PhotoMetadata photoMetadataZzb = zzb();
            Integer maxWidth = getMaxWidth();
            Integer maxHeight = getMaxHeight();
            boolean z15 = false;
            if (photoMetadataZzb.zzb() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p.e(z10, "To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.");
            if (maxWidth != null) {
                if (maxWidth.intValue() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                p.l(z13, "Max width must not be < 1, but was: %s.", maxWidth);
                if (maxWidth.intValue() <= 4800) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                p.j(z14, "Max width must not be > %s, but was: %s.", 4800, maxWidth);
            }
            if (maxHeight != null) {
                if (maxHeight.intValue() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p.l(z11, "Max height must not be < 1, but was: %s.", maxHeight);
                if (maxHeight.intValue() <= 4800) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p.j(z12, "Max height must not be > %s, but was: %s.", 4800, maxHeight);
            }
            if (maxWidth == null && maxHeight == null) {
                int width = photoMetadataZzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(Math.min(4800, width)));
                }
                int height = photoMetadataZzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(Math.min(4800, height)));
                }
            }
            if (getMaxWidth() != null || getMaxHeight() != null) {
                z15 = true;
            }
            p.x(z15, "Must include max width or max height in the request.");
            return zzc();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull PhotoMetadata photoMetadata) {
        zzg zzgVar = new zzg();
        zzgVar.zza(photoMetadata);
        return zzgVar;
    }

    @RecentlyNonNull
    public static FetchResolvedPhotoUriRequest newInstance(@RecentlyNonNull PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }
}
