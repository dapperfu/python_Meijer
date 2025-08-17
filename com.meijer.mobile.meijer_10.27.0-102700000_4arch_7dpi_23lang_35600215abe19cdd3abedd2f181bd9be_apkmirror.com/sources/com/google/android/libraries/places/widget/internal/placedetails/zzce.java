package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.ParkingOptions;
import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class zzce {
    public static final boolean zza(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue dineIn = place.getDineIn();
        Intrinsics.i(dineIn, "getDineIn(...)");
        if (zzm(dineIn)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue outdoorSeating = place.getOutdoorSeating();
        Intrinsics.i(outdoorSeating, "getOutdoorSeating(...)");
        if (zzm(outdoorSeating)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue reservable = place.getReservable();
        Intrinsics.i(reservable, "getReservable(...)");
        if (zzm(reservable)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue takeout = place.getTakeout();
        Intrinsics.i(takeout, "getTakeout(...)");
        if (zzm(takeout)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue delivery = place.getDelivery();
        Intrinsics.i(delivery, "getDelivery(...)");
        if (zzm(delivery)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue curbsidePickup = place.getCurbsidePickup();
        Intrinsics.i(curbsidePickup, "getCurbsidePickup(...)");
        return zzm(curbsidePickup);
    }

    public static final boolean zzb(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue servesBreakfast = place.getServesBreakfast();
        Intrinsics.i(servesBreakfast, "getServesBreakfast(...)");
        if (zzm(servesBreakfast)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesLunch = place.getServesLunch();
        Intrinsics.i(servesLunch, "getServesLunch(...)");
        if (zzm(servesLunch)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesBrunch = place.getServesBrunch();
        Intrinsics.i(servesBrunch, "getServesBrunch(...)");
        if (zzm(servesBrunch)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesDinner = place.getServesDinner();
        Intrinsics.i(servesDinner, "getServesDinner(...)");
        if (zzm(servesDinner)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesDessert = place.getServesDessert();
        Intrinsics.i(servesDessert, "getServesDessert(...)");
        return zzm(servesDessert);
    }

    public static final boolean zzc(Place place) {
        Intrinsics.j(place, "<this>");
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if (accessibilityOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue wheelchairAccessibleEntrance = accessibilityOptions.getWheelchairAccessibleEntrance();
        Intrinsics.i(wheelchairAccessibleEntrance, "getWheelchairAccessibleEntrance(...)");
        if (!zzm(wheelchairAccessibleEntrance)) {
            Place.BooleanPlaceAttributeValue wheelchairAccessibleParking = accessibilityOptions.getWheelchairAccessibleParking();
            Intrinsics.i(wheelchairAccessibleParking, "getWheelchairAccessibleParking(...)");
            if (!zzm(wheelchairAccessibleParking)) {
                Place.BooleanPlaceAttributeValue wheelchairAccessibleSeating = accessibilityOptions.getWheelchairAccessibleSeating();
                Intrinsics.i(wheelchairAccessibleSeating, "getWheelchairAccessibleSeating(...)");
                if (!zzm(wheelchairAccessibleSeating)) {
                    Place.BooleanPlaceAttributeValue wheelchairAccessibleRestroom = accessibilityOptions.getWheelchairAccessibleRestroom();
                    Intrinsics.i(wheelchairAccessibleRestroom, "getWheelchairAccessibleRestroom(...)");
                    return zzm(wheelchairAccessibleRestroom);
                }
            }
        }
        return true;
    }

    public static final boolean zzd(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue servesBeer = place.getServesBeer();
        Intrinsics.i(servesBeer, "getServesBeer(...)");
        if (zzm(servesBeer)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesWine = place.getServesWine();
        Intrinsics.i(servesWine, "getServesWine(...)");
        if (zzm(servesWine)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesCoffee = place.getServesCoffee();
        Intrinsics.i(servesCoffee, "getServesCoffee(...)");
        if (zzm(servesCoffee)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesCocktails = place.getServesCocktails();
        Intrinsics.i(servesCocktails, "getServesCocktails(...)");
        if (zzm(servesCocktails)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue servesVegetarianFood = place.getServesVegetarianFood();
        Intrinsics.i(servesVegetarianFood, "getServesVegetarianFood(...)");
        return zzm(servesVegetarianFood);
    }

    public static final boolean zze(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue restroom = place.getRestroom();
        Intrinsics.i(restroom, "getRestroom(...)");
        return zzm(restroom);
    }

    public static final boolean zzf(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue goodForGroups = place.getGoodForGroups();
        Intrinsics.i(goodForGroups, "getGoodForGroups(...)");
        if (zzm(goodForGroups)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue goodForWatchingSports = place.getGoodForWatchingSports();
        Intrinsics.i(goodForWatchingSports, "getGoodForWatchingSports(...)");
        if (zzm(goodForWatchingSports)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue liveMusic = place.getLiveMusic();
        Intrinsics.i(liveMusic, "getLiveMusic(...)");
        return zzm(liveMusic);
    }

    public static final boolean zzg(Place place) {
        Intrinsics.j(place, "<this>");
        PaymentOptions paymentOptions = place.getPaymentOptions();
        if (paymentOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue acceptsCreditCards = paymentOptions.getAcceptsCreditCards();
        Intrinsics.i(acceptsCreditCards, "getAcceptsCreditCards(...)");
        if (!zzm(acceptsCreditCards)) {
            Place.BooleanPlaceAttributeValue acceptsCashOnly = paymentOptions.getAcceptsCashOnly();
            Intrinsics.i(acceptsCashOnly, "getAcceptsCashOnly(...)");
            if (!zzm(acceptsCashOnly)) {
                Place.BooleanPlaceAttributeValue acceptsDebitCards = paymentOptions.getAcceptsDebitCards();
                Intrinsics.i(acceptsDebitCards, "getAcceptsDebitCards(...)");
                if (!zzm(acceptsDebitCards)) {
                    Place.BooleanPlaceAttributeValue acceptsNfc = paymentOptions.getAcceptsNfc();
                    Intrinsics.i(acceptsNfc, "getAcceptsNfc(...)");
                    return zzm(acceptsNfc);
                }
            }
        }
        return true;
    }

    public static final boolean zzh(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue goodForChildren = place.getGoodForChildren();
        Intrinsics.i(goodForChildren, "getGoodForChildren(...)");
        if (zzm(goodForChildren)) {
            return true;
        }
        Place.BooleanPlaceAttributeValue menuForChildren = place.getMenuForChildren();
        Intrinsics.i(menuForChildren, "getMenuForChildren(...)");
        return zzm(menuForChildren);
    }

    public static final boolean zzi(Place place) {
        Intrinsics.j(place, "<this>");
        Place.BooleanPlaceAttributeValue allowsDogs = place.getAllowsDogs();
        Intrinsics.i(allowsDogs, "getAllowsDogs(...)");
        return zzm(allowsDogs);
    }

    public static final boolean zzj(Place place) {
        Intrinsics.j(place, "<this>");
        ParkingOptions parkingOptions = place.getParkingOptions();
        if (parkingOptions == null) {
            return false;
        }
        Place.BooleanPlaceAttributeValue freeParkingLot = parkingOptions.getFreeParkingLot();
        Intrinsics.i(freeParkingLot, "getFreeParkingLot(...)");
        if (!zzm(freeParkingLot)) {
            Place.BooleanPlaceAttributeValue paidParkingLot = parkingOptions.getPaidParkingLot();
            Intrinsics.i(paidParkingLot, "getPaidParkingLot(...)");
            if (!zzm(paidParkingLot)) {
                Place.BooleanPlaceAttributeValue freeStreetParking = parkingOptions.getFreeStreetParking();
                Intrinsics.i(freeStreetParking, "getFreeStreetParking(...)");
                if (!zzm(freeStreetParking)) {
                    Place.BooleanPlaceAttributeValue paidStreetParking = parkingOptions.getPaidStreetParking();
                    Intrinsics.i(paidStreetParking, "getPaidStreetParking(...)");
                    if (!zzm(paidStreetParking)) {
                        Place.BooleanPlaceAttributeValue valetParking = parkingOptions.getValetParking();
                        Intrinsics.i(valetParking, "getValetParking(...)");
                        if (!zzm(valetParking)) {
                            Place.BooleanPlaceAttributeValue freeGarageParking = parkingOptions.getFreeGarageParking();
                            Intrinsics.i(freeGarageParking, "getFreeGarageParking(...)");
                            if (!zzm(freeGarageParking)) {
                                Place.BooleanPlaceAttributeValue paidGarageParking = parkingOptions.getPaidGarageParking();
                                Intrinsics.i(paidGarageParking, "getPaidGarageParking(...)");
                                return zzm(paidGarageParking);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean zzk(Place place, Context context, boolean z10) {
        ArrayList arrayList;
        String formattedAddress;
        String internationalPhoneNumber;
        String strZzc;
        List<FuelPrice> fuelPrices;
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context, "context");
        EVChargeOptions evChargeOptions = place.getEvChargeOptions();
        List<ConnectorAggregation> connectorAggregations = evChargeOptions != null ? evChargeOptions.getConnectorAggregations() : null;
        boolean z11 = (connectorAggregations == null || connectorAggregations.isEmpty()) ? false : true;
        FuelOptions fuelOptions = place.getFuelOptions();
        if (fuelOptions == null || (fuelPrices = fuelOptions.getFuelPrices()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : fuelPrices) {
                FuelPrice.FuelType type = ((FuelPrice) obj).getType();
                Intrinsics.i(type, "getType(...)");
                if (zzx.zza(type)) {
                    arrayList.add(obj);
                }
            }
        }
        boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        boolean z13 = (!z10 || (strZzc = zzad.zzc(place, context)) == null || StringsKt.r0(strZzc)) ? false : true;
        if (z11 || z12 || !(((formattedAddress = place.getFormattedAddress()) == null || StringsKt.r0(formattedAddress)) && !z13 && (((internationalPhoneNumber = place.getInternationalPhoneNumber()) == null || StringsKt.r0(internationalPhoneNumber)) && zzl(place.getWebsiteUri())))) {
            return true;
        }
        PlusCode plusCode = place.getPlusCode();
        String compoundCode = plusCode != null ? plusCode.getCompoundCode() : null;
        return (compoundCode == null || StringsKt.r0(compoundCode)) ? false : true;
    }

    private static final boolean zzl(Uri uri) {
        if (uri == null) {
            return true;
        }
        String string = uri.toString();
        Intrinsics.i(string, "toString(...)");
        return StringsKt.r0(string);
    }

    private static final boolean zzm(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        return booleanPlaceAttributeValue == Place.BooleanPlaceAttributeValue.TRUE;
    }
}
