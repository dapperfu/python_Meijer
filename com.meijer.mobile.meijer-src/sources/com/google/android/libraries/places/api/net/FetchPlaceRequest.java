package com.google.android.libraries.places.api.net;

import Ee.L;
import Vd.AbstractC5507a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FetchPlaceRequest implements zzmg {
    @Override // com.google.android.libraries.places.internal.zzmg
    @RecentlyNullable
    public abstract AbstractC5507a getCancellationToken();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNullable
    public abstract String getRegionCode();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract AbstractC5507a getCancellationToken();

        @RecentlyNullable
        public abstract String getRegionCode();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(AbstractC5507a abstractC5507a);

        @RecentlyNonNull
        public abstract Builder setRegionCode(String str);

        @RecentlyNonNull
        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        abstract Builder zzb(List list);

        abstract FetchPlaceRequest zzc();

        @RecentlyNonNull
        public FetchPlaceRequest build() {
            zzb(L.s(zzc().getPlaceFields()));
            return zzc();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        zzd zzdVar = new zzd();
        zzdVar.zza(str);
        zzdVar.zzb(list);
        return zzdVar;
    }

    @RecentlyNonNull
    public static FetchPlaceRequest newInstance(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        return builder(str, list).build();
    }
}
