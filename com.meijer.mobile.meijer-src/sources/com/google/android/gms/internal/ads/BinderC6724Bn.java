package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Bn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6724Bn extends BinderC8990nb implements InterfaceC6758Cn {
    public static InterfaceC6758Cn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6758Cn ? (InterfaceC6758Cn) iInterfaceQueryLocalInterface : new C6690An(iBinder);
    }
}
