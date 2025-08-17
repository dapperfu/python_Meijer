package com.google.android.libraries.places.internal;

import Ce.L;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class zzng implements Parcelable {
    public abstract zzoh zza();

    public abstract AutocompleteActivityMode zzb();

    public abstract L zzc();

    public abstract zzoc zzd();

    public abstract LatLng zze();

    public abstract String zzf();

    public abstract String zzg();

    public abstract LocationBias zzh();

    public abstract LocationRestriction zzi();

    public abstract L zzj();

    @Deprecated
    public abstract TypeFilter zzk();

    public abstract L zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract String zzo();

    public abstract AutocompleteUiCustomization zzp();

    public abstract boolean zzq();

    public abstract AutocompleteSessionToken zzr();

    public abstract zznf zzs();

    public static zznf zzt(AutocompleteActivityMode autocompleteActivityMode, List list, zzoc zzocVar) {
        zzmz zzmzVar = new zzmz();
        zzmzVar.zzj(new ArrayList());
        zzmzVar.zzl(new ArrayList());
        zzmzVar.zzb(autocompleteActivityMode);
        zzmzVar.zzc(list);
        zzmzVar.zzd(zzocVar);
        zzmzVar.zzm(0);
        zzmzVar.zzn(0);
        zzmzVar.zzq(false);
        zzmzVar.zza(zzoh.PABLO);
        return zzmzVar;
    }

    public static zznf zzu(zzoh zzohVar) {
        zzmz zzmzVar = new zzmz();
        zzmzVar.zzj(new ArrayList());
        zzmzVar.zzl(new ArrayList());
        zzmzVar.zzc(new ArrayList());
        zzmzVar.zzm(0);
        zzmzVar.zzn(0);
        zzmzVar.zzb(AutocompleteActivityMode.FULLSCREEN);
        zzmzVar.zzd(zzoc.INTENT);
        zzmzVar.zza(zzohVar);
        zzmzVar.zzq(false);
        return zzmzVar;
    }
}
