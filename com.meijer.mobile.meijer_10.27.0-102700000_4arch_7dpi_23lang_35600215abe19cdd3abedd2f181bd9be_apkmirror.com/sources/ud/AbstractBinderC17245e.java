package ud;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ud.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC17245e extends BinderC17242b implements InterfaceC17246f {
    public static InterfaceC17246f A1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC17246f ? (InterfaceC17246f) iInterfaceQueryLocalInterface : new C17244d(iBinder);
    }
}
