package Fd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public abstract class Ea extends BinderC3524u implements Fa {
    public static Fa K1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof Fa ? (Fa) iInterfaceQueryLocalInterface : new Da(iBinder);
    }
}
