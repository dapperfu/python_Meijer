package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8773lZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f76692a;

    /* renamed from: b, reason: collision with root package name */
    private final C9188pM f76693b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76694c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f76695d;

    public C8773lZ(Xj0 xj0, C9188pM c9188pM, C9695u60 c9695u60, String str) {
        this.f76692a = xj0;
        this.f76693b = c9188pM;
        this.f76695d = c9695u60;
        this.f76694c = str;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 17;
    }

    final /* synthetic */ C8880mZ a() throws Exception {
        C9188pM c9188pM = this.f76693b;
        return new C8880mZ(c9188pM.b(this.f76695d.f79580f, this.f76694c), c9188pM.a());
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f76692a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.kZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f76510a.a();
            }
        });
    }
}
