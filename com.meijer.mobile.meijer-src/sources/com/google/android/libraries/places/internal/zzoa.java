package com.google.android.libraries.places.internal;

import De.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* loaded from: classes6.dex */
public final class zzoa implements Parcelable {
    public static final Parcelable.Creator<zzoa> CREATOR = new zznz();
    private final zzoh zza;
    private final AutocompleteUiCustomization zzb;
    private final zzoc zzc;
    private final AutocompleteActivityMode zzd;
    private final AutocompleteSessionToken zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private String zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private int zzs;
    private long zzt;
    private final zzdy zzu;

    /* synthetic */ zzoa(Parcel parcel, byte[] bArr) {
        this.zza = (zzoh) parcel.readParcelable(zzoh.class.getClassLoader());
        this.zzb = (AutocompleteUiCustomization) parcel.readParcelable(AutocompleteUiCustomization.class.getClassLoader());
        this.zzc = (zzoc) parcel.readParcelable(zzoc.class.getClassLoader());
        this.zzd = (AutocompleteActivityMode) parcel.readParcelable(AutocompleteActivityMode.class.getClassLoader());
        this.zze = (AutocompleteSessionToken) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader());
        this.zzm = zzF(parcel);
        this.zzf = zzF(parcel);
        this.zzg = zzF(parcel);
        this.zzl = parcel.readInt();
        this.zzh = parcel.readInt();
        this.zzi = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzn = zzF(parcel);
        this.zzk = parcel.readInt();
        this.zzo = v.e(parcel.readString());
        this.zzp = parcel.readInt();
        this.zzq = parcel.readInt();
        this.zzr = zzF(parcel);
        this.zzs = parcel.readInt();
        this.zzt = parcel.readLong();
        this.zzu = new zzeb();
    }

    private final boolean zzG() {
        return this.zzt != -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void zzA(String str) {
        this.zzp++;
        this.zzo = str;
    }

    public final void zzB() {
        this.zzq++;
    }

    public final void zzC() {
        this.zzr = true;
    }

    public final zzoh zza() {
        return this.zza;
    }

    public final AutocompleteUiCustomization zzb() {
        return this.zzb;
    }

    public final zzoc zzc() {
        return this.zzc;
    }

    public final AutocompleteActivityMode zzd() {
        return this.zzd;
    }

    public final AutocompleteSessionToken zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzg;
    }

    public final int zzi() {
        return this.zzl;
    }

    public final int zzj() {
        return this.zzh;
    }

    public final int zzk() {
        return this.zzi;
    }

    public final int zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }

    public final String zzn() {
        return this.zzo;
    }

    public final int zzo() {
        return this.zzp;
    }

    public final int zzp() {
        return this.zzq;
    }

    public final boolean zzq() {
        return this.zzr;
    }

    public final int zzr() {
        return this.zzs;
    }

    public final void zzs(int i10) {
        this.zzm = true;
        this.zzl = i10;
    }

    public final void zzt() {
        this.zzf = true;
    }

    public final void zzu() {
        if (this.zzf || this.zzn) {
            return;
        }
        this.zzg = true;
    }

    public final void zzv() {
        this.zzh++;
    }

    public final void zzw() {
        this.zzi++;
    }

    public final void zzx() {
        this.zzj++;
    }

    public final void zzy() {
        this.zzn = true;
    }

    public final void zzz() {
        this.zzk++;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.zza, i10);
        parcel.writeParcelable(this.zzb, i10);
        parcel.writeParcelable(this.zzc, i10);
        parcel.writeParcelable(this.zzd, i10);
        parcel.writeParcelable(this.zze, i10);
        parcel.writeInt(this.zzm ? 1 : 0);
        parcel.writeInt(this.zzf ? 1 : 0);
        parcel.writeInt(this.zzg ? 1 : 0);
        parcel.writeInt(this.zzl);
        parcel.writeInt(this.zzh);
        parcel.writeInt(this.zzi);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzn ? 1 : 0);
        parcel.writeInt(this.zzk);
        parcel.writeString(this.zzo);
        parcel.writeInt(this.zzp);
        parcel.writeInt(this.zzq);
        parcel.writeInt(this.zzr ? 1 : 0);
        parcel.writeInt(this.zzs);
        parcel.writeLong(this.zzt);
    }

    private static boolean zzF(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public final void zzD() {
        if (!zzG()) {
            this.zzt = this.zzu.zzb();
        }
    }

    public final void zzE() {
        if (zzG()) {
            this.zzs += (int) (this.zzu.zzb() - this.zzt);
            this.zzt = -1L;
        }
    }

    public zzoa(zzoh zzohVar, AutocompleteUiCustomization autocompleteUiCustomization, zzoc zzocVar, AutocompleteActivityMode autocompleteActivityMode, String str, AutocompleteSessionToken autocompleteSessionToken, zzdy zzdyVar) {
        this.zza = zzohVar;
        this.zzb = autocompleteUiCustomization;
        this.zzc = zzocVar;
        this.zzd = autocompleteActivityMode;
        if (autocompleteSessionToken == null) {
            this.zze = AutocompleteSessionToken.newInstance();
        } else {
            this.zze = autocompleteSessionToken;
        }
        AutocompleteSessionToken.newInstance();
        this.zzo = v.e(str);
        this.zzl = -1;
        this.zzt = -1L;
        this.zzu = zzdyVar;
    }
}
