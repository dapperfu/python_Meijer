package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class zzma {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public final int zzd() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzb;
    }

    public static zzma zze(int i10, String str, float f10, float f11) {
        return new zzlx(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzma zzf(int i10, String str, int i11, int i12) {
        return new zzlv(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzma zzg(int i10, String str, long j10, long j11) {
        return new zzlw(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzma zzh(int i10, String str) {
        zzly zzlyVar = new zzly(1, "gads:sdk_core_constants:experiment_id", null, null);
        zzls.zza().zza(zzlyVar);
        return zzlyVar;
    }

    /* synthetic */ zzma(int i10, String str, Object obj, Object obj2, zzlz zzlzVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        zzls.zza().zzb(this);
    }

    public final Object zzi() {
        if (zzls.zzc().zzd()) {
            return this.zzd;
        }
        return this.zzc;
    }
}
