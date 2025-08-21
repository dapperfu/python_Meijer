package com.google.android.libraries.places.api.net;

import Ee.L;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FindCurrentPlaceRequest implements zzmg {
    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5507a getCancellationToken();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        abstract Builder zza(List list);

        abstract FindCurrentPlaceRequest zzb();

        @RecentlyNonNull
        public FindCurrentPlaceRequest build() {
            zza(L.s(zzb().getPlaceFields()));
            return zzb();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull List<Place.Field> list) {
        zzm zzmVar = new zzm();
        zzmVar.zza(list);
        return zzmVar;
    }

    @RecentlyNonNull
    public static FindCurrentPlaceRequest newInstance(@RecentlyNonNull List<Place.Field> list) {
        return builder(list).build();
    }
}
