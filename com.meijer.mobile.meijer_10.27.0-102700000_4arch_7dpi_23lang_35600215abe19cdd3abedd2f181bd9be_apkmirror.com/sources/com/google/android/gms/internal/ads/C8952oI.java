package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8952oI implements InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77355a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9379sI f77356b;

    C8952oI(C9379sI c9379sI, String str) {
        this.f77355a = str;
        this.f77356b = c9379sI;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76126R1)).booleanValue()) {
            if (c9720vb.f79090j) {
                C9379sI c9379sI = this.f77356b;
                if (c9379sI.f78213u != null) {
                    c9379sI.f78200E.put(this.f77355a, Boolean.TRUE);
                    C9379sI c9379sI2 = this.f77356b;
                    if (c9379sI2.f78213u == null) {
                        return;
                    }
                    c9379sI2.j(c9379sI2.f78213u.zzf(), this.f77356b.f78213u.zzl(), this.f77356b.f78213u.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c9720vb.f79090j) {
                    C9379sI c9379sI3 = this.f77356b;
                    if (c9379sI3.f78213u != null) {
                        c9379sI3.f78200E.put(this.f77355a, Boolean.TRUE);
                        C9379sI c9379sI4 = this.f77356b;
                        if (c9379sI4.f78213u == null) {
                        } else {
                            c9379sI4.j(c9379sI4.f78213u.zzf(), this.f77356b.f78213u.zzl(), this.f77356b.f78213u.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
