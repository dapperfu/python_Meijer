package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;

/* loaded from: classes4.dex */
public abstract class D extends BinderC8865nb implements E {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
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
