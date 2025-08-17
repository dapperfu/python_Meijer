package com.google.android.gms.internal.ads;

import Mc.InterfaceC4103b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7140Rl extends Mc.X0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f69930a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC4103b1 f69931b;

    @Override // Mc.Y0
    public final void I6(InterfaceC4103b1 interfaceC4103b1) throws RemoteException {
        synchronized (this.f69930a) {
            this.f69931b = interfaceC4103b1;
        }
    }

    @Override // Mc.Y0
    public final void J(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final InterfaceC4103b1 zzi() throws RemoteException {
        InterfaceC4103b1 interfaceC4103b1;
        synchronized (this.f69930a) {
            interfaceC4103b1 = this.f69931b;
        }
        return interfaceC4103b1;
    }

    @Override // Mc.Y0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
