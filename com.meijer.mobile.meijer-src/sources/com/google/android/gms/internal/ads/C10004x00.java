package com.google.android.gms.internal.ads;

import Xc.C5569c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.x00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10004x00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f80470a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f80471b;

    C10004x00(Xj0 xj0, C9695u60 c9695u60) {
        this.f80470a = xj0;
        this.f80471b = c9695u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 21;
    }

    final /* synthetic */ C10218z00 a() throws Exception {
        return new C10218z00("requester_type_2".equals(C5569c.c(this.f80471b.f79578d)));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f80470a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.w00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80237a.a();
            }
        });
    }
}
