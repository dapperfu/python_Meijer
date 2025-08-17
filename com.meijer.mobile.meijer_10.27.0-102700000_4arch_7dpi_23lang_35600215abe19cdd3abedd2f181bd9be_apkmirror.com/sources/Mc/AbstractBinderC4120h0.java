package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* renamed from: Mc.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4120h0 extends BinderC8865nb implements InterfaceC4123i0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        C8972ob.c(parcel);
        K0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4120h0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC4123i0 B9(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4123i0 ? (InterfaceC4123i0) iInterfaceQueryLocalInterface : new C4117g0(iBinder);
    }
}
