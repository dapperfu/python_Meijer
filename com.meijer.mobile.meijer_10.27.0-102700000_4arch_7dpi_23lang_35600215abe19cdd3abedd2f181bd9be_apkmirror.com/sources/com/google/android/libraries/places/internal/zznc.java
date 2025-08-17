package com.google.android.libraries.places.internal;

import Ce.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* loaded from: classes6.dex */
final class zznc extends zzna {
    public static final Parcelable.Creator<zznc> CREATOR = new zznb();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zznc(zzoh zzohVar, AutocompleteActivityMode autocompleteActivityMode, L l10, zzoc zzocVar, LatLng latLng, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, L l11, TypeFilter typeFilter, L l12, int i10, int i11, String str3, AutocompleteUiCustomization autocompleteUiCustomization, boolean z10, AutocompleteSessionToken autocompleteSessionToken) {
        super(zzohVar, autocompleteActivityMode, l10, zzocVar, latLng, str, str2, locationBias, locationRestriction, l11, typeFilter, l12, i10, i11, str3, autocompleteUiCustomization, z10, autocompleteSessionToken);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(zza(), i10);
        parcel.writeParcelable(zzb(), i10);
        parcel.writeList(zzc().a());
        parcel.writeParcelable(zzd(), i10);
        parcel.writeParcelable(zze(), i10);
        if (zzf() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzf());
        }
        if (zzg() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzg());
        }
        parcel.writeParcelable(zzh(), i10);
        parcel.writeParcelable(zzi(), i10);
        parcel.writeList(zzj().a());
        parcel.writeParcelable(zzk(), i10);
        parcel.writeList(zzl().a());
        parcel.writeInt(zzm());
        parcel.writeInt(zzn());
        if (zzo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzo());
        }
        parcel.writeParcelable(zzp(), i10);
        parcel.writeInt(zzq() ? 1 : 0);
        parcel.writeParcelable(zzr(), i10);
    }
}
