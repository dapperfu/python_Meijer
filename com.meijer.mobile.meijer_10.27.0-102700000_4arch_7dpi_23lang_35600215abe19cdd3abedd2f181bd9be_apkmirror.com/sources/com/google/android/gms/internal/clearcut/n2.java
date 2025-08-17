package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import ed.C13645d;
import ed.C13647f;

/* loaded from: classes6.dex */
public interface n2 extends IInterface {
    void M4(Status status) throws RemoteException;

    void P6(Status status, C13645d c13645d) throws RemoteException;

    void U3(Status status) throws RemoteException;

    void U4(Status status, long j10) throws RemoteException;

    void e6(Status status, C13645d c13645d) throws RemoteException;

    void g1(Status status, long j10) throws RemoteException;

    void q3(Status status, C13647f[] c13647fArr) throws RemoteException;

    void r4(Status status) throws RemoteException;

    void v1(DataHolder dataHolder) throws RemoteException;
}
