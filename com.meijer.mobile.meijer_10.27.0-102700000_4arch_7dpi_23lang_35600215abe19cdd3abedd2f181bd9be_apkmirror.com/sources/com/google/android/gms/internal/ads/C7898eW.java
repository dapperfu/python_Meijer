package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.eW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7898eW implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f73885a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7153Ry f73886b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6758Gf f73887c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f73888d;

    /* renamed from: e, reason: collision with root package name */
    private final B80 f73889e;

    public C7898eW(Context context, AbstractC7153Ry abstractC7153Ry, B80 b80, Xj0 xj0, InterfaceC6758Gf interfaceC6758Gf) {
        this.f73885a = context;
        this.f73886b = abstractC7153Ry;
        this.f73889e = b80;
        this.f73888d = xj0;
        this.f73887c = interfaceC6758Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60;
        return (this.f73887c == null || (c7755d60 = z50.f72057s) == null || c7755d60.f73363a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(C8608l60 c8608l60, Z50 z50) {
        C7685cW c7685cW = new C7685cW(this, new View(this.f73885a), null, new InterfaceC10089yz() { // from class: com.google.android.gms.internal.ads.aW
            @Override // com.google.android.gms.internal.ads.InterfaceC10089yz
            public final Mc.Y0 zza() {
                return null;
            }
        }, (C7435a60) z50.f72061u.get(0));
        AbstractC8911ny abstractC8911nyA = this.f73886b.a(new C7154Rz(c8608l60, z50, null), c7685cW);
        C7792dW c7792dWL = abstractC8911nyA.l();
        C7755d60 c7755d60 = z50.f72057s;
        final BinderC6588Bf binderC6588Bf = new BinderC6588Bf(c7792dWL, c7755d60.f73364b, c7755d60.f73363a);
        EnumC9681v80 enumC9681v80 = EnumC9681v80.CUSTOM_RENDER_SYN;
        return C8505k80.d(new InterfaceC7972f80() { // from class: com.google.android.gms.internal.ads.bW
            @Override // com.google.android.gms.internal.ads.InterfaceC7972f80
            public final void zza() throws Exception {
                this.f72821a.c(binderC6588Bf);
            }
        }, this.f73888d, enumC9681v80, this.f73889e).b(EnumC9681v80.CUSTOM_RENDER_ACK).d(Mj0.h(abstractC8911nyA.h())).a();
    }

    final /* synthetic */ void c(BinderC6588Bf binderC6588Bf) throws Exception {
        this.f73887c.y5(binderC6588Bf);
    }
}
