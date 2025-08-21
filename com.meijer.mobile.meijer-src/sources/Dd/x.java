package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class x extends r implements y {
    public static y a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new w(iBinder);
    }
}
