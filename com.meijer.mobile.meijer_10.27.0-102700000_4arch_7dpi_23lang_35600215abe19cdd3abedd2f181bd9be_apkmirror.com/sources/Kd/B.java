package Kd;

import Kd.C3945c;
import Ld.AbstractBinderC4070x;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class B extends AbstractBinderC4070x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.n f16379a;

    B(C3945c c3945c, C3945c.n nVar) {
        this.f16379a = nVar;
    }

    @Override // Ld.InterfaceC4071y
    public final void zzb() throws RemoteException {
        this.f16379a.onMapLoaded();
    }
}
