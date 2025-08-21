package ud;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public abstract class g extends Bd.b implements InterfaceC17386f {
    @Override // Bd.b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            init(b.a.a2(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), Bd.c.b(parcel), parcel.readInt());
            parcel2.writeNoException();
            Bd.c.a(parcel2, booleanFlagValue);
        } else if (i10 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i10 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else {
            if (i10 != 5) {
                return false;
            }
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }

    public g() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static InterfaceC17386f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof InterfaceC17386f ? (InterfaceC17386f) iInterfaceQueryLocalInterface : new h(iBinder);
    }
}
