package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
abstract class zzb extends AccessibilityOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccessibilityOptions) {
            AccessibilityOptions accessibilityOptions = (AccessibilityOptions) obj;
            if (this.zza.equals(accessibilityOptions.getWheelchairAccessibleParking()) && this.zzb.equals(accessibilityOptions.getWheelchairAccessibleEntrance()) && this.zzc.equals(accessibilityOptions.getWheelchairAccessibleRestroom()) && this.zzd.equals(accessibilityOptions.getWheelchairAccessibleSeating())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating() {
        return this.zzd;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(length + 80 + length2 + 31 + length3 + 30 + string4.length() + 1);
        sb2.append("AccessibilityOptions{wheelchairAccessibleParking=");
        sb2.append(string);
        sb2.append(", wheelchairAccessibleEntrance=");
        sb2.append(string2);
        sb2.append(", wheelchairAccessibleRestroom=");
        sb2.append(string3);
        sb2.append(", wheelchairAccessibleSeating=");
        sb2.append(string4);
        sb2.append("}");
        return sb2.toString();
    }

    zzb(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue != null) {
            this.zza = booleanPlaceAttributeValue;
            if (booleanPlaceAttributeValue2 != null) {
                this.zzb = booleanPlaceAttributeValue2;
                if (booleanPlaceAttributeValue3 != null) {
                    this.zzc = booleanPlaceAttributeValue3;
                    if (booleanPlaceAttributeValue4 != null) {
                        this.zzd = booleanPlaceAttributeValue4;
                        return;
                    }
                    throw new NullPointerException("Null wheelchairAccessibleSeating");
                }
                throw new NullPointerException("Null wheelchairAccessibleRestroom");
            }
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        throw new NullPointerException("Null wheelchairAccessibleParking");
    }
}
