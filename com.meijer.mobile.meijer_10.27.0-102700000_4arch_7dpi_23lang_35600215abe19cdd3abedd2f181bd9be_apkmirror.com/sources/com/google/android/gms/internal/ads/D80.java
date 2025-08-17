package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class D80 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66158a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66159b;

    public D80(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f66158a = interfaceC10088yy02;
        this.f66159b = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new B80(U70.b(), (ScheduledExecutorService) this.f66158a.zzb(), ((E80) this.f66159b).zzb());
    }
}
