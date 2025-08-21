package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class zzst {
    private static final zzsp zza = new zzsr();
    private static final zzso zzb = new zzss();

    public static zzsm zza(Set set) {
        zzsm zzsmVar = new zzsm(zza, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzsmVar.zza((zzsd) it.next());
        }
        return zzsmVar;
    }
}
