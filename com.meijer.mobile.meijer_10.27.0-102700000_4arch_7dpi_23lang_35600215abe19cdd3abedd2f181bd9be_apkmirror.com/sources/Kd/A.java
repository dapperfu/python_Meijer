package Kd;

import Kd.C3945c;
import android.location.Location;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class A extends Ld.K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.s f16378a;

    A(C3945c c3945c, C3945c.s sVar) {
        this.f16378a = sVar;
    }

    @Override // Ld.L
    public final void i2(Location location) throws RemoteException {
        this.f16378a.a(location);
    }
}
