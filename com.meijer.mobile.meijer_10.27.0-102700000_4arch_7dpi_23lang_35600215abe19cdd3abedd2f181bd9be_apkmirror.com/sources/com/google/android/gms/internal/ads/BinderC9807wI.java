package com.google.android.gms.internal.ads;

import Mc.InterfaceC4103b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.wI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9807wI extends Mc.X0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f79466a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Mc.Y0 f79467b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7106Ql f79468c;

    @Override // Mc.Y0
    public final void I6(InterfaceC4103b1 interfaceC4103b1) throws RemoteException {
        synchronized (this.f79466a) {
            try {
                Mc.Y0 y02 = this.f79467b;
                if (y02 != null) {
                    y02.I6(interfaceC4103b1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
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
        InterfaceC7106Ql interfaceC7106Ql = this.f79468c;
        if (interfaceC7106Ql != null) {
            return interfaceC7106Ql.zzg();
        }
        return 0.0f;
    }

    @Override // Mc.Y0
    public final float zzg() throws RemoteException {
        InterfaceC7106Ql interfaceC7106Ql = this.f79468c;
        if (interfaceC7106Ql != null) {
            return interfaceC7106Ql.zzh();
        }
        return 0.0f;
    }

    @Override // Mc.Y0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // Mc.Y0
    public final InterfaceC4103b1 zzi() throws RemoteException {
        synchronized (this.f79466a) {
            try {
                Mc.Y0 y02 = this.f79467b;
                if (y02 == null) {
                    return null;
                }
                return y02.zzi();
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    public BinderC9807wI(Mc.Y0 y02, InterfaceC7106Ql interfaceC7106Ql) {
        this.f79467b = y02;
        this.f79468c = interfaceC7106Ql;
    }
}
