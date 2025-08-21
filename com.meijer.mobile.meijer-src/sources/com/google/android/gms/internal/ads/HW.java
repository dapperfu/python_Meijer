package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class HW extends Oc.M {

    /* renamed from: a, reason: collision with root package name */
    private final C9199pX f68290a;

    @Override // Oc.N
    public final synchronized void L5(Oc.Y1 y12, int i10) throws RemoteException {
        this.f68290a.d(y12, i10);
    }

    @Override // Oc.N
    public final synchronized String zze() {
        return this.f68290a.a();
    }

    @Override // Oc.N
    public final synchronized String zzf() {
        return this.f68290a.b();
    }

    @Override // Oc.N
    public final synchronized boolean zzi() throws RemoteException {
        return this.f68290a.e();
    }

    @Override // Oc.N
    public final void h6(Oc.Y1 y12) throws RemoteException {
        this.f68290a.d(y12, 1);
    }

    public HW(Context context, AbstractC9135ou abstractC9135ou, C9481s60 c9481s60, II ii2, Oc.H h10) {
        C9519sX c9519sX = new C9519sX(ii2, abstractC9135ou.q());
        c9519sX.e(h10);
        this.f68290a = new C9199pX(new CX(abstractC9135ou, context, c9519sX, c9481s60), c9481s60.l());
    }
}
