package Id;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

/* loaded from: classes6.dex */
public interface r extends IInterface {
    void H2(int i10, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void I1(int i10, boolean z10, Bundle bundle) throws RemoteException;

    void M7(Status status, Xd.i iVar, Bundle bundle) throws RemoteException;

    void N5(Status status, boolean z10, Bundle bundle) throws RemoteException;

    void X3(int i10, Bundle bundle) throws RemoteException;

    void f9(int i10, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void x7(Status status, Xd.j jVar, Bundle bundle) throws RemoteException;
}
