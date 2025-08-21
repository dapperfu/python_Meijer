package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes4.dex */
final class zzzx extends zzwj {
    zzzx() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        zzaccVar.zzi();
        while (zzaccVar.zzp()) {
            try {
                arrayList.add(Integer.valueOf(zzaccVar.zzb()));
            } catch (NumberFormatException e10) {
                throw new zzwe(e10);
            }
        }
        zzaccVar.zzk();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzb();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            zzaceVar.zzi(r6.get(i10));
        }
        zzaceVar.zzd();
    }
}
