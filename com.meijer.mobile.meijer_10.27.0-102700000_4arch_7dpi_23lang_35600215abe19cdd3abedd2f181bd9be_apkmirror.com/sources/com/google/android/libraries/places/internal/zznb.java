package com.google.android.libraries.places.internal;

import Ce.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* loaded from: classes6.dex */
final class zznb implements Parcelable.Creator {
    zznb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzoh zzohVar = (zzoh) parcel.readParcelable(zzng.class.getClassLoader());
        AutocompleteActivityMode autocompleteActivityMode = (AutocompleteActivityMode) parcel.readParcelable(zzng.class.getClassLoader());
        L lS = L.s(parcel.readArrayList(Place.Field.class.getClassLoader()));
        zzoc zzocVar = (zzoc) parcel.readParcelable(zzng.class.getClassLoader());
        LatLng latLng = (LatLng) parcel.readParcelable(zzng.class.getClassLoader());
        String string = parcel.readInt() == 0 ? parcel.readString() : null;
        String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
        LocationBias locationBias = (LocationBias) parcel.readParcelable(zzng.class.getClassLoader());
        LocationRestriction locationRestriction = (LocationRestriction) parcel.readParcelable(zzng.class.getClassLoader());
        L lS2 = L.s(parcel.readArrayList(String.class.getClassLoader()));
        TypeFilter typeFilter = (TypeFilter) parcel.readParcelable(zzng.class.getClassLoader());
        L lS3 = L.s(parcel.readArrayList(String.class.getClassLoader()));
        String string3 = null;
        int i10 = parcel.readInt();
        String str = string2;
        int i11 = parcel.readInt();
        if (parcel.readInt() == 0) {
            string3 = parcel.readString();
        }
        return new zznc(zzohVar, autocompleteActivityMode, lS, zzocVar, latLng, string, str, locationBias, locationRestriction, lS2, typeFilter, lS3, i10, i11, string3, (AutocompleteUiCustomization) parcel.readParcelable(zzng.class.getClassLoader()), parcel.readInt() == 1, (AutocompleteSessionToken) parcel.readParcelable(zzng.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zznc[i10];
    }
}
