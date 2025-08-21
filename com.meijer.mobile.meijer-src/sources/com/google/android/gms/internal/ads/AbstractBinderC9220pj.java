package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9220pj extends BinderC8990nb implements InterfaceC9327qj {
    public static InterfaceC9327qj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9327qj ? (InterfaceC9327qj) iInterfaceQueryLocalInterface : new C9113oj(iBinder);
    }
}
