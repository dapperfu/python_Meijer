package Ld;

import Bd.C2951a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public final class v0 extends C2951a implements InterfaceC4048e {
    @Override // Ld.InterfaceC4048e
    public final void onDestroy() throws RemoteException {
        b2(5, a2());
    }

    @Override // Ld.InterfaceC4048e
    public final void onLowMemory() throws RemoteException {
        b2(6, a2());
    }

    @Override // Ld.InterfaceC4048e
    public final void onPause() throws RemoteException {
        b2(4, a2());
    }

    @Override // Ld.InterfaceC4048e
    public final void onResume() throws RemoteException {
        b2(3, a2());
    }

    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // Ld.InterfaceC4048e
    public final com.google.android.gms.dynamic.b getView() throws RemoteException {
        Parcel parcelA1 = A1(8, a2());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    @Override // Ld.InterfaceC4048e
    public final void onStart() throws RemoteException {
        b2(12, a2());
    }

    @Override // Ld.InterfaceC4048e
    public final void onStop() throws RemoteException {
        b2(13, a2());
    }

    @Override // Ld.InterfaceC4048e
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4048e
    public final void l0(C c10) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, c10);
        b2(9, parcelA2);
    }

    @Override // Ld.InterfaceC4048e
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
