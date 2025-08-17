package com.google.android.gms.internal.ads;

import Mc.InterfaceC4105c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ca0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6613Ca0 extends AbstractC10040ya0 {
    @Override // com.google.android.gms.internal.ads.AbstractC10040ya0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((InterfaceC7719cp) obj).zzc());
        } catch (RemoteException e10) {
            Qc.p.c("Failed to get response info for the rewarded ad.", e10);
            return Optional.empty();
        }
    }

    public C6613Ca0(ClientApi clientApi, Context context, int i10, InterfaceC6631Cl interfaceC6631Cl, Mc.J1 j12, InterfaceC4105c0 interfaceC4105c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        super(clientApi, context, i10, interfaceC6631Cl, j12, interfaceC4105c0, scheduledExecutorService, w90, fVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10040ya0
    protected final com.google.common.util.concurrent.q e() {
        C8244hk0 c8244hk0D = C8244hk0.D();
        InterfaceC7719cp interfaceC7719cpD2 = this.f80243a.D2(com.google.android.gms.dynamic.d.F2(this.f80244b), this.f80247e.f19145a, this.f80246d, this.f80245c);
        BinderC6579Ba0 binderC6579Ba0 = new BinderC6579Ba0(this, c8244hk0D, interfaceC7719cpD2);
        if (interfaceC7719cpD2 != null) {
            try {
                interfaceC7719cpD2.x9(this.f80247e.f19147c, binderC6579Ba0);
                return c8244hk0D;
            } catch (RemoteException unused) {
                Qc.p.g("Failed to load rewarded ad.");
                c8244hk0D.h(new zzfjc(1, "remote exception"));
                return c8244hk0D;
            }
        }
        c8244hk0D.h(new zzfjc(1, "Failed to create a rewarded ad."));
        return c8244hk0D;
    }
}
