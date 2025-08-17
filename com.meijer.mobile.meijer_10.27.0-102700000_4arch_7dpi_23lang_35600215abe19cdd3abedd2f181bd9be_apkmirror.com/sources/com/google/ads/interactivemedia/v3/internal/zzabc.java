package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzabc extends zzwj {
    zzabc() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            zzaceVar.zzg();
        } else {
            zzaceVar.zzi(r4.shortValue());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        try {
            int iZzb = zzaccVar.zzb();
            if (iZzb <= 65535 && iZzb >= -32768) {
                return Short.valueOf((short) iZzb);
            }
            throw new zzwe("Lossy conversion from " + iZzb + " to short; at path " + zzaccVar.zzf());
        } catch (NumberFormatException e10) {
            throw new zzwe(e10);
        }
    }
}
