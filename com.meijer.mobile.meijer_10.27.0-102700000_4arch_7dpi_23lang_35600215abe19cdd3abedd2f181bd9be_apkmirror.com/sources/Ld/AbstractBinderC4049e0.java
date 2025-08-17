package Ld;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: Ld.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4049e0 extends Bd.r implements InterfaceC4051f0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) Bd.s.a(parcel, Bitmap.CREATOR);
            Bd.s.b(parcel);
            l6(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            o0(bVarA2);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4049e0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }
}
