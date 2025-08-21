package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Al, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6688Al extends C8883mb implements InterfaceC6756Cl {
    C6688Al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final boolean L(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(4, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final boolean a(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(2, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final InterfaceC6858Fl d(String str) throws RemoteException {
        InterfaceC6858Fl c6790Dl;
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c6790Dl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC6858Fl) {
                c6790Dl = (InterfaceC6858Fl) iInterfaceQueryLocalInterface;
            } else {
                c6790Dl = new C6790Dl(strongBinder);
            }
        }
        parcelA2.recycle();
        return c6790Dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6756Cl
    public final InterfaceC10295zm p(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        Parcel parcelA2 = a2(3, parcelK1);
        InterfaceC10295zm interfaceC10295zmB9 = AbstractBinderC10188ym.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC10295zmB9;
    }
}
