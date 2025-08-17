package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8889nn extends BinderC8865nb implements InterfaceC9103pn {
    public static InterfaceC9103pn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9103pn ? (InterfaceC9103pn) iInterfaceQueryLocalInterface : new C8782mn(iBinder);
    }
}
