package Md;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

/* renamed from: Md.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4194u {

    /* renamed from: a, reason: collision with root package name */
    private final Bd.k f19487a;

    public void a() {
        try {
            this.f19487a.zzp();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f19487a.B0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(int i10) {
        try {
            this.f19487a.E0(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(C4180f c4180f) {
        com.google.android.gms.common.internal.r.m(c4180f, "endCap must not be null");
        try {
            this.f19487a.n3(c4180f);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f19487a.Q2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4194u)) {
            return false;
        }
        try {
            return this.f19487a.Q7(((C4194u) obj).f19487a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(int i10) {
        try {
            this.f19487a.zzu(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(List<C4190p> list) {
        try {
            this.f19487a.zzv(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(List<LatLng> list) {
        com.google.android.gms.common.internal.r.m(list, "points must not be null");
        try {
            this.f19487a.zzw(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19487a.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(List<D> list) {
        try {
            this.f19487a.zzx(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(C4180f c4180f) {
        com.google.android.gms.common.internal.r.m(c4180f, "startCap must not be null");
        try {
            this.f19487a.o9(c4180f);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(Object obj) {
        try {
            this.f19487a.K(com.google.android.gms.dynamic.d.F2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f19487a.N2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f19487a.R0(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(float f10) {
        try {
            this.f19487a.U(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4194u(Bd.k kVar) {
        this.f19487a = (Bd.k) com.google.android.gms.common.internal.r.l(kVar);
    }
}
