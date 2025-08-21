package com.google.android.libraries.places.widget.internal.placedetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzait;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzajc;
import com.google.android.libraries.places.internal.zzbae;
import com.google.android.libraries.places.internal.zzoz;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzo();
    private final zzajb zza;
    private final zzaiz zzb;
    private final List zzc;
    private zzoz zzd;

    public zzp(zzajb variant, zzaiz orientation, List content) {
        Intrinsics.j(variant, "variant");
        Intrinsics.j(orientation, "orientation");
        Intrinsics.j(content, "content");
        this.zza = variant;
        this.zzb = orientation;
        this.zzc = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.zza.name());
        dest.writeString(this.zzb.name());
        List list = this.zzc;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((zzaiw) it.next()).name());
        }
    }

    public final void zza(zzoz zzozVar) {
        this.zzd = zzozVar;
    }

    public final void zzb() {
        zzl(2);
    }

    public final void zzc() {
        zzl(3);
    }

    public final void zzd() {
        zzl(4);
    }

    public final void zze() {
        zzl(5);
    }

    public final void zzf() {
        zzl(7);
    }

    public final void zzg() {
        zzm(2);
    }

    public final void zzh() {
        zzm(3);
    }

    public final void zzi() {
        zzm(4);
    }

    public final void zzk() {
        zzm(6);
    }

    private final void zzl(int i10) {
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zze(i10);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.i(zzbaeVarZzG, "build(...)");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            zzozVar.zzb(zzajcVar);
        }
    }

    private final void zzm(int i10) {
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zzf(i10);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.i(zzbaeVarZzG, "build(...)");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            zzozVar.zzb(zzajcVar);
        }
    }

    public final void zzj(int i10) {
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zzf(5);
        zzaitVarZza.zzd(i10);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.i(zzbaeVarZzG, "build(...)");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            zzozVar.zzb(zzajcVar);
        }
    }
}
