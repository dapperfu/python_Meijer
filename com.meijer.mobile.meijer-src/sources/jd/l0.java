package jd;

import Vd.C5517k;
import android.os.RemoteException;
import id.C14720c;
import jd.C14987j;

/* loaded from: classes4.dex */
public final class l0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final X f140358c;

    public l0(X x10, C5517k c5517k) {
        super(3, c5517k);
        this.f140358c = x10;
    }

    @Override // jd.o0
    public final /* bridge */ /* synthetic */ void d(C15000x c15000x, boolean z10) {
    }

    @Override // jd.P
    public final boolean f(H h10) {
        return this.f140358c.f140292a.f();
    }

    @Override // jd.P
    public final C14720c[] g(H h10) {
        return this.f140358c.f140292a.c();
    }

    @Override // jd.j0
    public final void h(H h10) throws RemoteException {
        this.f140358c.f140292a.d(h10.t(), this.f140345b);
        C14987j.a aVarB = this.f140358c.f140292a.b();
        if (aVarB != null) {
            h10.v().put(aVarB, this.f140358c);
        }
    }
}
