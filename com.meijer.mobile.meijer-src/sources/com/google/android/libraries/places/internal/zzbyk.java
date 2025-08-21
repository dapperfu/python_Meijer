package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbyk {
    private String[] zza;
    private String[] zzb;
    private boolean zzc;

    public zzbyk(boolean z10) {
    }

    public final zzbyk zza(zzbyj... zzbyjVarArr) {
        String[] strArr = new String[zzbyjVarArr.length];
        for (int i10 = 0; i10 < zzbyjVarArr.length; i10++) {
            strArr[i10] = zzbyjVarArr[i10].zzbb;
        }
        this.zza = strArr;
        return this;
    }

    public final zzbyk zzc(zzbyx... zzbyxVarArr) {
        String[] strArr = new String[zzbyxVarArr.length];
        for (int i10 = 0; i10 < zzbyxVarArr.length; i10++) {
            strArr[i10] = zzbyxVarArr[i10].zzf;
        }
        this.zzb = strArr;
        return this;
    }

    public final zzbyk zze(boolean z10) {
        this.zzc = true;
        return this;
    }

    final /* synthetic */ String[] zzg() {
        return this.zza;
    }

    final /* synthetic */ String[] zzh() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzc;
    }

    public zzbyk(zzbyl zzbylVar) {
        boolean z10 = zzbylVar.zzb;
        this.zza = zzbylVar.zzc();
        this.zzb = zzbylVar.zzd();
        this.zzc = zzbylVar.zzc;
    }

    public final zzbyk zzb(String... strArr) {
        this.zza = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final zzbyk zzd(String... strArr) {
        this.zzb = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final zzbyl zzf() {
        return new zzbyl(this, null);
    }
}
