package Td;

import android.os.Parcel;
import android.os.RemoteException;
import yd.BinderC18303b;
import yd.C18304c;

/* loaded from: classes6.dex */
public abstract class e extends BinderC18303b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // yd.BinderC18303b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                C18304c.b(parcel);
                break;
            case 4:
                C18304c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                C18304c.b(parcel);
                break;
            case 7:
                C18304c.b(parcel);
                break;
            case 8:
                l lVar = (l) C18304c.a(parcel, l.CREATOR);
                C18304c.b(parcel);
                Q4(lVar);
                break;
            case 9:
                C18304c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
