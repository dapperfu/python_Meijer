package com.google.android.libraries.places.internal;

import Ce.L;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes6.dex */
final class zznd extends zznh {
    private String zza;
    private L zzb;
    private Place zzc;
    private AutocompletePrediction zzd;
    private AutocompleteSessionToken zze;
    private Status zzf;
    private int zzg;

    zznd() {
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzc(Place place) {
        this.zzc = place;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzd(AutocompletePrediction autocompletePrediction) {
        this.zzd = autocompletePrediction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zze(AutocompleteSessionToken autocompleteSessionToken) {
        this.zze = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzf(Status status) {
        this.zzf = status;
        return this;
    }

    public final zznh zzh(int i10) {
        this.zzg = i10;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzb(List list) {
        this.zzb = list == null ? null : L.s(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zzni zzg() {
        int i10 = this.zzg;
        if (i10 != 0) {
            return new zzne(i10, this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }
        throw new IllegalStateException("Missing required properties: type");
    }
}
