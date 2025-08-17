package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class zzbpk {
    private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean zzc(Object... objArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza.contains(objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    protected abstract void zzd();

    protected abstract void zze();

    public final void zza(Object obj, boolean z10) {
        Set set = this.zza;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                zzd();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zze();
        }
    }

    public final boolean zzb() {
        return !this.zza.isEmpty();
    }
}
