package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Kl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6903Kl extends BinderC8865nb implements InterfaceC6937Ll {
    public static InterfaceC6937Ll B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6937Ll ? (InterfaceC6937Ll) iInterfaceQueryLocalInterface : new C6869Jl(iBinder);
    }
}
