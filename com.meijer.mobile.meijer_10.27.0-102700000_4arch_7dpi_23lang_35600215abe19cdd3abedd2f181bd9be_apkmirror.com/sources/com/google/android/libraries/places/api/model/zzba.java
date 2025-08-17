package com.google.android.libraries.places.api.model;

import android.net.Uri;

/* loaded from: classes6.dex */
abstract class zzba extends Review {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final Double zzf;
    private final AuthorAttribution zzg;
    private final String zzh;
    private final String zzi;
    private final Uri zzj;

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Review) {
            Review review = (Review) obj;
            String str2 = this.zza;
            if (str2 != null ? str2.equals(review.getRelativePublishTimeDescription()) : review.getRelativePublishTimeDescription() == null) {
                String str3 = this.zzb;
                if (str3 != null ? str3.equals(review.getText()) : review.getText() == null) {
                    String str4 = this.zzc;
                    if (str4 != null ? str4.equals(review.getTextLanguageCode()) : review.getTextLanguageCode() == null) {
                        String str5 = this.zzd;
                        if (str5 != null ? str5.equals(review.getOriginalText()) : review.getOriginalText() == null) {
                            String str6 = this.zze;
                            if (str6 != null ? str6.equals(review.getOriginalTextLanguageCode()) : review.getOriginalTextLanguageCode() == null) {
                                if (this.zzf.equals(review.getRating()) && this.zzg.equals(review.getAuthorAttribution()) && this.zzh.equals(review.getAttribution()) && ((str = this.zzi) != null ? str.equals(review.getPublishTime()) : review.getPublishTime() == null) && ((uri = this.zzj) != null ? uri.equals(review.getFlagContentUri()) : review.getFlagContentUri() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getAttribution() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final AuthorAttribution getAuthorAttribution() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Uri getFlagContentUri() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final Double getRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final String getTextLanguageCode() {
        return this.zzc;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i10 = iHashCode ^ 1000003;
        String str3 = this.zzc;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zze;
        int iHashCode5 = (((((((iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        String str6 = this.zzi;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Uri uri = this.zzj;
        return iHashCode6 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.zzj;
        String string = this.zzg.toString();
        String strValueOf = String.valueOf(uri);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        Double d10 = this.zzf;
        int length6 = d10.toString().length();
        int length7 = string.length();
        String str6 = this.zzi;
        int length8 = String.valueOf(str6).length();
        int length9 = strValueOf.length();
        int i10 = length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7;
        String str7 = this.zzh;
        StringBuilder sb2 = new StringBuilder(i10 + 14 + str7.length() + 14 + length8 + 17 + length9 + 1);
        sb2.append("Review{relativePublishTimeDescription=");
        sb2.append(str);
        sb2.append(", text=");
        sb2.append(str2);
        sb2.append(", textLanguageCode=");
        sb2.append(str3);
        sb2.append(", originalText=");
        sb2.append(str4);
        sb2.append(", originalTextLanguageCode=");
        sb2.append(str5);
        sb2.append(", rating=");
        sb2.append(d10);
        sb2.append(", authorAttribution=");
        sb2.append(string);
        sb2.append(", attribution=");
        sb2.append(str7);
        sb2.append(", publishTime=");
        sb2.append(str6);
        sb2.append(", flagContentUri=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    zzba(String str, String str2, String str3, String str4, String str5, Double d10, AuthorAttribution authorAttribution, String str6, String str7, Uri uri) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = d10;
        if (authorAttribution != null) {
            this.zzg = authorAttribution;
            if (str6 != null) {
                this.zzh = str6;
                this.zzi = str7;
                this.zzj = uri;
                return;
            }
            throw new NullPointerException("Null attribution");
        }
        throw new NullPointerException("Null authorAttribution");
    }
}
