package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzaaq extends zzwj {
    zzaaq() {
    }

    private static final zzvw zzb(zzacc zzaccVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            return new zzwb(zzaccVar.zzh());
        }
        if (i11 == 6) {
            return new zzwb(new zzxq(zzaccVar.zzh()));
        }
        if (i11 == 7) {
            return new zzwb(Boolean.valueOf(zzaccVar.zzq()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzacd.zza(i10)));
        }
        zzaccVar.zzm();
        return zzvy.zza;
    }

    private static final zzvw zzc(zzacc zzaccVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzaccVar.zzi();
            return new zzvu();
        }
        if (i11 != 2) {
            return null;
        }
        zzaccVar.zzj();
        return new zzvz();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar instanceof zzyz) {
            return ((zzyz) zzaccVar).zzd();
        }
        int iZzr = zzaccVar.zzr();
        zzvw zzvwVarZzc = zzc(zzaccVar, iZzr);
        if (zzvwVarZzc == null) {
            return zzb(zzaccVar, iZzr);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzaccVar.zzp()) {
                String strZzg = zzvwVarZzc instanceof zzvz ? zzaccVar.zzg() : null;
                int iZzr2 = zzaccVar.zzr();
                zzvw zzvwVarZzc2 = zzc(zzaccVar, iZzr2);
                zzvw zzvwVarZzb = zzvwVarZzc2 == null ? zzb(zzaccVar, iZzr2) : zzvwVarZzc2;
                if (zzvwVarZzc instanceof zzvu) {
                    ((zzvu) zzvwVarZzc).zza(zzvwVarZzb);
                } else {
                    ((zzvz) zzvwVarZzc).zzb(strZzg, zzvwVarZzb);
                }
                if (zzvwVarZzc2 != null) {
                    arrayDeque.addLast(zzvwVarZzc);
                    zzvwVarZzc = zzvwVarZzb;
                }
            } else {
                if (zzvwVarZzc instanceof zzvu) {
                    zzaccVar.zzk();
                } else {
                    zzaccVar.zzl();
                }
                if (arrayDeque.isEmpty()) {
                    return zzvwVarZzc;
                }
                zzvwVarZzc = (zzvw) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void write(zzace zzaceVar, zzvw zzvwVar) throws IOException {
        if (zzvwVar == null || (zzvwVar instanceof zzvy)) {
            zzaceVar.zzg();
            return;
        }
        if (zzvwVar instanceof zzwb) {
            zzwb zzwbVar = (zzwb) zzvwVar;
            if (zzwbVar.zzj()) {
                zzaceVar.zzk(zzwbVar.zzd());
                return;
            } else if (zzwbVar.zzi()) {
                zzaceVar.zzm(zzwbVar.zzh());
                return;
            } else {
                zzaceVar.zzl(zzwbVar.zze());
                return;
            }
        }
        if (zzvwVar instanceof zzvu) {
            zzaceVar.zzb();
            Iterator it = ((zzvu) zzvwVar).iterator();
            while (it.hasNext()) {
                write(zzaceVar, (zzvw) it.next());
            }
            zzaceVar.zzd();
            return;
        }
        if (!(zzvwVar instanceof zzvz)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzvwVar.getClass())));
        }
        zzaceVar.zzc();
        for (Map.Entry entry : ((zzvz) zzvwVar).zza()) {
            zzaceVar.zzf((String) entry.getKey());
            write(zzaceVar, (zzvw) entry.getValue());
        }
        zzaceVar.zze();
    }
}
