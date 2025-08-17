package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6597Bl extends BinderC8865nb implements InterfaceC6631Cl {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            C8972ob.c(parcel);
            InterfaceC6733Fl interfaceC6733FlD = d(string);
            parcel2.writeNoException();
            C8972ob.f(parcel2, interfaceC6733FlD);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            C8972ob.c(parcel);
            boolean zA = a(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            C8972ob.c(parcel);
            InterfaceC10170zm interfaceC10170zmP = p(string3);
            parcel2.writeNoException();
            C8972ob.f(parcel2, interfaceC10170zmP);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            C8972ob.c(parcel);
            boolean zL = L(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zL ? 1 : 0);
        }
        return true;
    }

    public AbstractBinderC6597Bl() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC6631Cl B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6631Cl ? (InterfaceC6631Cl) iInterfaceQueryLocalInterface : new C6563Al(iBinder);
    }
}
