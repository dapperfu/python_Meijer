package com.google.maps.model;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.internal.StringJoin;

/* loaded from: classes7.dex */
public enum PlaceType implements StringJoin.UrlValue {
    ACCOUNTING(PlaceTypes.ACCOUNTING),
    AIRPORT(PlaceTypes.AIRPORT),
    AMUSEMENT_PARK(PlaceTypes.AMUSEMENT_PARK),
    AQUARIUM(PlaceTypes.AQUARIUM),
    ART_GALLERY(PlaceTypes.ART_GALLERY),
    ATM(PlaceTypes.ATM),
    BAKERY(PlaceTypes.BAKERY),
    BANK(PlaceTypes.BANK),
    BAR(PlaceTypes.BAR),
    BEAUTY_SALON(PlaceTypes.BEAUTY_SALON),
    BICYCLE_STORE(PlaceTypes.BICYCLE_STORE),
    BOOK_STORE(PlaceTypes.BOOK_STORE),
    BOWLING_ALLEY(PlaceTypes.BOWLING_ALLEY),
    BUS_STATION(PlaceTypes.BUS_STATION),
    CAFE(PlaceTypes.CAFE),
    CAMPGROUND(PlaceTypes.CAMPGROUND),
    CAR_DEALER(PlaceTypes.CAR_DEALER),
    CAR_RENTAL(PlaceTypes.CAR_RENTAL),
    CAR_REPAIR(PlaceTypes.CAR_REPAIR),
    CAR_WASH(PlaceTypes.CAR_WASH),
    CASINO(PlaceTypes.CASINO),
    CEMETERY(PlaceTypes.CEMETERY),
    CHURCH(PlaceTypes.CHURCH),
    CITY_HALL(PlaceTypes.CITY_HALL),
    CLOTHING_STORE(PlaceTypes.CLOTHING_STORE),
    CONVENIENCE_STORE(PlaceTypes.CONVENIENCE_STORE),
    COURTHOUSE(PlaceTypes.COURTHOUSE),
    DENTIST(PlaceTypes.DENTIST),
    DEPARTMENT_STORE(PlaceTypes.DEPARTMENT_STORE),
    DOCTOR(PlaceTypes.DOCTOR),
    DRUGSTORE(PlaceTypes.DRUGSTORE),
    ELECTRICIAN(PlaceTypes.ELECTRICIAN),
    ELECTRONICS_STORE(PlaceTypes.ELECTRONICS_STORE),
    EMBASSY(PlaceTypes.EMBASSY),
    ESTABLISHMENT(PlaceTypes.ESTABLISHMENT),
    FINANCE(PlaceTypes.FINANCE),
    FIRE_STATION(PlaceTypes.FIRE_STATION),
    FLORIST(PlaceTypes.FLORIST),
    FOOD(PlaceTypes.FOOD),
    FUNERAL_HOME(PlaceTypes.FUNERAL_HOME),
    FURNITURE_STORE(PlaceTypes.FURNITURE_STORE),
    GAS_STATION(PlaceTypes.GAS_STATION),
    GENERAL_CONTRACTOR(PlaceTypes.GENERAL_CONTRACTOR),
    GROCERY_OR_SUPERMARKET("grocery_or_supermarket"),
    GYM(PlaceTypes.GYM),
    HAIR_CARE(PlaceTypes.HAIR_CARE),
    HARDWARE_STORE(PlaceTypes.HARDWARE_STORE),
    HEALTH(PlaceTypes.HEALTH),
    HINDU_TEMPLE(PlaceTypes.HINDU_TEMPLE),
    HOME_GOODS_STORE(PlaceTypes.HOME_GOODS_STORE),
    HOSPITAL(PlaceTypes.HOSPITAL),
    INSURANCE_AGENCY(PlaceTypes.INSURANCE_AGENCY),
    JEWELRY_STORE(PlaceTypes.JEWELRY_STORE),
    LAUNDRY(PlaceTypes.LAUNDRY),
    LAWYER(PlaceTypes.LAWYER),
    LIBRARY(PlaceTypes.LIBRARY),
    LIGHT_RAIL_STATION(PlaceTypes.LIGHT_RAIL_STATION),
    LIQUOR_STORE(PlaceTypes.LIQUOR_STORE),
    LOCAL_GOVERNMENT_OFFICE(PlaceTypes.LOCAL_GOVERNMENT_OFFICE),
    LOCKSMITH(PlaceTypes.LOCKSMITH),
    LODGING(PlaceTypes.LODGING),
    MEAL_DELIVERY(PlaceTypes.MEAL_DELIVERY),
    MEAL_TAKEAWAY(PlaceTypes.MEAL_TAKEAWAY),
    MOSQUE(PlaceTypes.MOSQUE),
    MOVIE_RENTAL(PlaceTypes.MOVIE_RENTAL),
    MOVIE_THEATER(PlaceTypes.MOVIE_THEATER),
    MOVING_COMPANY(PlaceTypes.MOVING_COMPANY),
    MUSEUM(PlaceTypes.MUSEUM),
    NIGHT_CLUB(PlaceTypes.NIGHT_CLUB),
    PAINTER(PlaceTypes.PAINTER),
    PARK(PlaceTypes.PARK),
    PARKING(PlaceTypes.PARKING),
    PET_STORE(PlaceTypes.PET_STORE),
    PHARMACY(PlaceTypes.PHARMACY),
    PHYSIOTHERAPIST(PlaceTypes.PHYSIOTHERAPIST),
    PLACE_OF_WORSHIP(PlaceTypes.PLACE_OF_WORSHIP),
    PLUMBER(PlaceTypes.PLUMBER),
    POLICE(PlaceTypes.POLICE),
    POST_OFFICE(PlaceTypes.POST_OFFICE),
    PRIMARY_SCHOOL(PlaceTypes.PRIMARY_SCHOOL),
    REAL_ESTATE_AGENCY(PlaceTypes.REAL_ESTATE_AGENCY),
    RESTAURANT(PlaceTypes.RESTAURANT),
    ROOFING_CONTRACTOR(PlaceTypes.ROOFING_CONTRACTOR),
    RV_PARK(PlaceTypes.RV_PARK),
    SCHOOL(PlaceTypes.SCHOOL),
    SECONDARY_SCHOOL(PlaceTypes.SECONDARY_SCHOOL),
    SHOE_STORE(PlaceTypes.SHOE_STORE),
    SHOPPING_MALL(PlaceTypes.SHOPPING_MALL),
    SPA(PlaceTypes.SPA),
    STADIUM(PlaceTypes.STADIUM),
    STORAGE(PlaceTypes.STORAGE),
    STORE(PlaceTypes.STORE),
    SUBWAY_STATION(PlaceTypes.SUBWAY_STATION),
    SUPERMARKET(PlaceTypes.SUPERMARKET),
    SYNAGOGUE(PlaceTypes.SYNAGOGUE),
    TAXI_STAND(PlaceTypes.TAXI_STAND),
    TOURIST_ATTRACTION(PlaceTypes.TOURIST_ATTRACTION),
    TRAIN_STATION(PlaceTypes.TRAIN_STATION),
    TRANSIT_STATION(PlaceTypes.TRANSIT_STATION),
    TRAVEL_AGENCY(PlaceTypes.TRAVEL_AGENCY),
    UNIVERSITY(PlaceTypes.UNIVERSITY),
    VETERINARY_CARE(PlaceTypes.VETERINARY_CARE),
    ZOO(PlaceTypes.ZOO);

    private final String placeType;

    @Override // java.lang.Enum
    public String toString() {
        return this.placeType;
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return this.placeType;
    }

    PlaceType(String str) {
        this.placeType = str;
    }
}
