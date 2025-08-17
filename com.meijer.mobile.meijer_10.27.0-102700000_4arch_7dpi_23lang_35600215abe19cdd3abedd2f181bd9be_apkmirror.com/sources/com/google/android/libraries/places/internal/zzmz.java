package com.google.android.libraries.places.internal;

import Ce.L;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import java.util.List;

/* loaded from: classes6.dex */
final class zzmz extends zznf {
    private zzoh zza;
    private AutocompleteActivityMode zzb;
    private L zzc;
    private zzoc zzd;
    private LatLng zze;
    private String zzf;
    private String zzg;
    private LocationBias zzh;
    private LocationRestriction zzi;
    private L zzj;
    private TypeFilter zzk;
    private L zzl;
    private int zzm;
    private int zzn;
    private String zzo;
    private AutocompleteUiCustomization zzp;
    private boolean zzq;
    private AutocompleteSessionToken zzr;
    private byte zzs;

    zzmz() {
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zze(LatLng latLng) {
        this.zze = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzf(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzg(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzh(LocationBias locationBias) {
        this.zzh = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzi(LocationRestriction locationRestriction) {
        this.zzi = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzk(TypeFilter typeFilter) {
        this.zzk = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzm(int i10) {
        this.zzm = i10;
        this.zzs = (byte) (this.zzs | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzn(int i10) {
        this.zzn = i10;
        this.zzs = (byte) (this.zzs | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzo(String str) {
        this.zzo = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzp(AutocompleteUiCustomization autocompleteUiCustomization) {
        this.zzp = autocompleteUiCustomization;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzq(boolean z10) {
        this.zzq = z10;
        this.zzs = (byte) (this.zzs | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzr(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzr = autocompleteSessionToken;
        return this;
    }

    zzmz(zzng zzngVar) {
        this.zza = zzngVar.zza();
        this.zzb = zzngVar.zzb();
        this.zzc = zzngVar.zzc();
        this.zzd = zzngVar.zzd();
        this.zze = zzngVar.zze();
        this.zzf = zzngVar.zzf();
        this.zzg = zzngVar.zzg();
        this.zzh = zzngVar.zzh();
        this.zzi = zzngVar.zzi();
        this.zzj = zzngVar.zzj();
        this.zzk = zzngVar.zzk();
        this.zzl = zzngVar.zzl();
        this.zzm = zzngVar.zzm();
        this.zzn = zzngVar.zzn();
        this.zzo = zzngVar.zzo();
        this.zzp = zzngVar.zzp();
        this.zzq = zzngVar.zzq();
        this.zzr = zzngVar.zzr();
        this.zzs = (byte) 7;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zza(zzoh zzohVar) {
        if (zzohVar == null) {
            throw new NullPointerException("Null widgetBackend");
        }
        this.zza = zzohVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzb(AutocompleteActivityMode autocompleteActivityMode) {
        if (autocompleteActivityMode == null) {
            throw new NullPointerException("Null mode");
        }
        this.zzb = autocompleteActivityMode;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzd(zzoc zzocVar) {
        if (zzocVar == null) {
            throw new NullPointerException("Null activityOrigin");
        }
        this.zzd = zzocVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zzng zzs() {
        zzoh zzohVar;
        AutocompleteActivityMode autocompleteActivityMode;
        L l10;
        zzoc zzocVar;
        L l11;
        L l12;
        if (this.zzs == 7 && (zzohVar = this.zza) != null && (autocompleteActivityMode = this.zzb) != null && (l10 = this.zzc) != null && (zzocVar = this.zzd) != null && (l11 = this.zzj) != null && (l12 = this.zzl) != null) {
            return new zznc(zzohVar, autocompleteActivityMode, l10, zzocVar, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, l11, this.zzk, l12, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" widgetBackend");
        }
        if (this.zzb == null) {
            sb2.append(" mode");
        }
        if (this.zzc == null) {
            sb2.append(" placeFields");
        }
        if (this.zzd == null) {
            sb2.append(" activityOrigin");
        }
        if (this.zzj == null) {
            sb2.append(" countries");
        }
        if (this.zzl == null) {
            sb2.append(" typesFilter");
        }
        if ((this.zzs & 1) == 0) {
            sb2.append(" primaryColor");
        }
        if ((this.zzs & 2) == 0) {
            sb2.append(" primaryColorDark");
        }
        if ((this.zzs & 4) == 0) {
            sb2.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzc(List list) {
        this.zzc = L.s(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzj(List list) {
        this.zzj = L.s(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final zznf zzl(List list) {
        this.zzl = L.s(list);
        return this;
    }
}
