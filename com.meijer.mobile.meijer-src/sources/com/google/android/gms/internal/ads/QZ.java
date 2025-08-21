package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class QZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70426a;

    public QZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f70426a = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        AbstractC8575jh0 abstractC8575jh0T;
        C8347hZ c8347hZA = C8559jZ.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f70426a.zzb();
        if (((Boolean) Oc.A.c().a(C8784lf.f77178g4)).booleanValue()) {
            abstractC8575jh0T = AbstractC8575jh0.u(new C7870d10(c8347hZA, ((Integer) Oc.A.c().a(C8784lf.f77192h4)).intValue(), scheduledExecutorService));
        } else {
            abstractC8575jh0T = AbstractC8575jh0.t();
        }
        C9358qy0.b(abstractC8575jh0T);
        return abstractC8575jh0T;
    }
}
