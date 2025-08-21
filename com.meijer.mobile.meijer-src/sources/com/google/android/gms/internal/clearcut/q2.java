package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import gd.C14351f;

/* loaded from: classes6.dex */
public final class q2 extends C10402a implements p2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // com.google.android.gms.internal.clearcut.p2
    public final void z9(n2 n2Var, C14351f c14351f) throws RemoteException {
        Parcel parcelK1 = K1();
        Y.b(parcelK1, n2Var);
        Y.c(parcelK1, c14351f);
        a2(1, parcelK1);
    }
}
