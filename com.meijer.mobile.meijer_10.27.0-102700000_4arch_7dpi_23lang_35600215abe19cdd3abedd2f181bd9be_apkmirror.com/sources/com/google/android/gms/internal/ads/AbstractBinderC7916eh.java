package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7916eh extends BinderC8865nb implements InterfaceC8023fh {
    public static InterfaceC8023fh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8023fh ? (InterfaceC8023fh) iInterfaceQueryLocalInterface : new C7810dh(iBinder);
    }
}
