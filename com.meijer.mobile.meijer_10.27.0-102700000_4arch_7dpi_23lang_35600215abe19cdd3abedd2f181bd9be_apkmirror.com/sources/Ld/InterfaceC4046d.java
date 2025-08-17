package Ld;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: Ld.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4046d extends IInterface {
    void H() throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void l0(C c10) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void s6(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    com.google.android.gms.dynamic.b x0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException;
}
