package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* loaded from: classes6.dex */
final class zzao extends PhotoMetadata.Builder {
    private String zza;
    private int zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private AuthorAttributions zzf;
    private Uri zzg;
    private byte zzh;

    zzao() {
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAuthorAttributions(AuthorAttributions authorAttributions) {
        this.zzf = authorAttributions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i10) {
        this.zzb = i10;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i10) {
        this.zzc = i10;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zzb(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zzc(Uri uri) {
        this.zzg = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final String getAttributions() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"attributions\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zzh & 1) != 0) {
            return this.zzb;
        }
        throw new IllegalStateException("Property \"height\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zzh & 2) != 0) {
            return this.zzc;
        }
        throw new IllegalStateException("Property \"width\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.zza = str;
        return this;
    }

    final PhotoMetadata.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    final PhotoMetadata zzd() {
        String str;
        String str2;
        if (this.zzh == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new zzdi(str, this.zzb, this.zzc, str2, this.zze, this.zzf, this.zzg);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" attributions");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" height");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" width");
        }
        if (this.zzd == null) {
            sb2.append(" photoReference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
