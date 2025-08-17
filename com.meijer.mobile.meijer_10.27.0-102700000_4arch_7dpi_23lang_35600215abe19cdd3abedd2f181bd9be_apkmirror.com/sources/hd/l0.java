package hd;

import Td.C5233k;
import android.os.RemoteException;
import gd.C14244c;
import hd.C14409j;

/* loaded from: classes4.dex */
public final class l0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final X f134669c;

    public l0(X x10, C5233k c5233k) {
        super(3, c5233k);
        this.f134669c = x10;
    }

    @Override // hd.o0
    public final /* bridge */ /* synthetic */ void d(C14422x c14422x, boolean z10) {
    }

    @Override // hd.P
    public final boolean f(H h10) {
        return this.f134669c.f134603a.f();
    }

    @Override // hd.P
    public final C14244c[] g(H h10) {
        return this.f134669c.f134603a.c();
    }

    @Override // hd.j0
    public final void h(H h10) throws RemoteException {
        this.f134669c.f134603a.d(h10.t(), this.f134656b);
        C14409j.a aVarB = this.f134669c.f134603a.b();
        if (aVarB != null) {
            h10.v().put(aVarB, this.f134669c);
        }
    }
}
