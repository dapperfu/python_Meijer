package com.google.android.libraries.places.internal;

import Be.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbie {
    private static final Logger zza = Logger.getLogger(zzbie.class.getName());
    private static zzbie zzb;
    private static final Iterable zzc;
    private final LinkedHashSet zzd = new LinkedHashSet();
    private final LinkedHashMap zze = new LinkedHashMap();

    private final synchronized void zzc(zzbic zzbicVar) {
        zzbicVar.zzb();
        p.e(true, "isAvailable() returned false");
        this.zzd.add(zzbicVar);
    }

    private final synchronized void zzd() {
        try {
            LinkedHashMap linkedHashMap = this.zze;
            linkedHashMap.clear();
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                zzbic zzbicVar = (zzbic) it.next();
                String strZzd = zzbicVar.zzd();
                if (((zzbic) linkedHashMap.get(strZzd)) != null) {
                    zzbicVar.zzc();
                } else {
                    linkedHashMap.put(strZzd, zzbicVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzbic zzb(String str) {
        return (zzbic) this.zze.get(p.r(str, "policy"));
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = zzbtp.zzb;
            arrayList.add(zzbtp.class);
        } catch (ClassNotFoundException e10) {
            zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i11 = zzcax.f86166a;
            arrayList.add(zzcax.class);
        } catch (ClassNotFoundException e11) {
            zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        zzc = Collections.unmodifiableList(arrayList);
    }

    public static synchronized zzbie zza() {
        try {
            if (zzb == null) {
                List<zzbic> listZza = zzbjr.zza(zzbic.class, zzc, zzbic.class.getClassLoader(), new zzbid());
                zzb = new zzbie();
                for (zzbic zzbicVar : listZza) {
                    zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzbicVar)));
                    zzb.zzc(zzbicVar);
                }
                zzb.zzd();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb;
    }
}
