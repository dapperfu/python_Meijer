package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class H20 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68168a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68169b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f68170c;

    public H20(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f68168a = interfaceC10213yy0;
        this.f68169b = interfaceC10213yy03;
        this.f68170c = interfaceC10213yy04;
    }

    public static F20 a(String str, C6707Bc c6707Bc, C6693Aq c6693Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        return new F20(str, c6707Bc, c6693Aq, scheduledExecutorService, xj0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new F20(((C7767c30) this.f68168a).a(), C8285gw.a(), (C6693Aq) this.f68169b.zzb(), (ScheduledExecutorService) this.f68170c.zzb(), U70.b());
    }
}
