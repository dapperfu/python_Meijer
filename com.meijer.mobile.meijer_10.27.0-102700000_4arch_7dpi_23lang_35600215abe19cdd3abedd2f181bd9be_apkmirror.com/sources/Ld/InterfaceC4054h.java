package Ld;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: Ld.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4054h extends IInterface {
    void H() throws RemoteException;

    void L0(InterfaceC4045c0 interfaceC4045c0) throws RemoteException;

    void h7(com.google.android.gms.dynamic.b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    com.google.android.gms.dynamic.b x0(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, Bundle bundle) throws RemoteException;
}
