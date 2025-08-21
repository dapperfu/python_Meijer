package Md;

import Md.C4110c;
import Nd.AbstractBinderC4202x;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class B extends AbstractBinderC4202x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.n f19738a;

    B(C4110c c4110c, C4110c.n nVar) {
        this.f19738a = nVar;
    }

    @Override // Nd.InterfaceC4203y
    public final void zzb() throws RemoteException {
        this.f19738a.onMapLoaded();
    }
}
