package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public abstract class M extends BinderC8990nb implements N {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Y1 y12 = (Y1) C9097ob.a(parcel, Y1.CREATOR);
            C9097ob.c(parcel);
            h6(y12);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i10 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i12 = C9097ob.f78241b;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i10 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i10 != 5) {
                return false;
            }
            Y1 y13 = (Y1) C9097ob.a(parcel, Y1.CREATOR);
            int i13 = parcel.readInt();
            C9097ob.c(parcel);
            L5(y13, i13);
            parcel2.writeNoException();
        }
        return true;
    }

    public M() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }
}
