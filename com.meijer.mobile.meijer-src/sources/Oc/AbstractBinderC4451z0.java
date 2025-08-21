package Oc;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.BinderC8990nb;

/* renamed from: Oc.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4451z0 extends BinderC8990nb implements A0 {
    public static A0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new C4448y0(iBinder);
    }
}
