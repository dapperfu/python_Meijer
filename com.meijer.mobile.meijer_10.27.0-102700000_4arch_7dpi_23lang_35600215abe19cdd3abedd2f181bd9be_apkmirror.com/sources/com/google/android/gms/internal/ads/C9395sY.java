package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.sY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9395sY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f78269a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f78270b;

    /* renamed from: c, reason: collision with root package name */
    private final C6704Eq f78271c;

    public C9395sY(Xj0 xj0, C9570u60 c9570u60, C6704Eq c6704Eq) {
        this.f78269a = xj0;
        this.f78270b = c9570u60;
        this.f78271c = c6704Eq;
    }

    final /* synthetic */ C9502tY a() throws Exception {
        return new C9502tY(this.f78270b.f78744j, this.f78271c.m());
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f78269a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.rY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78036a.a();
            }
        });
    }
}
