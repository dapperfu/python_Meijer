package com.google.android.libraries.places.internal;

import Ce.M;
import com.google.android.libraries.places.api.model.Place;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zziy {
    private static final M zza = M.a().f(Place.Field.ACCESSIBILITY_OPTIONS, "accessibilityOptions").f(Place.Field.ADDRESS, "formattedAddress").f(Place.Field.ADDRESS_COMPONENTS, "addressComponents").f(Place.Field.ADR_FORMAT_ADDRESS, "adrFormatAddress").f(Place.Field.ALLOWS_DOGS, "allowsDogs").f(Place.Field.BUSINESS_STATUS, "businessStatus").f(Place.Field.CURBSIDE_PICKUP, "curbsidePickup").f(Place.Field.CURRENT_OPENING_HOURS, "currentOpeningHours").f(Place.Field.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours").f(Place.Field.DELIVERY, "delivery").f(Place.Field.DINE_IN, "dineIn").f(Place.Field.DISPLAY_NAME, "displayName").f(Place.Field.EDITORIAL_SUMMARY, "editorialSummary").f(Place.Field.EV_CHARGE_OPTIONS, "evChargeOptions").f(Place.Field.FORMATTED_ADDRESS, "formattedAddress").f(Place.Field.FUEL_OPTIONS, "fuelOptions").f(Place.Field.GOOD_FOR_CHILDREN, "goodForChildren").f(Place.Field.GOOD_FOR_GROUPS, "goodForGroups").f(Place.Field.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports").f(Place.Field.GOOGLE_MAPS_URI, "googleMapsUri").f(Place.Field.ICON_BACKGROUND_COLOR, "iconBackgroundColor").f(Place.Field.ICON_MASK_URL, "iconMaskBaseUri").f(Place.Field.ICON_URL, "iconMaskBaseUri").f(Place.Field.ID, PreferencesHelper.PREF_ID).f(Place.Field.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber").f(Place.Field.LAT_LNG, "location").f(Place.Field.LIVE_MUSIC, "liveMusic").f(Place.Field.LOCATION, "location").f(Place.Field.MENU_FOR_CHILDREN, "menuForChildren").f(Place.Field.NAME, "displayName").f(Place.Field.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber").f(Place.Field.OPENING_HOURS, "regularOpeningHours").f(Place.Field.OUTDOOR_SEATING, "outdoorSeating").f(Place.Field.PARKING_OPTIONS, "parkingOptions").f(Place.Field.PAYMENT_OPTIONS, "paymentOptions").f(Place.Field.PHONE_NUMBER, "internationalPhoneNumber").f(Place.Field.PHOTO_METADATAS, "photos").f(Place.Field.PLUS_CODE, "plusCode").f(Place.Field.PRICE_LEVEL, "priceLevel").f(Place.Field.PRICE_RANGE, "priceRange").f(Place.Field.PRIMARY_TYPE, "primaryType").f(Place.Field.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName").f(Place.Field.PURE_SERVICE_AREA_BUSINESS, "pureServiceAreaBusiness").f(Place.Field.RATING, "rating").f(Place.Field.RESERVABLE, "reservable").f(Place.Field.RESOURCE_NAME, "name").f(Place.Field.RESTROOM, "restroom").f(Place.Field.REVIEWS, "reviews").f(Place.Field.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours").f(Place.Field.SERVES_BEER, "servesBeer").f(Place.Field.SERVES_BREAKFAST, "servesBreakfast").f(Place.Field.SERVES_BRUNCH, "servesBrunch").f(Place.Field.SERVES_COCKTAILS, "servesCocktails").f(Place.Field.SERVES_COFFEE, "servesCoffee").f(Place.Field.SERVES_DESSERT, "servesDessert").f(Place.Field.SERVES_DINNER, "servesDinner").f(Place.Field.SERVES_LUNCH, "servesLunch").f(Place.Field.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood").f(Place.Field.SERVES_WINE, "servesWine").f(Place.Field.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress").f(Place.Field.SUB_DESTINATIONS, "subDestinations").f(Place.Field.TAKEOUT, "takeout").f(Place.Field.TYPES, "types").f(Place.Field.USER_RATINGS_TOTAL, "userRatingCount").f(Place.Field.USER_RATING_COUNT, "userRatingCount").f(Place.Field.UTC_OFFSET, "utcOffsetMinutes").f(Place.Field.VIEWPORT, "viewport").f(Place.Field.WEBSITE_URI, "websiteUri").f(Place.Field.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "accessibilityOptions").c();

    public static List zza(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
