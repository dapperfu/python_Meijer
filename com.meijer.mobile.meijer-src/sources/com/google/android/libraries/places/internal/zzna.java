package com.google.android.libraries.places.internal;

import Ee.L;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* loaded from: classes6.dex */
abstract class zzna extends zzng {
    private final zzoh zza;
    private final AutocompleteActivityMode zzb;
    private final L zzc;
    private final zzoc zzd;
    private final LatLng zze;
    private final String zzf;
    private final String zzg;
    private final LocationBias zzh;
    private final LocationRestriction zzi;
    private final L zzj;
    private final TypeFilter zzk;
    private final L zzl;
    private final int zzm;
    private final int zzn;
    private final String zzo;
    private final AutocompleteUiCustomization zzp;
    private final boolean zzq;
    private final AutocompleteSessionToken zzr;

    public final boolean equals(Object obj) {
        LatLng latLng;
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        String str3;
        AutocompleteUiCustomization autocompleteUiCustomization;
        AutocompleteSessionToken autocompleteSessionToken;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzng) {
            zzng zzngVar = (zzng) obj;
            if (this.zza.equals(zzngVar.zza()) && this.zzb.equals(zzngVar.zzb()) && this.zzc.equals(zzngVar.zzc()) && this.zzd.equals(zzngVar.zzd()) && ((latLng = this.zze) != null ? latLng.equals(zzngVar.zze()) : zzngVar.zze() == null) && ((str = this.zzf) != null ? str.equals(zzngVar.zzf()) : zzngVar.zzf() == null) && ((str2 = this.zzg) != null ? str2.equals(zzngVar.zzg()) : zzngVar.zzg() == null) && ((locationBias = this.zzh) != null ? locationBias.equals(zzngVar.zzh()) : zzngVar.zzh() == null) && ((locationRestriction = this.zzi) != null ? locationRestriction.equals(zzngVar.zzi()) : zzngVar.zzi() == null) && this.zzj.equals(zzngVar.zzj()) && ((typeFilter = this.zzk) != null ? typeFilter.equals(zzngVar.zzk()) : zzngVar.zzk() == null) && this.zzl.equals(zzngVar.zzl()) && this.zzm == zzngVar.zzm() && this.zzn == zzngVar.zzn() && ((str3 = this.zzo) != null ? str3.equals(zzngVar.zzo()) : zzngVar.zzo() == null) && ((autocompleteUiCustomization = this.zzp) != null ? autocompleteUiCustomization.equals(zzngVar.zzp()) : zzngVar.zzp() == null) && this.zzq == zzngVar.zzq() && ((autocompleteSessionToken = this.zzr) != null ? autocompleteSessionToken.equals(zzngVar.zzr()) : zzngVar.zzr() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zzoh zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteActivityMode zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zzoc zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LatLng zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzg() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LocationBias zzh() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LocationRestriction zzi() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    @Deprecated
    public final TypeFilter zzk() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final int zzm() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final int zzn() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzo() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteUiCustomization zzp() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final boolean zzq() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteSessionToken zzr() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zznf zzs() {
        return new zzmz(this);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
        LatLng latLng = this.zze;
        int iHashCode2 = ((iHashCode * 1000003) ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str = this.zzf;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzg;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzh;
        int iHashCode5 = (iHashCode4 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzi;
        int iHashCode6 = (((iHashCode5 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzj.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzk;
        int iHashCode7 = (((((((iHashCode6 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003) ^ this.zzl.hashCode()) * 1000003) ^ this.zzm) * 1000003) ^ this.zzn) * 1000003;
        String str3 = this.zzo;
        int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AutocompleteUiCustomization autocompleteUiCustomization = this.zzp;
        int iHashCode9 = (((iHashCode8 ^ (autocompleteUiCustomization == null ? 0 : autocompleteUiCustomization.hashCode())) * 1000003) ^ (true != this.zzq ? 1237 : 1231)) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzr;
        return iHashCode9 ^ (autocompleteSessionToken != null ? autocompleteSessionToken.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        int length4 = string4.length();
        AutocompleteSessionToken autocompleteSessionToken = this.zzr;
        AutocompleteUiCustomization autocompleteUiCustomization = this.zzp;
        L l10 = this.zzl;
        TypeFilter typeFilter = this.zzk;
        L l11 = this.zzj;
        LocationRestriction locationRestriction = this.zzi;
        LocationBias locationBias = this.zzh;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(locationBias);
        String strValueOf3 = String.valueOf(locationRestriction);
        String string5 = l11.toString();
        String strValueOf4 = String.valueOf(typeFilter);
        String string6 = l10.toString();
        String strValueOf5 = String.valueOf(autocompleteUiCustomization);
        String strValueOf6 = String.valueOf(autocompleteSessionToken);
        int length5 = strValueOf.length();
        String str = this.zzf;
        int length6 = String.valueOf(str).length();
        String str2 = this.zzg;
        int length7 = String.valueOf(str2).length();
        int length8 = strValueOf2.length();
        int length9 = strValueOf3.length();
        int length10 = string5.length();
        int length11 = strValueOf4.length();
        int length12 = string6.length();
        int i10 = this.zzm;
        int length13 = String.valueOf(i10).length();
        int i11 = this.zzn;
        int length14 = String.valueOf(i11).length();
        String str3 = this.zzo;
        int length15 = String.valueOf(str3).length();
        int length16 = strValueOf5.length();
        boolean z10 = this.zzq;
        StringBuilder sb2 = new StringBuilder(length + 41 + length2 + 14 + length3 + 17 + length4 + 9 + length5 + 15 + length6 + 7 + length7 + 15 + length8 + 22 + length9 + 12 + length10 + 13 + length11 + 14 + length12 + 15 + length13 + 19 + length14 + 13 + length15 + 30 + length16 + 36 + String.valueOf(z10).length() + 27 + strValueOf6.length() + 1);
        sb2.append("AutocompleteOptions{widgetBackend=");
        sb2.append(string);
        sb2.append(", mode=");
        sb2.append(string2);
        sb2.append(", placeFields=");
        sb2.append(string3);
        sb2.append(", activityOrigin=");
        sb2.append(string4);
        sb2.append(", origin=");
        sb2.append(strValueOf);
        sb2.append(", initialQuery=");
        sb2.append(str);
        sb2.append(", hint=");
        sb2.append(str2);
        sb2.append(", locationBias=");
        sb2.append(strValueOf2);
        sb2.append(", locationRestriction=");
        sb2.append(strValueOf3);
        sb2.append(", countries=");
        sb2.append(string5);
        sb2.append(", typeFilter=");
        sb2.append(strValueOf4);
        sb2.append(", typesFilter=");
        sb2.append(string6);
        sb2.append(", primaryColor=");
        sb2.append(i10);
        sb2.append(", primaryColorDark=");
        sb2.append(i11);
        sb2.append(", regionCode=");
        sb2.append(str3);
        sb2.append(", autocompleteUiCustomization=");
        sb2.append(strValueOf5);
        sb2.append(", pureServiceAreaBusinessesIncluded=");
        sb2.append(z10);
        sb2.append(", autocompleteSessionToken=");
        sb2.append(strValueOf6);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final L zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final L zzj() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final L zzl() {
        return this.zzl;
    }

    zzna(zzoh zzohVar, AutocompleteActivityMode autocompleteActivityMode, L l10, zzoc zzocVar, LatLng latLng, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, L l11, TypeFilter typeFilter, L l12, int i10, int i11, String str3, AutocompleteUiCustomization autocompleteUiCustomization, boolean z10, AutocompleteSessionToken autocompleteSessionToken) {
        if (zzohVar != null) {
            this.zza = zzohVar;
            if (autocompleteActivityMode != null) {
                this.zzb = autocompleteActivityMode;
                if (l10 != null) {
                    this.zzc = l10;
                    if (zzocVar != null) {
                        this.zzd = zzocVar;
                        this.zze = latLng;
                        this.zzf = str;
                        this.zzg = str2;
                        this.zzh = locationBias;
                        this.zzi = locationRestriction;
                        if (l11 != null) {
                            this.zzj = l11;
                            this.zzk = typeFilter;
                            if (l12 != null) {
                                this.zzl = l12;
                                this.zzm = i10;
                                this.zzn = i11;
                                this.zzo = str3;
                                this.zzp = autocompleteUiCustomization;
                                this.zzq = z10;
                                this.zzr = autocompleteSessionToken;
                                return;
                            }
                            throw new NullPointerException("Null typesFilter");
                        }
                        throw new NullPointerException("Null countries");
                    }
                    throw new NullPointerException("Null activityOrigin");
                }
                throw new NullPointerException("Null placeFields");
            }
            throw new NullPointerException("Null mode");
        }
        throw new NullPointerException("Null widgetBackend");
    }
}
