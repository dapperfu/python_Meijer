package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class LZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68382a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68383b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f68384c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f68385d;

    public LZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f68382a = interfaceC10088yy0;
        this.f68383b = interfaceC10088yy02;
        this.f68384c = interfaceC10088yy03;
        this.f68385d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C9930xY c9930xYZzb = ((C10144zY) this.f68382a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f68383b.zzb();
        List list = (List) this.f68384c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f68385d.zzb();
        if (list.contains("10")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76262ac)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(c9930xYZzb, ((Integer) Mc.A.c().a(C8659lf.f76262ac)).intValue(), scheduledExecutorService);
    }
}
