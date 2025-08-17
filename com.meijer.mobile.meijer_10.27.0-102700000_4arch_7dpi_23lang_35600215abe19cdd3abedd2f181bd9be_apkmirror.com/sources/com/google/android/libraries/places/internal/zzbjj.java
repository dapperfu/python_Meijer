package com.google.android.libraries.places.internal;

import Be.p;
import Ce.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbjj {
    private static final Logger zza = Logger.getLogger(zzbjj.class.getName());
    private static zzbjj zzb;
    private String zzc;
    private final LinkedHashSet zzd;
    private M zze;

    private final synchronized void zze(zzbjg zzbjgVar) {
        zzbjgVar.zzc();
        p.e(true, "isAvailable() returned false");
        this.zzd.add(zzbjgVar);
    }

    private final synchronized void zzf() {
        try {
            HashMap map = new HashMap();
            Iterator it = this.zzd.iterator();
            String strZzb = com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE;
            char c10 = 0;
            while (it.hasNext()) {
                zzbjg zzbjgVar = (zzbjg) it.next();
                String strZzb2 = zzbjgVar.zzb();
                if (((zzbjg) map.get(strZzb2)) != null) {
                    zzbjgVar.zzd();
                } else {
                    map.put(strZzb2, zzbjgVar);
                }
                zzbjgVar.zzd();
                if (c10 < 5) {
                    zzbjgVar.zzd();
                    strZzb = zzbjgVar.zzb();
                }
                c10 = 5;
            }
            this.zze = M.d(map);
            this.zzc = strZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String zza() {
        return this.zzc;
    }

    final synchronized Map zzd() {
        return this.zze;
    }

    public static synchronized zzbjj zzc() {
        if (zzb == null) {
            ArrayList arrayList = new ArrayList();
            try {
                int i10 = zzbol.f86165a;
                arrayList.add(zzbol.class);
            } catch (ClassNotFoundException e10) {
                zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e10);
            }
            List<zzbjg> listZza = zzbjr.zza(zzbjg.class, Collections.unmodifiableList(arrayList), zzbjg.class.getClassLoader(), new zzbji(null));
            if (listZza.isEmpty()) {
                zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            zzb = new zzbjj();
            for (zzbjg zzbjgVar : listZza) {
                zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzbjgVar)));
                zzb.zze(zzbjgVar);
            }
            zzb.zzf();
        }
        return zzb;
    }

    public final zzbjg zzb(String str) {
        if (str == null) {
            return null;
        }
        return (zzbjg) zzd().get(str.toLowerCase(Locale.US));
    }

    public zzbjj() {
        new zzbjh(this, null);
        this.zzc = com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE;
        this.zzd = new LinkedHashSet();
        this.zze = M.n();
    }
}
