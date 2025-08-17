package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.UUID;

/* loaded from: classes4.dex */
final class zzaam extends zzwj {
    zzaam() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        zzaceVar.zzl(uuid == null ? null : uuid.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        try {
            return UUID.fromString(strZzh);
        } catch (IllegalArgumentException e10) {
            throw new zzwe("Failed parsing '" + strZzh + "' as UUID; at path " + zzaccVar.zzf(), e10);
        }
    }
}
