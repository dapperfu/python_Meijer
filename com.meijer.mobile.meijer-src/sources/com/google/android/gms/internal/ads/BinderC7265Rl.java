package com.google.android.gms.internal.ads;

import Oc.InterfaceC4381b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7265Rl extends Oc.X0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f70770a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC4381b1 f70771b;

    @Override // Oc.Y0
    public final void J(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final void v5(InterfaceC4381b1 interfaceC4381b1) throws RemoteException {
        synchronized (this.f70770a) {
            this.f70771b = interfaceC4381b1;
        }
    }

    @Override // Oc.Y0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final InterfaceC4381b1 zzi() throws RemoteException {
        InterfaceC4381b1 interfaceC4381b1;
        synchronized (this.f70770a) {
            interfaceC4381b1 = this.f70771b;
        }
        return interfaceC4381b1;
    }

    @Override // Oc.Y0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Oc.Y0
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
