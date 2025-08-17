package Rd;

import android.os.Parcel;
import android.os.RemoteException;
import wd.BinderC17810b;
import wd.C17811c;

/* loaded from: classes6.dex */
public abstract class e extends BinderC17810b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // wd.BinderC17810b
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                C17811c.b(parcel);
                break;
            case 4:
                C17811c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                C17811c.b(parcel);
                break;
            case 7:
                C17811c.b(parcel);
                break;
            case 8:
                l lVar = (l) C17811c.a(parcel, l.CREATOR);
                C17811c.b(parcel);
                A5(lVar);
                break;
            case 9:
                C17811c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
