package com.google.android.libraries.places.api.net;

import De.p;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;

/* loaded from: classes6.dex */
public abstract class IsOpenRequest implements zzmg {
    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Place place) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull Place place) {
        return builder(place).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5507a getCancellationToken();

    @RecentlyNullable
    public abstract Place getPlace();

    @RecentlyNullable
    public abstract String getPlaceId();

    public abstract long getUtcTimeMillis();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNonNull
        public abstract Place getPlace();

        @RecentlyNonNull
        public abstract String getPlaceId();

        public abstract long getUtcTimeMillis();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        @RecentlyNonNull
        public abstract Builder setPlace(@RecentlyNonNull Place place);

        @RecentlyNonNull
        public abstract Builder setPlaceId(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setUtcTimeMillis(long j10);

        abstract IsOpenRequest zza();

        @RecentlyNonNull
        public IsOpenRequest build() {
            boolean z10;
            IsOpenRequest isOpenRequestZza = zza();
            Place place = isOpenRequestZza.getPlace();
            if (place != null) {
                if (place.getId() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p.e(z10, "Place must have a valid place id.");
            }
            return isOpenRequestZza;
        }
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull Place place, long j10) {
        return builder(place, j10).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Place place, long j10) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(j10);
        return zzpVar;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull String str) {
        return builder(str).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull String str, long j10) {
        return builder(str, j10).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, long j10) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(j10);
        return zzpVar;
    }
}
