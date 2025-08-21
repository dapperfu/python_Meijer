package Dd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Dd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3100a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f6123a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6124b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6123a;
    }

    protected C3100a(IBinder iBinder, String str) {
        this.f6123a = iBinder;
        this.f6124b = str;
    }

    protected final Parcel K1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6123a.transact(i10, parcel, parcelObtain, 0);
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

    protected final Parcel a2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6124b);
        return parcelObtain;
    }

    protected final void c2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f6123a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
