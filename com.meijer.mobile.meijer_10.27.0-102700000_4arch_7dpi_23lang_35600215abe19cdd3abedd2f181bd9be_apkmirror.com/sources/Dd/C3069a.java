package Dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Dd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3069a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f5979a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5980b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5979a;
    }

    protected C3069a(IBinder iBinder, String str) {
        this.f5979a = iBinder;
        this.f5980b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5980b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5979a.transact(i10, parcel, parcelObtain, 0);
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
            this.f5979a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
