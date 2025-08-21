package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8556jW implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6883Gf f76290a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f76291b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f76292c;

    /* renamed from: d, reason: collision with root package name */
    private final C9625tW f76293d;

    public C8556jW(B80 b80, Xj0 xj0, InterfaceC6883Gf interfaceC6883Gf, C9625tW c9625tW) {
        this.f76292c = b80;
        this.f76291b = xj0;
        this.f76290a = interfaceC6883Gf;
        this.f76293d = c9625tW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60;
        return (this.f76290a == null || (c7880d60 = z50.f72897s) == null || c7880d60.f74203a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(C8733l60 c8733l60, Z50 z50) {
        C7270Rq c7270Rq = new C7270Rq();
        C9091oW c9091oW = new C9091oW();
        c9091oW.a(new C8451iW(this, c7270Rq, c8733l60, z50, c9091oW));
        C7880d60 c7880d60 = z50.f72897s;
        final BinderC6713Bf binderC6713Bf = new BinderC6713Bf(c9091oW, c7880d60.f74204b, c7880d60.f74203a);
        EnumC9806v80 enumC9806v80 = EnumC9806v80.CUSTOM_RENDER_SYN;
        return C8630k80.d(new InterfaceC8097f80() { // from class: com.google.android.gms.internal.ads.hW
            @Override // com.google.android.gms.internal.ads.InterfaceC8097f80
            public final void zza() throws Exception {
                this.f75577a.c(binderC6713Bf);
            }
        }, this.f76291b, enumC9806v80, this.f76292c).b(EnumC9806v80.CUSTOM_RENDER_ACK).d(c7270Rq).a();
    }

    final /* synthetic */ void c(BinderC6713Bf binderC6713Bf) throws Exception {
        this.f76290a.I5(binderC6713Bf);
    }
}
