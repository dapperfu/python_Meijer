package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zza extends AccessibilityOptions.Builder {
    private Place.BooleanPlaceAttributeValue zza;
    private Place.BooleanPlaceAttributeValue zzb;
    private Place.BooleanPlaceAttributeValue zzc;
    private Place.BooleanPlaceAttributeValue zzd;

    zza() {
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final AccessibilityOptions build() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zza;
        if (booleanPlaceAttributeValue4 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null) {
            return new zzbo(booleanPlaceAttributeValue4, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" wheelchairAccessibleParking");
        }
        if (this.zzb == null) {
            sb2.append(" wheelchairAccessibleEntrance");
        }
        if (this.zzc == null) {
            sb2.append(" wheelchairAccessibleRestroom");
        }
        if (this.zzd == null) {
            sb2.append(" wheelchairAccessibleSeating");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleEntrance\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleRestroom\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"wheelchairAccessibleSeating\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final AccessibilityOptions.Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final AccessibilityOptions.Builder setWheelchairAccessibleParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final AccessibilityOptions.Builder setWheelchairAccessibleRestroom(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final AccessibilityOptions.Builder setWheelchairAccessibleSeating(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }
}
