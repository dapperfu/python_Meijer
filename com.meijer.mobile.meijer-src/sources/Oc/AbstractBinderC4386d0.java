package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC6722Bl;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7844cp;
import com.google.android.gms.internal.ads.InterfaceC9526sc;
import java.util.ArrayList;

/* renamed from: Oc.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4386d0 extends BinderC8990nb implements InterfaceC4389e0 {
    public AbstractBinderC4386d0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4383c0 c4380b0;
        switch (i10) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(J1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4380b0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC4383c0) {
                        c4380b0 = (InterfaceC4383c0) iInterfaceQueryLocalInterface;
                    } else {
                        c4380b0 = new C4380b0(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                W5(arrayListCreateTypedArrayList, c4380b0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                C9097ob.c(parcel);
                boolean zX = x(string);
                parcel2.writeNoException();
                parcel2.writeInt(zX ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                InterfaceC7844cp interfaceC7844cpS = s(string2);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7844cpS);
                return true;
            case 4:
                String string3 = parcel.readString();
                C9097ob.c(parcel);
                boolean zS = S(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                C9097ob.c(parcel);
                InterfaceC9526sc interfaceC9526scA = a(string4);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC9526scA);
                return true;
            case 6:
                String string5 = parcel.readString();
                C9097ob.c(parcel);
                boolean zX2 = X(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zX2 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                C9097ob.c(parcel);
                V vI = i(string6);
                parcel2.writeNoException();
                C9097ob.f(parcel2, vI);
                return true;
            case 8:
                InterfaceC6756Cl interfaceC6756ClB9 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                l5(interfaceC6756ClB9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
