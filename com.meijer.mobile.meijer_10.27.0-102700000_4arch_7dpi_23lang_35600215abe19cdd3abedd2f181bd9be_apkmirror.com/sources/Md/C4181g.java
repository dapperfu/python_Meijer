package Md;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;

/* renamed from: Md.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4181g {

    /* renamed from: a, reason: collision with root package name */
    private final Bd.y f19416a;

    public void a() {
        try {
            this.f19416a.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b(LatLng latLng) {
        try {
            com.google.android.gms.common.internal.r.m(latLng, "center must not be null.");
            this.f19416a.a6(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f19416a.w(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f19416a.z0(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(double d10) {
        try {
            this.f19416a.W7(d10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4181g)) {
            return false;
        }
        try {
            return this.f19416a.T7(((C4181g) obj).f19416a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(int i10) {
        try {
            this.f19416a.zzs(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void g(List<C4190p> list) {
        try {
            this.f19416a.a0(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f19416a.W2(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f19416a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void i(Object obj) {
        try {
            this.f19416a.t0(com.google.android.gms.dynamic.d.F2(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f19416a.u4(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f19416a.F(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4181g(Bd.y yVar) {
        this.f19416a = (Bd.y) com.google.android.gms.common.internal.r.l(yVar);
    }
}
