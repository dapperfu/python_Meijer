package com.google.android.libraries.places.internal;

import Be.t;
import android.util.Base64;
import com.google.common.util.concurrent.j;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class zzjh implements j {
    final /* synthetic */ zzbdd zza;
    final /* synthetic */ zzjm zzb;

    zzjh(zzjm zzjmVar, zzbdd zzbddVar) {
        this.zza = zzbddVar;
        Objects.requireNonNull(zzjmVar);
        this.zzb = zzjmVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        zzjm zzjmVar = this.zzb;
        zzjmVar.zzf(false);
        zzjmVar.zza = null;
        zzjmVar.zzb = null;
        zzjmVar.zzc = this.zza;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzjm zzjmVar = this.zzb;
        zzjmVar.zzf(false);
        String strZzc = ((zzbdn) obj).zzc();
        zzbdd zzbddVar = this.zza;
        try {
            zzjmVar.zza = strZzc;
            List<String> listH = t.e('.').h(strZzc);
            if (listH.size() < 2) {
                throw new IllegalStateException("Invalid JWT format");
            }
            zzjmVar.zzb = Long.valueOf(Long.parseLong(new JSONObject(new String(Base64.decode(listH.get(1), 8), StandardCharsets.UTF_8)).get("exp").toString()));
            zzjmVar.zzc = zzbddVar;
        } catch (Exception e10) {
            throw new IllegalStateException("Couldn't decode JWT payload", e10);
        }
    }
}
