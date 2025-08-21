package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Od.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4466n {

    /* renamed from: a, reason: collision with root package name */
    protected final Dd.e f23630a;

    public String a() {
        try {
            return this.f23630a.zzk();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f23630a.zzj();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public String c() {
        try {
            return this.f23630a.zzl();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public String d() {
        try {
            return this.f23630a.zzm();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e() {
        try {
            this.f23630a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4466n)) {
            return false;
        }
        try {
            return this.f23630a.x6(((C4466n) obj).f23630a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean f() {
        try {
            return this.f23630a.g();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g() {
        try {
            this.f23630a.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f23630a.V8(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23630a.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(float f10, float f11) {
        try {
            this.f23630a.I7(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f23630a.J0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f23630a.q2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(C4455c c4455c) {
        try {
            if (c4455c == null) {
                this.f23630a.o0(null);
            } else {
                this.f23630a.o0(c4455c.a());
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(float f10, float f11) {
        try {
            this.f23630a.f1(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f23630a.O1(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void o(float f10) {
        try {
            this.f23630a.F(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void p(String str) {
        try {
            this.f23630a.F0(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void q(Object obj) {
        try {
            this.f23630a.K(com.google.android.gms.dynamic.d.I2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void r(String str) {
        try {
            this.f23630a.u5(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void s(boolean z10) {
        try {
            this.f23630a.j1(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void t(float f10) {
        try {
            this.f23630a.U(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void u() {
        try {
            this.f23630a.e();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4466n(Dd.e eVar) {
        this.f23630a = (Dd.e) com.google.android.gms.common.internal.r.l(eVar);
    }
}
