package com.google.maps.model;

import j$.time.Instant;
import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class PlaceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    public AddressComponent[] addressComponents;
    public String adrAddress;

    @Deprecated
    public AlternatePlaceIds[] altIds;
    public String businessStatus;
    public Boolean curbsidePickup;
    public OpeningHours currentOpeningHours;
    public Boolean delivery;
    public Boolean dineIn;
    public PlaceEditorialSummary editorialSummary;
    public String formattedAddress;
    public String formattedPhoneNumber;
    public Geometry geometry;
    public String[] htmlAttributions;
    public URL icon;
    public String internationalPhoneNumber;
    public String name;
    public OpeningHours openingHours;

    @Deprecated
    public boolean permanentlyClosed;
    public Photo[] photos;
    public String placeId;
    public PlusCode plusCode;
    public PriceLevel priceLevel;
    public float rating;
    public Boolean reservable;
    public Review[] reviews;

    @Deprecated
    public PlaceIdScope scope;
    public OpeningHours secondaryOpeningHours;
    public Boolean servesBeer;
    public Boolean servesBreakfast;
    public Boolean servesBrunch;
    public Boolean servesDinner;
    public Boolean servesLunch;
    public Boolean servesVegetarianFood;
    public Boolean servesWine;
    public Boolean takeout;
    public AddressType[] types;
    public URL url;
    public int userRatingsTotal;
    public int utcOffset;
    public String vicinity;
    public URL website;
    public Boolean wheelchairAccessibleEntrance;

    @Deprecated
    public static class AlternatePlaceIds implements Serializable {
        private static final long serialVersionUID = 1;
        public String placeId;

        @Deprecated
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
        if (this.businessStatus != null) {
            sb2.append("businessStatus=");
            sb2.append(this.businessStatus);
        }
        if (this.curbsidePickup != null) {
            sb2.append(", curbsidePickup=");
            sb2.append(this.curbsidePickup);
        }
        if (this.currentOpeningHours != null) {
            sb2.append(", currentOpeningHours=");
            sb2.append(this.currentOpeningHours);
        }
        if (this.delivery != null) {
            sb2.append(", delivery=");
            sb2.append(this.delivery);
        }
        if (this.dineIn != null) {
            sb2.append(", dineIn=");
            sb2.append(this.dineIn);
        }
        if (this.editorialSummary != null) {
            sb2.append(", editorialSummary=");
            sb2.append(this.editorialSummary);
        }
        sb2.append(", geometry=");
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
        if (this.reservable != null) {
            sb2.append(", reservable=");
            sb2.append(this.reservable);
        }
        Review[] reviewArr = this.reviews;
        if (reviewArr != null && reviewArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.reviews.length);
            sb2.append(" reviews");
        }
        if (this.secondaryOpeningHours != null) {
            sb2.append(", secondaryOpeningHours=");
            sb2.append(this.secondaryOpeningHours);
        }
        if (this.servesBeer != null) {
            sb2.append(", servesBeer=");
            sb2.append(this.servesBeer);
        }
        if (this.servesBreakfast != null) {
            sb2.append(", servesBreakfast=");
            sb2.append(this.servesBreakfast);
        }
        if (this.servesBrunch != null) {
            sb2.append(", servesBrunch=");
            sb2.append(this.servesBrunch);
        }
        if (this.servesDinner != null) {
            sb2.append(", servesDinner=");
            sb2.append(this.servesDinner);
        }
        if (this.servesLunch != null) {
            sb2.append(", servesLunch=");
            sb2.append(this.servesLunch);
        }
        if (this.servesVegetarianFood != null) {
            sb2.append(", servesVegetarianFood=");
            sb2.append(this.servesVegetarianFood);
        }
        if (this.servesWine != null) {
            sb2.append(", servesWine=");
            sb2.append(this.servesWine);
        }
        if (this.takeout != null) {
            sb2.append(", takeout=");
            sb2.append(this.takeout);
        }
        if (this.wheelchairAccessibleEntrance != null) {
            sb2.append(", wheelchairAccessibleEntrance=");
            sb2.append(this.wheelchairAccessibleEntrance);
        }
        String[] strArr = this.htmlAttributions;
        if (strArr != null && strArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.htmlAttributions.length);
            sb2.append(" htmlAttributions");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
