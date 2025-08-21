package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzzf extends zzwj {
    private static final zzwk zza = zzb(2);
    private final int zzb;

    private zzzf(int i10) {
        this.zzb = i10;
    }

    public static zzwk zza(int i10) {
        return i10 == 2 ? zza : zzb(i10);
    }

    private static zzwk zzb(int i10) {
        return new zzze(new zzzf(i10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        zzaceVar.zzk((Number) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        int iZzr = zzaccVar.zzr();
        int i10 = iZzr - 1;
        if (i10 != 5 && i10 != 6) {
            if (i10 == 8) {
                zzaccVar.zzm();
                return null;
            }
            throw new zzwe("Expecting number, got: " + zzacd.zza(iZzr) + "; at path " + zzaccVar.zze());
        }
        return zzwh.zza(this.zzb, zzaccVar);
    }
}
