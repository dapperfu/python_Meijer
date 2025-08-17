package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7031Og extends C8758mb implements InterfaceC7099Qg {
    @Override // com.google.android.gms.internal.ads.InterfaceC7099Qg
    public final String zzg() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7099Qg
    public final List zzh() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        ArrayList arrayListB = C8972ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7031Og(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }
}
