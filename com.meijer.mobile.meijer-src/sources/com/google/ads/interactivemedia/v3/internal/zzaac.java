package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaac extends zzwj {
    zzaac() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzl((String) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        int iZzr = zzaccVar.zzr();
        if (iZzr == 9) {
            zzaccVar.zzm();
            return null;
        }
        if (iZzr == 8) {
            return Boolean.toString(zzaccVar.zzq());
        }
        return zzaccVar.zzh();
    }
}
