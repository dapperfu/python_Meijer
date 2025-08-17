package com.google.maps.model;

import j$.time.Instant;
import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class PlaceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    public AddressComponent[] addressComponents;
    public String adrAddress;
    public AlternatePlaceIds[] altIds;
    public String businessStatus;
    public String formattedAddress;
    public String formattedPhoneNumber;
    public Geometry geometry;
    public String[] htmlAttributions;
    public URL icon;
    public String internationalPhoneNumber;
    public String name;
    public OpeningHours openingHours;
    public boolean permanentlyClosed;
    public Photo[] photos;
    public String placeId;
    public PlusCode plusCode;
    public PriceLevel priceLevel;
    public float rating;
    public Review[] reviews;

    @Deprecated
    public PlaceIdScope scope;
    public AddressType[] types;
    public URL url;
    public int userRatingsTotal;
    public int utcOffset;
    public String vicinity;
    public URL website;

    @Deprecated
    public static class AlternatePlaceIds implements Serializable {
        private static final long serialVersionUID = 1;
        public String placeId;
        public PlaceIdScope scope;

        public String toString() {
            return String.format("%s (%s)", this.placeId, this.scope);
        }
    }

    public static class Review implements Serializable {
        private static final long serialVersionUID = 1;
        public AspectRating[] aspects;
        public String authorName;
        public URL authorUrl;
        public String language;
        public String profilePhotoUrl;
        public int rating;
        public String relativeTimeDescription;
        public String text;
        public Instant time;

        public static class AspectRating implements Serializable {
            private static final long serialVersionUID = 1;
            public int rating;
            public RatingType type;

            public enum RatingType {
                APPEAL,
                ATMOSPHERE,
                DECOR,
                FACILITIES,
                FOOD,
                OVERALL,
                QUALITY,
                SERVICE,
                UNKNOWN
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PlaceDetails: ");
        sb2.append("\"");
        sb2.append(this.name);
        sb2.append("\"");
        sb2.append(" ");
        sb2.append(this.placeId);
        sb2.append(" (");
        sb2.append(this.scope);
        sb2.append(")");
        sb2.append(" address=\"");
        sb2.append(this.formattedAddress);
        sb2.append("\"");
        sb2.append(" geometry=");
        sb2.append(this.geometry);
        if (this.vicinity != null) {
            sb2.append(", vicinity=");
            sb2.append(this.vicinity);
        }
        AddressType[] addressTypeArr = this.types;
        if (addressTypeArr != null && addressTypeArr.length > 0) {
            sb2.append(", types=");
            sb2.append(Arrays.toString(this.types));
        }
        AlternatePlaceIds[] alternatePlaceIdsArr = this.altIds;
        if (alternatePlaceIdsArr != null && alternatePlaceIdsArr.length > 0) {
            sb2.append(", altIds=");
            sb2.append(Arrays.toString(this.altIds));
        }
        if (this.formattedPhoneNumber != null) {
            sb2.append(", phone=");
            sb2.append(this.formattedPhoneNumber);
        }
        if (this.internationalPhoneNumber != null) {
            sb2.append(", internationalPhoneNumber=");
            sb2.append(this.internationalPhoneNumber);
        }
        if (this.url != null) {
            sb2.append(", url=");
            sb2.append(this.url);
        }
        if (this.website != null) {
            sb2.append(", website=");
            sb2.append(this.website);
        }
        if (this.icon != null) {
            sb2.append(", icon");
        }
        if (this.openingHours != null) {
            sb2.append(", openingHours");
            sb2.append(", utcOffset=");
            sb2.append(this.utcOffset);
        }
        if (this.priceLevel != null) {
            sb2.append(", priceLevel=");
            sb2.append(this.priceLevel);
        }
        sb2.append(", rating=");
        sb2.append(this.rating);
        if (this.permanentlyClosed) {
            sb2.append(", permanentlyClosed");
        }
        if (this.userRatingsTotal > 0) {
            sb2.append(", userRatingsTotal=");
            sb2.append(this.userRatingsTotal);
        }
        Photo[] photoArr = this.photos;
        if (photoArr != null && photoArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.photos.length);
            sb2.append(" photos");
        }
        Review[] reviewArr = this.reviews;
        if (reviewArr != null && reviewArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.reviews.length);
            sb2.append(" reviews");
        }
        String[] strArr = this.htmlAttributions;
        if (strArr != null && strArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.htmlAttributions.length);
            sb2.append(" htmlAttributions");
        }
        if (this.businessStatus != null) {
            sb2.append(", businessStatus=");
            sb2.append(this.businessStatus);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
