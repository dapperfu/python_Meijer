package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9139q40 implements C70 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f77705a;

    public C9139q40(N40 n40) {
        this.f77705a = n40;
    }

    @Override // com.google.android.gms.internal.ads.C70
    public final void a(C9251r70 c9251r70) {
        c9251r70.f77943a = ((C8818n40) this.f77705a).b();
    }

    @Override // com.google.android.gms.internal.ads.C70
    public final com.google.common.util.concurrent.q b(D70 d70) {
        C9245r40 c9245r40 = (C9245r40) d70;
        return ((C8818n40) this.f77705a).c(c9245r40.f77924b, c9245r40.f77923a, null);
    }
}
