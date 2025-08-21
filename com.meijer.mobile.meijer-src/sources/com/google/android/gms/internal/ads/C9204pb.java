package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9204pb extends C8883mb implements InterfaceC9417rb {
    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zzf() throws RemoteException {
        c2(3, K1());
    }

    C9204pb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zze(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString("GMA_SDK");
        c2(2, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeIntArray(null);
        c2(4, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(0);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417rb
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeByteArray(bArr);
        c2(5, parcelK1);
    }
}
