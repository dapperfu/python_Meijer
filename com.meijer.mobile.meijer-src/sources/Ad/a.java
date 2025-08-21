package Ad;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f306b;

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f305a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f305a;
    }

    protected a(IBinder iBinder, String str) {
        this.f305a = iBinder;
        this.f306b = str;
    }

    protected final Parcel K1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f305a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel c2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f306b);
        return parcelObtain;
    }
}
