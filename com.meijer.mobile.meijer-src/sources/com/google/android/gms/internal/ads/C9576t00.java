package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.t00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9576t00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79305a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f79306b;

    C9576t00(Xj0 xj0, Context context) {
        this.f79306b = xj0;
        this.f79305a = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 57;
    }

    final /* synthetic */ C9683u00 a() throws Exception {
        Nc.v.t();
        return new C9683u00(Rc.D0.Y(this.f79305a));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f79306b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.s00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78950a.a();
            }
        });
    }
}
