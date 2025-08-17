package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6796Hh extends BinderC8865nb implements InterfaceC6830Ih {
    public static InterfaceC6830Ih B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6830Ih ? (InterfaceC6830Ih) iInterfaceQueryLocalInterface : new C6762Gh(iBinder);
    }
}
