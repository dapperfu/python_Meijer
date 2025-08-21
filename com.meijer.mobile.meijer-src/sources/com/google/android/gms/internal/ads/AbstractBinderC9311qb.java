package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9311qb extends BinderC8990nb implements InterfaceC9417rb {
    public static InterfaceC9417rb B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9417rb ? (InterfaceC9417rb) iInterfaceQueryLocalInterface : new C9204pb(iBinder);
    }
}
