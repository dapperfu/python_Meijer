package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class U4 extends O4 implements W4 {
    U4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zze(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.e(parcelK1, bVar);
        parcelK1.writeString("");
        Parcel parcelA2 = a2(8, parcelK1);
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzg(com.google.android.gms.dynamic.b bVar, byte[] bArr) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.e(parcelK1, bVar);
        parcelK1.writeByteArray(null);
        Parcel parcelA2 = a2(12, parcelK1);
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final String zzk(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.e(parcelK1, bVar);
        Q4.e(parcelK1, bVar2);
        Q4.e(parcelK1, bVar3);
        Parcel parcelA2 = a2(14, parcelK1);
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.W4
    public final void zzl(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.e(parcelK1, bVar);
        c2(9, parcelK1);
    }
}
