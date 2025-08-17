package com.google.android.libraries.places.internal;

import Ce.L;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzne extends zzni {
    private final String zza;
    private final L zzb;
    private final Place zzc;
    private final AutocompletePrediction zzd;
    private final AutocompleteSessionToken zze;
    private final Status zzf;
    private final int zzg;

    public final boolean equals(Object obj) {
        String str;
        L l10;
        Place place;
        AutocompletePrediction autocompletePrediction;
        AutocompleteSessionToken autocompleteSessionToken;
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzni) {
            zzni zzniVar = (zzni) obj;
            if (this.zzg == zzniVar.zzg() && ((str = this.zza) != null ? str.equals(zzniVar.zza()) : zzniVar.zza() == null) && ((l10 = this.zzb) != null ? l10.equals(zzniVar.zzb()) : zzniVar.zzb() == null) && ((place = this.zzc) != null ? place.equals(zzniVar.zzc()) : zzniVar.zzc() == null) && ((autocompletePrediction = this.zzd) != null ? autocompletePrediction.equals(zzniVar.zzd()) : zzniVar.zzd() == null) && ((autocompleteSessionToken = this.zze) != null ? autocompleteSessionToken.equals(zzniVar.zze()) : zzniVar.zze() == null) && ((status = this.zzf) != null ? status.equals(zzniVar.zzf()) : zzniVar.zzf() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final Place zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final AutocompletePrediction zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final AutocompleteSessionToken zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final Status zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final int zzg() {
        return this.zzg;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i10 = this.zzg;
        L l10 = this.zzb;
        int iHashCode2 = l10 == null ? 0 : l10.hashCode();
        int i11 = iHashCode ^ ((i10 ^ 1000003) * 1000003);
        Place place = this.zzc;
        int iHashCode3 = ((((i11 * 1000003) ^ iHashCode2) * 1000003) ^ (place == null ? 0 : place.hashCode())) * 1000003;
        AutocompletePrediction autocompletePrediction = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (autocompletePrediction == null ? 0 : autocompletePrediction.hashCode())) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        int iHashCode5 = (iHashCode4 ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        Status status = this.zzf;
        return iHashCode5 ^ (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        String str;
        switch (this.zzg) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.zza;
        L l10 = this.zzb;
        Place place = this.zzc;
        AutocompletePrediction autocompletePrediction = this.zzd;
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        Status status = this.zzf;
        int length = str.length();
        String strValueOf = String.valueOf(l10);
        String strValueOf2 = String.valueOf(place);
        String strValueOf3 = String.valueOf(autocompletePrediction);
        String strValueOf4 = String.valueOf(autocompleteSessionToken);
        String strValueOf5 = String.valueOf(status);
        StringBuilder sb2 = new StringBuilder(length + 31 + String.valueOf(str2).length() + 14 + strValueOf.length() + 8 + strValueOf2.length() + 13 + strValueOf3.length() + 15 + strValueOf4.length() + 9 + strValueOf5.length() + 1);
        sb2.append("AutocompleteState{type=");
        sb2.append(str);
        sb2.append(", query=");
        sb2.append(str2);
        sb2.append(", predictions=");
        sb2.append(strValueOf);
        sb2.append(", place=");
        sb2.append(strValueOf2);
        sb2.append(", prediction=");
        sb2.append(strValueOf3);
        sb2.append(", sessionToken=");
        sb2.append(strValueOf4);
        sb2.append(", status=");
        sb2.append(strValueOf5);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final L zzb() {
        return this.zzb;
    }

    /* synthetic */ zzne(int i10, String str, L l10, Place place, AutocompletePrediction autocompletePrediction, AutocompleteSessionToken autocompleteSessionToken, Status status, byte[] bArr) {
        this.zzg = i10;
        this.zza = str;
        this.zzb = l10;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = autocompleteSessionToken;
        this.zzf = status;
    }
}
