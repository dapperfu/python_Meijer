package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8984oh extends C8758mb implements InterfaceC9198qh {
    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final String zzi() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    C8984oh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final com.google.android.gms.dynamic.b zzh() throws RemoteException {
        Parcel parcelA2 = a2(9, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(10, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(17, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
