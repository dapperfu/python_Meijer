package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public abstract class P0 extends BinderC8865nb implements Q0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
        com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
        C8972ob.c(parcel);
        O3(string, bVarA2, bVarA22);
        parcel2.writeNoException();
        return true;
    }

    public P0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }
}
