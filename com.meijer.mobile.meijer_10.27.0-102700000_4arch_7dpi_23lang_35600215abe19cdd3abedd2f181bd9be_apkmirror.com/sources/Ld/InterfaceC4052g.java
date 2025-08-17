package Ld;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: Ld.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4052g extends IInterface {
    void B1(String str) throws RemoteException;

    void B2(InterfaceC4041a0 interfaceC4041a0) throws RemoteException;

    void D7(StreetViewPanoramaCamera streetViewPanoramaCamera, long j10) throws RemoteException;

    void M3(LatLng latLng, int i10) throws RemoteException;

    void M5(boolean z10) throws RemoteException;

    void R3(LatLng latLng, int i10, Md.B b10) throws RemoteException;

    void T3(boolean z10) throws RemoteException;

    void U7(boolean z10) throws RemoteException;

    Md.A c2() throws RemoteException;

    void f3(U u10) throws RemoteException;

    void k5(Y y10) throws RemoteException;

    void m4(W w10) throws RemoteException;

    void q6(boolean z10) throws RemoteException;

    void x1(LatLng latLng) throws RemoteException;
}
