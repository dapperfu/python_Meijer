package com.google.maps.model;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class GeocodingResult implements Serializable {
    private static final long serialVersionUID = 1;
    public AddressComponent[] addressComponents;
    public String formattedAddress;
    public Geometry geometry;
    public boolean partialMatch;
    public String placeId;
    public PlusCode plusCode;
    public String[] postcodeLocalities;
    public AddressType[] types;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[GeocodingResult");
        if (this.partialMatch) {
            sb2.append(" PARTIAL MATCH");
        }
        sb2.append(" placeId=");
        sb2.append(this.placeId);
        sb2.append(" ");
        sb2.append(this.geometry);
        sb2.append(", formattedAddress=");
        sb2.append(this.formattedAddress);
        sb2.append(", types=");
        sb2.append(Arrays.toString(this.types));
        sb2.append(", addressComponents=");
        sb2.append(Arrays.toString(this.addressComponents));
        String[] strArr = this.postcodeLocalities;
        if (strArr != null && strArr.length > 0) {
            sb2.append(", postcodeLocalities=");
            sb2.append(Arrays.toString(this.postcodeLocalities));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
