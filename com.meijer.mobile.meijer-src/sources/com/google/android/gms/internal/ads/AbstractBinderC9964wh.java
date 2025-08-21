package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9964wh extends BinderC8990nb implements InterfaceC10071xh {
    public static InterfaceC10071xh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10071xh ? (InterfaceC10071xh) iInterfaceQueryLocalInterface : new C9857vh(iBinder);
    }
}
