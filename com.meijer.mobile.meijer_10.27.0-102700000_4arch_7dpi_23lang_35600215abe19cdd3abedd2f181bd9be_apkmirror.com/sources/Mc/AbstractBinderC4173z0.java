package Mc;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.BinderC8865nb;

/* renamed from: Mc.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4173z0 extends BinderC8865nb implements A0 {
    public static A0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new C4170y0(iBinder);
    }
}
