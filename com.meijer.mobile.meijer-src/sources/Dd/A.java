package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class A extends r implements B {
    public static B a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return iInterfaceQueryLocalInterface instanceof B ? (B) iInterfaceQueryLocalInterface : new z(iBinder);
    }
}
