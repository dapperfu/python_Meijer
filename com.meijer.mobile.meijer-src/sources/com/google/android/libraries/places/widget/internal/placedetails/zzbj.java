package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class zzbj {
    private final List zza = CollectionsKt.s(Place.Field.ID, Place.Field.LOCATION, Place.Field.VIEWPORT, Place.Field.DISPLAY_NAME, Place.Field.GOOGLE_MAPS_URI);

    public final void zza() {
        this.zza.add(Place.Field.PHOTO_METADATAS);
    }

    public final void zzb() {
        this.zza.add(Place.Field.FORMATTED_ADDRESS);
    }

    public final void zzc() {
        List list = this.zza;
        list.add(Place.Field.USER_RATING_COUNT);
        list.add(Place.Field.RATING);
    }

    public final void zzd() {
        List list = this.zza;
        list.add(Place.Field.PRICE_LEVEL);
        list.add(Place.Field.PRICE_RANGE);
    }

    public final void zze() {
        this.zza.add(Place.Field.PRIMARY_TYPE_DISPLAY_NAME);
    }

    public final void zzf() {
        this.zza.add(Place.Field.ACCESSIBILITY_OPTIONS);
    }

    public final void zzg() {
        List list = this.zza;
        list.add(Place.Field.CURRENT_OPENING_HOURS);
        list.add(Place.Field.UTC_OFFSET);
        list.add(Place.Field.BUSINESS_STATUS);
    }

    public final void zzh() {
        this.zza.add(Place.Field.EDITORIAL_SUMMARY);
    }

    public final void zzi() {
        this.zza.add(Place.Field.WEBSITE_URI);
    }

    public final void zzj() {
        this.zza.add(Place.Field.INTERNATIONAL_PHONE_NUMBER);
    }

    public final void zzk() {
        List list = this.zza;
        list.add(Place.Field.EV_CHARGE_OPTIONS);
        list.add(Place.Field.FUEL_OPTIONS);
    }

    public final void zzl() {
        this.zza.add(Place.Field.REVIEWS);
    }

    public final void zzm() {
        this.zza.add(Place.Field.PLUS_CODE);
    }

    public final void zzn() {
        Place.Field field = Place.Field.ACCESSIBILITY_OPTIONS;
        Place.Field field2 = Place.Field.DINE_IN;
        Place.Field field3 = Place.Field.OUTDOOR_SEATING;
        Place.Field field4 = Place.Field.RESERVABLE;
        Place.Field field5 = Place.Field.TAKEOUT;
        Place.Field field6 = Place.Field.DELIVERY;
        Place.Field field7 = Place.Field.CURBSIDE_PICKUP;
        Place.Field field8 = Place.Field.SERVES_BREAKFAST;
        Place.Field field9 = Place.Field.SERVES_LUNCH;
        Place.Field field10 = Place.Field.SERVES_BRUNCH;
        Place.Field field11 = Place.Field.SERVES_DINNER;
        Place.Field field12 = Place.Field.SERVES_DESSERT;
        Place.Field field13 = Place.Field.SERVES_BEER;
        Place.Field field14 = Place.Field.SERVES_WINE;
        Place.Field field15 = Place.Field.SERVES_COFFEE;
        Place.Field field16 = Place.Field.SERVES_COCKTAILS;
        Place.Field field17 = Place.Field.SERVES_VEGETARIAN_FOOD;
        Place.Field field18 = Place.Field.RESTROOM;
        Place.Field field19 = Place.Field.GOOD_FOR_GROUPS;
        Place.Field field20 = Place.Field.GOOD_FOR_WATCHING_SPORTS;
        Place.Field field21 = Place.Field.LIVE_MUSIC;
        this.zza.addAll(CollectionsKt.p(field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, Place.Field.PAYMENT_OPTIONS, Place.Field.GOOD_FOR_CHILDREN, Place.Field.MENU_FOR_CHILDREN, Place.Field.ALLOWS_DOGS, Place.Field.PARKING_OPTIONS));
    }

    public final List zzo() {
        return CollectionsKt.i0(this.zza);
    }
}
