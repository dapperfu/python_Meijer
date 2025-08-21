package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.sY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9520sY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f79109a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f79110b;

    /* renamed from: c, reason: collision with root package name */
    private final C6829Eq f79111c;

    public C9520sY(Xj0 xj0, C9695u60 c9695u60, C6829Eq c6829Eq) {
        this.f79109a = xj0;
        this.f79110b = c9695u60;
        this.f79111c = c6829Eq;
    }

    final /* synthetic */ C9627tY a() throws Exception {
        return new C9627tY(this.f79110b.f79584j, this.f79111c.m());
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f79109a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.rY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78876a.a();
            }
        });
    }
}
