package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* renamed from: Oc.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4398h0 extends BinderC8990nb implements InterfaceC4401i0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        C9097ob.c(parcel);
        M0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4398h0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC4401i0 B9(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4401i0 ? (InterfaceC4401i0) iInterfaceQueryLocalInterface : new C4395g0(iBinder);
    }
}
