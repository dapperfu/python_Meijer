package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9186qb extends BinderC8865nb implements InterfaceC9292rb {
    public static InterfaceC9292rb B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9292rb ? (InterfaceC9292rb) iInterfaceQueryLocalInterface : new C9079pb(iBinder);
    }
}
