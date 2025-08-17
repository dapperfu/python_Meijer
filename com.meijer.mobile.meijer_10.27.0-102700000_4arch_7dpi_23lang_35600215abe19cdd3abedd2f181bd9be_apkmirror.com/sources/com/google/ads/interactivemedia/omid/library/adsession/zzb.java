package com.google.ads.interactivemedia.omid.library.adsession;

import com.google.ads.interactivemedia.v3.internal.zzdl;
import com.google.ads.interactivemedia.v3.internal.zzdp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzb {
    private final zzi zza;
    private final zzi zzb;
    private final zzf zzc;
    private final zzh zzd;

    public static zzb zza(zzf zzfVar, zzh zzhVar, zzi zziVar, zzi zziVar2, boolean z10) {
        zzdp.zzb(zzfVar, "CreativeType is null");
        zzdp.zzb(zzhVar, "ImpressionType is null");
        zzdp.zzb(zziVar, "Impression owner is null");
        if (zziVar == zzi.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfVar == zzf.DEFINED_BY_JAVASCRIPT && zziVar == zzi.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzhVar == zzh.DEFINED_BY_JAVASCRIPT && zziVar == zzi.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzb(zzfVar, zzhVar, zziVar, zziVar2, true);
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzdl.zze(jSONObject, "impressionOwner", this.zza);
        zzdl.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzdl.zze(jSONObject, "creativeType", this.zzc);
        zzdl.zze(jSONObject, "impressionType", this.zzd);
        zzdl.zze(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }

    private zzb(zzf zzfVar, zzh zzhVar, zzi zziVar, zzi zziVar2, boolean z10) {
        this.zzc = zzfVar;
        this.zzd = zzhVar;
        this.zza = zziVar;
        if (zziVar2 == null) {
            this.zzb = zzi.NONE;
        } else {
            this.zzb = zziVar2;
        }
    }
}
