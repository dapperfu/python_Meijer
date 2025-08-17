package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class EVSearchOptions implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract EVSearchOptions build();

        @RecentlyNullable
        public abstract List<EVConnectorType> getConnectorTypes();

        @RecentlyNullable
        public abstract Double getMinimumChargingRateKw();

        @RecentlyNonNull
        public abstract Builder setConnectorTypes(List<EVConnectorType> list);

        @RecentlyNonNull
        public abstract Builder setMinimumChargingRateKw(Double d10);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzs();
    }

    @RecentlyNullable
    public abstract List<EVConnectorType> getConnectorTypes();

    @RecentlyNullable
    public abstract Double getMinimumChargingRateKw();
}
