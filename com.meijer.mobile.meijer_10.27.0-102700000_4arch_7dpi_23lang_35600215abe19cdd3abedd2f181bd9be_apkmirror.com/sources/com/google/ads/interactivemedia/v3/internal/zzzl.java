package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzzl<T, A> extends zzwj<T> {
    private final zzzo zza;

    zzzl(zzzo zzzoVar) {
        this.zza = zzzoVar;
    }

    abstract Object zza();

    abstract Object zzb(Object obj);

    abstract void zzc(Object obj, zzacc zzaccVar, zzzm zzzmVar) throws IllegalAccessException, IOException;

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, T t10) throws IOException {
        if (t10 == null) {
            zzaceVar.zzg();
            return;
        }
        zzaceVar.zzc();
        try {
            Iterator it = this.zza.zzc.iterator();
            while (it.hasNext()) {
                ((zzzm) it.next()).zzc(zzaceVar, t10);
            }
            zzaceVar.zze();
        } catch (IllegalAccessException e10) {
            throw zzabp.zzb(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final T read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        Object objZza = zza();
        Map map = this.zza.zzb;
        try {
            zzaccVar.zzj();
            while (zzaccVar.zzp()) {
                zzzm zzzmVar = (zzzm) map.get(zzaccVar.zzg());
                if (zzzmVar == null) {
                    zzaccVar.zzo();
                } else {
                    zzc(objZza, zzaccVar, zzzmVar);
                }
            }
            zzaccVar.zzl();
            return (T) zzb(objZza);
        } catch (IllegalAccessException e10) {
            throw zzabp.zzb(e10);
        } catch (IllegalStateException e11) {
            throw new zzwe(e11);
        }
    }
}
