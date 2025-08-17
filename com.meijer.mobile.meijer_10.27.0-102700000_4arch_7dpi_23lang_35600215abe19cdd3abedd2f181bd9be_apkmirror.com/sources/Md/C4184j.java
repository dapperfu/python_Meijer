package Md;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: Md.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4184j {

    /* renamed from: a, reason: collision with root package name */
    private final Bd.B f19428a;

    public void a() {
        try {
            this.f19428a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(float f10) {
        try {
            this.f19428a.B8(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f19428a.w(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f19428a.M(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(float f10, float f11) {
        try {
            this.f19428a.a8(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4184j)) {
            return false;
        }
        try {
            return this.f19428a.h6(((C4184j) obj).f19428a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(C4177c c4177c) {
        com.google.android.gms.common.internal.r.m(c4177c, "imageDescriptor must not be null");
        try {
            this.f19428a.D(c4177c.a());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(LatLng latLng) {
        try {
            this.f19428a.s3(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(LatLngBounds latLngBounds) {
        try {
            this.f19428a.a1(latLngBounds);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19428a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(Object obj) {
        try {
            this.f19428a.t0(com.google.android.gms.dynamic.d.F2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f19428a.X(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f19428a.I(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f19428a.Q4(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4184j(Bd.B b10) {
        this.f19428a = (Bd.B) com.google.android.gms.common.internal.r.l(b10);
    }
}
