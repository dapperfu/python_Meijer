package jd;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f140377a;

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(H h10) throws DeadObjectException;

    public abstract void d(C15000x c15000x, boolean z10);

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public o0(int i10) {
        this.f140377a = i10;
    }
}
