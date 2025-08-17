package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class WZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f71113a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f71114b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f71115c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f71116d;

    public WZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f71113a = interfaceC10088yy0;
        this.f71114b = interfaceC10088yy02;
        this.f71115c = interfaceC10088yy03;
        this.f71116d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        F00 f00Zzb = ((H00) this.f71113a).zzb();
        C8008fZ c8008fZ = (C8008fZ) this.f71114b.zzb();
        List list = (List) this.f71115c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f71116d.zzb();
        if (list.contains("60")) {
            return new C7745d10(c8008fZ, ((Integer) Mc.A.c().a(C8659lf.f76011Ic)).intValue(), scheduledExecutorService);
        }
        return new C7745d10(f00Zzb, ((Integer) Mc.A.c().a(C8659lf.f76011Ic)).intValue(), scheduledExecutorService);
    }
}
