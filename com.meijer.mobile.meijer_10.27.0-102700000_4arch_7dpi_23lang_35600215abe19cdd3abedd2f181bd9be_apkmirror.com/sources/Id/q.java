package Id;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

/* loaded from: classes6.dex */
public abstract class q extends c implements r {
    public q() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // Id.c
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                int i12 = parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) d.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                H2(i12, maskedWallet, bundle);
                return true;
            case 2:
                int i13 = parcel.readInt();
                FullWallet fullWallet = (FullWallet) d.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                f9(i13, fullWallet, bundle2);
                return true;
            case 3:
                int i14 = parcel.readInt();
                boolean zE = d.e(parcel);
                Bundle bundle3 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                I1(i14, zE, bundle3);
                return true;
            case 4:
                int i15 = parcel.readInt();
                Bundle bundle4 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                X3(i15, bundle4);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                d.e(parcel);
                d.b(parcel);
                return true;
            case 7:
                d.b(parcel);
                return true;
            case 8:
                d.b(parcel);
                return true;
            case 9:
                Status status = (Status) d.a(parcel, Status.CREATOR);
                boolean zE2 = d.e(parcel);
                Bundle bundle5 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                N5(status, zE2, bundle5);
                return true;
            case 10:
                d.b(parcel);
                return true;
            case 11:
                d.b(parcel);
                return true;
            case 12:
                d.b(parcel);
                return true;
            case 13:
                d.b(parcel);
                return true;
            case 14:
                Status status2 = (Status) d.a(parcel, Status.CREATOR);
                Xd.j jVar = (Xd.j) d.a(parcel, Xd.j.CREATOR);
                Bundle bundle6 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                x7(status2, jVar, bundle6);
                return true;
            case 15:
                d.b(parcel);
                return true;
            case 16:
                d.b(parcel);
                return true;
            case 17:
                d.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                d.b(parcel);
                return true;
            case 19:
                Status status3 = (Status) d.a(parcel, Status.CREATOR);
                Xd.i iVar = (Xd.i) d.a(parcel, Xd.i.CREATOR);
                Bundle bundle7 = (Bundle) d.a(parcel, Bundle.CREATOR);
                d.b(parcel);
                M7(status3, iVar, bundle7);
                return true;
            case 20:
                d.b(parcel);
                return true;
        }
    }
}
