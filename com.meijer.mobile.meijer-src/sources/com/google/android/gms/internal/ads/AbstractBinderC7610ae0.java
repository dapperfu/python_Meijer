package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ae0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7610ae0 extends BinderC8990nb implements InterfaceC7717be0 {
    public static InterfaceC7717be0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7717be0 ? (InterfaceC7717be0) iInterfaceQueryLocalInterface : new C7520Zd0(iBinder);
    }
}
