package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class UA implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71395a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71396b;

    public UA(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f71395a = interfaceC10213yy0;
        this.f71396b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF((C9069oE) this.f71395a.zzb(), (Executor) this.f71396b.zzb());
    }
}
