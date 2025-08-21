package Nd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: Nd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4188i extends IInterface {
    com.google.android.gms.dynamic.b getView() throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void y0(InterfaceC4177c0 interfaceC4177c0) throws RemoteException;
}
