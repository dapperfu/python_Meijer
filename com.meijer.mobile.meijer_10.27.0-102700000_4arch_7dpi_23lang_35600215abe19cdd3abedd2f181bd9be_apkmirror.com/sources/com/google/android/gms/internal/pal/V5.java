package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class V5 extends O4 implements X5 {
    @Override // com.google.android.gms.internal.pal.X5
    public final void zzf() throws RemoteException {
        b2(3, A1());
    }

    V5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zze(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        Q4.e(parcelA1, bVar);
        parcelA1.writeString("ADSHIELD");
        parcelA1.writeString(null);
        b2(8, parcelA1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeIntArray(null);
        b2(4, parcelA1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.pal.X5
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeByteArray(bArr);
        b2(5, parcelA1);
    }
}
