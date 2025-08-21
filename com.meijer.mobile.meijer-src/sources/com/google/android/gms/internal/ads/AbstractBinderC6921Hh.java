package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6921Hh extends BinderC8990nb implements InterfaceC6955Ih {
    public static InterfaceC6955Ih B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6955Ih ? (InterfaceC6955Ih) iInterfaceQueryLocalInterface : new C6887Gh(iBinder);
    }
}
