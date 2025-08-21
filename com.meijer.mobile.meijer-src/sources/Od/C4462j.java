package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Od.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4462j {

    /* renamed from: a, reason: collision with root package name */
    private final Dd.B f23615a;

    public void a() {
        try {
            this.f23615a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(float f10) {
        try {
            this.f23615a.u8(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f23615a.w(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f23615a.M(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(float f10, float f11) {
        try {
            this.f23615a.V7(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4462j)) {
            return false;
        }
        try {
            return this.f23615a.F5(((C4462j) obj).f23615a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(C4455c c4455c) {
        com.google.android.gms.common.internal.r.m(c4455c, "imageDescriptor must not be null");
        try {
            this.f23615a.D(c4455c.a());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(LatLng latLng) {
        try {
            this.f23615a.C3(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(LatLngBounds latLngBounds) {
        try {
            this.f23615a.e1(latLngBounds);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23615a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(Object obj) {
        try {
            this.f23615a.u0(com.google.android.gms.dynamic.d.I2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f23615a.Y(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f23615a.I(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f23615a.f5(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4462j(Dd.B b10) {
        this.f23615a = (Dd.B) com.google.android.gms.common.internal.r.l(b10);
    }
}
