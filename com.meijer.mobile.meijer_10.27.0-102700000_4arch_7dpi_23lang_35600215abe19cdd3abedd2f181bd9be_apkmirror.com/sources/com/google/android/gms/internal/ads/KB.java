package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class KB implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final IB f68051a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68052b;

    public KB(IB ib2, InterfaceC10088yy0 interfaceC10088yy0) {
        this.f68051a = ib2;
        this.f68052b = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextB = this.f68051a.b(((C9865wu) this.f68052b).a());
        C9233qy0.b(contextB);
        return contextB;
    }
}
