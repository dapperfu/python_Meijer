package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Jl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6994Jl extends C8883mb implements InterfaceC7062Ll {
    @Override // com.google.android.gms.internal.ads.InterfaceC7062Ll
    public final com.google.android.gms.dynamic.b zze() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7062Ll
    public final boolean zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    C6994Jl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }
}
