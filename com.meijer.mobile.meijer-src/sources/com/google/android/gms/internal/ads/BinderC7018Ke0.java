package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Ke0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC7018Ke0 extends AbstractBinderC7823ce0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7255Re0 f68977a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7052Le0 f68978b;

    BinderC7018Ke0(C7052Le0 c7052Le0, InterfaceC7255Re0 interfaceC7255Re0) {
        this.f68978b = c7052Le0;
        this.f68977a = interfaceC7255Re0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7930de0
    public final void P(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        AbstractC7153Oe0 abstractC7153Oe0C = AbstractC7221Qe0.c();
        abstractC7153Oe0C.b(i10);
        if (string != null) {
            abstractC7153Oe0C.a(string);
        }
        this.f68977a.a(abstractC7153Oe0C.c());
        if (i10 == 8157) {
            this.f68978b.a();
        }
    }
}
