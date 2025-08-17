package wd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: wd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17809a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f166032a;

    /* renamed from: b, reason: collision with root package name */
    private final String f166033b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f166032a;
    }

    protected final void b2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f166032a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected C17809a(IBinder iBinder, String str) {
        this.f166032a = iBinder;
        this.f166033b = str;
    }

    protected final Parcel A1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f166033b);
        return parcelObtain;
    }

    protected final void a2(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f166032a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
