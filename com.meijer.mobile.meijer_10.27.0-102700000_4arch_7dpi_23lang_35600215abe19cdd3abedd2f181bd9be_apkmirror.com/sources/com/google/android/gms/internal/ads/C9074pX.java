package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9074pX {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9715vX f77596a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77597b;

    /* renamed from: c, reason: collision with root package name */
    private Mc.U0 f77598c;

    public C9074pX(InterfaceC9715vX interfaceC9715vX, String str) {
        this.f77596a = interfaceC9715vX;
        this.f77597b = str;
    }

    public final synchronized String a() {
        Mc.U0 u02;
        try {
            u02 = this.f77598c;
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return u02 != null ? u02.zzg() : null;
    }

    public final synchronized String b() {
        Mc.U0 u02;
        try {
            u02 = this.f77598c;
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return u02 != null ? u02.zzg() : null;
    }

    public final synchronized void d(Mc.Y1 y12, int i10) throws RemoteException {
        this.f77598c = null;
        C9822wX c9822wX = new C9822wX(i10);
        C8967oX c8967oX = new C8967oX(this);
        this.f77596a.a(y12, this.f77597b, c9822wX, c8967oX);
    }

    public final synchronized boolean e() throws RemoteException {
        return this.f77596a.zza();
    }
}
