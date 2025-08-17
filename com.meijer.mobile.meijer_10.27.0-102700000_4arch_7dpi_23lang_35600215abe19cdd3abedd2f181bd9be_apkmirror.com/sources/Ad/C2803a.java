package Ad;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ad.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2803a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f231a;

    /* renamed from: b, reason: collision with root package name */
    private final String f232b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f231a;
    }

    protected C2803a(IBinder iBinder, String str) {
        this.f231a = iBinder;
        this.f232b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f232b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f231a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void b2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f231a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
