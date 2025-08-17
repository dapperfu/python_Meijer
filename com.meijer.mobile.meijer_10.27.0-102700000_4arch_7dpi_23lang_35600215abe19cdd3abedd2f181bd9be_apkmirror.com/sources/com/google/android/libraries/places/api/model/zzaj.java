package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
abstract class zzaj extends ParkingOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;
    private final Place.BooleanPlaceAttributeValue zze;
    private final Place.BooleanPlaceAttributeValue zzf;
    private final Place.BooleanPlaceAttributeValue zzg;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParkingOptions) {
            ParkingOptions parkingOptions = (ParkingOptions) obj;
            if (this.zza.equals(parkingOptions.getFreeParkingLot()) && this.zzb.equals(parkingOptions.getPaidParkingLot()) && this.zzc.equals(parkingOptions.getFreeStreetParking()) && this.zzd.equals(parkingOptions.getPaidStreetParking()) && this.zze.equals(parkingOptions.getValetParking()) && this.zzf.equals(parkingOptions.getFreeGarageParking()) && this.zzg.equals(parkingOptions.getPaidGarageParking())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeGarageParking() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeParkingLot() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getFreeStreetParking() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidGarageParking() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidParkingLot() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getPaidStreetParking() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final Place.BooleanPlaceAttributeValue getValetParking() {
        return this.zze;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode();
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
        String string5 = this.zze.toString();
        int length5 = string5.length();
        String string6 = this.zzf.toString();
        int length6 = string6.length();
        String string7 = this.zzg.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 20 + length3 + 20 + length4 + 15 + length5 + 20 + length6 + 20 + string7.length() + 1);
        sb2.append("ParkingOptions{freeParkingLot=");
        sb2.append(string);
        sb2.append(", paidParkingLot=");
        sb2.append(string2);
        sb2.append(", freeStreetParking=");
        sb2.append(string3);
        sb2.append(", paidStreetParking=");
        sb2.append(string4);
        sb2.append(", valetParking=");
        sb2.append(string5);
        sb2.append(", freeGarageParking=");
        sb2.append(string6);
        sb2.append(", paidGarageParking=");
        sb2.append(string7);
        sb2.append("}");
        return sb2.toString();
    }

    zzaj(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        if (booleanPlaceAttributeValue != null) {
            this.zza = booleanPlaceAttributeValue;
            if (booleanPlaceAttributeValue2 != null) {
                this.zzb = booleanPlaceAttributeValue2;
                if (booleanPlaceAttributeValue3 != null) {
                    this.zzc = booleanPlaceAttributeValue3;
                    if (booleanPlaceAttributeValue4 != null) {
                        this.zzd = booleanPlaceAttributeValue4;
                        if (booleanPlaceAttributeValue5 != null) {
                            this.zze = booleanPlaceAttributeValue5;
                            if (booleanPlaceAttributeValue6 != null) {
                                this.zzf = booleanPlaceAttributeValue6;
                                if (booleanPlaceAttributeValue7 != null) {
                                    this.zzg = booleanPlaceAttributeValue7;
                                    return;
                                }
                                throw new NullPointerException("Null paidGarageParking");
                            }
                            throw new NullPointerException("Null freeGarageParking");
                        }
                        throw new NullPointerException("Null valetParking");
                    }
                    throw new NullPointerException("Null paidStreetParking");
                }
                throw new NullPointerException("Null freeStreetParking");
            }
            throw new NullPointerException("Null paidParkingLot");
        }
        throw new NullPointerException("Null freeParkingLot");
    }
}
