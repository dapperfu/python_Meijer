package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7167Sg extends C8758mb implements InterfaceC7235Ug {
    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final com.google.android.gms.dynamic.b zzi() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    C7167Sg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final boolean zzk() throws RemoteException {
        Parcel parcelA2 = a2(10, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final boolean zzl() throws RemoteException {
        Parcel parcelA2 = a2(8, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
