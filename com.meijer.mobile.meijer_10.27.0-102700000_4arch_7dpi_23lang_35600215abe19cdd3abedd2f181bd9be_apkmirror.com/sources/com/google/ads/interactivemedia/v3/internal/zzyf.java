package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzyf {
    public static boolean zza(AccessibleObject accessibleObject, Object obj) {
        return zzye.zzb.zza(accessibleObject, obj);
    }

    public static int zzb(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iZza = ((zzwf) it.next()).zza();
            if (iZza != 2) {
                return iZza;
            }
        }
        return 1;
    }
}
