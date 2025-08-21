package Nd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: Nd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4180e extends IInterface {
    void V(C c10) throws RemoteException;

    com.google.android.gms.dynamic.b getView() throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
