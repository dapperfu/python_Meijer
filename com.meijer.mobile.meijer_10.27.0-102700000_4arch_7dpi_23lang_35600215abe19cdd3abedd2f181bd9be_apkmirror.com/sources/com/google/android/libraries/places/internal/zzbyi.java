package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbyi {
    private zzbyi() {
    }

    static {
        Logger.getLogger(zzbyi.class.getName());
    }

    public static zzbip zza(List list) {
        return zzbhh.zzb(zzc(list));
    }

    public static zzbip zzb(List list) {
        return zzbhh.zzb(zzc(list));
    }

    private static byte[][] zzc(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zzbzd zzbzdVar = (zzbzd) it.next();
            bArr[i10] = zzbzdVar.zzf.zzk();
            bArr[i10 + 1] = zzbzdVar.zzg.zzk();
            i10 += 2;
        }
        return zzbwl.zzb(bArr);
    }
}
