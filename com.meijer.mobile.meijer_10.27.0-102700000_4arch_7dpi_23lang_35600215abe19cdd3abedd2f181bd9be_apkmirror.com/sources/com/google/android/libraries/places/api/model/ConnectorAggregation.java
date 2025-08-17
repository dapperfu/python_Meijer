package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import j$.time.Instant;

/* loaded from: classes6.dex */
public abstract class ConnectorAggregation implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract ConnectorAggregation build();

        @RecentlyNullable
        public abstract Instant getAvailabilityLastUpdateTime();

        @RecentlyNullable
        public abstract Integer getAvailableCount();

        @RecentlyNullable
        public abstract Integer getOutOfServiceCount();

        @RecentlyNonNull
        public abstract Builder setAvailabilityLastUpdateTime(Instant instant);

        @RecentlyNonNull
        public abstract Builder setAvailableCount(Integer num);

        @RecentlyNonNull
        public abstract Builder setCount(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract Builder setMaxChargeRateKw(@RecentlyNonNull Double d10);

        @RecentlyNonNull
        public abstract Builder setOutOfServiceCount(Integer num);

        @RecentlyNonNull
        public abstract Builder setType(@RecentlyNonNull EVConnectorType eVConnectorType);
    }

    @RecentlyNullable
    public abstract Instant getAvailabilityLastUpdateTime();

    @RecentlyNullable
    public abstract Integer getAvailableCount();

    @RecentlyNonNull
    public abstract Integer getCount();

    @RecentlyNonNull
    public abstract Double getMaxChargeRateKw();

    @RecentlyNullable
    public abstract Integer getOutOfServiceCount();

    @RecentlyNonNull
    public abstract EVConnectorType getType();

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull EVConnectorType eVConnectorType, @RecentlyNonNull Double d10, @RecentlyNonNull Integer num) {
        zzo zzoVar = new zzo();
        zzoVar.setType(eVConnectorType);
        zzoVar.setMaxChargeRateKw(d10);
        zzoVar.setCount(num);
        return zzoVar;
    }
}
