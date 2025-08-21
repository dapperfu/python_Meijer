package Fd;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Fd.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC3435m extends BinderC3524u implements InterfaceC3447n {
    public static InterfaceC3447n K1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3447n ? (InterfaceC3447n) iInterfaceQueryLocalInterface : new C3423l(iBinder);
    }
}
