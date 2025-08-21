package Nd;

import Dd.C3100a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public final class v0 extends C3100a implements InterfaceC4180e {
    @Override // Nd.InterfaceC4180e
    public final void onDestroy() throws RemoteException {
        c2(5, a2());
    }

    @Override // Nd.InterfaceC4180e
    public final void onLowMemory() throws RemoteException {
        c2(6, a2());
    }

    @Override // Nd.InterfaceC4180e
    public final void onPause() throws RemoteException {
        c2(4, a2());
    }

    @Override // Nd.InterfaceC4180e
    public final void onResume() throws RemoteException {
        c2(3, a2());
    }

    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // Nd.InterfaceC4180e
    public final com.google.android.gms.dynamic.b getView() throws RemoteException {
        Parcel parcelK1 = K1(8, a2());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    @Override // Nd.InterfaceC4180e
    public final void onStart() throws RemoteException {
        c2(12, a2());
    }

    @Override // Nd.InterfaceC4180e
    public final void onStop() throws RemoteException {
        c2(13, a2());
    }

    @Override // Nd.InterfaceC4180e
    public final void V(C c10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, c10);
        c2(9, parcelA2);
    }

    @Override // Nd.InterfaceC4180e
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, bundle);
        c2(2, parcelA2);
    }

    @Override // Nd.InterfaceC4180e
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, bundle);
        Parcel parcelK1 = K1(7, parcelA2);
        if (parcelK1.readInt() != 0) {
            bundle.readFromParcel(parcelK1);
        }
        parcelK1.recycle();
    }
}
