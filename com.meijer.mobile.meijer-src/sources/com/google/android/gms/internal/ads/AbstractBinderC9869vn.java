package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9869vn extends BinderC8990nb implements InterfaceC9976wn {
    public static InterfaceC9976wn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9976wn ? (InterfaceC9976wn) iInterfaceQueryLocalInterface : new C9762un(iBinder);
    }
}
