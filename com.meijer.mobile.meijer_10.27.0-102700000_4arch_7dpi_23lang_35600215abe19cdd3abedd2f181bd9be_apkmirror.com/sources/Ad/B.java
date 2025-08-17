package Ad;

import Td.C5233k;
import android.os.RemoteException;
import hd.C14418t;

/* loaded from: classes6.dex */
final class B extends z0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Jd.K f191b;

    B(C5233k c5233k, Jd.K k10) {
        this.f190a = c5233k;
        this.f191b = k10;
    }

    @Override // Ad.A0
    public final void zze() throws RemoteException {
        this.f191b.zzf();
    }

    @Override // Ad.A0
    public final void l4(w0 w0Var) {
        C14418t.a(w0Var.a(), this.f190a);
    }
}
