package Kd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

/* loaded from: classes6.dex */
public interface r extends IInterface {
    void M2(int i10, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void P0(Status status, Zd.j jVar, Bundle bundle) throws RemoteException;

    void P1(int i10, boolean z10, Bundle bundle) throws RemoteException;

    void P8(Status status, Zd.i iVar, Bundle bundle) throws RemoteException;

    void Y5(Status status, boolean z10, Bundle bundle) throws RemoteException;

    void e9(int i10, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void o4(int i10, Bundle bundle) throws RemoteException;
}
