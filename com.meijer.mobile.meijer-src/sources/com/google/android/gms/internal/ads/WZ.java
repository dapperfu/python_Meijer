package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class WZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71953a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71954b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f71955c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f71956d;

    public WZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f71953a = interfaceC10213yy0;
        this.f71954b = interfaceC10213yy02;
        this.f71955c = interfaceC10213yy03;
        this.f71956d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        F00 f00Zzb = ((H00) this.f71953a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f71954b.zzb();
        List list = (List) this.f71955c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f71956d.zzb();
        if (list.contains("60")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f76851Ic)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(f00Zzb, ((Integer) Oc.A.c().a(C8784lf.f76851Ic)).intValue(), scheduledExecutorService);
    }
}
