package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
final class zzvo extends zzwj {
    final /* synthetic */ zzwj zza;

    zzvo(zzwj zzwjVar) {
        this.zza = zzwjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        return new AtomicLong(((Number) this.zza.read(zzaccVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        this.zza.write(zzaceVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
