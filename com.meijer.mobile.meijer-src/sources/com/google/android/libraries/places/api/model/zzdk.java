package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zzdk extends zzar {
    public static final Parcelable.Creator<zzdk> CREATOR = new zzdj();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzdk(String str, String str2, String str3, String str4, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, OpeningHours openingHours2, String str15, String str16, String str17, List list2, List list3, List list4, PlusCode plusCode, Integer num2, zzey zzeyVar, String str18, String str19, String str20, Double d10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list5, List list6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13, AccessibilityOptions accessibilityOptions, ParkingOptions parkingOptions, PaymentOptions paymentOptions, EVChargeOptions eVChargeOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue14, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue15, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue16, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue17, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue18, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue19, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue20, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue21, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue22, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue23, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue24, List list8, FuelOptions fuelOptions, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue25) {
        super(str, str2, str3, str4, addressComponents, list, businessStatus, booleanPlaceAttributeValue, openingHours, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, str5, str6, num, str7, str8, str9, latLng, latLng2, str10, str11, str12, str13, str14, openingHours2, str15, str16, str17, list2, list3, list4, plusCode, num2, zzeyVar, str18, str19, str20, d10, booleanPlaceAttributeValue4, list5, list6, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, booleanPlaceAttributeValue12, list7, num3, num4, num5, latLngBounds, uri, uri2, booleanPlaceAttributeValue13, accessibilityOptions, parkingOptions, paymentOptions, eVChargeOptions, booleanPlaceAttributeValue14, booleanPlaceAttributeValue15, booleanPlaceAttributeValue16, booleanPlaceAttributeValue17, booleanPlaceAttributeValue18, booleanPlaceAttributeValue19, booleanPlaceAttributeValue20, booleanPlaceAttributeValue21, booleanPlaceAttributeValue22, booleanPlaceAttributeValue23, booleanPlaceAttributeValue24, list8, fuelOptions, booleanPlaceAttributeValue25);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (getAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAddress());
        }
        if (getFormattedAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getFormattedAddress());
        }
        if (getShortFormattedAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getShortFormattedAddress());
        }
        if (getAdrFormatAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdrFormatAddress());
        }
        parcel.writeParcelable(getAddressComponents(), i10);
        parcel.writeList(getAttributions());
        parcel.writeParcelable(getBusinessStatus(), i10);
        parcel.writeParcelable(getCurbsidePickup(), i10);
        parcel.writeParcelable(getCurrentOpeningHours(), i10);
        parcel.writeParcelable(getDelivery(), i10);
        parcel.writeParcelable(getDineIn(), i10);
        if (getEditorialSummary() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummary());
        }
        if (getEditorialSummaryLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummaryLanguageCode());
        }
        if (getIconBackgroundColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getIconBackgroundColor().intValue());
        }
        if (getIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconUrl());
        }
        if (getIconMaskUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconMaskUrl());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        parcel.writeParcelable(getLatLng(), i10);
        parcel.writeParcelable(getLocation(), i10);
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        if (getDisplayName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayName());
        }
        if (getNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getNameLanguageCode());
        }
        if (getDisplayNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayNameLanguageCode());
        }
        if (getResourceName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getResourceName());
        }
        parcel.writeParcelable(getOpeningHours(), i10);
        if (getPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhoneNumber());
        }
        if (getInternationalPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getInternationalPhoneNumber());
        }
        if (getNationalPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getNationalPhoneNumber());
        }
        parcel.writeList(getPhotoMetadatas());
        parcel.writeList(getReviews());
        parcel.writeList(getPlaceTypes());
        parcel.writeParcelable(getPlusCode(), i10);
        if (getPriceLevel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getPriceLevel().intValue());
        }
        parcel.writeParcelable(zza(), i10);
        if (getPrimaryType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryType());
        }
        if (getPrimaryTypeDisplayName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryTypeDisplayName());
        }
        if (getPrimaryTypeDisplayNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPrimaryTypeDisplayNameLanguageCode());
        }
        if (getRating() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getRating().doubleValue());
        }
        parcel.writeParcelable(getReservable(), i10);
        parcel.writeList(getSecondaryOpeningHours());
        parcel.writeList(getCurrentSecondaryOpeningHours());
        parcel.writeParcelable(getServesBeer(), i10);
        parcel.writeParcelable(getServesBreakfast(), i10);
        parcel.writeParcelable(getServesBrunch(), i10);
        parcel.writeParcelable(getServesDinner(), i10);
        parcel.writeParcelable(getServesLunch(), i10);
        parcel.writeParcelable(getServesVegetarianFood(), i10);
        parcel.writeParcelable(getServesWine(), i10);
        parcel.writeParcelable(getTakeout(), i10);
        parcel.writeList(getTypes());
        if (getUserRatingsTotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingsTotal().intValue());
        }
        if (getUserRatingCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingCount().intValue());
        }
        if (getUtcOffsetMinutes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUtcOffsetMinutes().intValue());
        }
        parcel.writeParcelable(getViewport(), i10);
        parcel.writeParcelable(getWebsiteUri(), i10);
        parcel.writeParcelable(getGoogleMapsUri(), i10);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i10);
        parcel.writeParcelable(getAccessibilityOptions(), i10);
        parcel.writeParcelable(getParkingOptions(), i10);
        parcel.writeParcelable(getPaymentOptions(), i10);
        parcel.writeParcelable(getEvChargeOptions(), i10);
        parcel.writeParcelable(getOutdoorSeating(), i10);
        parcel.writeParcelable(getLiveMusic(), i10);
        parcel.writeParcelable(getMenuForChildren(), i10);
        parcel.writeParcelable(getServesCocktails(), i10);
        parcel.writeParcelable(getServesDessert(), i10);
        parcel.writeParcelable(getServesCoffee(), i10);
        parcel.writeParcelable(getGoodForChildren(), i10);
        parcel.writeParcelable(getAllowsDogs(), i10);
        parcel.writeParcelable(getRestroom(), i10);
        parcel.writeParcelable(getGoodForGroups(), i10);
        parcel.writeParcelable(getGoodForWatchingSports(), i10);
        parcel.writeList(getSubDestinations());
        parcel.writeParcelable(getFuelOptions(), i10);
        parcel.writeParcelable(getPureServiceAreaBusiness(), i10);
    }
}
