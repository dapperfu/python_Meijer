package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7156Og extends C8883mb implements InterfaceC7224Qg {
    @Override // com.google.android.gms.internal.ads.InterfaceC7224Qg
    public final String zzg() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7224Qg
    public final List zzh() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        ArrayList arrayListB = C9097ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7156Og(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }
}
