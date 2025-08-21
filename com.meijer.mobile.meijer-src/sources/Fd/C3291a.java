package Fd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Fd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3291a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f10012a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10013b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10012a;
    }

    protected C3291a(IBinder iBinder, String str) {
        this.f10012a = iBinder;
        this.f10013b = str;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f10013b);
        return parcelObtain;
    }

    protected final Parcel a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f10012a.transact(i10, parcel, parcelObtain, 0);
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
            this.f10012a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
