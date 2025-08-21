package com.google.android.gms.internal.ads;

import Oc.InterfaceC4383c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class V90 extends AbstractC10165ya0 {
    @Override // com.google.android.gms.internal.ads.AbstractC10165ya0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((InterfaceC9526sc) obj).zzf());
        } catch (RemoteException e10) {
            Sc.p.c("Failed to get response info for the app open ad.", e10);
            return Optional.empty();
        }
    }

    public V90(ClientApi clientApi, Context context, int i10, InterfaceC6756Cl interfaceC6756Cl, Oc.J1 j12, InterfaceC4383c0 interfaceC4383c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        super(clientApi, context, i10, interfaceC6756Cl, j12, interfaceC4383c0, scheduledExecutorService, w90, fVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10165ya0
    protected final com.google.common.util.concurrent.q e() {
        C8369hk0 c8369hk0D = C8369hk0.D();
        Oc.V vR2 = this.f81083a.r2(com.google.android.gms.dynamic.d.I2(this.f81084b), Oc.d2.T(), this.f81087e.f23332a, this.f81086d, this.f81085c);
        if (vR2 != null) {
            try {
                vR2.V4(new U90(this, c8369hk0D, this.f81087e));
                vR2.W7(this.f81087e.f23334c);
                return c8369hk0D;
            } catch (RemoteException e10) {
                Sc.p.h("Failed to load app open ad.", e10);
                c8369hk0D.h(new zzfjc(1, "remote exception"));
                return c8369hk0D;
            }
        }
        c8369hk0D.h(new zzfjc(1, "Failed to create an app open ad manager."));
        return c8369hk0D;
    }
}
