package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8431jW implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6758Gf f75450a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f75451b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f75452c;

    /* renamed from: d, reason: collision with root package name */
    private final C9500tW f75453d;

    public C8431jW(B80 b80, Xj0 xj0, InterfaceC6758Gf interfaceC6758Gf, C9500tW c9500tW) {
        this.f75452c = b80;
        this.f75451b = xj0;
        this.f75450a = interfaceC6758Gf;
        this.f75453d = c9500tW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60;
        return (this.f75450a == null || (c7755d60 = z50.f72057s) == null || c7755d60.f73363a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(C8608l60 c8608l60, Z50 z50) {
        C7145Rq c7145Rq = new C7145Rq();
        C8966oW c8966oW = new C8966oW();
        c8966oW.a(new C8326iW(this, c7145Rq, c8608l60, z50, c8966oW));
        C7755d60 c7755d60 = z50.f72057s;
        final BinderC6588Bf binderC6588Bf = new BinderC6588Bf(c8966oW, c7755d60.f73364b, c7755d60.f73363a);
        EnumC9681v80 enumC9681v80 = EnumC9681v80.CUSTOM_RENDER_SYN;
        return C8505k80.d(new InterfaceC7972f80() { // from class: com.google.android.gms.internal.ads.hW
            @Override // com.google.android.gms.internal.ads.InterfaceC7972f80
            public final void zza() throws Exception {
                this.f74737a.c(binderC6588Bf);
            }
        }, this.f75451b, enumC9681v80, this.f75452c).b(EnumC9681v80.CUSTOM_RENDER_ACK).d(c7145Rq).a();
    }

    final /* synthetic */ void c(BinderC6588Bf binderC6588Bf) throws Exception {
        this.f75450a.y5(binderC6588Bf);
    }
}
