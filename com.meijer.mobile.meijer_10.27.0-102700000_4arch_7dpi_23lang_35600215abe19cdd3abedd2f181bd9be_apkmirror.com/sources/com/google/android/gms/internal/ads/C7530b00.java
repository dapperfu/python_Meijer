package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.b00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7530b00 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72696a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f72697b;

    public C7530b00(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f72696a = interfaceC10088yy0;
        this.f72697b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((C7532b10) this.f72696a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76276bc)).intValue(), (ScheduledExecutorService) this.f72697b.zzb());
    }
}
