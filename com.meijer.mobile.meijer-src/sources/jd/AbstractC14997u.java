package jd;

import Vd.C5517k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import jd.C14987j;

/* renamed from: jd.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14997u<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C14987j.a f140400a;

    protected abstract void b(A a10, C5517k<Boolean> c5517k) throws RemoteException;

    public C14987j.a<L> a() {
        return this.f140400a;
    }

    protected AbstractC14997u(C14987j.a<L> aVar) {
        this.f140400a = aVar;
    }
}
