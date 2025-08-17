package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class MZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68663a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68664b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f68665c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f68666d;

    public MZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f68663a = interfaceC10088yy0;
        this.f68664b = interfaceC10088yy02;
        this.f68665c = interfaceC10088yy03;
        this.f68666d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        KY kyZzb = ((MY) this.f68663a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f68664b.zzb();
        List list = (List) this.f68665c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f68666d.zzb();
        if (list.contains("54")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76388jc)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(kyZzb, ((Integer) Mc.A.c().a(C8659lf.f76388jc)).intValue(), scheduledExecutorService);
    }
}
