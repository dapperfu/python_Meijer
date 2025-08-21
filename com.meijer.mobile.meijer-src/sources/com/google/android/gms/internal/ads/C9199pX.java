package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9199pX {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9840vX f78436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78437b;

    /* renamed from: c, reason: collision with root package name */
    private Oc.U0 f78438c;

    public C9199pX(InterfaceC9840vX interfaceC9840vX, String str) {
        this.f78436a = interfaceC9840vX;
        this.f78437b = str;
    }

    public final synchronized String a() {
        Oc.U0 u02;
        try {
            u02 = this.f78438c;
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return u02 != null ? u02.zzg() : null;
    }

    public final synchronized String b() {
        Oc.U0 u02;
        try {
            u02 = this.f78438c;
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
            return null;
        }
        return u02 != null ? u02.zzg() : null;
    }

    public final synchronized void d(Oc.Y1 y12, int i10) throws RemoteException {
        this.f78438c = null;
        C9947wX c9947wX = new C9947wX(i10);
        C9092oX c9092oX = new C9092oX(this);
        this.f78436a.a(y12, this.f78437b, c9947wX, c9092oX);
    }

    public final synchronized boolean e() throws RemoteException {
        return this.f78436a.zza();
    }
}
