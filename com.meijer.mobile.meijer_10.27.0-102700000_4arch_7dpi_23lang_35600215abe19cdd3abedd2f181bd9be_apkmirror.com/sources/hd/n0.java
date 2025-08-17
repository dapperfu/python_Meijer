package hd;

import Td.C5233k;
import android.os.RemoteException;
import gd.C14244c;
import hd.C14409j;

/* loaded from: classes4.dex */
public final class n0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final C14409j.a f134677c;

    public n0(C14409j.a aVar, C5233k c5233k) {
        super(4, c5233k);
        this.f134677c = aVar;
    }

    @Override // hd.o0
    public final /* bridge */ /* synthetic */ void d(C14422x c14422x, boolean z10) {
    }

    @Override // hd.P
    public final boolean f(H h10) {
        X x10 = (X) h10.v().get(this.f134677c);
        if (x10 != null && x10.f134603a.f()) {
            return true;
        }
        return false;
    }

    @Override // hd.P
    public final C14244c[] g(H h10) {
        X x10 = (X) h10.v().get(this.f134677c);
        if (x10 == null) {
            return null;
        }
        return x10.f134603a.c();
    }

    @Override // hd.j0
    public final void h(H h10) throws RemoteException {
        X x10 = (X) h10.v().remove(this.f134677c);
        if (x10 != null) {
            x10.f134604b.b(h10.t(), this.f134656b);
            x10.f134603a.a();
            return;
        }
        this.f134656b.e(Boolean.FALSE);
    }
}
