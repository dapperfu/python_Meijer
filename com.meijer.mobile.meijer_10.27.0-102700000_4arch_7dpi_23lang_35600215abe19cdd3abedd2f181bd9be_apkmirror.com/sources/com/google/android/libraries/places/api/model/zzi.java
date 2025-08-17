package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zzi extends AutocompletePrediction.Builder {
    private String zza;
    private Integer zzb;
    private List zzc;
    private List zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private List zzh;
    private List zzi;
    private List zzj;

    zzi() {
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setDistanceMeters(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getFullText() {
        String str = this.zze;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"fullText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final List<Place.Type> getPlaceTypes() {
        List<Place.Type> list = this.zzc;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeTypes\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getPrimaryText() {
        String str = this.zzf;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"primaryText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getSecondaryText() {
        String str = this.zzg;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"secondaryText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final List<String> getTypes() {
        List<String> list = this.zzd;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"types\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setFullText(String str) {
        if (str == null) {
            throw new NullPointerException("Null fullText");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPlaceTypes(List<Place.Type> list) {
        if (list == null) {
            throw new NullPointerException("Null placeTypes");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPrimaryText(String str) {
        if (str == null) {
            throw new NullPointerException("Null primaryText");
        }
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setSecondaryText(String str) {
        if (str == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setTypes(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    final AutocompletePrediction.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzb(List list) {
        if (list == null) {
            throw new NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzc(List list) {
        if (list == null) {
            throw new NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzd(List list) {
        if (list == null) {
            throw new NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.zzj = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    final AutocompletePrediction zze() {
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        List list3;
        List list4;
        List list5;
        String str4 = this.zza;
        if (str4 != null && (list = this.zzc) != null && (list2 = this.zzd) != null && (str = this.zze) != null && (str2 = this.zzf) != null && (str3 = this.zzg) != null && (list3 = this.zzh) != null && (list4 = this.zzi) != null && (list5 = this.zzj) != null) {
            return new zzby(str4, this.zzb, list, list2, str, str2, str3, list3, list4, list5);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" placeId");
        }
        if (this.zzc == null) {
            sb2.append(" placeTypes");
        }
        if (this.zzd == null) {
            sb2.append(" types");
        }
        if (this.zze == null) {
            sb2.append(" fullText");
        }
        if (this.zzf == null) {
            sb2.append(" primaryText");
        }
        if (this.zzg == null) {
            sb2.append(" secondaryText");
        }
        if (this.zzh == null) {
            sb2.append(" fullTextMatchedSubstrings");
        }
        if (this.zzi == null) {
            sb2.append(" primaryTextMatchedSubstrings");
        }
        if (this.zzj == null) {
            sb2.append(" secondaryTextMatchedSubstrings");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
