package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.th, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9643th extends BinderC8990nb implements InterfaceC9750uh {
    public static InterfaceC9750uh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9750uh ? (InterfaceC9750uh) iInterfaceQueryLocalInterface : new C9536sh(iBinder);
    }
}
