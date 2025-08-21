package Oc;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.BinderC8990nb;

/* loaded from: classes4.dex */
public abstract class J0 extends BinderC8990nb implements K0 {
    public static K0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof K0 ? (K0) iInterfaceQueryLocalInterface : new I0(iBinder);
    }
}
