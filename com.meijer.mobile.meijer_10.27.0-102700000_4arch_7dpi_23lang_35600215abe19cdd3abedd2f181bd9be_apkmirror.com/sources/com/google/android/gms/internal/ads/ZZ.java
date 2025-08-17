package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class ZZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72201a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f72202b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f72203c;

    public ZZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f72201a = interfaceC10088yy02;
        this.f72202b = interfaceC10088yy03;
        this.f72203c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        N00 n00A = P00.a();
        C8008fZ c8008fZ = (C8008fZ) this.f72201a.zzb();
        List list = (List) this.f72202b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f72203c.zzb();
        if (list.contains("24")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76290cc)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(n00A, ((Integer) Mc.A.c().a(C8659lf.f76290cc)).intValue(), scheduledExecutorService);
    }
}
