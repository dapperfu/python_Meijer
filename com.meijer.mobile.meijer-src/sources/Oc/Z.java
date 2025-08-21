package Oc;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.BinderC8990nb;

/* loaded from: classes4.dex */
public abstract class Z extends BinderC8990nb implements InterfaceC4377a0 {
    public static InterfaceC4377a0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4377a0 ? (InterfaceC4377a0) iInterfaceQueryLocalInterface : new Y(iBinder);
    }
}
