package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
final class zzaad extends zzwj {
    zzaad() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzk((BigDecimal) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        try {
            return zzxz.zza(strZzh);
        } catch (NumberFormatException e10) {
            throw new zzwe("Failed parsing '" + strZzh + "' as BigDecimal; at path " + zzaccVar.zzf(), e10);
        }
    }
}
