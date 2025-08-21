package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8921mu extends BinderC8990nb implements InterfaceC9028nu {
    public static InterfaceC9028nu B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9028nu ? (InterfaceC9028nu) iInterfaceQueryLocalInterface : new C8814lu(iBinder);
    }
}
