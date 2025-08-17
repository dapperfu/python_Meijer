package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.My, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6983My implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68766a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68767b;

    public C6983My(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f68766a = interfaceC10088yy0;
        this.f68767b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7745d10(((TY) this.f68766a).zzb(), ((Integer) Mc.A.c().a(C8659lf.f76528tc)).intValue(), (ScheduledExecutorService) this.f68767b.zzb());
    }
}
