package yd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18206a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f170456a;

    /* renamed from: b, reason: collision with root package name */
    private final String f170457b;

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f170456a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f170456a;
    }

    protected C18206a(IBinder iBinder, String str) {
        this.f170456a = iBinder;
        this.f170457b = str;
    }

    protected final Parcel A1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f170456a.transact(i10, parcel, parcelObtain, 0);
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

    protected final Parcel b2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f170457b);
        return parcelObtain;
    }
}
