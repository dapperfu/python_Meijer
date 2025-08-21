package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7124Nh extends BinderC8990nb implements InterfaceC7158Oh {
    public static InterfaceC7158Oh B9(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7158Oh ? (InterfaceC7158Oh) iInterfaceQueryLocalInterface : new C7090Mh(iBinder);
    }
}
