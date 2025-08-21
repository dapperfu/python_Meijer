package com.google.android.gms.internal.ads;

import Oc.InterfaceC4383c0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ca0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6738Ca0 extends AbstractC10165ya0 {
    @Override // com.google.android.gms.internal.ads.AbstractC10165ya0
    protected final /* bridge */ /* synthetic */ Optional f(Object obj) {
        try {
            return Optional.ofNullable(((InterfaceC7844cp) obj).zzc());
        } catch (RemoteException e10) {
            Sc.p.c("Failed to get response info for the rewarded ad.", e10);
            return Optional.empty();
        }
    }

    public C6738Ca0(ClientApi clientApi, Context context, int i10, InterfaceC6756Cl interfaceC6756Cl, Oc.J1 j12, InterfaceC4383c0 interfaceC4383c0, ScheduledExecutorService scheduledExecutorService, W90 w90, com.google.android.gms.common.util.f fVar) {
        super(clientApi, context, i10, interfaceC6756Cl, j12, interfaceC4383c0, scheduledExecutorService, w90, fVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10165ya0
    protected final com.google.common.util.concurrent.q e() {
        C8369hk0 c8369hk0D = C8369hk0.D();
        InterfaceC7844cp interfaceC7844cpG2 = this.f81083a.G2(com.google.android.gms.dynamic.d.I2(this.f81084b), this.f81087e.f23332a, this.f81086d, this.f81085c);
        BinderC6704Ba0 binderC6704Ba0 = new BinderC6704Ba0(this, c8369hk0D, interfaceC7844cpG2);
        if (interfaceC7844cpG2 != null) {
            try {
                interfaceC7844cpG2.j6(this.f81087e.f23334c, binderC6704Ba0);
                return c8369hk0D;
            } catch (RemoteException unused) {
                Sc.p.g("Failed to load rewarded ad.");
                c8369hk0D.h(new zzfjc(1, "remote exception"));
                return c8369hk0D;
            }
        }
        c8369hk0D.h(new zzfjc(1, "Failed to create a rewarded ad."));
        return c8369hk0D;
    }
}
