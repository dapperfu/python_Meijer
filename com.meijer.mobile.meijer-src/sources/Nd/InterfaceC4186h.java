package Nd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: Nd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4186h extends IInterface {
    com.google.android.gms.dynamic.b A0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException;

    void H() throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void q7(com.google.android.gms.dynamic.b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    void y0(InterfaceC4177c0 interfaceC4177c0) throws RemoteException;
}
