package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6928Hn extends BinderC8990nb implements InterfaceC6962In {
    public static InterfaceC6962In B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6962In ? (InterfaceC6962In) iInterfaceQueryLocalInterface : new C6894Gn(iBinder);
    }
}
