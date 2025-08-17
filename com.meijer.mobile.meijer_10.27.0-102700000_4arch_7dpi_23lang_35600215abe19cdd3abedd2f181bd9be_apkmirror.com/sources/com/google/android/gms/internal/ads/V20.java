package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class V20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final Xj0 f70766a;

    /* renamed from: b, reason: collision with root package name */
    final List f70767b;

    public V20(C7197Te c7197Te, Xj0 xj0, List list) {
        this.f70766a = xj0;
        this.f70767b = list;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f70766a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.U20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new W20(this.f70526a.f70767b);
            }
        });
    }
}
