package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Bn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6599Bn extends BinderC8865nb implements InterfaceC6633Cn {
    public static InterfaceC6633Cn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6633Cn ? (InterfaceC6633Cn) iInterfaceQueryLocalInterface : new C6565An(iBinder);
    }
}
