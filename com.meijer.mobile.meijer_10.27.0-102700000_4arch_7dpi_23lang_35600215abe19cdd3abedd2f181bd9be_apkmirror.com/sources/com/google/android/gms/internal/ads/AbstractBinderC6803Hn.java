package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6803Hn extends BinderC8865nb implements InterfaceC6837In {
    public static InterfaceC6837In B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6837In ? (InterfaceC6837In) iInterfaceQueryLocalInterface : new C6769Gn(iBinder);
    }
}
