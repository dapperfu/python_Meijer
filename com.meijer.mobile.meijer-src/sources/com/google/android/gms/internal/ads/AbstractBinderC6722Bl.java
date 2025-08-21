package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6722Bl extends BinderC8990nb implements InterfaceC6756Cl {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            InterfaceC6858Fl interfaceC6858FlD = d(string);
            parcel2.writeNoException();
            C9097ob.f(parcel2, interfaceC6858FlD);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            C9097ob.c(parcel);
            boolean zA = a(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            C9097ob.c(parcel);
            InterfaceC10295zm interfaceC10295zmP = p(string3);
            parcel2.writeNoException();
            C9097ob.f(parcel2, interfaceC10295zmP);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            C9097ob.c(parcel);
            boolean zL = L(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zL ? 1 : 0);
        }
        return true;
    }

    public AbstractBinderC6722Bl() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC6756Cl B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6756Cl ? (InterfaceC6756Cl) iInterfaceQueryLocalInterface : new C6688Al(iBinder);
    }
}
