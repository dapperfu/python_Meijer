package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7041Oo extends BinderC8865nb implements InterfaceC7075Po {
    public static InterfaceC7075Po B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7075Po ? (InterfaceC7075Po) iInterfaceQueryLocalInterface : new C7007No(iBinder);
    }
}
