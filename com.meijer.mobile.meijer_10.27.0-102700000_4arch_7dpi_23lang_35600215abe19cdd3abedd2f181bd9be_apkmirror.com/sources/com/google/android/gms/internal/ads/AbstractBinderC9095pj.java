package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9095pj extends BinderC8865nb implements InterfaceC9202qj {
    public static InterfaceC9202qj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9202qj ? (InterfaceC9202qj) iInterfaceQueryLocalInterface : new C8988oj(iBinder);
    }
}
