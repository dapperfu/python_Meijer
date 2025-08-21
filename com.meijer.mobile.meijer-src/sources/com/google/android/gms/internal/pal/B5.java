package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class B5 extends P4 implements C5 {
    public static C5 a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        return iInterfaceQueryLocalInterface instanceof C5 ? (C5) iInterfaceQueryLocalInterface : new A5(iBinder);
    }
}
