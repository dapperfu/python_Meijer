package Od;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Dd.n f23580a;

    public void a() {
        try {
            this.f23580a.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void b() {
        try {
            this.f23580a.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f23580a.J(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f23580a.C6(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f23580a.t0(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        try {
            return this.f23580a.X8(((F) obj).f23580a);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void f(float f10) {
        try {
            this.f23580a.C5(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f23580a.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public F(Dd.n nVar) {
        this.f23580a = (Dd.n) com.google.android.gms.common.internal.r.l(nVar);
    }
}
