package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzki extends zzkx {
    private final zzim zzh;
    private final long zzi;
    private final long zzj;

    public zzki(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, zzim zzimVar, long j10, long j11) {
        super(zzjjVar, "K0xZIBPInE6j6xPLxhKGMY561g1nMY757L1d/vVVfLAbZ7cYe/kji+8cDrSya44i", "LymMUKNT3cAvWIhxX52CTQ3uE86eU+14G9dqvWvUzWk=", zzanVar, i10, 11);
        this.zzh = zzimVar;
        this.zzi = j10;
        this.zzj = j11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzim zzimVar = this.zzh;
        if (zzimVar != null) {
            zzik zzikVar = new zzik((String) this.zze.invoke(null, zzimVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzz(zzikVar.zza.longValue());
                    if (zzikVar.zzb.longValue() >= 0) {
                        this.zzd.zzQ(zzikVar.zzb.longValue());
                    }
                    if (zzikVar.zzc.longValue() >= 0) {
                        this.zzd.zzf(zzikVar.zzc.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
