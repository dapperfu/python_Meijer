package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkr extends zzkx {
    private final zzjq zzh;
    private long zzi;

    public zzkr(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, zzjq zzjqVar) {
        super(zzjjVar, "S2bj7XqeiGNcYHcKeeGhBD7AjwenAND57ZasB9YyvkNKuXmMxi2URXZo9xEY1HWC", "FYnfwG63I09Vg7QzBJMFCV+7n/vqGsbswosvmgiipjk=", zzanVar, i10, 53);
        this.zzh = zzjqVar;
        if (zzjqVar != null) {
            this.zzi = zzjqVar.zza();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
