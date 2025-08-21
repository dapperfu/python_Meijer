package Md;

import Md.C4110c;
import Nd.AbstractBinderC4181e0;
import android.graphics.Bitmap;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class I extends AbstractBinderC4181e0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4110c.w f19745a;

    I(C4110c c4110c, C4110c.w wVar) {
        this.f19745a = wVar;
    }

    @Override // Nd.InterfaceC4183f0
    public final void z6(Bitmap bitmap) throws RemoteException {
        this.f19745a.onSnapshotReady(bitmap);
    }

    @Override // Nd.InterfaceC4183f0
    public final void p0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f19745a.onSnapshotReady((Bitmap) com.google.android.gms.dynamic.d.c2(bVar));
    }
}
