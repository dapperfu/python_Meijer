package jd;

import Vd.C5517k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
abstract class j0 extends P {

    /* renamed from: b, reason: collision with root package name */
    protected final C5517k f140345b;

    protected abstract void h(H h10) throws RemoteException;

    @Override // jd.o0
    public final void a(Status status) {
        this.f140345b.d(new ApiException(status));
    }

    @Override // jd.o0
    public final void b(Exception exc) {
        this.f140345b.d(exc);
    }

    public j0(int i10, C5517k c5517k) {
        super(i10);
        this.f140345b = c5517k;
    }

    @Override // jd.o0
    public final void c(H h10) throws DeadObjectException {
        try {
            h(h10);
        } catch (DeadObjectException e10) {
            a(o0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f140345b.d(e12);
        }
    }
}
