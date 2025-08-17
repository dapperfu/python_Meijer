package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ae0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7485ae0 extends BinderC8865nb implements InterfaceC7592be0 {
    public static InterfaceC7592be0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7592be0 ? (InterfaceC7592be0) iInterfaceQueryLocalInterface : new C7395Zd0(iBinder);
    }
}
