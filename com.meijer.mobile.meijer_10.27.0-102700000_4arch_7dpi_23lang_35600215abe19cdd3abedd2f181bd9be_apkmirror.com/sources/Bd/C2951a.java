package Bd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Bd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2951a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f2178a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2179b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2178a;
    }

    protected C2951a(IBinder iBinder, String str) {
        this.f2178a = iBinder;
        this.f2179b = str;
    }

    protected final Parcel A1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2178a.transact(i10, parcel, parcelObtain, 0);
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
        parcelObtain.writeInterfaceToken(this.f2179b);
        return parcelObtain;
    }

    protected final void b2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2178a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
