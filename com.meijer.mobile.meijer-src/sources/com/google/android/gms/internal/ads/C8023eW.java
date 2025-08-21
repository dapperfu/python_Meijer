package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.eW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8023eW implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74725a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7278Ry f74726b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6883Gf f74727c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f74728d;

    /* renamed from: e, reason: collision with root package name */
    private final B80 f74729e;

    public C8023eW(Context context, AbstractC7278Ry abstractC7278Ry, B80 b80, Xj0 xj0, InterfaceC6883Gf interfaceC6883Gf) {
        this.f74725a = context;
        this.f74726b = abstractC7278Ry;
        this.f74729e = b80;
        this.f74728d = xj0;
        this.f74727c = interfaceC6883Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60;
        return (this.f74727c == null || (c7880d60 = z50.f72897s) == null || c7880d60.f74203a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(C8733l60 c8733l60, Z50 z50) {
        C7810cW c7810cW = new C7810cW(this, new View(this.f74725a), null, new InterfaceC10214yz() { // from class: com.google.android.gms.internal.ads.aW
            @Override // com.google.android.gms.internal.ads.InterfaceC10214yz
            public final Oc.Y0 zza() {
                return null;
            }
        }, (C7560a60) z50.f72901u.get(0));
        AbstractC9036ny abstractC9036nyA = this.f74726b.a(new C7279Rz(c8733l60, z50, null), c7810cW);
        C7917dW c7917dWL = abstractC9036nyA.l();
        C7880d60 c7880d60 = z50.f72897s;
        final BinderC6713Bf binderC6713Bf = new BinderC6713Bf(c7917dWL, c7880d60.f74204b, c7880d60.f74203a);
        EnumC9806v80 enumC9806v80 = EnumC9806v80.CUSTOM_RENDER_SYN;
        return C8630k80.d(new InterfaceC8097f80() { // from class: com.google.android.gms.internal.ads.bW
            @Override // com.google.android.gms.internal.ads.InterfaceC8097f80
            public final void zza() throws Exception {
                this.f73661a.c(binderC6713Bf);
            }
        }, this.f74728d, enumC9806v80, this.f74729e).b(EnumC9806v80.CUSTOM_RENDER_ACK).d(Mj0.h(abstractC9036nyA.h())).a();
    }

    final /* synthetic */ void c(BinderC6713Bf binderC6713Bf) throws Exception {
        this.f74727c.I5(binderC6713Bf);
    }
}
