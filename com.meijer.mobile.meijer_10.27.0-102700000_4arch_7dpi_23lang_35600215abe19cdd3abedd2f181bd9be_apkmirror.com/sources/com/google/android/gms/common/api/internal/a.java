package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.r;

/* loaded from: classes4.dex */
public abstract class a<R extends k, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: p, reason: collision with root package name */
    private final a.c<A> f64772p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<?> f64773q;

    protected abstract void k(A a10) throws RemoteException;

    protected void l(R r10) {
    }

    protected a(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.e eVar) {
        super((com.google.android.gms.common.api.e) r.m(eVar, "GoogleApiClient must not be null"));
        r.m(aVar, "Api must not be null");
        this.f64772p = aVar.b();
        this.f64773q = aVar;
    }

    private void n(RemoteException remoteException) {
        o(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public final void m(A a10) throws DeadObjectException {
        try {
            k(a10);
        } catch (DeadObjectException e10) {
            n(e10);
            throw e10;
        } catch (RemoteException e11) {
            n(e11);
        }
    }

    public final void o(Status status) {
        r.b(!status.d1(), "Failed result must not be success");
        R rB = b(status);
        e(rB);
        l(rB);
    }
}
