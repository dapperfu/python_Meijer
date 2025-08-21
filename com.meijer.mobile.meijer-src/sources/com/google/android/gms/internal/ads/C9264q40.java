package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9264q40 implements C70 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f78545a;

    public C9264q40(N40 n40) {
        this.f78545a = n40;
    }

    @Override // com.google.android.gms.internal.ads.C70
    public final void a(C9376r70 c9376r70) {
        c9376r70.f78783a = ((C8943n40) this.f78545a).b();
    }

    @Override // com.google.android.gms.internal.ads.C70
    public final com.google.common.util.concurrent.q b(D70 d70) {
        C9370r40 c9370r40 = (C9370r40) d70;
        return ((C8943n40) this.f78545a).c(c9370r40.f78764b, c9370r40.f78763a, null);
    }
}
