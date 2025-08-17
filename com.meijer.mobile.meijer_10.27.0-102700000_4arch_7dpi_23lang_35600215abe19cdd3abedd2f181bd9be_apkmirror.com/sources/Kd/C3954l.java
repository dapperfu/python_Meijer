package Kd;

import Ld.InterfaceC4052g;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: Kd.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3954l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4052g f16436a;

    /* renamed from: Kd.l$a */
    public interface a {
        void a(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: Kd.l$b */
    public interface b {
        void a(Md.A a10);
    }

    /* renamed from: Kd.l$c */
    public interface c {
        void a(com.google.android.gms.maps.model.a aVar);
    }

    /* renamed from: Kd.l$d */
    public interface d {
        void a(com.google.android.gms.maps.model.a aVar);
    }

    public Md.A b() {
        try {
            return this.f16436a.c2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void c(a aVar) {
        try {
            if (aVar == null) {
                this.f16436a.f3(null);
            } else {
                this.f16436a.f3(new r(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void d(b bVar) {
        try {
            if (bVar == null) {
                this.f16436a.m4(null);
            } else {
                this.f16436a.m4(new q(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void e(c cVar) {
        try {
            if (cVar == null) {
                this.f16436a.k5(null);
            } else {
                this.f16436a.k5(new s(this, cVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void f(d dVar) {
        try {
            if (dVar == null) {
                this.f16436a.B2(null);
            } else {
                this.f16436a.B2(new t(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(boolean z10) {
        try {
            this.f16436a.M5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(LatLng latLng) {
        try {
            this.f16436a.x1(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(LatLng latLng, int i10) {
        try {
            this.f16436a.M3(latLng, i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(LatLng latLng, int i10, Md.B b10) {
        try {
            this.f16436a.R3(latLng, i10, b10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(String str) {
        try {
            this.f16436a.B1(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f16436a.U7(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(boolean z10) {
        try {
            this.f16436a.T3(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(boolean z10) {
        try {
            this.f16436a.q6(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C3954l(InterfaceC4052g interfaceC4052g) {
        this.f16436a = (InterfaceC4052g) com.google.android.gms.common.internal.r.m(interfaceC4052g, "delegate");
    }

    public void a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j10) {
        com.google.android.gms.common.internal.r.l(streetViewPanoramaCamera);
        try {
            this.f16436a.D7(streetViewPanoramaCamera, j10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
