package Ld;

import Bd.C2951a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes6.dex */
public final class u0 extends C2951a implements InterfaceC4046d {
    @Override // Ld.InterfaceC4046d
    public final void H() throws RemoteException {
        b2(7, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void onPause() throws RemoteException {
        b2(6, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void onResume() throws RemoteException {
        b2(5, a2());
    }

    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // Ld.InterfaceC4046d
    public final void onDestroy() throws RemoteException {
        b2(8, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void onLowMemory() throws RemoteException {
        b2(9, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void onStart() throws RemoteException {
        b2(15, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void onStop() throws RemoteException {
        b2(16, a2());
    }

    @Override // Ld.InterfaceC4046d
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        b2(3, parcelA2);
    }

    @Override // Ld.InterfaceC4046d
    public final void l0(C c10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, c10);
        b2(12, parcelA2);
    }

    @Override // Ld.InterfaceC4046d
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        Parcel parcelA1 = A1(10, parcelA2);
        if (parcelA1.readInt() != 0) {
            bundle.readFromParcel(parcelA1);
        }
        parcelA1.recycle();
    }

    @Override // Ld.InterfaceC4046d
    public final void s6(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.c(parcelA2, googleMapOptions);
        Bd.s.c(parcelA2, bundle);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4046d
    public final com.google.android.gms.dynamic.b x0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.e(parcelA2, bVar2);
        Bd.s.c(parcelA2, bundle);
        Parcel parcelA1 = A1(4, parcelA2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }
}
