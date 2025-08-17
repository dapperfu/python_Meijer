package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzyo extends zzwj {
    private final zzwj zza;
    private final zzya zzb;

    public zzyo(zzvr zzvrVar, Type type, zzwj zzwjVar, zzya zzyaVar) {
        this.zza = new zzzw(zzvrVar, zzwjVar, type);
        this.zzb = zzyaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            zzaceVar.zzg();
            return;
        }
        zzaceVar.zzb();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.zza.write(zzaceVar, it.next());
        }
        zzaceVar.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        Collection collection = (Collection) this.zzb.zza();
        zzaccVar.zzi();
        while (zzaccVar.zzp()) {
            collection.add(this.zza.read(zzaccVar));
        }
        zzaccVar.zzk();
        return collection;
    }
}
