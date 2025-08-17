package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9079pb extends C8758mb implements InterfaceC9292rb {
    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zzf() throws RemoteException {
        b2(3, A1());
    }

    C9079pb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zze(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString("GMA_SDK");
        b2(2, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeIntArray(null);
        b2(4, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(0);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9292rb
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeByteArray(bArr);
        b2(5, parcelA1);
    }
}
