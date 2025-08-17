package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzai extends ParkingOptions.Builder {
    private Place.BooleanPlaceAttributeValue zza;
    private Place.BooleanPlaceAttributeValue zzb;
    private Place.BooleanPlaceAttributeValue zzc;
    private Place.BooleanPlaceAttributeValue zzd;
    private Place.BooleanPlaceAttributeValue zze;
    private Place.BooleanPlaceAttributeValue zzf;
    private Place.BooleanPlaceAttributeValue zzg;

    zzai() {
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions build() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zza;
        if (booleanPlaceAttributeValue7 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null && (booleanPlaceAttributeValue4 = this.zze) != null && (booleanPlaceAttributeValue5 = this.zzf) != null && (booleanPlaceAttributeValue6 = this.zzg) != null) {
            return new zzdc(booleanPlaceAttributeValue7, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" freeParkingLot");
        }
        if (this.zzb == null) {
            sb2.append(" paidParkingLot");
        }
        if (this.zzc == null) {
            sb2.append(" freeStreetParking");
        }
        if (this.zzd == null) {
            sb2.append(" paidStreetParking");
        }
        if (this.zze == null) {
            sb2.append(" valetParking");
        }
        if (this.zzf == null) {
            sb2.append(" freeGarageParking");
        }
        if (this.zzg == null) {
            sb2.append(" paidGarageParking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getFreeGarageParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzf;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"freeGarageParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getFreeParkingLot() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"freeParkingLot\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getFreeStreetParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"freeStreetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getPaidGarageParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzg;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"paidGarageParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getPaidParkingLot() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"paidParkingLot\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getPaidStreetParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"paidStreetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final Place.BooleanPlaceAttributeValue getValetParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zze;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"valetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setFreeGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.zzf = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setFreeParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setFreeStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setPaidGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.zzg = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setPaidParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setPaidStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final ParkingOptions.Builder setValetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.zze = booleanPlaceAttributeValue;
        return this;
    }
}
