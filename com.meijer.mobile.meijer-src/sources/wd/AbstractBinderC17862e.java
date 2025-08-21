package wd;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: wd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC17862e extends BinderC17859b implements InterfaceC17863f {
    public static InterfaceC17863f K1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC17863f ? (InterfaceC17863f) iInterfaceQueryLocalInterface : new C17861d(iBinder);
    }
}
