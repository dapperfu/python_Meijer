package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class u0 extends Ad.a implements InterfaceC6655l {
    @Override // com.google.android.gms.common.internal.InterfaceC6655l
    public final void cancel() throws RemoteException {
        a2(2, c2());
    }

    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }
}
