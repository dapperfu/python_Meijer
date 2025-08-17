package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzfj {
    private final zzaha zzb;
    private final int zzc;
    private zzahj zze;
    private final Map zza = new LinkedHashMap();
    private int zzd = 0;

    public final zzahj zzb() {
        return this.zze;
    }

    public final void zzf(zzahj zzahjVar) {
        this.zze = zzahjVar;
    }

    public final zzqf zza(String str) {
        if (!this.zza.containsKey(str)) {
            return zzqf.zzf();
        }
        zzahj zzahjVar = ((zzfi) this.zza.get(str)).zza;
        int i10 = this.zzc;
        zzahd zzahdVarZzc = zzahe.zzc();
        zzahdVarZzc.zza(i10);
        zzahdVarZzc.zzd(((zzfi) this.zza.get(str)).zzb);
        zzahdVarZzc.zzb(this.zzb);
        zzahjVar.zzaj((zzahk) this.zze.zzal());
        zzahdVarZzc.zzc(zzahjVar);
        return zzqf.zzh((zzahe) zzahdVarZzc.zzal());
    }

    public final zzahj zzc(String str) {
        if (!this.zza.containsKey(str)) {
            Map map = this.zza;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            map.put(str, new zzfi(i10));
        }
        return ((zzfi) this.zza.get(str)).zza;
    }

    public final void zzd() {
        this.zza.clear();
        this.zzd = 0;
    }

    public final void zze(String str) {
        this.zza.remove(str);
    }

    public zzfj(int i10) {
        this.zzc = i10;
        zzaha zzahaVarZzc = zzahb.zzc();
        zzahaVarZzc.zzc(Build.MODEL);
        zzahaVarZzc.zzb(Build.MANUFACTURER);
        zzahaVarZzc.zza(Build.VERSION.RELEASE);
        this.zzb = zzahaVarZzc;
        this.zze = zzahk.zzd();
    }
}
