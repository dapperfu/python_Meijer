package com.google.maps.model;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.internal.StringJoin;

/* loaded from: classes8.dex */
public class ComponentFilter implements StringJoin.UrlValue {
    public final String component;
    public final String value;

    public static ComponentFilter administrativeArea(String str) {
        return new ComponentFilter("administrative_area", str);
    }

    public static ComponentFilter country(String str) {
        return new ComponentFilter(PlaceTypes.COUNTRY, str);
    }

    public static ComponentFilter locality(String str) {
        return new ComponentFilter(PlaceTypes.LOCALITY, str);
    }

    public static ComponentFilter postalCode(String str) {
        return new ComponentFilter(PlaceTypes.POSTAL_CODE, str);
    }

    public static ComponentFilter route(String str) {
        return new ComponentFilter(PlaceTypes.ROUTE, str);
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return StringJoin.join(':', this.component, this.value);
    }

    public ComponentFilter(String str, String str2) {
        this.component = str;
        this.value = str2;
    }

    public String toString() {
        return toUrlValue();
    }
}
