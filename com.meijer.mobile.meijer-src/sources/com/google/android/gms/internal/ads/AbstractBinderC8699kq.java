package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8699kq extends BinderC8990nb implements InterfaceC8806lq {
    public static InterfaceC8806lq B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8806lq ? (InterfaceC8806lq) iInterfaceQueryLocalInterface : new C8592jq(iBinder);
    }
}
