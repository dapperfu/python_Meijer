package com.google.ads.interactivemedia.v3.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzjv extends zzkx {
    public zzjv(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "IxJDzw7riPGIi+6mP3gv4cSOSWfR5YtNTbyqZn2Ht5HKdNQC0tKhOeKDSDHSp4KX", "z9spx3v9+kPNu6he2ixuUPrYedAM+Y/M/eZi1fM7bqI=", zzanVar, i10, 49);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzan zzanVar = this.zzd;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzanVar.zzaa(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
