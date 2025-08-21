package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AuthorAttribution;

/* loaded from: classes6.dex */
final class zzf extends AuthorAttribution.Builder {
    private String zza;
    private String zzb;
    private String zzc;

    zzf() {
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final String getUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setPhotoUri(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setUri(String str) {
        this.zzb = str;
        return this;
    }

    final AuthorAttribution.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    final AuthorAttribution zzb() {
        String str = this.zza;
        if (str != null) {
            return new zzbu(str, this.zzb, this.zzc);
        }
        throw new IllegalStateException("Missing required properties: name");
    }
}
