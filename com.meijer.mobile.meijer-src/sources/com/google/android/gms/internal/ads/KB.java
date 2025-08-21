package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class KB implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final IB f68891a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68892b;

    public KB(IB ib2, InterfaceC10213yy0 interfaceC10213yy0) {
        this.f68891a = ib2;
        this.f68892b = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextB = this.f68891a.b(((C9990wu) this.f68892b).a());
        C9358qy0.b(contextB);
        return contextB;
    }
}
