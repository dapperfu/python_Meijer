package com.google.android.libraries.places.internal;

import De.p;
import Ee.L;
import Ee.U;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class zzqi {
    private static final WeakHashMap zza = new WeakHashMap();
    private static final WeakHashMap zzb = new WeakHashMap();

    public static void zza(Throwable th2) {
        Throwable cause;
        zzrk zzrkVar;
        zzra zzraVar;
        WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            cause = th2;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th2, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        p.x(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap2 = zza;
        synchronized (weakHashMap2) {
            Throwable cause2 = th2;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } finally {
                }
            }
            if (cause2 == null) {
                zzrkVar = null;
            } else {
                zzre zzreVar = (zzre) weakHashMap2.get(cause2);
                weakHashMap2.put(th2, zzreVar);
                zzrkVar = new zzrk(cause2, zzreVar);
            }
        }
        if (zzrkVar != null || (zzraVar = zzqj.zzd().zzb) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzraVar = zzqj.zzd().zzb; zzraVar != null; zzraVar = null) {
            arrayList.add(zzraVar);
        }
        zzqd zzqdVar = new zzqd();
        zzqdVar.zzc(((zzra) arrayList.get(0)).zzc());
        ((zzra) arrayList.get(0)).zzi();
        zzqdVar.zzd(-1L);
        L.a aVarQ = L.q(arrayList.size());
        L.a aVarQ2 = L.q(arrayList.size());
        for (zzra zzraVar2 : U.k(arrayList)) {
            aVarQ2.a(zzraVar2.zze());
            aVarQ.a(zzraVar2.zzg());
        }
        synchronized (weakHashMap2) {
            zzqdVar.zza(aVarQ2.k());
            zzqdVar.zzb(aVarQ.k());
            weakHashMap2.put(th2, zzqdVar.zze());
        }
    }
}
