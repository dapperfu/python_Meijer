package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class EVChargeOptions implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract EVChargeOptions build();

        @RecentlyNonNull
        public abstract Builder setConnectorAggregations(@RecentlyNonNull List<ConnectorAggregation> list);

        @RecentlyNonNull
        public abstract Builder setConnectorCount(@RecentlyNonNull Integer num);
    }

    @RecentlyNonNull
    public abstract List<ConnectorAggregation> getConnectorAggregations();

    @RecentlyNonNull
    public abstract Integer getConnectorCount();

    @RecentlyNonNull
    public static EVChargeOptions newInstance(@RecentlyNonNull Integer num, @RecentlyNonNull List<ConnectorAggregation> list) {
        zzq zzqVar = new zzq();
        zzqVar.setConnectorCount(num);
        zzqVar.setConnectorAggregations(list);
        return zzqVar.build();
    }
}
