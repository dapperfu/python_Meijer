package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class NZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69741a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69742b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f69743c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f69744d;

    public NZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f69741a = interfaceC10213yy0;
        this.f69742b = interfaceC10213yy02;
        this.f69743c = interfaceC10213yy03;
        this.f69744d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        OY oyZzb = ((QY) this.f69741a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f69742b.zzb();
        List list = (List) this.f69743c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f69744d.zzb();
        if (list.contains("13")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77214ic)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(oyZzb, ((Integer) Oc.A.c().a(C8784lf.f77214ic)).intValue(), scheduledExecutorService);
    }
}
