package com.google.android.libraries.places.internal;

import Ee.M;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;

/* loaded from: classes6.dex */
public final class zzlm {
    private static final M zza = M.a().f(TypeFilter.ADDRESS, PlaceTypes.ADDRESS).f(TypeFilter.CITIES, PlaceTypes.CITIES).f(TypeFilter.ESTABLISHMENT, PlaceTypes.ESTABLISHMENT).f(TypeFilter.GEOCODE, PlaceTypes.GEOCODE).f(TypeFilter.REGIONS, PlaceTypes.REGIONS).c();

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
