package Cd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Cd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3041a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f4227a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4228b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4227a;
    }

    protected C3041a(IBinder iBinder, String str) {
        this.f4227a = iBinder;
        this.f4228b = str;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f4228b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f4227a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void c2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f4227a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
