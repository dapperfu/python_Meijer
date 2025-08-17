package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5225c;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zznt {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final AbstractC5232j zzd;
    private final boolean zze;

    static void zzg(int i10) {
        zzf = i10;
    }

    public final AbstractC5232j zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final AbstractC5232j zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final AbstractC5232j zzd(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public final AbstractC5232j zze(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }

    public final AbstractC5232j zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }

    public static zznt zza(final Context context, Executor executor, boolean z10) {
        final C5233k c5233k = new C5233k();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zznr
                @Override // java.lang.Runnable
                public final void run() {
                    c5233k.c(zzpj.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzns
                @Override // java.lang.Runnable
                public final void run() {
                    c5233k.c(zzpj.zzc());
                }
            });
        }
        return new zznt(context, executor, c5233k.a(), z10);
    }

    private final AbstractC5232j zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.j(this.zzc, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zznp
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return Boolean.valueOf(abstractC5232j.r());
                }
            });
        }
        Context context = this.zzb;
        final zzq zzqVarZza = zzv.zza();
        zzqVarZza.zza(context.getPackageName());
        zzqVarZza.zze(j10);
        zzqVarZza.zzg(zzf);
        if (exc != null) {
            zzqVarZza.zzf(zzqo.zza(exc));
            zzqVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzqVarZza.zzb(str2);
        }
        if (str != null) {
            zzqVarZza.zzc(str);
        }
        return this.zzd.j(this.zzc, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.v3.internal.zznq
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                int i11 = zznt.zza;
                if (!abstractC5232j.r()) {
                    return Boolean.FALSE;
                }
                int i12 = i10;
                zzpi zzpiVarZza = ((zzpj) abstractC5232j.n()).zza(((zzv) zzqVarZza.zzal()).zzav());
                zzpiVarZza.zza(i12);
                zzpiVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public zznt(Context context, Executor executor, AbstractC5232j abstractC5232j, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = abstractC5232j;
        this.zze = z10;
    }
}
