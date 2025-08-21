package com.google.android.libraries.places.api.net;

import Vd.AbstractC5507a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.List;

/* loaded from: classes6.dex */
final class zzd extends FetchPlaceRequest.Builder {
    private String zza;
    private List zzb;
    private AutocompleteSessionToken zzc;
    private AbstractC5507a zzd;
    private String zze;

    zzd() {
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setRegionCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final AbstractC5507a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setCancellationToken(AbstractC5507a abstractC5507a) {
        this.zzd = abstractC5507a;
        return this;
    }

    final FetchPlaceRequest.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    final FetchPlaceRequest.Builder zzb(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    final FetchPlaceRequest zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzb) != null) {
            return new zze(str, list, this.zzc, this.zzd, this.zze, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" placeId");
        }
        if (this.zzb == null) {
            sb2.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
