package com.google.android.libraries.places.api.model;

import Be.p;
import Ce.L;
import Ce.j0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Place implements Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    public static abstract class Builder {
        @RecentlyNonNull
        public Place build() {
            Place placeZzb = zzb();
            List<String> attributions = placeZzb.getAttributions();
            if (attributions != null) {
                Iterator<String> it = attributions.iterator();
                while (it.hasNext()) {
                    p.e(!TextUtils.isEmpty(it.next()), "Attributions must not contain null or empty values.");
                }
            }
            Integer priceLevel = placeZzb.getPriceLevel();
            if (priceLevel != null) {
                p.n(j0.d(0, 4).g(priceLevel), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, priceLevel);
            }
            Double rating = placeZzb.getRating();
            if (rating != null) {
                Double dValueOf = Double.valueOf(1.0d);
                Double dValueOf2 = Double.valueOf(5.0d);
                p.n(j0.d(dValueOf, dValueOf2).g(rating), "Rating must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, rating);
            }
            Integer userRatingsTotal = placeZzb.getUserRatingsTotal();
            if (userRatingsTotal != null) {
                p.l(j0.c(0).g(userRatingsTotal), "User Ratings Total must not be < 0, but was: %s.", userRatingsTotal);
            }
            if (attributions != null) {
                setAttributions(L.s(attributions));
            }
            List<PhotoMetadata> photoMetadatas = placeZzb.getPhotoMetadatas();
            if (photoMetadatas != null) {
                setPhotoMetadatas(L.s(photoMetadatas));
            }
            List<String> placeTypes = placeZzb.getPlaceTypes();
            if (placeTypes != null) {
                setPlaceTypes(L.s(placeTypes));
            }
            List<Type> types = placeZzb.getTypes();
            if (types != null) {
                setTypes(L.s(types));
            }
            List<OpeningHours> secondaryOpeningHours = placeZzb.getSecondaryOpeningHours();
            if (secondaryOpeningHours != null) {
                setSecondaryOpeningHours(L.s(secondaryOpeningHours));
            }
            List<Review> reviews = placeZzb.getReviews();
            if (reviews != null) {
                setReviews(L.s(reviews));
            }
            return zzb();
        }

        @RecentlyNullable
        public abstract AccessibilityOptions getAccessibilityOptions();

        @RecentlyNullable
        @Deprecated
        public abstract String getAddress();

        @RecentlyNullable
        public abstract AddressComponents getAddressComponents();

        @RecentlyNullable
        public abstract String getAdrFormatAddress();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getAllowsDogs();

        @RecentlyNullable
        public abstract List<String> getAttributions();

        @RecentlyNullable
        public abstract BusinessStatus getBusinessStatus();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getCurbsidePickup();

        @RecentlyNullable
        public abstract OpeningHours getCurrentOpeningHours();

        @RecentlyNullable
        public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getDelivery();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getDineIn();

        @RecentlyNullable
        public abstract String getDisplayName();

        @RecentlyNullable
        public abstract String getDisplayNameLanguageCode();

        @RecentlyNullable
        public abstract String getEditorialSummary();

        @RecentlyNullable
        public abstract String getEditorialSummaryLanguageCode();

        @RecentlyNullable
        public abstract EVChargeOptions getEvChargeOptions();

        @RecentlyNullable
        public abstract String getFormattedAddress();

        @RecentlyNullable
        public abstract FuelOptions getFuelOptions();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getGoodForChildren();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getGoodForGroups();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

        @RecentlyNullable
        public abstract Uri getGoogleMapsUri();

        @RecentlyNullable
        public abstract Integer getIconBackgroundColor();

        @RecentlyNullable
        public abstract String getIconMaskUrl();

        @RecentlyNullable
        @Deprecated
        public abstract String getIconUrl();

        @RecentlyNullable
        public abstract String getId();

        @RecentlyNullable
        public abstract String getInternationalPhoneNumber();

        @RecentlyNullable
        @Deprecated
        public abstract LatLng getLatLng();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getLiveMusic();

        @RecentlyNullable
        public abstract LatLng getLocation();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getMenuForChildren();

        @RecentlyNullable
        @Deprecated
        public abstract String getName();

        @RecentlyNullable
        @Deprecated
        public abstract String getNameLanguageCode();

        @RecentlyNullable
        public abstract String getNationalPhoneNumber();

        @RecentlyNullable
        public abstract OpeningHours getOpeningHours();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getOutdoorSeating();

        @RecentlyNullable
        public abstract ParkingOptions getParkingOptions();

        @RecentlyNullable
        public abstract PaymentOptions getPaymentOptions();

        @RecentlyNullable
        @Deprecated
        public abstract String getPhoneNumber();

        @RecentlyNullable
        public abstract List<PhotoMetadata> getPhotoMetadatas();

        @RecentlyNullable
        public abstract List<String> getPlaceTypes();

        @RecentlyNullable
        public abstract PlusCode getPlusCode();

        @RecentlyNullable
        public abstract Integer getPriceLevel();

        @RecentlyNullable
        public abstract String getPrimaryType();

        @RecentlyNullable
        public abstract String getPrimaryTypeDisplayName();

        @RecentlyNullable
        public abstract String getPrimaryTypeDisplayNameLanguageCode();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

        @RecentlyNullable
        public abstract Double getRating();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getReservable();

        @RecentlyNullable
        public abstract String getResourceName();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getRestroom();

        @RecentlyNullable
        public abstract List<Review> getReviews();

        @RecentlyNullable
        public abstract List<OpeningHours> getSecondaryOpeningHours();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesBeer();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesBreakfast();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesBrunch();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesCocktails();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesCoffee();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesDessert();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesDinner();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesLunch();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getServesWine();

        @RecentlyNullable
        public abstract String getShortFormattedAddress();

        @RecentlyNullable
        public abstract List<SubDestination> getSubDestinations();

        @RecentlyNonNull
        public abstract BooleanPlaceAttributeValue getTakeout();

        @RecentlyNullable
        @Deprecated
        public abstract List<Type> getTypes();

        @RecentlyNullable
        public abstract Integer getUserRatingCount();

        @RecentlyNullable
        @Deprecated
        public abstract Integer getUserRatingsTotal();

        @RecentlyNullable
        public abstract Integer getUtcOffsetMinutes();

        @RecentlyNullable
        public abstract LatLngBounds getViewport();

        @RecentlyNullable
        public abstract Uri getWebsiteUri();

        @RecentlyNonNull
        @Deprecated
        public abstract BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

        @RecentlyNonNull
        public abstract Builder setAccessibilityOptions(AccessibilityOptions accessibilityOptions);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setAddress(String str);

        @RecentlyNonNull
        public abstract Builder setAddressComponents(AddressComponents addressComponents);

        @RecentlyNonNull
        public abstract Builder setAdrFormatAddress(String str);

        @RecentlyNonNull
        public abstract Builder setAllowsDogs(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setAttributions(List<String> list);

        @RecentlyNonNull
        public abstract Builder setBusinessStatus(BusinessStatus businessStatus);

        @RecentlyNonNull
        public abstract Builder setCurbsidePickup(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setCurrentOpeningHours(OpeningHours openingHours);

        @RecentlyNonNull
        public abstract Builder setCurrentSecondaryOpeningHours(List<OpeningHours> list);

        @RecentlyNonNull
        public abstract Builder setDelivery(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setDineIn(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setDisplayName(String str);

        @RecentlyNonNull
        public abstract Builder setDisplayNameLanguageCode(String str);

        @RecentlyNonNull
        public abstract Builder setEditorialSummary(String str);

        @RecentlyNonNull
        public abstract Builder setEditorialSummaryLanguageCode(String str);

        @RecentlyNonNull
        public abstract Builder setEvChargeOptions(EVChargeOptions eVChargeOptions);

        @RecentlyNonNull
        public abstract Builder setFormattedAddress(String str);

        @RecentlyNonNull
        public abstract Builder setFuelOptions(FuelOptions fuelOptions);

        @RecentlyNonNull
        public abstract Builder setGoodForChildren(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setGoodForGroups(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setGoodForWatchingSports(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setGoogleMapsUri(Uri uri);

        @RecentlyNonNull
        public abstract Builder setIconBackgroundColor(Integer num);

        @RecentlyNonNull
        public abstract Builder setIconMaskUrl(String str);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setIconUrl(String str);

        @RecentlyNonNull
        public abstract Builder setId(String str);

        @RecentlyNonNull
        public abstract Builder setInternationalPhoneNumber(String str);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setLatLng(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setLiveMusic(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setLocation(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setMenuForChildren(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setName(String str);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setNameLanguageCode(String str);

        @RecentlyNonNull
        public abstract Builder setNationalPhoneNumber(String str);

        @RecentlyNonNull
        public abstract Builder setOpeningHours(OpeningHours openingHours);

        @RecentlyNonNull
        public abstract Builder setOutdoorSeating(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setParkingOptions(ParkingOptions parkingOptions);

        @RecentlyNonNull
        public abstract Builder setPaymentOptions(PaymentOptions paymentOptions);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setPhoneNumber(String str);

        @RecentlyNonNull
        public abstract Builder setPhotoMetadatas(List<PhotoMetadata> list);

        @RecentlyNonNull
        public abstract Builder setPlaceTypes(List<String> list);

        @RecentlyNonNull
        public abstract Builder setPlusCode(PlusCode plusCode);

        @RecentlyNonNull
        public abstract Builder setPriceLevel(Integer num);

        @RecentlyNonNull
        public abstract Builder setPrimaryType(String str);

        @RecentlyNonNull
        public abstract Builder setPrimaryTypeDisplayName(String str);

        @RecentlyNonNull
        public abstract Builder setPrimaryTypeDisplayNameLanguageCode(String str);

        @RecentlyNonNull
        public abstract Builder setPureServiceAreaBusiness(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setRating(Double d10);

        @RecentlyNonNull
        public abstract Builder setReservable(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setResourceName(String str);

        @RecentlyNonNull
        public abstract Builder setRestroom(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setReviews(List<Review> list);

        @RecentlyNonNull
        public abstract Builder setSecondaryOpeningHours(List<OpeningHours> list);

        @RecentlyNonNull
        public abstract Builder setServesBeer(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesBreakfast(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesBrunch(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesCocktails(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesCoffee(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesDessert(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesDinner(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesLunch(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesVegetarianFood(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setServesWine(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setShortFormattedAddress(String str);

        @RecentlyNonNull
        public abstract Builder setSubDestinations(List<SubDestination> list);

        @RecentlyNonNull
        public abstract Builder setTakeout(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setTypes(List<Type> list);

        @RecentlyNonNull
        public abstract Builder setUserRatingCount(Integer num);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setUserRatingsTotal(Integer num);

        @RecentlyNonNull
        public abstract Builder setUtcOffsetMinutes(Integer num);

        @RecentlyNonNull
        public abstract Builder setViewport(LatLngBounds latLngBounds);

        @RecentlyNonNull
        public abstract Builder setWebsiteUri(Uri uri);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setWheelchairAccessibleEntrance(@RecentlyNonNull BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder zza(zzey zzeyVar);

        abstract Place zzb();
    }

    @RecentlyNullable
    public abstract AccessibilityOptions getAccessibilityOptions();

    @RecentlyNullable
    @Deprecated
    public abstract String getAddress();

    @RecentlyNullable
    public abstract AddressComponents getAddressComponents();

    @RecentlyNullable
    public abstract String getAdrFormatAddress();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getAllowsDogs();

    @RecentlyNullable
    public abstract List<String> getAttributions();

    @RecentlyNullable
    public abstract BusinessStatus getBusinessStatus();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getCurbsidePickup();

    @RecentlyNullable
    public abstract OpeningHours getCurrentOpeningHours();

    @RecentlyNullable
    public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getDelivery();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getDineIn();

    @RecentlyNullable
    public abstract String getDisplayName();

    @RecentlyNullable
    public abstract String getDisplayNameLanguageCode();

    @RecentlyNullable
    public abstract String getEditorialSummary();

    @RecentlyNullable
    public abstract String getEditorialSummaryLanguageCode();

    @RecentlyNullable
    public abstract EVChargeOptions getEvChargeOptions();

    @RecentlyNullable
    public abstract String getFormattedAddress();

    @RecentlyNullable
    public abstract FuelOptions getFuelOptions();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getGoodForChildren();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getGoodForGroups();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

    @RecentlyNullable
    public abstract Uri getGoogleMapsUri();

    @RecentlyNullable
    public abstract Integer getIconBackgroundColor();

    @RecentlyNullable
    public abstract String getIconMaskUrl();

    @RecentlyNullable
    @Deprecated
    public abstract String getIconUrl();

    @RecentlyNullable
    public abstract String getId();

    @RecentlyNullable
    public abstract String getInternationalPhoneNumber();

    @RecentlyNullable
    @Deprecated
    public abstract LatLng getLatLng();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getLiveMusic();

    @RecentlyNullable
    public abstract LatLng getLocation();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getMenuForChildren();

    @RecentlyNullable
    @Deprecated
    public abstract String getName();

    @RecentlyNullable
    @Deprecated
    public abstract String getNameLanguageCode();

    @RecentlyNullable
    public abstract String getNationalPhoneNumber();

    @RecentlyNullable
    public abstract OpeningHours getOpeningHours();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getOutdoorSeating();

    @RecentlyNullable
    public abstract ParkingOptions getParkingOptions();

    @RecentlyNullable
    public abstract PaymentOptions getPaymentOptions();

    @RecentlyNullable
    @Deprecated
    public abstract String getPhoneNumber();

    @RecentlyNullable
    public abstract List<PhotoMetadata> getPhotoMetadatas();

    @RecentlyNullable
    public abstract List<String> getPlaceTypes();

    @RecentlyNullable
    public abstract PlusCode getPlusCode();

    @RecentlyNullable
    public abstract Integer getPriceLevel();

    @RecentlyNullable
    public abstract String getPrimaryType();

    @RecentlyNullable
    public abstract String getPrimaryTypeDisplayName();

    @RecentlyNullable
    public abstract String getPrimaryTypeDisplayNameLanguageCode();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

    @RecentlyNullable
    public abstract Double getRating();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getReservable();

    @RecentlyNullable
    public abstract String getResourceName();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getRestroom();

    @RecentlyNullable
    public abstract List<Review> getReviews();

    @RecentlyNullable
    public abstract List<OpeningHours> getSecondaryOpeningHours();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesBeer();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesBreakfast();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesBrunch();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesCocktails();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesCoffee();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesDessert();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesDinner();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesLunch();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getServesWine();

    @RecentlyNullable
    public abstract String getShortFormattedAddress();

    @RecentlyNullable
    public abstract List<SubDestination> getSubDestinations();

    @RecentlyNonNull
    public abstract BooleanPlaceAttributeValue getTakeout();

    @RecentlyNullable
    @Deprecated
    public abstract List<Type> getTypes();

    @RecentlyNullable
    public abstract Integer getUserRatingCount();

    @RecentlyNullable
    @Deprecated
    public abstract Integer getUserRatingsTotal();

    @RecentlyNullable
    public abstract Integer getUtcOffsetMinutes();

    @RecentlyNullable
    public abstract LatLngBounds getViewport();

    @RecentlyNullable
    public abstract Uri getWebsiteUri();

    @RecentlyNonNull
    @Deprecated
    public abstract BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

    @RecentlyNullable
    @Deprecated
    public Boolean isOpen() {
        return isOpen(System.currentTimeMillis());
    }

    public abstract zzey zza();

    public enum BooleanPlaceAttributeValue implements Parcelable {
        UNKNOWN,
        TRUE,
        FALSE;


        @RecentlyNonNull
        public static final Parcelable.Creator<BooleanPlaceAttributeValue> CREATOR = new zzet();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    public enum BusinessStatus implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;


        @RecentlyNonNull
        public static final Parcelable.Creator<BusinessStatus> CREATOR = new zzeu();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    public enum Field implements Parcelable {
        ACCESSIBILITY_OPTIONS,
        ADDRESS_COMPONENTS,
        ADR_FORMAT_ADDRESS,
        ALLOWS_DOGS,
        BUSINESS_STATUS,
        CURBSIDE_PICKUP,
        CURRENT_OPENING_HOURS,
        CURRENT_SECONDARY_OPENING_HOURS,
        DELIVERY,
        DINE_IN,
        DISPLAY_NAME,
        EDITORIAL_SUMMARY,
        EV_CHARGE_OPTIONS,
        FORMATTED_ADDRESS,
        FUEL_OPTIONS,
        GOOD_FOR_CHILDREN,
        GOOD_FOR_GROUPS,
        GOOD_FOR_WATCHING_SPORTS,
        GOOGLE_MAPS_URI,
        ICON_BACKGROUND_COLOR,
        ICON_MASK_URL,
        ID,
        INTERNATIONAL_PHONE_NUMBER,
        LIVE_MUSIC,
        LOCATION,
        MENU_FOR_CHILDREN,
        NATIONAL_PHONE_NUMBER,
        OPENING_HOURS,
        OUTDOOR_SEATING,
        PARKING_OPTIONS,
        PAYMENT_OPTIONS,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        PRIMARY_TYPE,
        PRIMARY_TYPE_DISPLAY_NAME,
        PURE_SERVICE_AREA_BUSINESS,
        RATING,
        RESERVABLE,
        RESOURCE_NAME,
        RESTROOM,
        REVIEWS,
        SECONDARY_OPENING_HOURS,
        SERVES_BEER,
        SERVES_BREAKFAST,
        SERVES_BRUNCH,
        SERVES_COCKTAILS,
        SERVES_COFFEE,
        SERVES_DESSERT,
        SERVES_DINNER,
        SERVES_LUNCH,
        SERVES_VEGETARIAN_FOOD,
        SERVES_WINE,
        SHORT_FORMATTED_ADDRESS,
        SUB_DESTINATIONS,
        TAKEOUT,
        TYPES,
        USER_RATING_COUNT,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI,
        ADDRESS,
        ICON_URL,
        LAT_LNG,
        NAME,
        PHONE_NUMBER,
        USER_RATINGS_TOTAL,
        WHEELCHAIR_ACCESSIBLE_ENTRANCE,
        PRICE_RANGE;


        @RecentlyNonNull
        public static final Parcelable.Creator<Field> CREATOR = new zzev();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    @Deprecated
    public enum Type implements Parcelable {
        OTHER,
        ACCOUNTING,
        ADMINISTRATIVE_AREA_LEVEL_1,
        ADMINISTRATIVE_AREA_LEVEL_2,
        ADMINISTRATIVE_AREA_LEVEL_3,
        ADMINISTRATIVE_AREA_LEVEL_4,
        ADMINISTRATIVE_AREA_LEVEL_5,
        AIRPORT,
        AMUSEMENT_PARK,
        AQUARIUM,
        ARCHIPELAGO,
        ART_GALLERY,
        ATM,
        BAKERY,
        BANK,
        BAR,
        BEAUTY_SALON,
        BICYCLE_STORE,
        BOOK_STORE,
        BOWLING_ALLEY,
        BUS_STATION,
        CAFE,
        CAMPGROUND,
        CAR_DEALER,
        CAR_RENTAL,
        CAR_REPAIR,
        CAR_WASH,
        CASINO,
        CEMETERY,
        CHURCH,
        CITY_HALL,
        CLOTHING_STORE,
        COLLOQUIAL_AREA,
        CONTINENT,
        CONVENIENCE_STORE,
        COUNTRY,
        COURTHOUSE,
        DENTIST,
        DEPARTMENT_STORE,
        DOCTOR,
        DRUGSTORE,
        ELECTRICIAN,
        ELECTRONICS_STORE,
        EMBASSY,
        ESTABLISHMENT,
        FINANCE,
        FIRE_STATION,
        FLOOR,
        FLORIST,
        FOOD,
        FUNERAL_HOME,
        FURNITURE_STORE,
        GAS_STATION,
        GENERAL_CONTRACTOR,
        GEOCODE,
        GROCERY_OR_SUPERMARKET,
        GYM,
        HAIR_CARE,
        HARDWARE_STORE,
        HEALTH,
        HINDU_TEMPLE,
        HOME_GOODS_STORE,
        HOSPITAL,
        INSURANCE_AGENCY,
        INTERSECTION,
        JEWELRY_STORE,
        LAUNDRY,
        LAWYER,
        LIBRARY,
        LIGHT_RAIL_STATION,
        LIQUOR_STORE,
        LOCAL_GOVERNMENT_OFFICE,
        LOCALITY,
        LOCKSMITH,
        LODGING,
        MEAL_DELIVERY,
        MEAL_TAKEAWAY,
        MOSQUE,
        MOVIE_RENTAL,
        MOVIE_THEATER,
        MOVING_COMPANY,
        MUSEUM,
        NATURAL_FEATURE,
        NEIGHBORHOOD,
        NIGHT_CLUB,
        PAINTER,
        PARK,
        PARKING,
        PET_STORE,
        PHARMACY,
        PHYSIOTHERAPIST,
        PLACE_OF_WORSHIP,
        PLUMBER,
        PLUS_CODE,
        POINT_OF_INTEREST,
        POLICE,
        POLITICAL,
        POST_BOX,
        POST_OFFICE,
        POSTAL_CODE_PREFIX,
        POSTAL_CODE_SUFFIX,
        POSTAL_CODE,
        POSTAL_TOWN,
        PREMISE,
        PRIMARY_SCHOOL,
        REAL_ESTATE_AGENCY,
        RESTAURANT,
        ROOFING_CONTRACTOR,
        ROOM,
        ROUTE,
        RV_PARK,
        SCHOOL,
        SECONDARY_SCHOOL,
        SHOE_STORE,
        SHOPPING_MALL,
        SPA,
        STADIUM,
        STORAGE,
        STORE,
        STREET_ADDRESS,
        STREET_NUMBER,
        SUBLOCALITY_LEVEL_1,
        SUBLOCALITY_LEVEL_2,
        SUBLOCALITY_LEVEL_3,
        SUBLOCALITY_LEVEL_4,
        SUBLOCALITY_LEVEL_5,
        SUBLOCALITY,
        SUBPREMISE,
        SUBWAY_STATION,
        SUPERMARKET,
        SYNAGOGUE,
        TAXI_STAND,
        TOURIST_ATTRACTION,
        TOWN_SQUARE,
        TRAIN_STATION,
        TRANSIT_STATION,
        TRAVEL_AGENCY,
        UNIVERSITY,
        VETERINARY_CARE,
        ZOO;


        @RecentlyNonNull
        public static final Parcelable.Creator<Type> CREATOR = new zzew();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzaq zzaqVar = new zzaq();
        BooleanPlaceAttributeValue booleanPlaceAttributeValue = BooleanPlaceAttributeValue.UNKNOWN;
        zzaqVar.setCurbsidePickup(booleanPlaceAttributeValue);
        zzaqVar.setDelivery(booleanPlaceAttributeValue);
        zzaqVar.setDineIn(booleanPlaceAttributeValue);
        zzaqVar.setReservable(booleanPlaceAttributeValue);
        zzaqVar.setServesBeer(booleanPlaceAttributeValue);
        zzaqVar.setServesBreakfast(booleanPlaceAttributeValue);
        zzaqVar.setServesBrunch(booleanPlaceAttributeValue);
        zzaqVar.setServesDinner(booleanPlaceAttributeValue);
        zzaqVar.setServesLunch(booleanPlaceAttributeValue);
        zzaqVar.setServesVegetarianFood(booleanPlaceAttributeValue);
        zzaqVar.setServesWine(booleanPlaceAttributeValue);
        zzaqVar.setTakeout(booleanPlaceAttributeValue);
        zzaqVar.setWheelchairAccessibleEntrance(booleanPlaceAttributeValue);
        zzaqVar.setOutdoorSeating(booleanPlaceAttributeValue);
        zzaqVar.setLiveMusic(booleanPlaceAttributeValue);
        zzaqVar.setMenuForChildren(booleanPlaceAttributeValue);
        zzaqVar.setServesCocktails(booleanPlaceAttributeValue);
        zzaqVar.setServesDessert(booleanPlaceAttributeValue);
        zzaqVar.setServesCoffee(booleanPlaceAttributeValue);
        zzaqVar.setGoodForChildren(booleanPlaceAttributeValue);
        zzaqVar.setAllowsDogs(booleanPlaceAttributeValue);
        zzaqVar.setRestroom(booleanPlaceAttributeValue);
        zzaqVar.setGoodForGroups(booleanPlaceAttributeValue);
        zzaqVar.setGoodForWatchingSports(booleanPlaceAttributeValue);
        zzaqVar.setPureServiceAreaBusiness(booleanPlaceAttributeValue);
        return zzaqVar;
    }

    @RecentlyNullable
    @Deprecated
    public Boolean isOpen(long j10) {
        return zzes.zzb(this, j10);
    }
}
