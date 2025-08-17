package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10561x0 extends P implements InterfaceC10570y0 {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
        Q.f(parcel);
        P(bundle);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC10561x0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
}
