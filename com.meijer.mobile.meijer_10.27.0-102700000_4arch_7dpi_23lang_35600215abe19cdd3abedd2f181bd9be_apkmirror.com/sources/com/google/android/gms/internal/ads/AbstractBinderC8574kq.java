package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8574kq extends BinderC8865nb implements InterfaceC8681lq {
    public static InterfaceC8681lq B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8681lq ? (InterfaceC8681lq) iInterfaceQueryLocalInterface : new C8467jq(iBinder);
    }
}
