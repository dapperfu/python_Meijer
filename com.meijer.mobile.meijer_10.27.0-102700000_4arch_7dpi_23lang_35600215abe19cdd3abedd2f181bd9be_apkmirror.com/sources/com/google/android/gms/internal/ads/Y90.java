package com.google.android.gms.internal.ads;

import Mc.InterfaceC4105c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class Y90 extends AbstractC10040ya0 {
    @Override // com.google.android.gms.internal.ads.AbstractC10040ya0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((Mc.V) obj).zzk());
        } catch (RemoteException e10) {
            Qc.p.c("Failed to get response info for  the interstitial ad.", e10);
            return Optional.empty();
        }
    }

    public Y90(ClientApi clientApi, Context context, int i10, InterfaceC6631Cl interfaceC6631Cl, Mc.J1 j12, InterfaceC4105c0 interfaceC4105c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        super(clientApi, context, i10, interfaceC6631Cl, j12, interfaceC4105c0, scheduledExecutorService, w90, fVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10040ya0
    protected final com.google.common.util.concurrent.q e() {
        C8244hk0 c8244hk0D = C8244hk0.D();
        Mc.V vW3 = this.f80243a.w3(com.google.android.gms.dynamic.d.F2(this.f80244b), new Mc.d2(), this.f80247e.f19145a, this.f80246d, this.f80245c);
        if (vW3 != null) {
            try {
                vW3.Y8(this.f80247e.f19147c, new X90(this, c8244hk0D, vW3));
                return c8244hk0D;
            } catch (RemoteException e10) {
                Qc.p.h("Failed to load interstitial ad.", e10);
                c8244hk0D.h(new zzfjc(1, "remote exception"));
                return c8244hk0D;
            }
        }
        c8244hk0D.h(new zzfjc(1, "Failed to create an interstitial ad manager."));
        return c8244hk0D;
    }
}
