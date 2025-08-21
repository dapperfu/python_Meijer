package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public abstract class zzmz extends zzlh implements zzna {
    public static zzna zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        return iInterfaceQueryLocalInterface instanceof zzna ? (zzna) iInterfaceQueryLocalInterface : new zzmy(iBinder);
    }
}
