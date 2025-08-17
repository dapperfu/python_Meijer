package Mc;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.BinderC8865nb;

/* loaded from: classes4.dex */
public abstract class Z extends BinderC8865nb implements InterfaceC4099a0 {
    public static InterfaceC4099a0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4099a0 ? (InterfaceC4099a0) iInterfaceQueryLocalInterface : new Y(iBinder);
    }
}
