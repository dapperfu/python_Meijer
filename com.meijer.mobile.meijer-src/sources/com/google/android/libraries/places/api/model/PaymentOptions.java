package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
public abstract class PaymentOptions implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract PaymentOptions build();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

        @RecentlyNonNull
        public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();

        @RecentlyNonNull
        public abstract Builder setAcceptsCashOnly(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setAcceptsCreditCards(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setAcceptsDebitCards(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        @RecentlyNonNull
        public abstract Builder setAcceptsNfc(@RecentlyNonNull Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

    @RecentlyNonNull
    public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();

    @RecentlyNonNull
    public static Builder builder() {
        zzak zzakVar = new zzak();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = Place.BooleanPlaceAttributeValue.UNKNOWN;
        zzakVar.setAcceptsCreditCards(booleanPlaceAttributeValue);
        zzakVar.setAcceptsDebitCards(booleanPlaceAttributeValue);
        zzakVar.setAcceptsCashOnly(booleanPlaceAttributeValue);
        zzakVar.setAcceptsNfc(booleanPlaceAttributeValue);
        return zzakVar;
    }
}
