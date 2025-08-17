package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaab extends zzwj {
    zzaab() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Character ch2 = (Character) obj;
        zzaceVar.zzl(ch2 == null ? null : ch2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        if (strZzh.length() == 1) {
            return Character.valueOf(strZzh.charAt(0));
        }
        throw new zzwe("Expecting character, got: " + strZzh + "; at " + zzaccVar.zzf());
    }
}
