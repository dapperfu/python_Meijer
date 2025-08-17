package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class zzafo {
    private final ArrayDeque zza = new ArrayDeque();

    private zzafo() {
    }

    /* synthetic */ zzafo(zzafn zzafnVar) {
    }

    private static final int zzc(int i10) {
        int iBinarySearch = Arrays.binarySearch(zzafs.zza, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    static /* bridge */ /* synthetic */ zzacw zza(zzafo zzafoVar, zzacw zzacwVar, zzacw zzacwVar2) {
        zzafoVar.zzb(zzacwVar);
        zzafoVar.zzb(zzacwVar2);
        zzacw zzafsVar = (zzacw) zzafoVar.zza.pop();
        while (!zzafoVar.zza.isEmpty()) {
            zzafsVar = new zzafs((zzacw) zzafoVar.zza.pop(), zzafsVar);
        }
        return zzafsVar;
    }

    private final void zzb(zzacw zzacwVar) {
        zzafr zzafrVar;
        if (zzacwVar.zzh()) {
            int iZzc = zzc(zzacwVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int iZzc2 = zzafs.zzc(iZzc + 1);
            if (!arrayDeque.isEmpty() && ((zzacw) this.zza.peek()).zzd() < iZzc2) {
                int iZzc3 = zzafs.zzc(iZzc);
                zzacw zzafsVar = (zzacw) this.zza.pop();
                while (true) {
                    zzafrVar = null;
                    if (this.zza.isEmpty() || ((zzacw) this.zza.peek()).zzd() >= iZzc3) {
                        break;
                    } else {
                        zzafsVar = new zzafs((zzacw) this.zza.pop(), zzafsVar);
                    }
                }
                zzafs zzafsVar2 = new zzafs(zzafsVar, zzacwVar);
                while (!this.zza.isEmpty()) {
                    int iZzc4 = zzc(zzafsVar2.zzd()) + 1;
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzacw) arrayDeque2.peek()).zzd() >= zzafs.zzc(iZzc4)) {
                        break;
                    } else {
                        zzafsVar2 = new zzafs((zzacw) this.zza.pop(), zzafsVar2);
                    }
                }
                this.zza.push(zzafsVar2);
                return;
            }
            this.zza.push(zzacwVar);
            return;
        }
        if (zzacwVar instanceof zzafs) {
            zzafs zzafsVar3 = (zzafs) zzacwVar;
            zzb(zzafsVar3.zzd);
            zzb(zzafsVar3.zze);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzacwVar.getClass())));
    }
}
