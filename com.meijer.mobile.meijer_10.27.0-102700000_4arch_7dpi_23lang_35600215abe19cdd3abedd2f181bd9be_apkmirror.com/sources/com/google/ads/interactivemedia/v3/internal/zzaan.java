package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Currency;

/* loaded from: classes4.dex */
final class zzaan extends zzwj {
    zzaan() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzl(((Currency) obj).getCurrencyCode());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        String strZzh = zzaccVar.zzh();
        try {
            return Currency.getInstance(strZzh);
        } catch (IllegalArgumentException e10) {
            throw new zzwe("Failed parsing '" + strZzh + "' as Currency; at path " + zzaccVar.zzf(), e10);
        }
    }
}
