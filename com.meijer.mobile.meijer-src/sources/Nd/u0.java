package Nd;

import Dd.C3100a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes6.dex */
public final class u0 extends C3100a implements InterfaceC4178d {
    @Override // Nd.InterfaceC4178d
    public final void H() throws RemoteException {
        c2(7, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final void onPause() throws RemoteException {
        c2(6, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final void onResume() throws RemoteException {
        c2(5, a2());
    }

    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // Nd.InterfaceC4178d
    public final void onDestroy() throws RemoteException {
        c2(8, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final void onLowMemory() throws RemoteException {
        c2(9, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final void onStart() throws RemoteException {
        c2(15, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final void onStop() throws RemoteException {
        c2(16, a2());
    }

    @Override // Nd.InterfaceC4178d
    public final com.google.android.gms.dynamic.b A0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Dd.s.e(parcelA2, bVar2);
        Dd.s.c(parcelA2, bundle);
        Parcel parcelK1 = K1(4, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    @Override // Nd.InterfaceC4178d
    public final void H6(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, bVar);
        Dd.s.c(parcelA2, googleMapOptions);
        Dd.s.c(parcelA2, bundle);
        c2(2, parcelA2);
    }

    @Override // Nd.InterfaceC4178d
    public final void V(C c10) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.e(parcelA2, c10);
        c2(12, parcelA2);
    }

    @Override // Nd.InterfaceC4178d
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, bundle);
        c2(3, parcelA2);
    }

    @Override // Nd.InterfaceC4178d
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Dd.s.c(parcelA2, bundle);
        Parcel parcelK1 = K1(10, parcelA2);
        if (parcelK1.readInt() != 0) {
            bundle.readFromParcel(parcelK1);
        }
        parcelK1.recycle();
    }
}
