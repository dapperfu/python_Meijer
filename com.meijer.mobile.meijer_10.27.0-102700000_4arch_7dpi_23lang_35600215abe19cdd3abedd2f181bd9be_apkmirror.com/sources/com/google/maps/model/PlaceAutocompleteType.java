package com.google.maps.model;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.internal.StringJoin;

/* loaded from: classes7.dex */
public enum PlaceAutocompleteType implements StringJoin.UrlValue {
    GEOCODE(PlaceTypes.GEOCODE),
    ADDRESS(PlaceTypes.ADDRESS),
    ESTABLISHMENT(PlaceTypes.ESTABLISHMENT),
    REGIONS(PlaceTypes.REGIONS),
    CITIES(PlaceTypes.CITIES);

    private final String placeType;

    @Override // java.lang.Enum
    public String toString() {
        return this.placeType;
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return this.placeType;
    }

    PlaceAutocompleteType(String str) {
        this.placeType = str;
    }
}
