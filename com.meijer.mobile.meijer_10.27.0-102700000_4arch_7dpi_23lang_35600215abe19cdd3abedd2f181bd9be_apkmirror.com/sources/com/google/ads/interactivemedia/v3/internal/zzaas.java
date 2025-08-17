package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes4.dex */
final class zzaas extends zzwj {
    zzaas() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        zzaccVar.zzi();
        int iZzr = zzaccVar.zzr();
        int i10 = 0;
        while (iZzr != 2) {
            int i11 = iZzr - 1;
            if (i11 == 5 || i11 == 6) {
                int iZzb = zzaccVar.zzb();
                if (iZzb != 0) {
                    if (iZzb != 1) {
                        throw new zzwe("Invalid bitset value " + iZzb + ", expected 0 or 1; at path " + zzaccVar.zzf());
                    }
                    bitSet.set(i10);
                } else {
                    continue;
                }
            } else {
                if (i11 != 7) {
                    throw new zzwe("Invalid bitset value type: " + zzacd.zza(iZzr) + "; at path " + zzaccVar.zze());
                }
                if (zzaccVar.zzq()) {
                    bitSet.set(i10);
                }
            }
            i10++;
            iZzr = zzaccVar.zzr();
        }
        zzaccVar.zzk();
        return bitSet;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        zzaceVar.zzb();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            zzaceVar.zzi(bitSet.get(i10) ? 1L : 0L);
        }
        zzaceVar.zzd();
    }
}
