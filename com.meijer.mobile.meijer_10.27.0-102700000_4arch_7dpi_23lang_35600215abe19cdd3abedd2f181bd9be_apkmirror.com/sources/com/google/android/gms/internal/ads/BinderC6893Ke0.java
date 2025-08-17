package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Ke0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6893Ke0 extends AbstractBinderC7698ce0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7130Re0 f68137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6927Le0 f68138b;

    BinderC6893Ke0(C6927Le0 c6927Le0, InterfaceC7130Re0 interfaceC7130Re0) {
        this.f68138b = c6927Le0;
        this.f68137a = interfaceC7130Re0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7805de0
    public final void P(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        AbstractC7028Oe0 abstractC7028Oe0C = AbstractC7096Qe0.c();
        abstractC7028Oe0C.b(i10);
        if (string != null) {
            abstractC7028Oe0C.a(string);
        }
        this.f68137a.a(abstractC7028Oe0C.c());
        if (i10 == 8157) {
            this.f68138b.a();
        }
    }
}
