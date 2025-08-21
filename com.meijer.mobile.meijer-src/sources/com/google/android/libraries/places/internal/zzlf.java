package com.google.android.libraries.places.internal;

import De.p;
import Ee.L;
import Ee.M;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.SpecialDay;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.internal.zzli;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzlf {
    private static final M zza = M.a().f("OPERATIONAL", Place.BusinessStatus.OPERATIONAL).f("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY).f("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY).c();
    private static final M zzb = M.a().f(PlaceTypes.ACCOUNTING, Place.Type.ACCOUNTING).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4, Place.Type.ADMINISTRATIVE_AREA_LEVEL_4).f(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5, Place.Type.ADMINISTRATIVE_AREA_LEVEL_5).f(PlaceTypes.AIRPORT, Place.Type.AIRPORT).f(PlaceTypes.AMUSEMENT_PARK, Place.Type.AMUSEMENT_PARK).f(PlaceTypes.AQUARIUM, Place.Type.AQUARIUM).f(PlaceTypes.ARCHIPELAGO, Place.Type.ARCHIPELAGO).f(PlaceTypes.ART_GALLERY, Place.Type.ART_GALLERY).f(PlaceTypes.ATM, Place.Type.ATM).f(PlaceTypes.BAKERY, Place.Type.BAKERY).f(PlaceTypes.BANK, Place.Type.BANK).f(PlaceTypes.BAR, Place.Type.BAR).f(PlaceTypes.BEAUTY_SALON, Place.Type.BEAUTY_SALON).f(PlaceTypes.BICYCLE_STORE, Place.Type.BICYCLE_STORE).f(PlaceTypes.BOOK_STORE, Place.Type.BOOK_STORE).f(PlaceTypes.BOWLING_ALLEY, Place.Type.BOWLING_ALLEY).f(PlaceTypes.BUS_STATION, Place.Type.BUS_STATION).f(PlaceTypes.CAFE, Place.Type.CAFE).f(PlaceTypes.CAMPGROUND, Place.Type.CAMPGROUND).f(PlaceTypes.CAR_DEALER, Place.Type.CAR_DEALER).f(PlaceTypes.CAR_RENTAL, Place.Type.CAR_RENTAL).f(PlaceTypes.CAR_REPAIR, Place.Type.CAR_REPAIR).f(PlaceTypes.CAR_WASH, Place.Type.CAR_WASH).f(PlaceTypes.CASINO, Place.Type.CASINO).f(PlaceTypes.CEMETERY, Place.Type.CEMETERY).f(PlaceTypes.CHURCH, Place.Type.CHURCH).f(PlaceTypes.CITY_HALL, Place.Type.CITY_HALL).f(PlaceTypes.CLOTHING_STORE, Place.Type.CLOTHING_STORE).f(PlaceTypes.COLLOQUIAL_AREA, Place.Type.COLLOQUIAL_AREA).f(PlaceTypes.CONTINENT, Place.Type.CONTINENT).f(PlaceTypes.CONVENIENCE_STORE, Place.Type.CONVENIENCE_STORE).f(PlaceTypes.COUNTRY, Place.Type.COUNTRY).f(PlaceTypes.COURTHOUSE, Place.Type.COURTHOUSE).f(PlaceTypes.DENTIST, Place.Type.DENTIST).f(PlaceTypes.DEPARTMENT_STORE, Place.Type.DEPARTMENT_STORE).f(PlaceTypes.DOCTOR, Place.Type.DOCTOR).f(PlaceTypes.DRUGSTORE, Place.Type.DRUGSTORE).f(PlaceTypes.ELECTRICIAN, Place.Type.ELECTRICIAN).f(PlaceTypes.ELECTRONICS_STORE, Place.Type.ELECTRONICS_STORE).f(PlaceTypes.EMBASSY, Place.Type.EMBASSY).f(PlaceTypes.ESTABLISHMENT, Place.Type.ESTABLISHMENT).f(PlaceTypes.FINANCE, Place.Type.FINANCE).f(PlaceTypes.FIRE_STATION, Place.Type.FIRE_STATION).f(PlaceTypes.FLOOR, Place.Type.FLOOR).f(PlaceTypes.FLORIST, Place.Type.FLORIST).f(PlaceTypes.FOOD, Place.Type.FOOD).f(PlaceTypes.FUNERAL_HOME, Place.Type.FUNERAL_HOME).f(PlaceTypes.FURNITURE_STORE, Place.Type.FURNITURE_STORE).f(PlaceTypes.GAS_STATION, Place.Type.GAS_STATION).f(PlaceTypes.GENERAL_CONTRACTOR, Place.Type.GENERAL_CONTRACTOR).f(PlaceTypes.GEOCODE, Place.Type.GEOCODE).f("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET).f(PlaceTypes.GYM, Place.Type.GYM).f(PlaceTypes.HAIR_CARE, Place.Type.HAIR_CARE).f(PlaceTypes.HARDWARE_STORE, Place.Type.HARDWARE_STORE).f(PlaceTypes.HEALTH, Place.Type.HEALTH).f(PlaceTypes.HINDU_TEMPLE, Place.Type.HINDU_TEMPLE).f(PlaceTypes.HOME_GOODS_STORE, Place.Type.HOME_GOODS_STORE).f(PlaceTypes.HOSPITAL, Place.Type.HOSPITAL).f(PlaceTypes.INSURANCE_AGENCY, Place.Type.INSURANCE_AGENCY).f(PlaceTypes.INTERSECTION, Place.Type.INTERSECTION).f(PlaceTypes.JEWELRY_STORE, Place.Type.JEWELRY_STORE).f(PlaceTypes.LAUNDRY, Place.Type.LAUNDRY).f(PlaceTypes.LAWYER, Place.Type.LAWYER).f(PlaceTypes.LIBRARY, Place.Type.LIBRARY).f(PlaceTypes.LIGHT_RAIL_STATION, Place.Type.LIGHT_RAIL_STATION).f(PlaceTypes.LIQUOR_STORE, Place.Type.LIQUOR_STORE).f(PlaceTypes.LOCAL_GOVERNMENT_OFFICE, Place.Type.LOCAL_GOVERNMENT_OFFICE).f(PlaceTypes.LOCALITY, Place.Type.LOCALITY).f(PlaceTypes.LOCKSMITH, Place.Type.LOCKSMITH).f(PlaceTypes.LODGING, Place.Type.LODGING).f(PlaceTypes.MEAL_DELIVERY, Place.Type.MEAL_DELIVERY).f(PlaceTypes.MEAL_TAKEAWAY, Place.Type.MEAL_TAKEAWAY).f(PlaceTypes.MOSQUE, Place.Type.MOSQUE).f(PlaceTypes.MOVIE_RENTAL, Place.Type.MOVIE_RENTAL).f(PlaceTypes.MOVIE_THEATER, Place.Type.MOVIE_THEATER).f(PlaceTypes.MOVING_COMPANY, Place.Type.MOVING_COMPANY).f(PlaceTypes.MUSEUM, Place.Type.MUSEUM).f(PlaceTypes.NATURAL_FEATURE, Place.Type.NATURAL_FEATURE).f(PlaceTypes.NEIGHBORHOOD, Place.Type.NEIGHBORHOOD).f(PlaceTypes.NIGHT_CLUB, Place.Type.NIGHT_CLUB).f(PlaceTypes.PAINTER, Place.Type.PAINTER).f(PlaceTypes.PARK, Place.Type.PARK).f(PlaceTypes.PARKING, Place.Type.PARKING).f(PlaceTypes.PET_STORE, Place.Type.PET_STORE).f(PlaceTypes.PHARMACY, Place.Type.PHARMACY).f(PlaceTypes.PHYSIOTHERAPIST, Place.Type.PHYSIOTHERAPIST).f(PlaceTypes.PLACE_OF_WORSHIP, Place.Type.PLACE_OF_WORSHIP).f(PlaceTypes.PLUMBER, Place.Type.PLUMBER).f(PlaceTypes.PLUS_CODE, Place.Type.PLUS_CODE).f(PlaceTypes.POINT_OF_INTEREST, Place.Type.POINT_OF_INTEREST).f(PlaceTypes.POLICE, Place.Type.POLICE).f(PlaceTypes.POLITICAL, Place.Type.POLITICAL).f(PlaceTypes.POST_BOX, Place.Type.POST_BOX).f(PlaceTypes.POST_OFFICE, Place.Type.POST_OFFICE).f(PlaceTypes.POSTAL_CODE_PREFIX, Place.Type.POSTAL_CODE_PREFIX).f(PlaceTypes.POSTAL_CODE_SUFFIX, Place.Type.POSTAL_CODE_SUFFIX).f(PlaceTypes.POSTAL_CODE, Place.Type.POSTAL_CODE).f(PlaceTypes.POSTAL_TOWN, Place.Type.POSTAL_TOWN).f(PlaceTypes.PREMISE, Place.Type.PREMISE).f(PlaceTypes.PRIMARY_SCHOOL, Place.Type.PRIMARY_SCHOOL).f(PlaceTypes.REAL_ESTATE_AGENCY, Place.Type.REAL_ESTATE_AGENCY).f(PlaceTypes.RESTAURANT, Place.Type.RESTAURANT).f(PlaceTypes.ROOFING_CONTRACTOR, Place.Type.ROOFING_CONTRACTOR).f(PlaceTypes.ROOM, Place.Type.ROOM).f(PlaceTypes.ROUTE, Place.Type.ROUTE).f(PlaceTypes.RV_PARK, Place.Type.RV_PARK).f(PlaceTypes.SCHOOL, Place.Type.SCHOOL).f(PlaceTypes.SECONDARY_SCHOOL, Place.Type.SECONDARY_SCHOOL).f(PlaceTypes.SHOE_STORE, Place.Type.SHOE_STORE).f(PlaceTypes.SHOPPING_MALL, Place.Type.SHOPPING_MALL).f(PlaceTypes.SPA, Place.Type.SPA).f(PlaceTypes.STADIUM, Place.Type.STADIUM).f(PlaceTypes.STORAGE, Place.Type.STORAGE).f(PlaceTypes.STORE, Place.Type.STORE).f(PlaceTypes.STREET_ADDRESS, Place.Type.STREET_ADDRESS).f(PlaceTypes.STREET_NUMBER, Place.Type.STREET_NUMBER).f(PlaceTypes.SUBLOCALITY_LEVEL_1, Place.Type.SUBLOCALITY_LEVEL_1).f(PlaceTypes.SUBLOCALITY_LEVEL_2, Place.Type.SUBLOCALITY_LEVEL_2).f(PlaceTypes.SUBLOCALITY_LEVEL_3, Place.Type.SUBLOCALITY_LEVEL_3).f(PlaceTypes.SUBLOCALITY_LEVEL_4, Place.Type.SUBLOCALITY_LEVEL_4).f(PlaceTypes.SUBLOCALITY_LEVEL_5, Place.Type.SUBLOCALITY_LEVEL_5).f(PlaceTypes.SUBLOCALITY, Place.Type.SUBLOCALITY).f(PlaceTypes.SUBPREMISE, Place.Type.SUBPREMISE).f(PlaceTypes.SUBWAY_STATION, Place.Type.SUBWAY_STATION).f(PlaceTypes.SUPERMARKET, Place.Type.SUPERMARKET).f(PlaceTypes.SYNAGOGUE, Place.Type.SYNAGOGUE).f(PlaceTypes.TAXI_STAND, Place.Type.TAXI_STAND).f(PlaceTypes.TOURIST_ATTRACTION, Place.Type.TOURIST_ATTRACTION).f(PlaceTypes.TOWN_SQUARE, Place.Type.TOWN_SQUARE).f(PlaceTypes.TRAIN_STATION, Place.Type.TRAIN_STATION).f(PlaceTypes.TRANSIT_STATION, Place.Type.TRANSIT_STATION).f(PlaceTypes.TRAVEL_AGENCY, Place.Type.TRAVEL_AGENCY).f(PlaceTypes.UNIVERSITY, Place.Type.UNIVERSITY).f(PlaceTypes.VETERINARY_CARE, Place.Type.VETERINARY_CARE).f(PlaceTypes.ZOO, Place.Type.ZOO).c();
    private static final M zzc = M.a().f("ACCESS", OpeningHours.HoursType.ACCESS).f("BREAKFAST", OpeningHours.HoursType.BREAKFAST).f("BRUNCH", OpeningHours.HoursType.BRUNCH).f("DELIVERY", OpeningHours.HoursType.DELIVERY).f("DINNER", OpeningHours.HoursType.DINNER).f("DRIVE_THROUGH", OpeningHours.HoursType.DRIVE_THROUGH).f("HAPPY_HOUR", OpeningHours.HoursType.HAPPY_HOUR).f("KITCHEN", OpeningHours.HoursType.KITCHEN).f("LUNCH", OpeningHours.HoursType.LUNCH).f("ONLINE_SERVICE_HOURS", OpeningHours.HoursType.ONLINE_SERVICE_HOURS).f("PICKUP", OpeningHours.HoursType.PICKUP).f("SENIOR_HOURS", OpeningHours.HoursType.SENIOR_HOURS).f("TAKEOUT", OpeningHours.HoursType.TAKEOUT).c();

    zzlf() {
    }

    static TimeOfWeek zza(zzli.zzd.zzc zzcVar) {
        LocalTime localTimeNewInstance;
        DayOfWeek dayOfWeek;
        LocalDate localDateZzb = null;
        if (zzcVar == null) {
            return null;
        }
        try {
            Integer num = (Integer) p.r(zzcVar.zza(), "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            String str = (String) p.r(zzcVar.zzb(), "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            if (str != null) {
                String str2 = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
                p.e(str.length() == 4, str2);
                try {
                    localTimeNewInstance = LocalTime.newInstance(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(str2, e10);
                }
            } else {
                localTimeNewInstance = null;
            }
            LocalTime localTime = (LocalTime) p.q(localTimeNewInstance);
            try {
                localDateZzb = zzb(zzcVar.zzc());
            } catch (IllegalArgumentException unused) {
            }
            switch (num.intValue()) {
                case 0:
                    dayOfWeek = DayOfWeek.SUNDAY;
                    break;
                case 1:
                    dayOfWeek = DayOfWeek.MONDAY;
                    break;
                case 2:
                    dayOfWeek = DayOfWeek.TUESDAY;
                    break;
                case 3:
                    dayOfWeek = DayOfWeek.WEDNESDAY;
                    break;
                case 4:
                    dayOfWeek = DayOfWeek.THURSDAY;
                    break;
                case 5:
                    dayOfWeek = DayOfWeek.FRIDAY;
                    break;
                case 6:
                    dayOfWeek = DayOfWeek.SATURDAY;
                    break;
                default:
                    throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
            }
            TimeOfWeek.Builder builder = TimeOfWeek.builder(dayOfWeek, localTime);
            builder.setDate(localDateZzb);
            builder.setTruncated(Objects.equals(zzcVar.zzd(), Boolean.TRUE));
            return builder.build();
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    private static OpeningHours zzh(zzli.zzd zzdVar) {
        ArrayList arrayList;
        SpecialDay specialDayBuild;
        Period periodBuild;
        if (zzdVar == null) {
            return null;
        }
        OpeningHours.Builder builder = OpeningHours.builder();
        L<zzli.zzd.zza> lZza = zzdVar.zza();
        if (lZza.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (zzli.zzd.zza zzaVar : lZza) {
                if (zzaVar != null) {
                    Period.Builder builder2 = Period.builder();
                    builder2.setOpen(zza(zzaVar.zzb()));
                    builder2.setClose(zza(zzaVar.zza()));
                    periodBuild = builder2.build();
                } else {
                    periodBuild = null;
                }
                zzk(arrayList, periodBuild);
            }
        }
        builder.setPeriods(zzf(arrayList));
        builder.setWeekdayText(zzdVar.zzb());
        builder.setHoursType((OpeningHours.HoursType) zzc.getOrDefault(zzdVar.zzc(), null));
        L<zzli.zzd.zzb> lZzd = zzdVar.zzd();
        ArrayList arrayList2 = new ArrayList();
        if (!lZzd.isEmpty()) {
            for (zzli.zzd.zzb zzbVar : lZzd) {
                if (zzbVar == null) {
                    specialDayBuild = null;
                } else {
                    try {
                        SpecialDay.Builder builder3 = SpecialDay.builder((LocalDate) p.q(zzb(zzbVar.zza())));
                        builder3.setExceptional(Objects.equals(zzbVar.zzb(), Boolean.TRUE));
                        specialDayBuild = builder3.build();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                }
                zzk(arrayList2, specialDayBuild);
            }
        }
        builder.setSpecialDays(arrayList2);
        return builder.build();
    }

    static LocalDate zzb(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LocalDate.newInstance(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e10);
        }
    }

    static Place.BooleanPlaceAttributeValue zze(Boolean bool) {
        return bool == null ? Place.BooleanPlaceAttributeValue.UNKNOWN : bool.booleanValue() ? Place.BooleanPlaceAttributeValue.TRUE : Place.BooleanPlaceAttributeValue.FALSE;
    }

    static List zzf(List list) {
        return list != null ? list : new ArrayList();
    }

    private static LatLng zzi(zzli.zzc.zza zzaVar) {
        if (zzaVar == null) {
            return null;
        }
        Double dZza = zzaVar.zza();
        Double dZzb = zzaVar.zzb();
        if (dZza == null || dZzb == null) {
            return null;
        }
        return new LatLng(dZza.doubleValue(), dZzb.doubleValue());
    }

    private static ApiException zzj(String str) {
        return new ApiException(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static boolean zzk(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }

    static List zzc(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Deprecated
    static List zzd(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            M m10 = zzb;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final com.google.android.libraries.places.api.model.Place zzg(com.google.android.libraries.places.internal.zzli r10, java.util.List r11) throws com.google.android.gms.common.api.ApiException {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlf.zzg(com.google.android.libraries.places.internal.zzli, java.util.List):com.google.android.libraries.places.api.model.Place");
    }
}
