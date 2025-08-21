package com.google.android.libraries.places.internal;

import De.p;
import Ee.M;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class zziz {
    private final M zza = M.a().f(PlaceTypes.ACCOUNTING, Place.Type.ACCOUNTING).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4, Place.Type.ADMINISTRATIVE_AREA_LEVEL_4).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5, Place.Type.ADMINISTRATIVE_AREA_LEVEL_5).f(PlaceTypes.AIRPORT, Place.Type.AIRPORT).f(PlaceTypes.AMUSEMENT_PARK, Place.Type.AMUSEMENT_PARK).f(PlaceTypes.AQUARIUM, Place.Type.AQUARIUM).f(PlaceTypes.ARCHIPELAGO, Place.Type.ARCHIPELAGO).f(PlaceTypes.ART_GALLERY, Place.Type.ART_GALLERY).f(PlaceTypes.ATM, Place.Type.ATM).f(PlaceTypes.BAKERY, Place.Type.BAKERY).f(PlaceTypes.BANK, Place.Type.BANK).f(PlaceTypes.BAR, Place.Type.BAR).f(PlaceTypes.BEAUTY_SALON, Place.Type.BEAUTY_SALON).f(PlaceTypes.BICYCLE_STORE, Place.Type.BICYCLE_STORE).f(PlaceTypes.BOOK_STORE, Place.Type.BOOK_STORE).f(PlaceTypes.BOWLING_ALLEY, Place.Type.BOWLING_ALLEY).f(PlaceTypes.BUS_STATION, Place.Type.BUS_STATION).f(PlaceTypes.CAFE, Place.Type.CAFE).f(PlaceTypes.CAMPGROUND, Place.Type.CAMPGROUND).f(PlaceTypes.CAR_DEALER, Place.Type.CAR_DEALER).f(PlaceTypes.CAR_RENTAL, Place.Type.CAR_RENTAL).f(PlaceTypes.CAR_REPAIR, Place.Type.CAR_REPAIR).f(PlaceTypes.CAR_WASH, Place.Type.CAR_WASH).f(PlaceTypes.CASINO, Place.Type.CASINO).f(PlaceTypes.CEMETERY, Place.Type.CEMETERY).f(PlaceTypes.CHURCH, Place.Type.CHURCH).f(PlaceTypes.CITY_HALL, Place.Type.CITY_HALL).f(PlaceTypes.CLOTHING_STORE, Place.Type.CLOTHING_STORE).f(PlaceTypes.COLLOQUIAL_AREA, Place.Type.COLLOQUIAL_AREA).f(PlaceTypes.CONTINENT, Place.Type.CONTINENT).f(PlaceTypes.CONVENIENCE_STORE, Place.Type.CONVENIENCE_STORE).f(PlaceTypes.COUNTRY, Place.Type.COUNTRY).f(PlaceTypes.COURTHOUSE, Place.Type.COURTHOUSE).f(PlaceTypes.DENTIST, Place.Type.DENTIST).f(PlaceTypes.DEPARTMENT_STORE, Place.Type.DEPARTMENT_STORE).f(PlaceTypes.DOCTOR, Place.Type.DOCTOR).f(PlaceTypes.DRUGSTORE, Place.Type.DRUGSTORE).f(PlaceTypes.ELECTRICIAN, Place.Type.ELECTRICIAN).f(PlaceTypes.ELECTRONICS_STORE, Place.Type.ELECTRONICS_STORE).f(PlaceTypes.EMBASSY, Place.Type.EMBASSY).f(PlaceTypes.ESTABLISHMENT, Place.Type.ESTABLISHMENT).f(PlaceTypes.FINANCE, Place.Type.FINANCE).f(PlaceTypes.FIRE_STATION, Place.Type.FIRE_STATION).f(PlaceTypes.FLOOR, Place.Type.FLOOR).f(PlaceTypes.FLORIST, Place.Type.FLORIST).f(PlaceTypes.FOOD, Place.Type.FOOD).f(PlaceTypes.FUNERAL_HOME, Place.Type.FUNERAL_HOME).f(PlaceTypes.FURNITURE_STORE, Place.Type.FURNITURE_STORE).f(PlaceTypes.GAS_STATION, Place.Type.GAS_STATION).f(PlaceTypes.GENERAL_CONTRACTOR, Place.Type.GENERAL_CONTRACTOR).f(PlaceTypes.GEOCODE, Place.Type.GEOCODE).f("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET).f(PlaceTypes.GYM, Place.Type.GYM).f(PlaceTypes.HAIR_CARE, Place.Type.HAIR_CARE).f(PlaceTypes.HARDWARE_STORE, Place.Type.HARDWARE_STORE).f(PlaceTypes.HEALTH, Place.Type.HEALTH).f(PlaceTypes.HINDU_TEMPLE, Place.Type.HINDU_TEMPLE).f(PlaceTypes.HOME_GOODS_STORE, Place.Type.HOME_GOODS_STORE).f(PlaceTypes.HOSPITAL, Place.Type.HOSPITAL).f(PlaceTypes.INSURANCE_AGENCY, Place.Type.INSURANCE_AGENCY).f(PlaceTypes.INTERSECTION, Place.Type.INTERSECTION).f(PlaceTypes.JEWELRY_STORE, Place.Type.JEWELRY_STORE).f(PlaceTypes.LAUNDRY, Place.Type.LAUNDRY).f(PlaceTypes.LAWYER, Place.Type.LAWYER).f(PlaceTypes.LIBRARY, Place.Type.LIBRARY).f(PlaceTypes.LIGHT_RAIL_STATION, Place.Type.LIGHT_RAIL_STATION).f(PlaceTypes.LIQUOR_STORE, Place.Type.LIQUOR_STORE).f(PlaceTypes.LOCAL_GOVERNMENT_OFFICE, Place.Type.LOCAL_GOVERNMENT_OFFICE).f(PlaceTypes.LOCALITY, Place.Type.LOCALITY).f(PlaceTypes.LOCKSMITH, Place.Type.LOCKSMITH).f(PlaceTypes.LODGING, Place.Type.LODGING).f(PlaceTypes.MEAL_DELIVERY, Place.Type.MEAL_DELIVERY).f(PlaceTypes.MEAL_TAKEAWAY, Place.Type.MEAL_TAKEAWAY).f(PlaceTypes.MOSQUE, Place.Type.MOSQUE).f(PlaceTypes.MOVIE_RENTAL, Place.Type.MOVIE_RENTAL).f(PlaceTypes.MOVIE_THEATER, Place.Type.MOVIE_THEATER).f(PlaceTypes.MOVING_COMPANY, Place.Type.MOVING_COMPANY).f(PlaceTypes.MUSEUM, Place.Type.MUSEUM).f(PlaceTypes.NATURAL_FEATURE, Place.Type.NATURAL_FEATURE).f(PlaceTypes.NEIGHBORHOOD, Place.Type.NEIGHBORHOOD).f(PlaceTypes.NIGHT_CLUB, Place.Type.NIGHT_CLUB).f(PlaceTypes.PAINTER, Place.Type.PAINTER).f(PlaceTypes.PARK, Place.Type.PARK).f(PlaceTypes.PARKING, Place.Type.PARKING).f(PlaceTypes.PET_STORE, Place.Type.PET_STORE).f(PlaceTypes.PHARMACY, Place.Type.PHARMACY).f(PlaceTypes.PHYSIOTHERAPIST, Place.Type.PHYSIOTHERAPIST).f(PlaceTypes.PLACE_OF_WORSHIP, Place.Type.PLACE_OF_WORSHIP).f(PlaceTypes.PLUMBER, Place.Type.PLUMBER).f(PlaceTypes.PLUS_CODE, Place.Type.PLUS_CODE).f(PlaceTypes.POINT_OF_INTEREST, Place.Type.POINT_OF_INTEREST).f(PlaceTypes.POLICE, Place.Type.POLICE).f(PlaceTypes.POLITICAL, Place.Type.POLITICAL).f(PlaceTypes.POST_BOX, Place.Type.POST_BOX).f(PlaceTypes.POST_OFFICE, Place.Type.POST_OFFICE).f(PlaceTypes.POSTAL_CODE_PREFIX, Place.Type.POSTAL_CODE_PREFIX).f(PlaceTypes.POSTAL_CODE_SUFFIX, Place.Type.POSTAL_CODE_SUFFIX).f(PlaceTypes.POSTAL_CODE, Place.Type.POSTAL_CODE).f(PlaceTypes.POSTAL_TOWN, Place.Type.POSTAL_TOWN).f(PlaceTypes.PREMISE, Place.Type.PREMISE).f(PlaceTypes.PRIMARY_SCHOOL, Place.Type.PRIMARY_SCHOOL).f(PlaceTypes.REAL_ESTATE_AGENCY, Place.Type.REAL_ESTATE_AGENCY).f(PlaceTypes.RESTAURANT, Place.Type.RESTAURANT).f(PlaceTypes.ROOFING_CONTRACTOR, Place.Type.ROOFING_CONTRACTOR).f(PlaceTypes.ROOM, Place.Type.ROOM).f(PlaceTypes.ROUTE, Place.Type.ROUTE).f(PlaceTypes.RV_PARK, Place.Type.RV_PARK).f(PlaceTypes.SCHOOL, Place.Type.SCHOOL).f(PlaceTypes.SECONDARY_SCHOOL, Place.Type.SECONDARY_SCHOOL).f(PlaceTypes.SHOE_STORE, Place.Type.SHOE_STORE).f(PlaceTypes.SHOPPING_MALL, Place.Type.SHOPPING_MALL).f(PlaceTypes.SPA, Place.Type.SPA).f(PlaceTypes.STADIUM, Place.Type.STADIUM).f(PlaceTypes.STORAGE, Place.Type.STORAGE).f(PlaceTypes.STORE, Place.Type.STORE).f(PlaceTypes.STREET_ADDRESS, Place.Type.STREET_ADDRESS).f(PlaceTypes.STREET_NUMBER, Place.Type.STREET_NUMBER).f(PlaceTypes.SUBLOCALITY_LEVEL_1, Place.Type.SUBLOCALITY_LEVEL_1).f(PlaceTypes.SUBLOCALITY_LEVEL_2, Place.Type.SUBLOCALITY_LEVEL_2).f(PlaceTypes.SUBLOCALITY_LEVEL_3, Place.Type.SUBLOCALITY_LEVEL_3).f(PlaceTypes.SUBLOCALITY_LEVEL_4, Place.Type.SUBLOCALITY_LEVEL_4).f(PlaceTypes.SUBLOCALITY_LEVEL_5, Place.Type.SUBLOCALITY_LEVEL_5).f(PlaceTypes.SUBLOCALITY, Place.Type.SUBLOCALITY).f(PlaceTypes.SUBPREMISE, Place.Type.SUBPREMISE).f(PlaceTypes.SUBWAY_STATION, Place.Type.SUBWAY_STATION).f(PlaceTypes.SUPERMARKET, Place.Type.SUPERMARKET).f(PlaceTypes.SYNAGOGUE, Place.Type.SYNAGOGUE).f(PlaceTypes.TAXI_STAND, Place.Type.TAXI_STAND).f(PlaceTypes.TOURIST_ATTRACTION, Place.Type.TOURIST_ATTRACTION).f(PlaceTypes.TOWN_SQUARE, Place.Type.TOWN_SQUARE).f(PlaceTypes.TRAIN_STATION, Place.Type.TRAIN_STATION).f(PlaceTypes.TRANSIT_STATION, Place.Type.TRANSIT_STATION).f(PlaceTypes.TRAVEL_AGENCY, Place.Type.TRAVEL_AGENCY).f(PlaceTypes.UNIVERSITY, Place.Type.UNIVERSITY).f(PlaceTypes.VETERINARY_CARE, Place.Type.VETERINARY_CARE).f(PlaceTypes.ZOO, Place.Type.ZOO).c();

    zziz() {
    }

    @Deprecated
    public final List zza(List list) {
        p.q(list);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            M m10 = this.zza;
            if (m10.containsKey(str)) {
                arrayList.add((Place.Type) m10.get(str));
            } else {
                z10 = true;
            }
        }
        if (z10) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }
}
