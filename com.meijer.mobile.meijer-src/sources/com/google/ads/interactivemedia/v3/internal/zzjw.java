package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzjw extends zzkx {
    private static final zzky zzh = new zzky();
    private final Context zzi;

    public zzjw(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, Context context) {
        super(zzjjVar, "NJ8FetXo0KyOsBrkOEKFojsJK8HUQrgQf5Lc3FXu4MGl5bYhJ/tvrJgkMmXasbAM", "s/eU2URRuCeWH32bRw//Xeb2p1pW8UEiL/Xy3irJSyY=", zzanVar, i10, 29);
        this.zzi = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzn("E");
        AtomicReference atomicReferenceZza = zzh.zza(this.zzi.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.zze.invoke(null, this.zzi));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        synchronized (this.zzd) {
            this.zzd.zzn(zzgl.zza(str.getBytes(), true));
        }
    }
}
