package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8251ho extends C8758mb implements InterfaceC8463jo {
    C8251ho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void E5(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c9853wo);
        C8972ob.f(parcelA1, interfaceC8998oo);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void N6(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c9853wo);
        C8972ob.f(parcelA1, interfaceC8998oo);
        b2(4, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void r3(String str, InterfaceC8998oo interfaceC8998oo) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC8998oo);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void u7(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c9853wo);
        C8972ob.f(parcelA1, interfaceC8998oo);
        b2(5, parcelA1);
    }
}
