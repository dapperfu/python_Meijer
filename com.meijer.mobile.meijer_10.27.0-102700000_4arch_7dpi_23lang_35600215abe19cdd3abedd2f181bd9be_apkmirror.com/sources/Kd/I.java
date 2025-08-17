package Kd;

import Kd.C3945c;
import Ld.AbstractBinderC4049e0;
import android.graphics.Bitmap;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class I extends AbstractBinderC4049e0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3945c.w f16386a;

    I(C3945c c3945c, C3945c.w wVar) {
        this.f16386a = wVar;
    }

    @Override // Ld.InterfaceC4051f0
    public final void l6(Bitmap bitmap) throws RemoteException {
        this.f16386a.onSnapshotReady(bitmap);
    }

    @Override // Ld.InterfaceC4051f0
    public final void o0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f16386a.onSnapshotReady((Bitmap) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
