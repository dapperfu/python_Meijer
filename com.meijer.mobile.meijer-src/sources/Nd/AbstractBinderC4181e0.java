package Nd;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: Nd.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4181e0 extends Dd.r implements InterfaceC4183f0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) Dd.s.a(parcel, Bitmap.CREATOR);
            Dd.s.b(parcel);
            z6(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            Dd.s.b(parcel);
            p0(bVarA2);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4181e0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }
}
