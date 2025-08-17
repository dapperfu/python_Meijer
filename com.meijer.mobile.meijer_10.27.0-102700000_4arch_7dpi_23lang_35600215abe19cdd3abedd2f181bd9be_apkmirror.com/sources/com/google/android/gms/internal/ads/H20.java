package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class H20 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67328a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67329b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f67330c;

    public H20(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05) {
        this.f67328a = interfaceC10088yy0;
        this.f67329b = interfaceC10088yy03;
        this.f67330c = interfaceC10088yy04;
    }

    public static F20 a(String str, C6582Bc c6582Bc, C6568Aq c6568Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        return new F20(str, c6582Bc, c6568Aq, scheduledExecutorService, xj0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new F20(((C7642c30) this.f67328a).a(), C8160gw.a(), (C6568Aq) this.f67329b.zzb(), (ScheduledExecutorService) this.f67330c.zzb(), U70.b());
    }
}
