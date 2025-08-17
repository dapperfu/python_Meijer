package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9744vn extends BinderC8865nb implements InterfaceC9851wn {
    public static InterfaceC9851wn B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9851wn ? (InterfaceC9851wn) iInterfaceQueryLocalInterface : new C9637un(iBinder);
    }
}
