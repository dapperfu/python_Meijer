package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8648lZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f75852a;

    /* renamed from: b, reason: collision with root package name */
    private final C9063pM f75853b;

    /* renamed from: c, reason: collision with root package name */
    private final String f75854c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f75855d;

    public C8648lZ(Xj0 xj0, C9063pM c9063pM, C9570u60 c9570u60, String str) {
        this.f75852a = xj0;
        this.f75853b = c9063pM;
        this.f75855d = c9570u60;
        this.f75854c = str;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 17;
    }

    final /* synthetic */ C8755mZ a() throws Exception {
        C9063pM c9063pM = this.f75853b;
        return new C8755mZ(c9063pM.b(this.f75855d.f78740f, this.f75854c), c9063pM.a());
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f75852a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.kZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75670a.a();
            }
        });
    }
}
