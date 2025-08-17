package Ad;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class B0 extends BinderC2809d implements C0 {
    @Override // Ad.BinderC2809d
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            r.d(parcel);
            y9(i12, strArrCreateStringArray);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            r.d(parcel);
            m1(i13, strArrCreateStringArray2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) r.a(parcel, PendingIntent.CREATOR);
            r.d(parcel);
            w4(i14, pendingIntent);
        }
        return true;
    }

    public B0() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }
}
