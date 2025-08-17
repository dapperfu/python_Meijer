package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class T extends yd.c implements InterfaceC6531m {
    @Override // yd.c
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) yd.d.a(parcel, Bundle.CREATOR);
            yd.d.b(parcel);
            e3(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) yd.d.a(parcel, Bundle.CREATOR);
            yd.d.b(parcel);
            n6(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            h0 h0Var = (h0) yd.d.a(parcel, h0.CREATOR);
            yd.d.b(parcel);
            c9(i14, strongBinder2, h0Var);
        }
        parcel2.writeNoException();
        return true;
    }

    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
