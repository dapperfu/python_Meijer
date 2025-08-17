package Ld;

import Bd.C2951a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public final class i0 extends C2951a implements InterfaceC4056i {
    @Override // Ld.InterfaceC4056i
    public final void onDestroy() throws RemoteException {
        b2(5, a2());
    }

    @Override // Ld.InterfaceC4056i
    public final void onLowMemory() throws RemoteException {
        b2(6, a2());
    }

    @Override // Ld.InterfaceC4056i
    public final void onPause() throws RemoteException {
        b2(4, a2());
    }

    @Override // Ld.InterfaceC4056i
    public final void onResume() throws RemoteException {
        b2(3, a2());
    }

    i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // Ld.InterfaceC4056i
    public final com.google.android.gms.dynamic.b getView() throws RemoteException {
        Parcel parcelA1 = A1(8, a2());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    @Override // Ld.InterfaceC4056i
    public final void onStart() throws RemoteException {
        b2(10, a2());
    }

    @Override // Ld.InterfaceC4056i
    public final void onStop() throws RemoteException {
        b2(11, a2());
    }

    @Override // Ld.InterfaceC4056i
    public final void L0(InterfaceC4045c0 interfaceC4045c0) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4045c0);
        b2(9, parcelA2);
    }

    @Override // Ld.InterfaceC4056i
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4056i
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        Parcel parcelA1 = A1(7, parcelA2);
        if (parcelA1.readInt() != 0) {
            bundle.readFromParcel(parcelA1);
        }
        parcelA1.recycle();
    }
}
