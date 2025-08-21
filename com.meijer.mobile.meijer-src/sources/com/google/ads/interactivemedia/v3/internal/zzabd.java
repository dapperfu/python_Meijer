package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzabd extends zzwj {
    zzabd() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            zzaceVar.zzg();
        } else {
            zzaceVar.zzi(r4.intValue());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        try {
            return Integer.valueOf(zzaccVar.zzb());
        } catch (NumberFormatException e10) {
            throw new zzwe(e10);
        }
    }
}
