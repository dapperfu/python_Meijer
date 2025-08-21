package com.google.ads.interactivemedia.v3.internal;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgp implements PackageManager$OnChecksumsReadyListener {
    final zzvd zza = zzvd.zzs();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = a.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    zzvd zzvdVar = this.zza;
                    zzsz zzszVarZzf = zzsz.zzi().zzf();
                    byte[] value = apkChecksumA.getValue();
                    zzvdVar.zzc(zzszVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
