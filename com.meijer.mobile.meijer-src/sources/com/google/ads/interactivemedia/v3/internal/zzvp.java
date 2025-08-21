package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes4.dex */
final class zzvp extends zzwj {
    final /* synthetic */ zzwj zza;

    zzvp(zzwj zzwjVar) {
        this.zza = zzwjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        zzaccVar.zzi();
        while (zzaccVar.zzp()) {
            arrayList.add(Long.valueOf(((Number) this.zza.read(zzaccVar)).longValue()));
        }
        zzaccVar.zzk();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        zzaceVar.zzb();
        int length = atomicLongArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.zza.write(zzaceVar, Long.valueOf(atomicLongArray.get(i10)));
        }
        zzaceVar.zzd();
    }
}
