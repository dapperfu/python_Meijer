package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class D0 extends P implements E0 {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
            long j10 = parcel.readLong();
            Q.f(parcel);
            V0(string, string2, bundle, j10);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }

    public D0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
}
