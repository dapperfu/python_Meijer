package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class R20 implements T10 {
    public R20(C9002oq c9002oq, Xj0 xj0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        final com.google.common.util.concurrent.q qVarH = Mj0.h(null);
        if (((Boolean) Mc.A.c().a(C8659lf.f76018J5)).booleanValue()) {
            qVarH = Mj0.h(null);
        }
        final com.google.common.util.concurrent.q qVarH2 = Mj0.h(null);
        return Mj0.c(qVarH, qVarH2).a(new Callable() { // from class: com.google.android.gms.internal.ads.Q20
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new S20((String) qVarH.get(), (String) qVarH2.get());
            }
        }, C6908Kq.f68174a);
    }
}
