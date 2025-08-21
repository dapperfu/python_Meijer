package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzabb extends zzwj {
    zzabb() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            zzaceVar.zzg();
        } else {
            zzaceVar.zzi(r4.byteValue());
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
            if (iZzb <= 255 && iZzb >= -128) {
                return Byte.valueOf((byte) iZzb);
            }
            throw new zzwe("Lossy conversion from " + iZzb + " to byte; at path " + zzaccVar.zzf());
        } catch (NumberFormatException e10) {
            throw new zzwe(e10);
        }
    }
}
