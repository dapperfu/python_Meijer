package com.google.android.gms.internal.ads;

import Ec.r;
import Mc.InterfaceC4103b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9382sL extends r.a {

    /* renamed from: a, reason: collision with root package name */
    private final C9914xI f78223a;

    public C9382sL(C9914xI c9914xI) {
        this.f78223a = c9914xI;
    }

    @Override // Ec.r.a
    public final void a() {
        InterfaceC4103b1 interfaceC4103b1F = f(this.f78223a);
        if (interfaceC4103b1F == null) {
            return;
        }
        try {
            interfaceC4103b1F.zze();
        } catch (RemoteException e10) {
            Qc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // Ec.r.a
    public final void c() {
        InterfaceC4103b1 interfaceC4103b1F = f(this.f78223a);
        if (interfaceC4103b1F == null) {
            return;
        }
        try {
            interfaceC4103b1F.zzg();
        } catch (RemoteException e10) {
            Qc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // Ec.r.a
    public final void e() {
        InterfaceC4103b1 interfaceC4103b1F = f(this.f78223a);
        if (interfaceC4103b1F == null) {
            return;
        }
        try {
            interfaceC4103b1F.zzi();
        } catch (RemoteException e10) {
            Qc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    private static InterfaceC4103b1 f(C9914xI c9914xI) {
        Mc.Y0 y0W = c9914xI.W();
        if (y0W == null) {
            return null;
        }
        try {
            return y0W.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
