package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class MZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69503a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69504b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f69505c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f69506d;

    public MZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f69503a = interfaceC10213yy0;
        this.f69504b = interfaceC10213yy02;
        this.f69505c = interfaceC10213yy03;
        this.f69506d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        KY kyZzb = ((MY) this.f69503a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f69504b.zzb();
        List list = (List) this.f69505c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f69506d.zzb();
        if (list.contains("54")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77228jc)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(kyZzb, ((Integer) Oc.A.c().a(C8784lf.f77228jc)).intValue(), scheduledExecutorService);
    }
}
