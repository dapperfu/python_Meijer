package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ed.C13647f;

/* loaded from: classes6.dex */
public final class q2 extends C10277a implements p2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // com.google.android.gms.internal.clearcut.p2
    public final void o6(n2 n2Var, C13647f c13647f) throws RemoteException {
        Parcel parcelA1 = A1();
        Y.b(parcelA1, n2Var);
        Y.c(parcelA1, c13647f);
        a2(1, parcelA1);
    }
}
