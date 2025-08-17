package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class zzyb extends zzye {
    final /* synthetic */ Method zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyb(Method method) {
        super(null);
        this.zza = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzye
    public final boolean zza(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.zza.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
