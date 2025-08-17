package com.google.android.libraries.places.internal;

import Be.p;
import Z.n0;

/* loaded from: classes6.dex */
final class zzqs extends zzqt {
    static final zzqt zza;

    /* JADX WARN: Multi-variable type inference failed */
    private zzqs(zzqt zzqtVar, n0 n0Var) {
        super(null, n0Var, 0 == true ? 1 : 0);
    }

    static {
        zzqt zzqtVarZzb = new zzqs(null, new n0(0)).zzb();
        zza = zzqtVarZzb;
        zzqs zzqsVar = new zzqs(zzqtVarZzb, new n0(), null);
        boolean z10 = !zzqsVar.zzh();
        Boolean bool = Boolean.TRUE;
        p.x(z10, "Can't mutate after handing to trace");
        p.q(bool);
        zzqr zzqrVar = zzqt.zza;
        p.x(!zzqsVar.zzd(zzqrVar), "Key already present");
        zzqsVar.zzg().put(zzqrVar, bool);
        zzqsVar.zzb();
    }

    /* synthetic */ zzqs(zzqt zzqtVar, n0 n0Var, byte[] bArr) {
        super(zzqtVar, n0Var, null);
    }
}
