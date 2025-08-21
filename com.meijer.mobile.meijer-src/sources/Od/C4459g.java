package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

/* renamed from: Od.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4459g {

    /* renamed from: a, reason: collision with root package name */
    private final Dd.y f23603a;

    public void a() {
        try {
            this.f23603a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(LatLng latLng) {
        try {
            com.google.android.gms.common.internal.r.m(latLng, "center must not be null.");
            this.f23603a.q6(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f23603a.w(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f23603a.C0(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(double d10) {
        try {
            this.f23603a.T7(d10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4459g)) {
            return false;
        }
        try {
            return this.f23603a.e2(((C4459g) obj).f23603a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(int i10) {
        try {
            this.f23603a.zzs(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(List<C4468p> list) {
        try {
            this.f23603a.c0(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f23603a.b3(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f23603a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(Object obj) {
        try {
            this.f23603a.u0(com.google.android.gms.dynamic.d.I2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f23603a.H4(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f23603a.F(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4459g(Dd.y yVar) {
        this.f23603a = (Dd.y) com.google.android.gms.common.internal.r.l(yVar);
    }
}
