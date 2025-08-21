package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaaf extends zzwj {
    zzaaf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzk((zzxq) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        return new zzxq(zzaccVar.zzh());
    }
}
