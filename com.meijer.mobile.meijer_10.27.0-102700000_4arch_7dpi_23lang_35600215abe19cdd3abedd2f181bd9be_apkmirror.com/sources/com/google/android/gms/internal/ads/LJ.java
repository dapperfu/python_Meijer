package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class LJ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68343a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68344b;

    public LJ(EJ ej2, InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f68343a = interfaceC10088yy0;
        this.f68344b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ZF(((C9489tL) this.f68343a).zzb(), (Executor) this.f68344b.zzb());
    }
}
