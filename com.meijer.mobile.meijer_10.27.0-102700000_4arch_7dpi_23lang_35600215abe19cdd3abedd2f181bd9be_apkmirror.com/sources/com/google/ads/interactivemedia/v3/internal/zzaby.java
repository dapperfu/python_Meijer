package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes4.dex */
final class zzaby extends zzwj {
    static final zzwk zza = new zzabw();
    private final zzwj zzb;

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        Date date = (Date) this.zzb.read(zzaccVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        this.zzb.write(zzaceVar, (Timestamp) obj);
    }
}
