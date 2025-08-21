package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;

/* loaded from: classes6.dex */
final class zza extends FetchPhotoRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private AbstractC5507a zzd;

    zza() {
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzd = abstractC5507a;
        return this;
    }

    final FetchPhotoRequest.Builder zza(PhotoMetadata photoMetadata) {
        if (photoMetadata == null) {
            throw new NullPointerException("Null photoMetadata");
        }
        this.zzc = photoMetadata;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    final PhotoMetadata zzb() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    final FetchPhotoRequest zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new zzb(this.zza, this.zzb, photoMetadata, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }
}
