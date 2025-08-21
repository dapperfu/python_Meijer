package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzm extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private AbstractC5507a zzb;

    zzm() {
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzb = abstractC5507a;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzn(list, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }
}
