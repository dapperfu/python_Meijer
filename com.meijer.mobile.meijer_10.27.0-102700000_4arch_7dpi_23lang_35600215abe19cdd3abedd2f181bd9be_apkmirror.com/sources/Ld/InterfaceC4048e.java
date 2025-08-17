package Ld;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: Ld.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4048e extends IInterface {
    com.google.android.gms.dynamic.b getView() throws RemoteException;

    void k(Bundle bundle) throws RemoteException;

    void l0(C c10) throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
