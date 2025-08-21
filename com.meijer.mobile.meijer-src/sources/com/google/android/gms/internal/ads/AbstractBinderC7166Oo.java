package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7166Oo extends BinderC8990nb implements InterfaceC7200Po {
    public static InterfaceC7200Po B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7200Po ? (InterfaceC7200Po) iInterfaceQueryLocalInterface : new C7132No(iBinder);
    }
}
