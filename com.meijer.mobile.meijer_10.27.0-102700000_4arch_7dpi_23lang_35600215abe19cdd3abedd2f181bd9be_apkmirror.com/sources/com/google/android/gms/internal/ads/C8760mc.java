package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8760mc extends Gc.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9401sc f76835a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76836b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC9081pc f76837c = new BinderC9081pc();

    @Override // Gc.a
    public final Ec.p a() {
        Mc.U0 u0Zzf;
        try {
            u0Zzf = this.f76835a.zzf();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
            u0Zzf = null;
        }
        return Ec.p.e(u0Zzf);
    }

    @Override // Gc.a
    public final void c(Activity activity) {
        try {
            this.f76835a.W4(com.google.android.gms.dynamic.d.F2(activity), this.f76837c);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public C8760mc(InterfaceC9401sc interfaceC9401sc, String str) {
        this.f76835a = interfaceC9401sc;
        this.f76836b = str;
    }
}
