package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class m extends r implements n {
    public static n a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new l(iBinder);
    }
}
