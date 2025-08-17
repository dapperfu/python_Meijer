package Bd;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Bd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC2954d extends r implements e {
    public static e a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new C2953c(iBinder);
    }
}
