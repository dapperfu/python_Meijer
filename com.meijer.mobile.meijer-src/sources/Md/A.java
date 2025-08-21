package Md;

import Md.C4110c;
import android.location.Location;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class A extends Nd.K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.s f19737a;

    A(C4110c c4110c, C4110c.s sVar) {
        this.f19737a = sVar;
    }

    @Override // Nd.L
    public final void k2(Location location) throws RemoteException {
        this.f19737a.a(location);
    }
}
