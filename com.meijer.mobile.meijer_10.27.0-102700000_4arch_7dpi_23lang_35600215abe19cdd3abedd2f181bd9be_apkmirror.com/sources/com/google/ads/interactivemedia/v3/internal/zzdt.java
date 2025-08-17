package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdt {
    private JSONObject zza;
    private final zzec zzb;

    public zzdt(zzec zzecVar) {
        this.zzb = zzecVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final void zzb() {
        this.zzb.zzb(new zzed(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzee(this, hashSet, jSONObject, j10));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzef(this, hashSet, jSONObject, j10));
    }
}
