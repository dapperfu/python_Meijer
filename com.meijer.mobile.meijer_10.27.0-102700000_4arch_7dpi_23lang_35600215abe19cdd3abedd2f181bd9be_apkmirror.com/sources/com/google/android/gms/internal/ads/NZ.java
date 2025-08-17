package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class NZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68901a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68902b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f68903c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f68904d;

    public NZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f68901a = interfaceC10088yy0;
        this.f68902b = interfaceC10088yy02;
        this.f68903c = interfaceC10088yy03;
        this.f68904d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        OY oyZzb = ((QY) this.f68901a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f68902b.zzb();
        List list = (List) this.f68903c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f68904d.zzb();
        if (list.contains("13")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76374ic)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(oyZzb, ((Integer) Mc.A.c().a(C8659lf.f76374ic)).intValue(), scheduledExecutorService);
    }
}
