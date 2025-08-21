package Md;

import Nd.InterfaceC4184g;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: Md.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4119l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4184g f19795a;

    /* renamed from: Md.l$a */
    public interface a {
        void a(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: Md.l$b */
    public interface b {
        void a(Od.A a10);
    }

    /* renamed from: Md.l$c */
    public interface c {
        void a(com.google.android.gms.maps.model.a aVar);
    }

    /* renamed from: Md.l$d */
    public interface d {
        void a(com.google.android.gms.maps.model.a aVar);
    }

    public Od.A b() {
        try {
            return this.f19795a.d2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void c(a aVar) {
        try {
            if (aVar == null) {
                this.f19795a.Z0(null);
            } else {
                this.f19795a.Z0(new r(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void d(b bVar) {
        try {
            if (bVar == null) {
                this.f19795a.h4(null);
            } else {
                this.f19795a.h4(new q(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void e(c cVar) {
        try {
            if (cVar == null) {
                this.f19795a.l7(null);
            } else {
                this.f19795a.l7(new s(this, cVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void f(d dVar) {
        try {
            if (dVar == null) {
                this.f19795a.j7(null);
            } else {
                this.f19795a.j7(new t(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(boolean z10) {
        try {
            this.f19795a.V5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(LatLng latLng) {
        try {
            this.f19795a.H1(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(LatLng latLng, int i10) {
        try {
            this.f19795a.Y3(latLng, i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(LatLng latLng, int i10, Od.B b10) {
        try {
            this.f19795a.N2(latLng, i10, b10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(String str) {
        try {
            this.f19795a.L1(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f19795a.Q7(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(boolean z10) {
        try {
            this.f19795a.f4(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(boolean z10) {
        try {
            this.f19795a.F6(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4119l(InterfaceC4184g interfaceC4184g) {
        this.f19795a = (InterfaceC4184g) com.google.android.gms.common.internal.r.m(interfaceC4184g, "delegate");
    }

    public void a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j10) {
        com.google.android.gms.common.internal.r.l(streetViewPanoramaCamera);
        try {
            this.f19795a.H7(streetViewPanoramaCamera, j10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
