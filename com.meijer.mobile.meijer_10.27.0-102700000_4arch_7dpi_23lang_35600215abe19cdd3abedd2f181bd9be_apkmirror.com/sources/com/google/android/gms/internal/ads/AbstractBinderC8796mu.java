package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8796mu extends BinderC8865nb implements InterfaceC8903nu {
    public static InterfaceC8903nu B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8903nu ? (InterfaceC8903nu) iInterfaceQueryLocalInterface : new C8689lu(iBinder);
    }
}
