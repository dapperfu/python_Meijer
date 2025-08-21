package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.En, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6826En extends BinderC8990nb implements InterfaceC6860Fn {
    public static InterfaceC6860Fn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6860Fn ? (InterfaceC6860Fn) iInterfaceQueryLocalInterface : new C6792Dn(iBinder);
    }
}
