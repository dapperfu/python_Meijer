package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ly, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6949Ly implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68458a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68459b;

    public C6949Ly(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f68458a = interfaceC10088yy0;
        this.f68459b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((KX) this.f68458a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76458oc)).intValue(), (ScheduledExecutorService) this.f68459b.zzb());
    }
}
