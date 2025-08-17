package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Nh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6999Nh extends BinderC8865nb implements InterfaceC7033Oh {
    public static InterfaceC7033Oh B9(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7033Oh ? (InterfaceC7033Oh) iInterfaceQueryLocalInterface : new C6965Mh(iBinder);
    }
}
