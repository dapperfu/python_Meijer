package jd;

import Vd.C5517k;
import android.os.RemoteException;
import id.C14720c;
import jd.C14987j;

/* loaded from: classes4.dex */
public final class n0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final C14987j.a f140366c;

    public n0(C14987j.a aVar, C5517k c5517k) {
        super(4, c5517k);
        this.f140366c = aVar;
    }

    @Override // jd.o0
    public final /* bridge */ /* synthetic */ void d(C15000x c15000x, boolean z10) {
    }

    @Override // jd.P
    public final boolean f(H h10) {
        X x10 = (X) h10.v().get(this.f140366c);
        if (x10 != null && x10.f140292a.f()) {
            return true;
        }
        return false;
    }

    @Override // jd.P
    public final C14720c[] g(H h10) {
        X x10 = (X) h10.v().get(this.f140366c);
        if (x10 == null) {
            return null;
        }
        return x10.f140292a.c();
    }

    @Override // jd.j0
    public final void h(H h10) throws RemoteException {
        X x10 = (X) h10.v().remove(this.f140366c);
        if (x10 != null) {
            x10.f140293b.b(h10.t(), this.f140345b);
            x10.f140292a.a();
            return;
        }
        this.f140345b.e(Boolean.FALSE);
    }
}
