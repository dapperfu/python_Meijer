package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaaz extends zzwj {
    zzaaz() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzj((Boolean) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        int iZzr = zzaccVar.zzr();
        if (iZzr == 9) {
            zzaccVar.zzm();
            return null;
        }
        if (iZzr == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(zzaccVar.zzh()));
        }
        return Boolean.valueOf(zzaccVar.zzq());
    }
}
