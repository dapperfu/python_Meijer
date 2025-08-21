package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class D extends r implements InterfaceC3101b {
    public static InterfaceC3101b a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3101b ? (InterfaceC3101b) iInterfaceQueryLocalInterface : new C(iBinder);
    }
}
