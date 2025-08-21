package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;

/* loaded from: classes6.dex */
final class zzg extends FetchResolvedPhotoUriRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private AbstractC5507a zzd;

    zzg() {
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzd = abstractC5507a;
        return this;
    }

    final FetchResolvedPhotoUriRequest.Builder zza(PhotoMetadata photoMetadata) {
        if (photoMetadata == null) {
            throw new NullPointerException("Null photoMetadata");
        }
        this.zzc = photoMetadata;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    final PhotoMetadata zzb() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    final FetchResolvedPhotoUriRequest zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new zzh(this.zza, this.zzb, photoMetadata, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }
}
