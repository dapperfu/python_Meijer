package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;

/* loaded from: classes4.dex */
public abstract class D extends BinderC8990nb implements E {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }

    public D() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
