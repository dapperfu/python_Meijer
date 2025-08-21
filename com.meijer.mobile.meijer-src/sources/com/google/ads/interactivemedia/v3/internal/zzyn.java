package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzyn extends zzwj {
    public static final zzwk zza = new zzym();
    private final Class zzb;
    private final zzwj zzc;

    public zzyn(zzvr zzvrVar, zzwj zzwjVar, Class cls) {
        this.zzc = new zzzw(zzvrVar, zzwjVar, cls);
        this.zzb = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            zzaceVar.zzg();
            return;
        }
        zzaceVar.zzb();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.zzc.write(zzaceVar, Array.get(obj, i10));
        }
        zzaceVar.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final Object read(zzacc zzaccVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzaccVar.zzi();
        while (zzaccVar.zzp()) {
            arrayList.add(this.zzc.read(zzaccVar));
        }
        zzaccVar.zzk();
        int size = arrayList.size();
        if (this.zzb.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) this.zzb, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(objNewInstance, i10, arrayList.get(i10));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.zzb, size));
    }
}
