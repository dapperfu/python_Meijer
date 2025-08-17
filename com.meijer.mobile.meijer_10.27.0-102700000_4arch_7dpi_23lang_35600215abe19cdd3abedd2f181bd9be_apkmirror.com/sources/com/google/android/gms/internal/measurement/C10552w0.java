package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10552w0 extends O implements InterfaceC10570y0 {
    C10552w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10570y0
    public final void P(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, bundle);
        b2(1, parcelA2);
    }
}
