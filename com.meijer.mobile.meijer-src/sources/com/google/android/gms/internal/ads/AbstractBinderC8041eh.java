package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8041eh extends BinderC8990nb implements InterfaceC8148fh {
    public static InterfaceC8148fh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8148fh ? (InterfaceC8148fh) iInterfaceQueryLocalInterface : new C7935dh(iBinder);
    }
}
