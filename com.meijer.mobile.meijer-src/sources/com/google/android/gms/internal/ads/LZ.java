package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class LZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69222a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69223b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f69224c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f69225d;

    public LZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f69222a = interfaceC10213yy0;
        this.f69223b = interfaceC10213yy02;
        this.f69224c = interfaceC10213yy03;
        this.f69225d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C10055xY c10055xYZzb = ((C10269zY) this.f69222a).zzb();
        C8133fZ c8133fZ = (C8133fZ) this.f69223b.zzb();
        List list = (List) this.f69224c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f69225d.zzb();
        if (list.contains("10")) {
            return new C7870d10(c8133fZ, ((Integer) Oc.A.c().a(C8784lf.f77102ac)).intValue(), scheduledExecutorService);
        }
        return new C7870d10(c10055xYZzb, ((Integer) Oc.A.c().a(C8784lf.f77102ac)).intValue(), scheduledExecutorService);
    }
}
