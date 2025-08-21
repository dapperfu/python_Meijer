package com.google.maps.model;

import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class PlacesSearchResult implements Serializable {
    private static final long serialVersionUID = 1;
    public String businessStatus;
    public String formattedAddress;
    public Geometry geometry;
    public URL icon;
    public String name;
    public OpeningHours openingHours;
    public boolean permanentlyClosed;
    public Photo[] photos;
    public String placeId;
    public float rating;

    @Deprecated
    public PlaceIdScope scope;
    public String[] types;
    public int userRatingsTotal;
    public String vicinity;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PlacesSearchResult: ");
        sb2.append("\"");
        sb2.append(this.name);
        sb2.append("\"");
        sb2.append(", \"");
        sb2.append(this.formattedAddress);
        sb2.append("\"");
        sb2.append(", geometry=");
        sb2.append(this.geometry);
        sb2.append(", placeId=");
        sb2.append(this.placeId);
        if (this.vicinity != null) {
            sb2.append(", vicinity=");
            sb2.append(this.vicinity);
        }
        String[] strArr = this.types;
        if (strArr != null && strArr.length > 0) {
            sb2.append(", types=");
            sb2.append(Arrays.toString(this.types));
        }
        sb2.append(", rating=");
        sb2.append(this.rating);
        if (this.icon != null) {
            sb2.append(", icon");
        }
        if (this.openingHours != null) {
            sb2.append(", openingHours");
        }
        Photo[] photoArr = this.photos;
        if (photoArr != null && photoArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.photos.length);
            sb2.append(" photos");
        }
        if (this.permanentlyClosed) {
            sb2.append(", permanentlyClosed");
        }
        if (this.userRatingsTotal > 0) {
            sb2.append(", userRatingsTotal=");
            sb2.append(this.userRatingsTotal);
        }
        if (this.businessStatus != null) {
            sb2.append(", businessStatus=");
            sb2.append(this.businessStatus);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
