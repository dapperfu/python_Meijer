package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9014nn extends BinderC8990nb implements InterfaceC9228pn {
    public static InterfaceC9228pn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9228pn ? (InterfaceC9228pn) iInterfaceQueryLocalInterface : new C8907mn(iBinder);
    }
}
