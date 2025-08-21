package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public abstract class W extends Ad.c implements X {
    public static X a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(iBinder);
    }
}
