package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.pal.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC11106y5 extends P4 implements InterfaceC11122z5 {
    @Override // com.google.android.gms.internal.pal.P4
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) Q4.a(parcel, Bundle.CREATOR);
            Q4.b(parcel);
            zzc(bundle);
        } else {
            if (i10 != 2) {
                return false;
            }
            int i12 = parcel.readInt();
            Q4.b(parcel);
            zzb(i12);
        }
        return true;
    }

    public AbstractBinderC11106y5() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }
}
