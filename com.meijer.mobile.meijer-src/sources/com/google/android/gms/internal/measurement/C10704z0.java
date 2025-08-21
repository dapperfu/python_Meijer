package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10704z0 extends O implements B0 {
    @Override // com.google.android.gms.internal.measurement.B0
    public final void zze() throws RemoteException {
        I2(2, a2());
    }

    C10704z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }
}
