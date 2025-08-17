package Jd;

import Ad.BinderC2809d;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class M extends BinderC2809d implements N {
    public static N a2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new L(iBinder);
    }
}
