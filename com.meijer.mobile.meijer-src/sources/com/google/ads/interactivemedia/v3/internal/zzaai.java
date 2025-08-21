package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaai extends zzwj {
    zzaai() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        zzaceVar.zzl(stringBuffer == null ? null : stringBuffer.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        return new StringBuffer(zzaccVar.zzh());
    }
}
