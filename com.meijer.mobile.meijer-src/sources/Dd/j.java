package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class j extends r implements k {
    public static k a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new i(iBinder);
    }
}
