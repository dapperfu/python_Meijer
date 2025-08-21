package com.bazaarvoice.bvandroidsdk;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;

@Deprecated
/* loaded from: classes4.dex */
enum PlaceAttribute {
    Type("type"),
    ClientId("clientId"),
    Name("name"),
    City("city"),
    State("state"),
    Zip("zip"),
    Address(PlaceTypes.ADDRESS),
    StoreId("storeId"),
    Id(PreferencesHelper.PREF_ID);

    private final String key;

    public String getKey() {
        return this.key;
    }

    PlaceAttribute(String str) {
        this.key = str;
    }
}
