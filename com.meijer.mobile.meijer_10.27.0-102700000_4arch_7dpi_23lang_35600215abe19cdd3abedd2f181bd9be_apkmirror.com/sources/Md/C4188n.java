package Md;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4188n {

    /* renamed from: a, reason: collision with root package name */
    protected final Bd.e f19443a;

    public String a() {
        try {
            return this.f19443a.zzk();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f19443a.zzj();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public String c() {
        try {
            return this.f19443a.zzl();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public String d() {
        try {
            return this.f19443a.zzm();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e() {
        try {
            this.f19443a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4188n)) {
            return false;
        }
        try {
            return this.f19443a.c3(((C4188n) obj).f19443a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean f() {
        try {
            return this.f19443a.f();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g() {
        try {
            this.f19443a.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f19443a.V8(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19443a.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(float f10, float f11) {
        try {
            this.f19443a.E7(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f19443a.G0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f19443a.p2(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(C4177c c4177c) {
        try {
            if (c4177c == null) {
                this.f19443a.n0(null);
            } else {
                this.f19443a.n0(c4177c.a());
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void m(float f10, float f11) {
        try {
            this.f19443a.c1(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void n(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f19443a.H1(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void o(float f10) {
        try {
            this.f19443a.F(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void p(String str) {
        try {
            this.f19443a.C0(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void q(Object obj) {
        try {
            this.f19443a.K(com.google.android.gms.dynamic.d.F2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void r(String str) {
        try {
            this.f19443a.o5(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void s(boolean z10) {
        try {
            this.f19443a.h1(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void t(float f10) {
        try {
            this.f19443a.U(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void u() {
        try {
            this.f19443a.e();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4188n(Bd.e eVar) {
        this.f19443a = (Bd.e) com.google.android.gms.common.internal.r.l(eVar);
    }
}
