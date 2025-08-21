package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzn {
    public static final List zza(Place place, Context context) {
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context, "context");
        ArrayList arrayList = new ArrayList();
        if (zzce.zza(place)) {
            zzb(arrayList);
            String string = context.getString(R.string.place_details_about_service_options);
            Intrinsics.i(string, "getString(...)");
            arrayList.add(new zzh(string));
            Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
            Intrinsics.i(dineIn, "getDineIn(...)");
            if (zzc(dineIn)) {
                String string2 = context.getString(R.string.place_details_dine_in_service_option);
                Intrinsics.i(string2, "getString(...)");
                arrayList.add(new zzf(string2));
            }
            Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
            Intrinsics.i(outdoorSeating, "getOutdoorSeating(...)");
            if (zzc(outdoorSeating)) {
                String string3 = context.getString(R.string.place_details_outdoor_seating_service_option);
                Intrinsics.i(string3, "getString(...)");
                arrayList.add(new zzf(string3));
            }
            Place.BooleanPlaceAttributeValue reservable = place.getReservable();
            Intrinsics.i(reservable, "getReservable(...)");
            if (zzc(reservable)) {
                String string4 = context.getString(R.string.place_details_takes_reservations_service_option);
                Intrinsics.i(string4, "getString(...)");
                arrayList.add(new zzf(string4));
            }
            Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
            Intrinsics.i(takeout, "getTakeout(...)");
            if (zzc(takeout)) {
                String string5 = context.getString(R.string.place_details_takeout_service_option);
                Intrinsics.i(string5, "getString(...)");
                arrayList.add(new zzf(string5));
            }
            Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
            Intrinsics.i(delivery, "getDelivery(...)");
            if (zzc(delivery)) {
                String string6 = context.getString(R.string.place_details_delivery_service_option);
                Intrinsics.i(string6, "getString(...)");
                arrayList.add(new zzf(string6));
            }
            Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
            Intrinsics.i(curbsidePickup, "getCurbsidePickup(...)");
            if (zzc(curbsidePickup)) {
                String string7 = context.getString(R.string.place_details_curbside_pickup_service_option);
                Intrinsics.i(string7, "getString(...)");
                arrayList.add(new zzf(string7));
            }
        }
        if (zzce.zzb(place)) {
            zzb(arrayList);
            String string8 = context.getString(R.string.place_details_about_popular_for);
            Intrinsics.i(string8, "getString(...)");
            arrayList.add(new zzh(string8));
            Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
            Intrinsics.i(servesBreakfast, "getServesBreakfast(...)");
            if (zzc(servesBreakfast)) {
                String string9 = context.getString(R.string.place_details_popular_for_breakfast);
                Intrinsics.i(string9, "getString(...)");
                arrayList.add(new zzf(string9));
            }
            Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
            Intrinsics.i(servesLunch, "getServesLunch(...)");
            if (zzc(servesLunch)) {
                String string10 = context.getString(R.string.place_details_popular_for_lunch);
                Intrinsics.i(string10, "getString(...)");
                arrayList.add(new zzf(string10));
            }
            Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
            Intrinsics.i(servesBrunch, "getServesBrunch(...)");
            if (zzc(servesBrunch)) {
                String string11 = context.getString(R.string.place_details_popular_for_brunch);
                Intrinsics.i(string11, "getString(...)");
                arrayList.add(new zzf(string11));
            }
            Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
            Intrinsics.i(servesDinner, "getServesDinner(...)");
            if (zzc(servesDinner)) {
                String string12 = context.getString(R.string.place_details_popular_for_dinner);
                Intrinsics.i(string12, "getString(...)");
                arrayList.add(new zzf(string12));
            }
            Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
            Intrinsics.i(servesDessert, "getServesDessert(...)");
            if (zzc(servesDessert)) {
                String string13 = context.getString(R.string.place_details_popular_for_dessert);
                Intrinsics.i(string13, "getString(...)");
                arrayList.add(new zzf(string13));
            }
        }
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (zzce.zzc(place) && accessibilityOptions != null) {
            zzb(arrayList);
            String string14 = context.getString(R.string.place_details_about_accessibility);
            Intrinsics.i(string14, "getString(...)");
            arrayList.add(new zzh(string14));
            Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
            Intrinsics.i(wheelchairAccessibleEntrance, "getWheelchairAccessibleEntrance(...)");
            if (zzc(wheelchairAccessibleEntrance)) {
                String string15 = context.getString(R.string.place_details_accessibility_entrance);
                Intrinsics.i(string15, "getString(...)");
                arrayList.add(new zzf(string15));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            Intrinsics.i(wheelchairAccessibleParking, "getWheelchairAccessibleParking(...)");
            if (zzc(wheelchairAccessibleParking)) {
                String string16 = context.getString(R.string.place_details_accessibility_parking_lot);
                Intrinsics.i(string16, "getString(...)");
                arrayList.add(new zzf(string16));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
            Intrinsics.i(wheelchairAccessibleSeating, "getWheelchairAccessibleSeating(...)");
            if (zzc(wheelchairAccessibleSeating)) {
                String string17 = context.getString(R.string.place_details_accessibility_seating);
                Intrinsics.i(string17, "getString(...)");
                arrayList.add(new zzf(string17));
            }
            Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
            Intrinsics.i(wheelchairAccessibleRestroom, "getWheelchairAccessibleRestroom(...)");
            if (zzc(wheelchairAccessibleRestroom)) {
                String string18 = context.getString(R.string.place_details_accessibility_restroom);
                Intrinsics.i(string18, "getString(...)");
                arrayList.add(new zzf(string18));
            }
        }
        if (zzce.zzd(place)) {
            zzb(arrayList);
            String string19 = context.getString(R.string.place_details_about_offerings);
            Intrinsics.i(string19, "getString(...)");
            arrayList.add(new zzh(string19));
            Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
            Intrinsics.i(servesBeer, "getServesBeer(...)");
            if (zzc(servesBeer)) {
                String string20 = context.getString(R.string.place_details_offerings_beer);
                Intrinsics.i(string20, "getString(...)");
                arrayList.add(new zzf(string20));
            }
            Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
            Intrinsics.i(servesWine, "getServesWine(...)");
            if (zzc(servesWine)) {
                String string21 = context.getString(R.string.place_details_offerings_wine);
                Intrinsics.i(string21, "getString(...)");
                arrayList.add(new zzf(string21));
            }
            Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
            Intrinsics.i(servesCoffee, "getServesCoffee(...)");
            if (zzc(servesCoffee)) {
                String string22 = context.getString(R.string.place_details_offerings_coffee);
                Intrinsics.i(string22, "getString(...)");
                arrayList.add(new zzf(string22));
            }
            Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
            Intrinsics.i(servesCocktails, "getServesCocktails(...)");
            if (zzc(servesCocktails)) {
                String string23 = context.getString(R.string.place_details_offerings_cocktails);
                Intrinsics.i(string23, "getString(...)");
                arrayList.add(new zzf(string23));
            }
            Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
            Intrinsics.i(servesVegetarianFood, "getServesVegetarianFood(...)");
            if (zzc(servesVegetarianFood)) {
                String string24 = context.getString(R.string.place_details_offerings_vegetarian_options);
                Intrinsics.i(string24, "getString(...)");
                arrayList.add(new zzf(string24));
            }
        }
        if (zzce.zze(place)) {
            zzb(arrayList);
            String string25 = context.getString(R.string.place_details_about_amenities);
            Intrinsics.i(string25, "getString(...)");
            arrayList.add(new zzh(string25));
            Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
            Intrinsics.i(restroom, "getRestroom(...)");
            if (zzc(restroom)) {
                String string26 = context.getString(R.string.place_details_amenities_restroom);
                Intrinsics.i(string26, "getString(...)");
                arrayList.add(new zzf(string26));
            }
        }
        if (zzce.zzf(place)) {
            zzb(arrayList);
            String string27 = context.getString(R.string.place_details_about_known_for);
            Intrinsics.i(string27, "getString(...)");
            arrayList.add(new zzh(string27));
            Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
            Intrinsics.i(goodForGroups, "getGoodForGroups(...)");
            if (zzc(goodForGroups)) {
                String string28 = context.getString(R.string.place_details_known_for_groups);
                Intrinsics.i(string28, "getString(...)");
                arrayList.add(new zzf(string28));
            }
            Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
            Intrinsics.i(goodForWatchingSports, "getGoodForWatchingSports(...)");
            if (zzc(goodForWatchingSports)) {
                String string29 = context.getString(R.string.place_details_known_for_sports);
                Intrinsics.i(string29, "getString(...)");
                arrayList.add(new zzf(string29));
            }
            Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
            Intrinsics.i(liveMusic, "getLiveMusic(...)");
            if (zzc(liveMusic)) {
                String string30 = context.getString(R.string.place_details_known_for_live_music);
                Intrinsics.i(string30, "getString(...)");
                arrayList.add(new zzf(string30));
            }
        }
        PaymentOptions paymentOptions = place.getPaymentOptions();
        if (zzce.zzg(place) && paymentOptions != null) {
            zzb(arrayList);
            String string31 = context.getString(R.string.place_details_about_payments);
            Intrinsics.i(string31, "getString(...)");
            arrayList.add(new zzh(string31));
            Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
            Intrinsics.i(acceptsCreditCards, "getAcceptsCreditCards(...)");
            if (zzc(acceptsCreditCards)) {
                String string32 = context.getString(R.string.place_details_payments_credit_cards);
                Intrinsics.i(string32, "getString(...)");
                arrayList.add(new zzf(string32));
            }
            Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
            Intrinsics.i(acceptsDebitCards, "getAcceptsDebitCards(...)");
            if (zzc(acceptsDebitCards)) {
                String string33 = context.getString(R.string.place_details_payments_debit_cards);
                Intrinsics.i(string33, "getString(...)");
                arrayList.add(new zzf(string33));
            }
            Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
            Intrinsics.i(acceptsNfc, "getAcceptsNfc(...)");
            if (zzc(acceptsNfc)) {
                String string34 = context.getString(R.string.place_details_payments_nfc);
                Intrinsics.i(string34, "getString(...)");
                arrayList.add(new zzf(string34));
            }
            Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            Intrinsics.i(acceptsCashOnly, "getAcceptsCashOnly(...)");
            if (zzc(acceptsCashOnly)) {
                String string35 = context.getString(R.string.place_details_payments_cash_only);
                Intrinsics.i(string35, "getString(...)");
                arrayList.add(new zzf(string35));
            }
        }
        if (zzce.zzh(place)) {
            zzb(arrayList);
            String string36 = context.getString(R.string.place_details_about_children);
            Intrinsics.i(string36, "getString(...)");
            arrayList.add(new zzh(string36));
            Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
            Intrinsics.i(goodForChildren, "getGoodForChildren(...)");
            if (zzc(goodForChildren)) {
                String string37 = context.getString(R.string.place_details_children_good_for_kids);
                Intrinsics.i(string37, "getString(...)");
                arrayList.add(new zzf(string37));
            }
            Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
            Intrinsics.i(menuForChildren, "getMenuForChildren(...)");
            if (zzc(menuForChildren)) {
                String string38 = context.getString(R.string.place_details_children_kids_menu);
                Intrinsics.i(string38, "getString(...)");
                arrayList.add(new zzf(string38));
            }
        }
        if (zzce.zzi(place)) {
            zzb(arrayList);
            String string39 = context.getString(R.string.place_details_about_pets);
            Intrinsics.i(string39, "getString(...)");
            arrayList.add(new zzh(string39));
            Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
            Intrinsics.i(allowsDogs, "getAllowsDogs(...)");
            if (zzc(allowsDogs)) {
                String string40 = context.getString(R.string.place_details_pets_dogs);
                Intrinsics.i(string40, "getString(...)");
                arrayList.add(new zzf(string40));
            }
        }
        ParkingOptions parkingOptions = place.getParkingOptions();
        if (zzce.zzj(place) && parkingOptions != null) {
            zzb(arrayList);
            String string41 = context.getString(R.string.place_details_about_parking);
            Intrinsics.i(string41, "getString(...)");
            arrayList.add(new zzh(string41));
            Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
            Intrinsics.i(freeParkingLot, "getFreeParkingLot(...)");
            if (zzc(freeParkingLot)) {
                String string42 = context.getString(R.string.place_details_parking_free_parking_lot);
                Intrinsics.i(string42, "getString(...)");
                arrayList.add(new zzf(string42));
            }
            Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            Intrinsics.i(paidParkingLot, "getPaidParkingLot(...)");
            if (zzc(paidParkingLot)) {
                String string43 = context.getString(R.string.place_details_parking_paid_parking_lot);
                Intrinsics.i(string43, "getString(...)");
                arrayList.add(new zzf(string43));
            }
            Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
            Intrinsics.i(freeStreetParking, "getFreeStreetParking(...)");
            if (zzc(freeStreetParking)) {
                String string44 = context.getString(R.string.place_details_parking_free_street_parking);
                Intrinsics.i(string44, "getString(...)");
                arrayList.add(new zzf(string44));
            }
            Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
            Intrinsics.i(paidStreetParking, "getPaidStreetParking(...)");
            if (zzc(paidStreetParking)) {
                String string45 = context.getString(R.string.place_details_parking_paid_street_parking);
                Intrinsics.i(string45, "getString(...)");
                arrayList.add(new zzf(string45));
            }
            Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
            Intrinsics.i(valetParking, "getValetParking(...)");
            if (zzc(valetParking)) {
                String string46 = context.getString(R.string.place_details_parking_valet);
                Intrinsics.i(string46, "getString(...)");
                arrayList.add(new zzf(string46));
            }
            Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
            Intrinsics.i(freeGarageParking, "getFreeGarageParking(...)");
            if (zzc(freeGarageParking)) {
                String string47 = context.getString(R.string.place_details_parking_free_garage_parking);
                Intrinsics.i(string47, "getString(...)");
                arrayList.add(new zzf(string47));
            }
            Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
            Intrinsics.i(paidGarageParking, "getPaidGarageParking(...)");
            if (zzc(paidGarageParking)) {
                String string48 = context.getString(R.string.place_details_parking_paid_garage_parking);
                Intrinsics.i(string48, "getString(...)");
                arrayList.add(new zzf(string48));
            }
        }
        return arrayList;
    }

    private static final void zzb(List list) {
        if (list.isEmpty()) {
            return;
        }
        list.add(zzg.zza);
    }

    private static final boolean zzc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == Place.BooleanPlaceAttributeValue.TRUE;
    }
}
