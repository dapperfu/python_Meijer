package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes4.dex */
final class zzaae extends zzwj {
    zzaae() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzk((BigInteger) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        try {
            return zzxz.zzb(strZzh);
        } catch (NumberFormatException e10) {
            throw new zzwe("Failed parsing '" + strZzh + "' as BigInteger; at path " + zzaccVar.zzf(), e10);
        }
    }
}
