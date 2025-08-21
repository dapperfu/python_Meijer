package com.bazaarvoice.bvandroidsdk;

import java.util.List;

/* loaded from: classes4.dex */
public class Store extends BaseProduct<StoreLocationAttributes> {

    public enum StoreAttributeType {
        COUNTRY("Country"),
        CITY("City"),
        STATE("State"),
        ADDRESS("Address"),
        PHONE("Phone"),
        POSTALCODE("PostalCode"),
        LATITUDE("Latitude"),
        LONGITUDE("Longitude");

        String val;

        @Override // java.lang.Enum
        public String toString() {
            return this.val;
        }

        StoreAttributeType(String str) {
            this.val = str;
        }
    }

    public String getLocationAttribute(StoreAttributeType storeAttributeType) {
        StoreLocationAttributes storeLocationAttributes;
        if (getAttributes() != null && (storeLocationAttributes = getAttributes().get(storeAttributeType.toString())) != null) {
            return storeLocationAttributes.getElements().get(0).getValue();
        }
        return null;
    }

    public List<StoreReview> getStoreReviews() {
        return getReviewList();
    }
}
