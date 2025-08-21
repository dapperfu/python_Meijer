package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class ZZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73041a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73042b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f73043c;

    public ZZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f73041a = interfaceC10213yy02;
        this.f73042b = interfaceC10213yy03;
        this.f73043c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        N00 n00A = P00.a();
        C8133fZ c8133fZ = (C8133fZ) this.f73041a.zzb();
        List list = (List) this.f73042b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f73043c.zzb();
        if (list.contains("24")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77130cc)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(n00A, ((Integer) Oc.A.c().a(C8784lf.f77130cc)).intValue(), scheduledExecutorService);
    }
}
