package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
abstract class zzj extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List zzc;
    private final List zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final List zzh;
    private final List zzi;
    private final List zzj;

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (this.zza.equals(autocompletePrediction.getPlaceId()) && ((num = this.zzb) != null ? num.equals(autocompletePrediction.getDistanceMeters()) : autocompletePrediction.getDistanceMeters() == null) && this.zzc.equals(autocompletePrediction.getPlaceTypes()) && this.zzd.equals(autocompletePrediction.getTypes()) && this.zze.equals(autocompletePrediction.zza()) && this.zzf.equals(autocompletePrediction.zzb()) && this.zzg.equals(autocompletePrediction.zzc()) && this.zzh.equals(autocompletePrediction.zzd()) && this.zzi.equals(autocompletePrediction.zze()) && this.zzj.equals(autocompletePrediction.zzf())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    @Deprecated
    public List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public List<String> getTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzf() {
        return this.zzj;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        Integer num = this.zzb;
        return (((((((((((((((((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003) ^ this.zzj.hashCode();
    }

    public final String toString() {
        List list = this.zzj;
        List list2 = this.zzi;
        List list3 = this.zzh;
        List list4 = this.zzd;
        String string = this.zzc.toString();
        String string2 = list4.toString();
        String string3 = list3.toString();
        String string4 = list2.toString();
        String string5 = list.toString();
        Integer num = this.zzb;
        int length = String.valueOf(num).length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        int length5 = string4.length();
        int length6 = string5.length();
        String str = this.zza;
        int length7 = str.length() + 48 + length + 13 + length2 + 8 + length3;
        String str2 = this.zze;
        int length8 = length7 + 11 + str2.length();
        String str3 = this.zzf;
        int length9 = length8 + 14 + str3.length();
        String str4 = this.zzg;
        StringBuilder sb2 = new StringBuilder(length9 + 16 + str4.length() + 28 + length4 + 31 + length5 + 33 + length6 + 1);
        sb2.append("AutocompletePrediction{placeId=");
        sb2.append(str);
        sb2.append(", distanceMeters=");
        sb2.append(num);
        sb2.append(", placeTypes=");
        sb2.append(string);
        sb2.append(", types=");
        sb2.append(string2);
        sb2.append(", fullText=");
        sb2.append(str2);
        sb2.append(", primaryText=");
        sb2.append(str3);
        sb2.append(", secondaryText=");
        sb2.append(str4);
        sb2.append(", fullTextMatchedSubstrings=");
        sb2.append(string3);
        sb2.append(", primaryTextMatchedSubstrings=");
        sb2.append(string4);
        sb2.append(", secondaryTextMatchedSubstrings=");
        sb2.append(string5);
        sb2.append("}");
        return sb2.toString();
    }

    zzj(String str, Integer num, List list, List list2, String str2, String str3, String str4, List list3, List list4, List list5) {
        if (str != null) {
            this.zza = str;
            this.zzb = num;
            if (list != null) {
                this.zzc = list;
                if (list2 != null) {
                    this.zzd = list2;
                    if (str2 != null) {
                        this.zze = str2;
                        if (str3 != null) {
                            this.zzf = str3;
                            if (str4 != null) {
                                this.zzg = str4;
                                if (list3 != null) {
                                    this.zzh = list3;
                                    if (list4 != null) {
                                        this.zzi = list4;
                                        if (list5 != null) {
                                            this.zzj = list5;
                                            return;
                                        }
                                        throw new NullPointerException("Null secondaryTextMatchedSubstrings");
                                    }
                                    throw new NullPointerException("Null primaryTextMatchedSubstrings");
                                }
                                throw new NullPointerException("Null fullTextMatchedSubstrings");
                            }
                            throw new NullPointerException("Null secondaryText");
                        }
                        throw new NullPointerException("Null primaryText");
                    }
                    throw new NullPointerException("Null fullText");
                }
                throw new NullPointerException("Null types");
            }
            throw new NullPointerException("Null placeTypes");
        }
        throw new NullPointerException("Null placeId");
    }
}
