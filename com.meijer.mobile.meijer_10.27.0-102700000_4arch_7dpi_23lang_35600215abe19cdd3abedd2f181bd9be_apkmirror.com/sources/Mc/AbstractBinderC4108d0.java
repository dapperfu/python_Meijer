package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC6597Bl;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7719cp;
import com.google.android.gms.internal.ads.InterfaceC9401sc;
import java.util.ArrayList;

/* renamed from: Mc.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4108d0 extends BinderC8865nb implements InterfaceC4111e0 {
    public AbstractBinderC4108d0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4105c0 c4102b0;
        switch (i10) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(J1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4102b0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC4105c0) {
                        c4102b0 = (InterfaceC4105c0) iInterfaceQueryLocalInterface;
                    } else {
                        c4102b0 = new C4102b0(strongBinder);
                    }
                }
                C8972ob.c(parcel);
                S7(arrayListCreateTypedArrayList, c4102b0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                C8972ob.c(parcel);
                boolean zX = x(string);
                parcel2.writeNoException();
                parcel2.writeInt(zX ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                C8972ob.c(parcel);
                InterfaceC7719cp interfaceC7719cpS = s(string2);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7719cpS);
                return true;
            case 4:
                String string3 = parcel.readString();
                C8972ob.c(parcel);
                boolean zS = S(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                C8972ob.c(parcel);
                InterfaceC9401sc interfaceC9401scA = a(string4);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC9401scA);
                return true;
            case 6:
                String string5 = parcel.readString();
                C8972ob.c(parcel);
                boolean zW = W(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                C8972ob.c(parcel);
                V vI = i(string6);
                parcel2.writeNoException();
                C8972ob.f(parcel2, vI);
                return true;
            case 8:
                InterfaceC6631Cl interfaceC6631ClB9 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Z4(interfaceC6631ClB9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
