package com.google.android.gms.internal.ads;

import Vc.C5366c;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class PX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f69346a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f69347b;

    PX(Xj0 xj0, C9570u60 c9570u60, I60 i60) {
        this.f69346a = xj0;
        this.f69347b = c9570u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 5;
    }

    final /* synthetic */ QX a() throws Exception {
        String strA = null;
        if (((Boolean) Mc.A.c().a(C8659lf.f76131R6)).booleanValue() && "requester_type_2".equals(C5366c.c(this.f69347b.f78738d))) {
            strA = I60.a();
        }
        return new QX(strA);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f69346a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.OX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f69105a.a();
            }
        });
    }
}
