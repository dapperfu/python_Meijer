package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class HW extends Mc.M {

    /* renamed from: a, reason: collision with root package name */
    private final C9074pX f67450a;

    @Override // Mc.N
    public final synchronized void L3(Mc.Y1 y12, int i10) throws RemoteException {
        this.f67450a.d(y12, i10);
    }

    @Override // Mc.N
    public final synchronized String zze() {
        return this.f67450a.a();
    }

    @Override // Mc.N
    public final synchronized String zzf() {
        return this.f67450a.b();
    }

    @Override // Mc.N
    public final synchronized boolean zzi() throws RemoteException {
        return this.f67450a.e();
    }

    @Override // Mc.N
    public final void w7(Mc.Y1 y12) throws RemoteException {
        this.f67450a.d(y12, 1);
    }

    public HW(Context context, AbstractC9010ou abstractC9010ou, C9356s60 c9356s60, II ii2, Mc.H h10) {
        C9394sX c9394sX = new C9394sX(ii2, abstractC9010ou.q());
        c9394sX.e(h10);
        this.f67450a = new C9074pX(new CX(abstractC9010ou, context, c9394sX, c9356s60), c9356s60.l());
    }
}
