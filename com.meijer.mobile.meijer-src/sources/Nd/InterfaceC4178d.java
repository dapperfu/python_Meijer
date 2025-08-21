package Nd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: Nd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4178d extends IInterface {
    com.google.android.gms.dynamic.b A0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException;

    void H() throws RemoteException;

    void H6(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;

    void V(C c10) throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
