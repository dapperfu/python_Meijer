package com.google.android.libraries.places.internal;

import Ee.L;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class zznf {
    public abstract zznf zza(zzoh zzohVar);

    public abstract zznf zzb(AutocompleteActivityMode autocompleteActivityMode);

    public abstract zznf zzc(List list);

    public abstract zznf zzd(zzoc zzocVar);

    public abstract zznf zze(LatLng latLng);

    public abstract zznf zzf(String str);

    public abstract zznf zzg(String str);

    public abstract zznf zzh(LocationBias locationBias);

    public abstract zznf zzi(LocationRestriction locationRestriction);

    public abstract zznf zzj(List list);

    @Deprecated
    public abstract zznf zzk(TypeFilter typeFilter);

    public abstract zznf zzl(List list);

    public abstract zznf zzm(int i10);

    public abstract zznf zzn(int i10);

    public abstract zznf zzo(String str);

    public abstract zznf zzp(AutocompleteUiCustomization autocompleteUiCustomization);

    public abstract zznf zzq(boolean z10);

    public abstract zznf zzr(AutocompleteSessionToken autocompleteSessionToken);

    public abstract zzng zzs();

    @Deprecated
    public final zznf zzt(String str) {
        return zzj(str == null ? L.x() : L.y(str));
    }
}
