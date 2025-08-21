package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzzi extends zzwj {
    private static final zzwk zza = new zzzg(1);
    private final zzvr zzb;
    private final int zzc;

    /* synthetic */ zzzi(zzvr zzvrVar, int i10, zzzh zzzhVar) {
        this.zzb = zzvrVar;
        this.zzc = i10;
    }

    public static zzwk zza(int i10) {
        return i10 == 1 ? zza : new zzzg(0);
    }

    private final Object zzb(zzacc zzaccVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            return zzaccVar.zzh();
        }
        if (i11 == 6) {
            return zzwh.zza(this.zzc, zzaccVar);
        }
        if (i11 == 7) {
            return Boolean.valueOf(zzaccVar.zzq());
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzacd.zza(i10)));
        }
        zzaccVar.zzm();
        return null;
    }

    private static final Object zzc(zzacc zzaccVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzaccVar.zzi();
            return new ArrayList();
        }
        if (i11 != 2) {
            return null;
        }
        zzaccVar.zzj();
        return new zzxy();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, Object obj) throws IOException {
        if (obj == null) {
            zzaceVar.zzg();
            return;
        }
        zzwj zzwjVarZza = this.zzb.zza(zzaca.zza(obj.getClass()));
        if (!(zzwjVarZza instanceof zzzi)) {
            zzwjVarZza.write(zzaceVar, obj);
        } else {
            zzaceVar.zzc();
            zzaceVar.zze();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final Object read(zzacc zzaccVar) throws IOException {
        String strZzg;
        Object objZzb;
        int iZzr = zzaccVar.zzr();
        Object objZzc = zzc(zzaccVar, iZzr);
        if (objZzc == null) {
            return zzb(zzaccVar, iZzr);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzaccVar.zzp()) {
                if (objZzc instanceof Map) {
                    strZzg = zzaccVar.zzg();
                } else {
                    strZzg = null;
                }
                int iZzr2 = zzaccVar.zzr();
                Object objZzc2 = zzc(zzaccVar, iZzr2);
                if (objZzc2 == null) {
                    objZzb = zzb(zzaccVar, iZzr2);
                } else {
                    objZzb = objZzc2;
                }
                if (objZzc instanceof List) {
                    ((List) objZzc).add(objZzb);
                } else {
                    ((Map) objZzc).put(strZzg, objZzb);
                }
                if (objZzc2 != null) {
                    arrayDeque.addLast(objZzc);
                    objZzc = objZzb;
                }
            } else {
                if (objZzc instanceof List) {
                    zzaccVar.zzk();
                } else {
                    zzaccVar.zzl();
                }
                if (arrayDeque.isEmpty()) {
                    return objZzc;
                }
                objZzc = arrayDeque.removeLast();
            }
        }
    }
}
