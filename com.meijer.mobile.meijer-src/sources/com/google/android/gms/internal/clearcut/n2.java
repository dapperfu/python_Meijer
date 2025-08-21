package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import gd.C14349d;
import gd.C14351f;

/* loaded from: classes6.dex */
public interface n2 extends IInterface {
    void D4(Status status) throws RemoteException;

    void E1(DataHolder dataHolder) throws RemoteException;

    void P3(Status status, C14349d c14349d) throws RemoteException;

    void c5(Status status) throws RemoteException;

    void g4(Status status) throws RemoteException;

    void h5(Status status, long j10) throws RemoteException;

    void i1(Status status, long j10) throws RemoteException;

    void n4(Status status, C14349d c14349d) throws RemoteException;

    void p2(Status status, C14351f[] c14351fArr) throws RemoteException;
}
