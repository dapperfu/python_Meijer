package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

/* renamed from: Od.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4472u {

    /* renamed from: a, reason: collision with root package name */
    private final Dd.k f23674a;

    public void a() {
        try {
            this.f23674a.zzp();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f23674a.E0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(int i10) {
        try {
            this.f23674a.H0(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(C4458f c4458f) {
        com.google.android.gms.common.internal.r.m(c4458f, "endCap must not be null");
        try {
            this.f23674a.o2(c4458f);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f23674a.X2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4472u)) {
            return false;
        }
        try {
            return this.f23674a.L2(((C4472u) obj).f23674a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(int i10) {
        try {
            this.f23674a.zzu(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(List<C4468p> list) {
        try {
            this.f23674a.zzv(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(List<LatLng> list) {
        com.google.android.gms.common.internal.r.m(list, "points must not be null");
        try {
            this.f23674a.zzw(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23674a.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(List<D> list) {
        try {
            this.f23674a.zzx(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(C4458f c4458f) {
        com.google.android.gms.common.internal.r.m(c4458f, "startCap must not be null");
        try {
            this.f23674a.o3(c4458f);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(Object obj) {
        try {
            this.f23674a.K(com.google.android.gms.dynamic.d.I2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f23674a.U2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f23674a.Q0(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(float f10) {
        try {
            this.f23674a.U(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4472u(Dd.k kVar) {
        this.f23674a = (Dd.k) com.google.android.gms.common.internal.r.l(kVar);
    }
}
