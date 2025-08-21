package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import java.util.List;

/* loaded from: classes6.dex */
final class zzu extends SearchByTextResponse.Builder {
    private List zza;
    private List zzb;

    zzu() {
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final List<RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final SearchByTextResponse.Builder setRoutingSummaries(List<RoutingSummary> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final SearchByTextResponse autoBuild() {
        List list = this.zza;
        if (list != null) {
            return new zzv(list, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: places");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final List<Place> getPlaces() {
        List<Place> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"places\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final SearchByTextResponse.Builder setPlaces(List<Place> list) {
        if (list == null) {
            throw new NullPointerException("Null places");
        }
        this.zza = list;
        return this;
    }
}
