package Md;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Bd.n f19393a;

    public void a() {
        try {
            this.f19393a.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b() {
        try {
            this.f19393a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f19393a.J(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f19393a.m6(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f19393a.s0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        try {
            return this.f19393a.f1(((F) obj).f19393a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(float f10) {
        try {
            this.f19393a.v5(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19393a.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public F(Bd.n nVar) {
        this.f19393a = (Bd.n) com.google.android.gms.common.internal.r.l(nVar);
    }
}
