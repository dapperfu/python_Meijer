package yd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18302a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f171354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f171355b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f171354a;
    }

    protected final void c2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f171354a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected C18302a(IBinder iBinder, String str) {
        this.f171354a = iBinder;
        this.f171355b = str;
    }

    protected final Parcel K1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f171355b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f171354a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
