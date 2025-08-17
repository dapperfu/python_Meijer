package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public abstract class G0 extends BinderC8865nb implements H0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        W0 w02 = (W0) C8972ob.a(parcel, W0.CREATOR);
        C8972ob.c(parcel);
        P7(w02);
        parcel2.writeNoException();
        return true;
    }

    public G0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }
}
