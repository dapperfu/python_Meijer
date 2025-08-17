package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
final class zzabe extends zzwj {
    zzabe() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        try {
            return new AtomicInteger(zzaccVar.zzb());
        } catch (NumberFormatException e10) {
            throw new zzwe(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzi(((AtomicInteger) obj).get());
    }
}
