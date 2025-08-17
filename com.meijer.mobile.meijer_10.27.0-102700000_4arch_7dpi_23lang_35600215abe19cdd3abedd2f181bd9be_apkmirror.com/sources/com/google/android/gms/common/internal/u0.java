package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class u0 extends C18206a implements InterfaceC6530l {
    @Override // com.google.android.gms.common.internal.InterfaceC6530l
    public final void cancel() throws RemoteException {
        a2(2, b2());
    }

    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }
}
