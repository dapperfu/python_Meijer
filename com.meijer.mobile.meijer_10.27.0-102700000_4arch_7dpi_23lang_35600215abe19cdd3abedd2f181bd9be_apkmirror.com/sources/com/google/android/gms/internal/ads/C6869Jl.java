package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Jl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6869Jl extends C8758mb implements InterfaceC6937Ll {
    @Override // com.google.android.gms.internal.ads.InterfaceC6937Ll
    public final com.google.android.gms.dynamic.b zze() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6937Ll
    public final boolean zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    C6869Jl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }
}
