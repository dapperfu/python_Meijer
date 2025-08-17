package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.Review;

/* loaded from: classes6.dex */
final class zzaz extends Review.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private Double zzf;
    private AuthorAttribution zzg;
    private String zzh;
    private String zzi;
    private Uri zzj;

    zzaz() {
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getTextLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setFlagContentUri(Uri uri) {
        this.zzj = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setOriginalText(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setOriginalTextLanguageCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setPublishTime(String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setRelativePublishTimeDescription(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setText(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setTextLanguageCode(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final Review.Builder zzc(String str) {
        this.zzh = str;
        return this;
    }

    final Review.Builder zza(Double d10) {
        if (d10 == null) {
            throw new NullPointerException("Null rating");
        }
        this.zzf = d10;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final Review.Builder zzb(AuthorAttribution authorAttribution) {
        if (authorAttribution == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.zzg = authorAttribution;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final Review zzd() {
        AuthorAttribution authorAttribution;
        String str;
        Double d10 = this.zzf;
        if (d10 != null && (authorAttribution = this.zzg) != null && (str = this.zzh) != null) {
            return new zzdu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d10, authorAttribution, str, this.zzi, this.zzj);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzf == null) {
            sb2.append(" rating");
        }
        if (this.zzg == null) {
            sb2.append(" authorAttribution");
        }
        if (this.zzh == null) {
            sb2.append(" attribution");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
