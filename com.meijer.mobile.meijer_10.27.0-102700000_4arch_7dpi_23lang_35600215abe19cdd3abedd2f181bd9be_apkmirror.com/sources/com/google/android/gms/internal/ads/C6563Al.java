package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Al, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6563Al extends C8758mb implements InterfaceC6631Cl {
    C6563Al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final boolean L(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(4, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final boolean a(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(2, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final InterfaceC6733Fl d(String str) throws RemoteException {
        InterfaceC6733Fl c6665Dl;
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c6665Dl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC6733Fl) {
                c6665Dl = (InterfaceC6733Fl) iInterfaceQueryLocalInterface;
            } else {
                c6665Dl = new C6665Dl(strongBinder);
            }
        }
        parcelA2.recycle();
        return c6665Dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6631Cl
    public final InterfaceC10170zm p(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        Parcel parcelA2 = a2(3, parcelA1);
        InterfaceC10170zm interfaceC10170zmB9 = AbstractBinderC10063ym.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC10170zmB9;
    }
}
