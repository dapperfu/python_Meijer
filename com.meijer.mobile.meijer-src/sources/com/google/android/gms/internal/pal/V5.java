package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class V5 extends O4 implements X5 {
    @Override // com.google.android.gms.internal.pal.X5
    public final void zzf() throws RemoteException {
        c2(3, K1());
    }

    V5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zze(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.e(parcelK1, bVar);
        parcelK1.writeString("ADSHIELD");
        parcelK1.writeString(null);
        c2(8, parcelK1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeIntArray(null);
        c2(4, parcelK1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeByteArray(bArr);
        c2(5, parcelK1);
    }
}
