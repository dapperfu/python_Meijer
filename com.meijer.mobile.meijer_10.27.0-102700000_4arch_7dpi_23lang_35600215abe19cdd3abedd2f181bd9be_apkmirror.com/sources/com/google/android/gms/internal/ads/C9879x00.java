package com.google.android.gms.internal.ads;

import Vc.C5366c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.x00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9879x00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f79630a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f79631b;

    C9879x00(Xj0 xj0, C9570u60 c9570u60) {
        this.f79630a = xj0;
        this.f79631b = c9570u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 21;
    }

    final /* synthetic */ C10093z00 a() throws Exception {
        return new C10093z00("requester_type_2".equals(C5366c.c(this.f79631b.f78738d)));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f79630a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.w00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f79397a.a();
            }
        });
    }
}
