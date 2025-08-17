package com.google.android.libraries.places.internal;

import Ce.M;
import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzll {
    private static final M zza = M.a().f(Place.Field.ADDRESS, "formatted_address").f(Place.Field.ADDRESS_COMPONENTS, "address_components").f(Place.Field.BUSINESS_STATUS, "business_status").f(Place.Field.CURBSIDE_PICKUP, "curbside_pickup").f(Place.Field.CURRENT_OPENING_HOURS, "current_opening_hours").f(Place.Field.DELIVERY, "delivery").f(Place.Field.DINE_IN, "dine_in").f(Place.Field.DISPLAY_NAME, "name").f(Place.Field.EDITORIAL_SUMMARY, "editorial_summary").f(Place.Field.FORMATTED_ADDRESS, "formatted_address").f(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color").f(Place.Field.ICON_MASK_URL, "icon_mask_base_uri").f(Place.Field.ICON_URL, "icon_mask_base_uri").f(Place.Field.ID, "place_id").f(Place.Field.INTERNATIONAL_PHONE_NUMBER, "international_phone_number").f(Place.Field.LAT_LNG, "geometry/location").f(Place.Field.LOCATION, "geometry/location").f(Place.Field.NAME, "name").f(Place.Field.OPENING_HOURS, "opening_hours").f(Place.Field.PHONE_NUMBER, "international_phone_number").f(Place.Field.PHOTO_METADATAS, "photos").f(Place.Field.PLUS_CODE, PlaceTypes.PLUS_CODE).f(Place.Field.PRICE_LEVEL, "price_level").f(Place.Field.RATING, "rating").f(Place.Field.RESERVABLE, "reservable").f(Place.Field.SECONDARY_OPENING_HOURS, "secondary_opening_hours").f(Place.Field.SERVES_BEER, "serves_beer").f(Place.Field.SERVES_BREAKFAST, "serves_breakfast").f(Place.Field.SERVES_BRUNCH, "serves_brunch").f(Place.Field.SERVES_DINNER, "serves_dinner").f(Place.Field.SERVES_LUNCH, "serves_lunch").f(Place.Field.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food").f(Place.Field.SERVES_WINE, "serves_wine").f(Place.Field.TAKEOUT, "takeout").f(Place.Field.TYPES, "types").f(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total").f(Place.Field.USER_RATING_COUNT, "user_ratings_total").f(Place.Field.UTC_OFFSET, "utc_offset").f(Place.Field.VIEWPORT, "geometry/viewport").f(Place.Field.WEBSITE_URI, "website").f(Place.Field.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance").c();

    public static List zza(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String zzb(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
