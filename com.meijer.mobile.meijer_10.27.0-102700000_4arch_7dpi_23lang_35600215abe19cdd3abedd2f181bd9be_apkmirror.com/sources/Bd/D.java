package Bd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class D extends r implements InterfaceC2952b {
    public static InterfaceC2952b a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2952b ? (InterfaceC2952b) iInterfaceQueryLocalInterface : new C(iBinder);
    }
}
