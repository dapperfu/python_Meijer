package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Kl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7028Kl extends BinderC8990nb implements InterfaceC7062Ll {
    public static InterfaceC7062Ll B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7062Ll ? (InterfaceC7062Ll) iInterfaceQueryLocalInterface : new C6994Jl(iBinder);
    }
}
