package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8885mc extends Ic.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9526sc f77675a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77676b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC9206pc f77677c = new BinderC9206pc();

    @Override // Ic.a
    public final Gc.p a() {
        Oc.U0 u0Zzf;
        try {
            u0Zzf = this.f77675a.zzf();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
            u0Zzf = null;
        }
        return Gc.p.e(u0Zzf);
    }

    @Override // Ic.a
    public final void c(Activity activity) {
        try {
            this.f77675a.j5(com.google.android.gms.dynamic.d.I2(activity), this.f77677c);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public C8885mc(InterfaceC9526sc interfaceC9526sc, String str) {
        this.f77675a = interfaceC9526sc;
        this.f77676b = str;
    }
}
