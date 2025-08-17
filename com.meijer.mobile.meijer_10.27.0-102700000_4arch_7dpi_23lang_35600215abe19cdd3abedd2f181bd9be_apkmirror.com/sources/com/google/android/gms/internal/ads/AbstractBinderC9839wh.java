package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9839wh extends BinderC8865nb implements InterfaceC9946xh {
    public static InterfaceC9946xh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9946xh ? (InterfaceC9946xh) iInterfaceQueryLocalInterface : new C9732vh(iBinder);
    }
}
