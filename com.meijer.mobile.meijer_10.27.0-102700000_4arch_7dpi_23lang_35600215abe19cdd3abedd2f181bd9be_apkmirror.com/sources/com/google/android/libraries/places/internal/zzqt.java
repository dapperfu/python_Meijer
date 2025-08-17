package com.google.android.libraries.places.internal;

import Be.p;
import Ce.O;
import Z.n0;

/* loaded from: classes6.dex */
public class zzqt {
    private static final zzqr zza = zzqr.zza(Boolean.class);
    private final zzqt zzb;
    private final n0 zzc;
    private boolean zzd = false;

    final boolean zze() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (zzqt zzqtVar = this; zzqtVar != null; zzqtVar = zzqtVar.zzb) {
            for (int i10 = 0; i10 < zzqtVar.zzc.getSize(); i10++) {
                sb2.append(this.zzc.k(i10));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    final zzqt zzb() {
        if (this.zzd) {
            throw new IllegalStateException("Already frozen");
        }
        this.zzd = true;
        zzqt zzqtVar = this.zzb;
        return (zzqtVar == null || !this.zzc.isEmpty()) ? this : zzqtVar;
    }

    public final boolean zzc() {
        return this == zzqs.zza;
    }

    final boolean zzd(zzqr zzqrVar) {
        if (this.zzc.containsKey(zzqrVar)) {
            return true;
        }
        zzqt zzqtVar = this.zzb;
        return zzqtVar != null && zzqtVar.zzd(zzqrVar);
    }

    final /* synthetic */ n0 zzg() {
        return this.zzc;
    }

    /* synthetic */ zzqt(zzqt zzqtVar, n0 n0Var, byte[] bArr) {
        if (zzqtVar != null) {
            p.d(zzqtVar.zzd);
        }
        this.zzb = zzqtVar;
        this.zzc = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static zzqt zza(zzqt zzqtVar, zzqt zzqtVar2) {
        boolean z10;
        if (zzqtVar.zzc()) {
            return zzqtVar2;
        }
        if (zzqtVar2.zzc()) {
            return zzqtVar;
        }
        O<zzqt> oZ = O.z(zzqtVar, zzqtVar2);
        if (oZ.isEmpty()) {
            return zzqs.zza;
        }
        if (oZ.size() == 1) {
            return (zzqt) oZ.iterator().next();
        }
        int size = 0;
        for (zzqt zzqtVar3 : oZ) {
            do {
                size += zzqtVar3.zzc.getSize();
                zzqtVar3 = zzqtVar3.zzb;
            } while (zzqtVar3 != null);
        }
        if (size == 0) {
            return zzqs.zza;
        }
        n0 n0Var = new n0(size);
        for (zzqt zzqtVar4 : oZ) {
            do {
                int i10 = 0;
                while (true) {
                    n0 n0Var2 = zzqtVar4.zzc;
                    if (i10 >= n0Var2.getSize()) {
                        break;
                    }
                    if (n0Var.put((zzqr) n0Var2.g(i10), n0Var2.k(i10)) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p.l(z10, "Duplicate bindings: %s", n0Var2.g(i10));
                    i10++;
                }
                zzqtVar4 = zzqtVar4.zzb;
            } while (zzqtVar4 != null);
        }
        return new zzqs(null, n0Var, 0 == true ? 1 : 0).zzb();
    }
}
