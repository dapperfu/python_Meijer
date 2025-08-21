package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public abstract class P0 extends BinderC8990nb implements Q0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
        com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
        C9097ob.c(parcel);
        a4(string, bVarA2, bVarA22);
        parcel2.writeNoException();
        return true;
    }

    public P0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }
}
