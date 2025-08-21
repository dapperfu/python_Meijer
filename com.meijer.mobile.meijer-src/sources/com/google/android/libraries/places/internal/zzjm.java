package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.f;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.u;
import j$.time.Instant;

/* loaded from: classes6.dex */
final class zzjm {
    String zza;
    Long zzb;
    zzbdd zzc;
    private final Context zzd;
    private final zzjf zze;
    private final zzbdg zzf;
    private final zzir zzg;
    private boolean zzh = false;
    private final zzmf zzi;

    public final void zzc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    final /* synthetic */ void zzf(boolean z10) {
        this.zzh = false;
    }

    public final q zza(final zzbdd zzbddVar) {
        if (zzbddVar == zzbdd.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Autocomplete widget should call getOrRefreshToken()");
        }
        if (this.zza != null && zze()) {
            throw new IllegalStateException("Token is expired");
        }
        zzbdd zzbddVar2 = this.zzc;
        if (zzbddVar2 != null && zzbddVar2 != zzbddVar) {
            throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", zzbddVar2.name(), zzbddVar.name()));
        }
        String str = this.zza;
        return str != null ? k.c(str) : f.a(this.zze.zza()).c(new d() { // from class: com.google.android.libraries.places.internal.zzjl
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ q apply(Object obj) {
                return this.zza.zzd((String) obj, zzbddVar);
            }
        }, u.a()).b(zzjj.zza, u.a());
    }

    public final q zzb(final zzbdd zzbddVar) {
        String str;
        if (zzbddVar != zzbdd.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Only Autocomplete widget should call getOrRefreshToken()");
        }
        zzbdd zzbddVar2 = this.zzc;
        if (zzbddVar2 == null || zzbddVar2 == zzbddVar) {
            return (zze() || (str = this.zza) == null) ? f.a(this.zze.zza()).c(new d() { // from class: com.google.android.libraries.places.internal.zzjk
                @Override // com.google.common.util.concurrent.d
                public final /* synthetic */ q apply(Object obj) {
                    return this.zza.zzd((String) obj, zzbddVar);
                }
            }, u.a()).b(zzji.zza, u.a()) : k.c(str);
        }
        throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", zzbddVar2.name(), zzbddVar.name()));
    }

    final q zzd(String str, zzbdd zzbddVar) {
        if (this.zzh) {
            throw new IllegalStateException("Too many concurrent requests");
        }
        this.zzh = true;
        zzbdc zzbdcVarZzc = zzbde.zzc();
        zzbdcVarZzc.zza(zzbddVar);
        zzbdcVarZzc.zzb(str);
        zzbdcVarZzc.zzc(this.zzd.getPackageName());
        zzbdcVarZzc.zzd(4);
        zzbde zzbdeVar = (zzbde) zzbdcVarZzc.zzG();
        zzbdg zzbdgVar = (zzbdg) this.zzf.zze(zzcam.zza(this.zzg.zza(this.zzi.zzf(), "")));
        q qVarZzb = zzcaj.zzb(zzbdgVar.zzc().zza(zzbdh.zzb(), zzbdgVar.zzd()), zzbdeVar);
        k.a(qVarZzb, new zzjh(this, zzbddVar), u.a());
        return qVarZzb;
    }

    final boolean zze() {
        Long l10 = this.zzb;
        if (l10 == null) {
            return true;
        }
        return Instant.ofEpochSecond(l10.longValue()).isBefore(Instant.now());
    }

    zzjm(Context context, zzbif zzbifVar, zzmf zzmfVar, zzir zzirVar, zzjf zzjfVar) {
        this.zzd = context;
        this.zzf = zzbdh.zzc(zzbifVar);
        this.zzg = zzirVar;
        this.zzi = zzmfVar;
        this.zze = zzjfVar;
    }
}
