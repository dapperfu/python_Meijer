package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes4.dex */
abstract class zzye {
    public static final zzye zzb;

    /* synthetic */ zzye(zzyd zzydVar) {
    }

    public abstract boolean zza(AccessibleObject accessibleObject, Object obj);

    static {
        zzye zzybVar = null;
        if (zzxo.zza()) {
            try {
                zzybVar = new zzyb(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzybVar == null) {
            zzybVar = new zzyc();
        }
        zzb = zzybVar;
    }
}
