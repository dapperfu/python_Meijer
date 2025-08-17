package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class QZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69586a;

    public QZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f69586a = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        AbstractC8450jh0 abstractC8450jh0T;
        C8222hZ c8222hZA = C8434jZ.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f69586a.zzb();
        if (((Boolean) Mc.A.c().a(C8659lf.f76338g4)).booleanValue()) {
            abstractC8450jh0T = AbstractC8450jh0.u(new C7745d10(c8222hZA, ((Integer) Mc.A.c().a(C8659lf.f76352h4)).intValue(), scheduledExecutorService));
        } else {
            abstractC8450jh0T = AbstractC8450jh0.t();
        }
        C9233qy0.b(abstractC8450jh0T);
        return abstractC8450jh0T;
    }
}
