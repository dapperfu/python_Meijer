package com.google.android.libraries.places.internal;

import De.g;
import android.content.Context;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.u;
import j$.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
final class zzjf {
    final zzbif zza;
    final ScheduledExecutorService zzb = Executors.newSingleThreadScheduledExecutor();
    int zzc = 0;
    Long zzd;
    zzbck zze;
    String zzf;
    private final Context zzg;
    private final zzbdg zzh;

    public final q zza() {
        zzbck zzbckVar = this.zze;
        if (zzbckVar == null || zzbckVar.zzc() < Instant.now().getEpochSecond()) {
            return k.d(zzb(), new g() { // from class: com.google.android.libraries.places.internal.zzje
                @Override // De.g
                public final /* synthetic */ Object apply(Object obj) {
                    String str = this.zza.zzf;
                    if (str != null) {
                        return str;
                    }
                    throw new IllegalStateException("Signature not generated.");
                }
            }, u.a());
        }
        String str = this.zzf;
        if (str != null) {
            return k.c(str);
        }
        throw new IllegalStateException("Signature not generated.");
    }

    public final q zzb() {
        this.zzc++;
        Context context = this.zzg;
        zzbdi zzbdiVarZzc = zzbdj.zzc();
        zzbdiVarZzc.zza(context.getPackageName());
        zzbdj zzbdjVar = (zzbdj) zzbdiVarZzc.zzG();
        zzbdg zzbdgVar = this.zzh;
        q qVarZzb = zzcaj.zzb(zzbdgVar.zzc().zza(zzbdh.zza(), zzbdgVar.zzd()), zzbdjVar);
        k.a(qVarZzb, new zzjc(this), u.a());
        return qVarZzb;
    }

    final String zzc(long j10) {
        String packageName = this.zzg.getPackageName();
        int length = packageName.length() + 1;
        long[] jArr = new long[length];
        jArr[0] = j10;
        int i10 = 0;
        while (i10 < packageName.length()) {
            int i11 = i10 + 1;
            jArr[i11] = packageName.codePointAt(i10) & 4294967295L;
            i10 = i11;
        }
        long j11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            j11 = ((j11 * 1729) + jArr[i12]) % 131071;
        }
        String strValueOf = String.valueOf(j11);
        this.zzf = strValueOf;
        return strValueOf;
    }

    zzjf(Context context, zzbif zzbifVar) {
        this.zzg = context;
        this.zza = zzbifVar;
        this.zzh = zzbdh.zzc(zzbifVar);
    }
}
