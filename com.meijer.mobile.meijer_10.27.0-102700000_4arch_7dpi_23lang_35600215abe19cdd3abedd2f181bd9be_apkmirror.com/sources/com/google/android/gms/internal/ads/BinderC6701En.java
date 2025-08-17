package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.En, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6701En extends BinderC8865nb implements InterfaceC6735Fn {
    public static InterfaceC6735Fn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6735Fn ? (InterfaceC6735Fn) iInterfaceQueryLocalInterface : new C6667Dn(iBinder);
    }
}
