package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6849Ff extends BinderC8990nb implements InterfaceC6883Gf {
    public static InterfaceC6883Gf B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6883Gf ? (InterfaceC6883Gf) iInterfaceQueryLocalInterface : new C6815Ef(iBinder);
    }
}
