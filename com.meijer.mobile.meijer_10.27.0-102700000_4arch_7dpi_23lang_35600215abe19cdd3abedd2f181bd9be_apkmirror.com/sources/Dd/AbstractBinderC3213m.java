package Dd;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: Dd.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC3213m extends BinderC3302u implements InterfaceC3225n {
    public static InterfaceC3225n A1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3225n ? (InterfaceC3225n) iInterfaceQueryLocalInterface : new C3201l(iBinder);
    }
}
