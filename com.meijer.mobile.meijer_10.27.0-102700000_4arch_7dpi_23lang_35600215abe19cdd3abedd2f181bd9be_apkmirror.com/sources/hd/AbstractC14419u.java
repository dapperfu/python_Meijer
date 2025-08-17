package hd;

import Td.C5233k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import hd.C14409j;

/* renamed from: hd.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14419u<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C14409j.a f134711a;

    protected abstract void b(A a10, C5233k<Boolean> c5233k) throws RemoteException;

    public C14409j.a<L> a() {
        return this.f134711a;
    }

    protected AbstractC14419u(C14409j.a<L> aVar) {
        this.f134711a = aVar;
    }
}
