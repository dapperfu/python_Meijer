package Ld;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: Ld.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4056i extends IInterface {
    void L0(InterfaceC4045c0 interfaceC4045c0) throws RemoteException;

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
