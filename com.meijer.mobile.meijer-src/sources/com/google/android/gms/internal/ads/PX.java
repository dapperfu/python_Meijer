package com.google.android.gms.internal.ads;

import Xc.C5569c;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class PX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f70186a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f70187b;

    PX(Xj0 xj0, C9695u60 c9695u60, I60 i60) {
        this.f70186a = xj0;
        this.f70187b = c9695u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 5;
    }

    final /* synthetic */ QX a() throws Exception {
        String strA = null;
        if (((Boolean) Oc.A.c().a(C8784lf.f76971R6)).booleanValue() && "requester_type_2".equals(C5569c.c(this.f70187b.f79578d))) {
            strA = I60.a();
        }
        return new QX(strA);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f70186a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.OX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f69945a.a();
            }
        });
    }
}
