package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenRequest;

/* loaded from: classes6.dex */
final class zzp extends IsOpenRequest.Builder {
    private Place zza;
    private String zzb;
    private long zzc;
    private AbstractC5507a zzd;
    private byte zze;

    zzp() {
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setPlace(Place place) {
        this.zza = place;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setPlaceId(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setUtcTimeMillis(long j10) {
        this.zzc = j10;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final long getUtcTimeMillis() {
        if (this.zze != 0) {
            return this.zzc;
        }
        throw new IllegalStateException("Property \"utcTimeMillis\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzd = abstractC5507a;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    final IsOpenRequest zza() {
        if (this.zze == 1) {
            return new zzq(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }
}
