package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

/* renamed from: Od.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4470s {

    /* renamed from: a, reason: collision with root package name */
    private final Dd.h f23662a;

    public void a() {
        try {
            this.f23662a.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f23662a.w(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(int i10) {
        try {
            this.f23662a.C0(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f23662a.J0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(List<? extends List<LatLng>> list) {
        try {
            this.f23662a.j0(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4470s)) {
            return false;
        }
        try {
            return this.f23662a.M7(((C4470s) obj).f23662a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(List<LatLng> list) {
        try {
            com.google.android.gms.common.internal.r.m(list, "points must not be null.");
            this.f23662a.c0(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f23662a.zzu(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(int i10) {
        try {
            this.f23662a.n1(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23662a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(List<C4468p> list) {
        try {
            this.f23662a.zzw(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f23662a.F(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(Object obj) {
        try {
            this.f23662a.E6(com.google.android.gms.dynamic.d.I2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f23662a.d0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f23662a.K2(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4470s(Dd.h hVar) {
        this.f23662a = (Dd.h) com.google.android.gms.common.internal.r.l(hVar);
    }
}
