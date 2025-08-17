package Ld;

import Bd.C2951a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: Ld.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4055h0 extends C2951a implements InterfaceC4054h {
    @Override // Ld.InterfaceC4054h
    public final void H() throws RemoteException {
        b2(7, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void onPause() throws RemoteException {
        b2(6, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void onResume() throws RemoteException {
        b2(5, a2());
    }

    C4055h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // Ld.InterfaceC4054h
    public final void onDestroy() throws RemoteException {
        b2(8, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void onLowMemory() throws RemoteException {
        b2(9, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void onStart() throws RemoteException {
        b2(13, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void onStop() throws RemoteException {
        b2(14, a2());
    }

    @Override // Ld.InterfaceC4054h
    public final void L0(InterfaceC4045c0 interfaceC4045c0) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, interfaceC4045c0);
        b2(12, parcelA2);
    }

    @Override // Ld.InterfaceC4054h
    public final void h7(com.google.android.gms.dynamic.b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.e(parcelA2, bVar);
        Bd.s.c(parcelA2, streetViewPanoramaOptions);
        Bd.s.c(parcelA2, bundle);
        b2(2, parcelA2);
    }

    @Override // Ld.InterfaceC4054h
    public final void k(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        b2(3, parcelA2);
    }

    @Override // Ld.InterfaceC4054h
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Bd.s.c(parcelA2, bundle);
        Parcel parcelA1 = A1(10, parcelA2);
        if (parcelA1.readInt() != 0) {
            bundle.readFromParcel(parcelA1);
        }
        parcelA1.recycle();
    }

    @Override // Ld.InterfaceC4054h
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
